/**
 * @author lxrm
 * @date 20161101
 * @description java�����������ַ�ʽ�������������Ӧ�ò�������̡����ڴ��������������̷�ʽ
 * 				�����򽲽��һ�ַ�ʽ��������Ӧ�ò�URL�������̣����������̷�ʽ�漰��������
 * 		���������̷�ʽ�ıȽϣ�
 * 			Ӧ�ó��ϲ�ͬ������URL�ĸ߲�ε������̿���ʹ��httpЭ���Խ�������ǽ����������������Internet
 * 		��ͨ�ţ�������Socket��TCPЭ��ĵͲ�ε������̸��ʺ����ڲ�ͨ�ţ�ͬһ�����εľ������������ͨ�ţ�
 * 				
 * 				�����򽲽��һ�ַ�ʽ��������Ӧ�ò�URL�������̣����������̷�ʽ�漰��������				
 *			    URL�࣬
 * 					�������ڶ�λ�������ϵ���Դ
 * 					��Դ���ڵ�����£�����ʹ�����ķ�ʽ��ȡ����Դ����ֻ�ܶ�ȡ���޷������������������ݵ�����
 * 					URL���޷����������������������ݵ�����
 * 				URLConnection�࣬
 * 					��λ����Դ�����ʹ�ø����еķ�����ȡ��Դ�����һ��ͷ��Ϣ
 * 					�������ύ�����ݣ�Ҳ���ǿ������������������
 * 				URLEncoder�࣬
 * 					���ڽ���ͨ��ʽ���ַ���ת����MIME��ʽ���ַ��������Ϸ���URL��ַ��
 * 				URLDecoder�࣬
 * 					���ڽ�MIME��ʽ���ַ���(URL)ת������ͨ��ʽ���ַ���
 * ���˼·��
 * 		step1������URL����
 * 				��һ��public URL(string spec)//ʹ��������url�ַ�����Ϊ����
 * 				������public URL(URL context,String spec)//ʹ������URL����+��չ����Ϊ����
 * 				������public URL(String protocol,String host,String file)//ʹ��Э������+����+�ļ���ַΪ����
 * 				���ģ�public URL(String protocol,String host,int port,String file)//ʹ��Э������+����+�˿ں�+�ļ���ַΪ����
 * 				�״�㣬����URL���캯��ʱ���п��ܻᴥ��MalformedURLException,�������URL����ʱ��ע�⴦����һ�쳣��
 * 					  �����׳��쳣����ʹ��try..catch���в���
 * 		step2��ʹ��URL��openConnection()���URLConnection����
 * 				���URLConnection����Ĺ���Ҳ���ǽ�������ͨ�����ӵĹ���
 * 				������ӹ���ʧ�ܣ���ᴥ��IOException�쳣
 * 		step3������URLConnection����ĸ�����Ա������ȡ�������ø�������
 * 		step4��������Զ�̶����ʵ������
 * 		step5����Զ�̶��󡱱�Ϊ���ã����Ի�ȡԶ�̶����һЩ������Ϣ
 * 		step6.1����ȡԶ�̶��������
 * 		step6.2����������˷�������*/
package net_communication_programming;

import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Method1_BasedOnURL_ApplicationLayer {
	public static void main(String[] args){
		try {
			//step1������URL����
			URL url=new URL("https://www.baidu.com/");//��һ���URL���󣬽����https://www.baidu.com/
			URL url2=new URL(url,"index.html");//�����������https://www.baidu.com/index.html
			URL url3=new URL("http","www.12306.cn","/mormhweb/index.html");//�����������http://www.12306.cn/mormhweb/index.html
			URL url4=new URL("http","www.12306.cn",80,"/mormhweb/index.html");//���ģ������http://www.12306.cn:80/mormhweb/index.html
			System.out.println("step1,����URL����");
			System.out.println(url+"\n"+url2+"\n"+url3+"\n"+url4);
			//step2��ʹ��URL��openConnection()���URLConnection����
			URLConnection urlConn=url.openConnection();
			//step3������URLConnection����ĸ�����Ա������ȡ�������ø�������
			urlConn.setDoInput(true);
			urlConn.setDoOutput(true);//���óɿ������������д����
			//step4��������Զ�̶����ʵ������
			urlConn.connect();
			//step5����Զ�̶��󡱱�Ϊ����
			System.out.println(urlConn.getContentType());//�����text/html
			System.out.println(urlConn.getContentEncoding());//�����null
			System.out.println(urlConn.getContentLength());//�����2443
			System.out.println(urlConn.getDate());//����19700101�ն��ٺ��룬�����1477997394000
			//step6����ȡԶ�̶��������
			Scanner in=new Scanner(urlConn.getInputStream());
			while(in.hasNextLine()){
				System.out.println(in.nextLine());
			}
			//step6.2����������˷�������
			//PrintStream out=new PrintStream(urlConn.getOutputStream());
			//out.println("this is from client1");
		}catch(UnknownHostException e){
			System.out.println(e);
		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
