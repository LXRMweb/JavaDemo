/**
 * @author lxrm
 * @date 20161101
 * @description java�����������ַ�ʽ�������������Ӧ�ò�������̡����ڴ��������������̷�ʽ
 * 				�����򽲽�ڶ��ַ�ʽ�������ڴ����ĵͲ�������̣����д����Э����TCPЭ��
 * 		���������̷�ʽ�ıȽϣ�
 * 			Ӧ�ó��ϲ�ͬ������URL�ĸ߲�ε������̿���ʹ��httpЭ���Խ�������ǽ����������������Internet
 * 		��ͨ�ţ�������Socket��TCPЭ��ĵͲ�ε������̸��ʺ����ڲ�ͨ�ţ�ͬһ�����εľ������������ͨ�ţ���
 *		�����ڲ�ͨ�ŵ�TCPЭ�鴫������ӵ�пɿ��ԣ�����UDP��ͨ��û�пɿ��ԣ����Ǵ���Ч�ʽϸߣ�������ʵʱ��Ҫ���
 * 		���ǿɿ���Ҫ��û����ô�ߵ��ڲ�ͨ�ţ���ֱ��ϵͳ����
 * 
 * 				�����򽲽�����ַ�ʽ�������ڴ����UDPЭ���java�����̣����ֱ�̷����漰�����¼����ࣺ
 * 				DatagramSocket�࣬
 * 						1�������ڳ���֮�佨���������ݱ���ͨ������
 * 						2������DatagramSocket����
 * 							��һ��DatagramSocket()
 * 							������DatagramSocket(int port)//�Ա����˿ں�Ϊ����
 * 							������DatagramSocket(int port,InetAddress laddr)//�Ա����˿ںźͱ���IPΪ����
 * 							ע������DatagramSocket����ʱ�����û��ָ�����ض˿ںź�IP��ϵͳ���Զ�Ϊ���һ�����õı��ض˿ںźͿ��õı���IP��ַ
 * 							�״������ö���ʱ�����״���SocketException,�����ڳ����н��д���������׳���
 * 						3��ʹ�øö����receive(���յ������ݵĴ�ŵ�ַ)����
 * 							receive()��ʹ�����ڵ��̴߳�������̬���ȴ����ݱ��ĵ�����ֱ���յ�һ�����ݱ�Ϊֹ
 * 						4��ʹ�øö����send(������DatagramPacket����)����
 * 							send()��������ݱ�����DatagramPacket�����е�Ŀ�ĵ�ַ��Ѱַ�Դ������ݱ�
 * 				DatagramPacket�࣬
 * 						1��������ʾһ��UDP���ݱ������ǿͻ��˺ͷ������˴�������ݵ�����
 * 						2������DatagramPacket����
 * 							��һ��DatagramPacket(byte buf[],int length)//�������ݱ����ն�
 * 							������DatagramPacket(byte buf[],int length,InetAddress addr,int port)//�������ݱ����Ͷ�
 *  						������DatagramPacket(byte buf[],int offset,int length)//�������ݱ����ն�
 *  						���ģ�DatagramPacket(byte buf[],int offset,int length,InetAddress addr,int port)//�������ݱ����Ͷ�
 *  						˵����buf��byte[] ���ݱ�����
 *  							length:int  ���ݱ������ݳ���
 *  							addr��InetAddress Ŀ��IP
 *  							port��int Ŀ�Ķ˿�
 *  							offset��int ���ݱ���λ����
 *  						�״�㣺����DatagramPacket����ʱ��ע��������˼·��
 *  							���ݱ����Ͷˣ�ʹ�÷�������ȥ����DatagramPacket������Ϊ�����͵����ݵ�����
 *  							���ݱ����նˣ�ʹ�÷�һ��������    ���յġ�  DatagramPacket���󣬲���Ҫָ���������ݵĻ��������䳤�ȣ��ȴ���������
 * ���˼�룺������������
 * 			�ͻ��˳���
 * 			�������˳���
 * �ͻ��˳���ͷ������˳���Ľ������̣�
 * */
package net_communication_programming;

public class Method3_BasedOnDatagramSocket_UDP_TransitionLayer {

}
