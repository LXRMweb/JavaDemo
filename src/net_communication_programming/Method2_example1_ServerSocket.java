/**
 * @author lxrm
 * @date 20161102
 * @description ���ڴ����TCPЭ���Socket��̣�java����ͨ�ų���
 * 				�������˳���
 * 				example1�������ܣ��������˳���ȴ��ͻ��˵����룬���տͻ���ͨ�����緢���������ݲ��ڷ���������Ļ�����
 * 								֮��������˽��Լ����յ��Ŀͻ��˴����������ݻش����ͻ��ˣ��ͻ��˽��շ�������ͨ�����紫���������ݲ��ڿͻ��˿���̨���
 * ���˼·��
 * 		step1,����ServerSocket����ʹ�ñ�����һֱ�������������ڻ����ġ�SERVERPORT=8088���˿�
 * 			  ʹ��newֱ�ӵ���ServerSocket�Ĺ��캯��������ServerSocket����
 * 			 ��һ��ServerSocket(int port)//�Է�������������˿�Ϊ��������ServerSocket����
 * 			������ServerSocket(int port,int backlog)
 * 			������ServerSocket(int port,int backlog,InetAddress bindAddr)
 * 		step2��ʹ��serverSocket��������������������SERVERPORT�˿ڣ�һ�����ֿͻ��˷���������
 * 			      ����������serverSocket�����accept()��������һ��Socket����
 * 		step3,ÿ���м������µĿͻ�������ʱ���͵�������һ���µ��߳������������µ����ӣ��µ�ͨ�����ӣ�
 * 				step3.1,���������������������������������
 * 				step3.2,ʹ�����潨���������������ӿͻ��˽������ݣ�����ʹ�����潨���������������ͻ��˷�������
 * 				step3.3,ͨ����ϣ��رմ˴�����
 * 					���ر����������������Դ��
 * 					���رշ���������client������ص��½���socket��
 * */
package net_communication_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Method2_example1_ServerSocket {
	public static final int SERVERPORT=8088;//��������������Ķ˿ڣ�����������һֱ��������˿��Ƿ��пͻ���������
	public static void main(String[] args){
		
		try {
			//step1,����ServerSocket����ʹ�ñ�����һֱ�������������ڻ����ġ�SERVERPORT=8088���˿�
			ServerSocket serverSocket=new ServerSocket(SERVERPORT);//��һ
			System.out.println("���������������������˿ڣ�"+SERVERPORT);
			//step2��ʹ��serverSocket��������������������SERVERPORT�˿ڣ�һ�����ֿͻ��˷��������󣬾���������serverSocket�����accept()��������һ��Socket����
			int number=0;//�ɹ������ϱ�����˳�����ܷÿ���Ŀ
			while(true){//�������˳���һֱ���У�һֱ����SERVERPORT�˿ڣ�
						//�����ʹ��whileѭ������ô�˷����������ֻ�ܽ���һ�οͻ������󣬴����������֮��������˳���ͽ������У�
						//�������ڴ˴�ʹ����whileѭ�������Դ˷������������һֱ���У�һֱ������Ӧ�˿ڣ�һ���пͻ������������Ὺ���µ��߳�����������ͬ���ε������̵߳�run()��������ô�����������ر��Ǵ������Ӧ��ͨ����·
				Socket socket=serverSocket.accept();//accept()��һ�����������������������е�����ʱ���÷������ڵ��߳̽�������̬���ȴ��û�����
													//ֱ�����û��������ӵ���Ӧ�Ķ˿�ʱ,�Ž������о���̬
													//���±������̬֮�������½�һ��Socket����Ϊ֮�������ڴ˴����ӵ�ͨ����·��׼��
				System.out.println("�˿�"+SERVERPORT+"�����µĿͻ������󣬷������˵���accept()�����½�һ��Socket����"+socket);
				//����һ���µ��߳�����������ͻ�����������˵�������ݽ���
				number++;
				Thread t=new EchoThread(socket,number);//ͨ��accept()���socket����֮��,�Ϳ��������µ��߳�������������(��������������������������ݵ�)
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//end main
}//end class

class EchoThread extends Thread{
	//�߳���Դ
	private Socket socket;
	int number;
	//�߳���Դ��ʼ��
	public EchoThread(Socket socket,int number){
		this.socket=socket;
		this.number=number;
	}
	public void run(){
		System.out.println("���յ��µĿͻ����������ǳɹ����ӵ�����վ�ĵ�"+number+"λ�ÿͣ��û������Ϣ���£�"+socket);
		try {
			//step3.1,���������������������������������
			System.out.println("����Ϊ����µĿͻ�������װ���������������������������...");
			BufferedReader inFromClient=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter outToClient=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
			System.out.println("Ӧ���ڴ˴����ӵ�����������������������Ѿ�װ����ɣ�������Դӿͻ��˽������ݻ�����ͻ��˷�������");
			//step3.2,ʹ�����潨���������������ӿͻ��˽������ݣ�����ʹ�����潨���������������ͻ��˷�������
			while(true){
				String line=inFromClient.readLine();//���տͻ��˵����ݲ�������line��String��
				System.out.println("�������˽��յ��ͻ������ݣ�"+line);
				if(line==null){
					break;
				}else{
					if(line.trim().equals("BYE")){
						System.out.println("The Client"+number+"�����˵������еġ�BYE��");
						System.out.println("�������˽�Ҫ�رմ˴����ӣ�number="+number+"   "+socket);
						break;
					}
					System.out.println("connection:number="+number+line);
					outToClient.println("this is from server,�ҽ��յ����㷢�͵����ݣ�"+line);
						
				}
				
			}//end while
			//step3.3,ͨ����ϣ��رմ˴����ӣ��رշ���������client������ص��½���socket��
			inFromClient.close();
			outToClient.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end run()
}//end class EchoThread