/**
 * @author lxrm
 * @date 20161102
 * @description ���ڴ����TCPЭ���Socket��̣�java����ͨ�ų���
 * 				�ͻ��˳���
 * 				example1�������ܣ��������˳���ȴ��ͻ��˵����룬���տͻ���ͨ�����緢���������ݲ��ڷ���������Ļ�����
 * 								֮��������˽��Լ����յ��Ŀͻ��˴����������ݻش����ͻ��ˣ��ͻ��˽��շ�������ͨ�����紫���������ݲ��ڿͻ��˿���̨���
 * ���˼·��
 * 		step1������Socket����ͨ����·��һ�ˣ��ͻ���Socket��
 * 				�ͻ���Socket����ֱ��ʹ��new����Socket��Ĺ��캯��������
 * 				��һ��Socket(InetAdress address,int port)//�Է�������IP�Ͷ˿ں�Ϊ����
 * 				������Socket(String host,int port)//�Է������������Ͷ˿ں�Ϊ���������ͻ���Socket
 * 				������Socket(InetAddress address,int port,InetAddress localAddress,int localPort)//�Է�������ip���������˶˿ںţ��ͻ��˱���IP���ͻ��˱��ض˿ں�Ϊ���������ͻ���Socket
 * 				���ģ�Socket(String host,int port,InetAddress localAddress,int localPort)//�Է��������������˿ںţ��ͻ���IP���˿ں�Ϊ���������ͻ���Socket				
 * 				���壬Socket(SocketImpl impl)//impl��Socket�ĸ���
 * 				ע����������ö���ʱû����ʾ��������IP�Լ��˿ںţ�ϵͳ���Զ�Ϊ���һ�����õı���IP�Լ��˿ں�
 * 				�״��һ������Socket�Ĺ����п��ܻᴥ��IOExecption,�ڳ����б��������������� �� �׳���
 * 		step2������socket����ĳ�Ա���������ͻ��˵��Զ�ˢ�µ������������ͨ���������������������˷������ݣ�
 * 		step3,����socket����ĳ�Ա���������ͻ���Socket��������������ͨ����������������Դӷ������˽������ݣ�
 * 		step4��ʹ�����潨����ͨѶ��·�������ݽ�����
 * 				����step1-step3���Ѿ������˿ͻ��˺ͷ������˵�˫��ͨ����·������������ʹ��step2����������������Ϳͻ������ݵ���������
 * 			  	Ҳ��ʹ��step3������������������շ������˴��͹��������ݲ��ڿͻ�������һ����������ʾ�ȣ�
 * 		step5,ͨ�Ž������ر���Ӧ��Դ
 * 				�ر����������������Դ
 * 				�رձ�׼��������Դ
 * 				�رտͻ���Socket����	*/
package net_communication_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Method2_example1_ClientSocket {
	private static final int SERVERPORT=8088;//ͨ���пͻ��˵�Ŀ�Ķ˿ڣ����������˿ڣ�
	public static void main(String[] args){
		try {
			//step1���ͻ��˽���Socket����
			Socket clientSocket=new Socket("localhost",SERVERPORT);//����,�����������Ϊlocalhost���������˿�Ϊ8088
			System.out.println("�ͻ��˽�����Socket����clientSocket="+clientSocket);
			//step2�������ͻ��˵��Զ�ˢ�µ������������ͨ���������������������˷������ݣ�
			PrintWriter outToServer=new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())),true);
			//step3,�����ͻ���Socket��������������ͨ����������������Դӷ������˽������ݣ�
			BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("�ͻ���Socket�������������롢�����");
			//step4��ʹ�����潨����ͨ����·�������ݽ���
			//�����ͻ��˴Ӽ�������������Ϊ�ͻ������ݣ����͵���������
			//	ͬʱ���ͻ��˽������Է������˵����ݣ������ڿͻ��˱�׼������������Ļ�ϣ�
			BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("������Ҫ���͵��������˵����ݣ���BYE��ռһ�н�����");
			while(true){
				outToServer.println(stdin.readLine());//�Ӽ����������ݣ���ͨ����������������䷢������������
				String str=inFromServer.readLine();//ͨ��clientSocket�����������������ȡ�������˷����������ݣ���������str:String��
				if(str==null){
					break;
				}
				System.out.println(str);//�ͻ��˶Խ��յ��ķ��������ݵĽ�һ�������������о���ֱ�ӱ�׼����ˣ�
			}
			//step5,ͨ�Ž������رտͻ���Socket
			outToServer.close();
			inFromServer.close();
			stdin.close();
			clientSocket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
