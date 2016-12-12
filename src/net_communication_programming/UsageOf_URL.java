/**
 * @author lxrm
 * @date 20161101
 * @description ���ļ���������URL����÷�
 * 			1����ȡURL���󣬹������ַ���
 * 				��һ��public URL(string spec)//ʹ��������url�ַ�����Ϊ����
 * 				������public URL(URL context,String spec)//ʹ������URL����+��չ����Ϊ����
 * 				������public URL(String protocol,String host,String file)//ʹ��Э������+����+�ļ���ַΪ����
 * 				���ģ�public URL(String protocol,String host,int port,String file)//ʹ��Э������+����+�˿ں�+�ļ���ַΪ����
 * 				�״�㣬����URL���캯��ʱ���п��ܻᴥ��MalformedURLException,�������URL����ʱ��ע�⴦����һ�쳣��
 * 					  �����׳��쳣����ʹ��try..catch���в���
 * 			2)URL����ĳ�Ա������ʹ��
 * 				2.1��һ���Ա���������ڻ�ȡURL������������
	 * 				public String getProtocol()//��URL����  ��Э��
	 * 				public String getHost()//��URL�����    ����
	 * 				public int getPort()//��URL�����  �˿ں�
	 * 				public String getFile()//��URL�����   �ļ���
	 * 				public String getPath()//��ȡ��URL�����е�·��
	 * 				public String getRef()//��ȡ��URL�����е�ê
	 * 				public String getQuery()//��ȡ��URL�����е�   ��ѯ��Ϣ
	 * 				public String getUserInfo()//��ȡʹ������Ϣ
	 * 				public String getAuthority()//��ȡ��URL�����Ȩ����Ϣ
 * 					...������Ա����
 * 				2.2��openStream()������ʹ�ø÷�������һ��InputStream���󣬽�����ȡ��URL����ָ�����ҳ��Դ
 * 					ע��ʹ��URL�����openStream()ֻ�ܴ���ҳ�϶�ȡ��Դ���޷��ӿͻ�������ҳ���������ݣ�����Ҫ��������˷���һЩ���ݵ�ʱ��
 * 					����Ҫ������URLConnection��������Ա����
 * 					step1����ȡURL����
 * 					step2��ʹ��step1�л�õ�URL�������openStream(),���InputStream����
 * 					step3��InputStream-->InputStreamReader-->BufferedReader
 * 					step4��ʹ��BuffedredReader�����г�Ա������ȡURL�����Ӧ����ҳ��Դ��
 * 					step5,�Զ�ȡ����������Դ���ݽ�����һ�������籾�������ǽ��������������������Ļ�ϣ�
 * 					step6���ر��ַ������������籾������in.close()��
 * */
package net_communication_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UsageOf_URL {
	public static void main(String[] args){
		
		try{
			//1����ȡURL���󣬹������ַ���
			URL url=new URL("https://www.baidu.com/");//��һ���URL���󣬽����https://www.baidu.com/
			URL url2=new URL(url,"index.html");//�����������https://www.baidu.com/index.html
			URL url3=new URL("http","www.12306.cn","/mormhweb/index.html");//�����������http://www.12306.cn/mormhweb/index.html
			URL url4=new URL("http","www.12306.cn",80,"/mormhweb/index.html#BOTTOM");//���ģ������http://www.12306.cn:80/mormhweb/index.html#BOTTOM
			System.out.println("1)����URL����,�������ַ���");
			System.out.println("   "+url+"\n   "+url2+"\n   "+url3+"\n   "+url4);
			//2)ʹ��URL�����������Ա����
			//	2.1��һ���Ա���������ڻ�ȡURL������������
			System.out.println("2)ʹ��URL�����������Ա����\n    2.1��һ���Ա���������ڻ�ȡURL������������");
			System.out.println(url4.getProtocol());//�����http
			System.out.println(url4.getHost());//�����www.12306.cn
			System.out.println(url4.getPort());//�����80
			System.out.println(url4.getFile());//�����/mormhweb/index.html
			System.out.println(url4.getRef());//�����BOTTOM
			//getFile():String=getPath():String+getQuery():String ����һ�������ķ���ֵ�Ǻ����������ķ���ֵ�ĵ��ӽ��
			System.out.println(url4.getPath());//�����/mormhweb/index.html
			System.out.println(url4.getQuery());//�����null
			System.out.println(url4.getUserInfo());//�����null
			System.out.println(url4.getAuthority());//�����www.12306.cn:80
			//2)ʹ��URL�����������Ա����
			//	2.2������URL�е�openStream()��������ȡ��URL����ָ���������Դ��������һ������
			System.out.println("2)ʹ��URL�����������Ա����\n    2.2������URL�е�openStream()��������ȡ��URL����ָ���������Դ��������һ������");
			BufferedReader in=new BufferedReader(new InputStreamReader(url4.openStream()));//step2-step3
			while(in.readLine()!=null){
				System.out.println(in.readLine());//step4-step5
			}
			in.close();//step6
		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}//end main
	
}//end class
