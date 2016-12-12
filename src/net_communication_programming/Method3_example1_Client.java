/**
 * @author lxrm
 * @date 20161102
 * @description ���ڴ����UDPЭ���java����ͨ�ų���
 * 				�ͻ��˳���
 * ���˼·��
 * 		step1,����DatagramSocket����
 * 			��һ��DatagramSocket()
 * 			������DatagramSocket(int port)//�Ա����˿ں�Ϊ����
 * 			������DatagramSocket(int port,InetAddress laddr)//�Ա����˿ںźͱ���IPΪ����
 * 			ע������DatagramSocket����ʱ�����û��ָ�����ض˿ںź�IP��ϵͳ���Զ�Ϊ���һ�����õı��ض˿ںźͿ��õı���IP��ַ
 * 			�״������ö���ʱ�����״���SocketException,�����ڳ����н��д���������׳���
 * 		 step2,ͨ�ţ���Ŀ�Ķ˷���UDP���ݱ���Ҳ��DatagramPacket����
 * 				     ����   �����ⲿ���͹��������ݱ���Ҳ��DatagramPacket���󣩣�
 * 
 *			״��һ�� ��Ŀ�Ķ˷���UDP���ݱ���Ҳ��DatagramPacket����
 *				1-step2.1׼����Ҫ���͵����ݣ���װ��DatagramPacket����
 * 					������DatagramPacket(byte buf[],int length,InetAddress addr,int port)//�������ݱ����Ͷ�
 *  				���ģ�DatagramPacket(byte buf[],int offset,int length,InetAddress addr,int port)//�������ݱ����Ͷ�
 *  						˵����buf��byte[] ���ݱ�����
 *  							length:int  ���ݱ������ݳ���
 *  							addr��InetAddress Ŀ��IP
 *  							port��int Ŀ�Ķ˿�
 *  							offset��int ���ݱ���λ����
 *  			1-step2.2,ʹ��DatagramSocket�����е�send()������UDP���ݱ�(Ҳ��DatagramPacket����)���ͳ�ȥ
 *  				������DatagramSocket�����е�send()����֮��UDP���ݱ�(Ҳ��DatagramPacket����)�����Ҳ��DatagramPacket������Ŀ��IP�Լ�Ŀ�Ķ˿�Ѱַ
 *  				�ҿ��е�·�������ݱ����͵�Ŀ�Ķ�
 *  
 *  		״���������շ������˷��͹��������ݱ���Ҳ��DatagramPacket����
 *  			2-step2.1 �������յġ�DatagramPacket���󣬲���ָ�������������С��Ϊ���շ������˷��͹�����UDP���ݱ��������ⲿ���͹��������ݱ���Ҳ��DatagramPacket���󣩣���׼��
 *  				��һ��DatagramPacket(byte buf[],int length)//�������ݱ�����
 *  				������DatagramPacket(byte buf[],int offset,int length)//�������ݱ����ն�
 *  						˵����buf��byte[] ���ݱ�����
 *  							length:int  ���ݱ������ݳ���
 *  							offset��int ���ݱ���λ����
 *  			2-step2.2����DatagramSocket�����receive()����UDP���ݱ�
 *  				����receive()����֮��receive()���ڵ��߳̽����������̬��ֱ�������յ��ⲿ���͹�����UDP���ݱ�ʱ��ת�����̬
 *  	step3��ͨ�Ž������ر�socket���ͷ���Ӧ��Դ
 *  */
	
package net_communication_programming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Method3_example1_Client {
	public static final int SERVERPORT=8809;
	public static void main(){
		
		try {
			//step1������DatagramSocket����ָ������IP�ͱ��ض˿ںţ����û����ʽ��ָ�����ض˿ںź�IP��ϵͳ���Զ�Ϊ���һ�����õı��ض˿ںźͿ��õı���IP��ַ
			DatagramSocket socket=new DatagramSocket();
			/*step2,ͨ��
			 * 	״���������շ������˷��͹��������ݱ���Ҳ��DatagramPacket����
			 * 		1-step2.1׼����Ҫ���͵����ݣ���װ��DatagramPacket����
			 */
			byte[] buf=new byte[256];//����������
			InetAddress addr=InetAddress.getLocalHost();
			DatagramPacket packet=new DatagramPacket(buf,buf.length,addr,SERVERPORT);
			//		1-step2.2,����UDP���ݱ�
			socket.send(packet);//���в���packet��DatagramPacket�Ǵ����͵�UDP���ݱ�
			/*step2,ͨ��
			 * 	״��һ�� ��Ŀ�Ķ˷���UDP���ݱ���Ҳ��DatagramPacket����
			 * 		2-step2.1 �������յġ�DatagramPacket���󣬲���ָ�������������С��Ϊ���շ������˷��͹�����UDP���ݱ��������ⲿ���͹��������ݱ���Ҳ��DatagramPacket���󣩣���׼��
			 */
			DatagramPacket packetToPutReceivedUDP=new DatagramPacket(buf,buf.length);
			//		2-step2.2����DatagramSocket�����receive()����UDP���ݱ�
			socket.receive(packetToPutReceivedUDP);//���в���packetToPutReceivedUDP:DatagramPacket���ڴ�Ŵ��ⲿ���յ���UDP���ݱ�(Ҳ��DatagramPacket����
			System.out.println("client:�ӿͻ��˽��յ����µ�UDP���ݱ���"+packetToPutReceivedUDP.getData().toString());
			//step3
			socket.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
