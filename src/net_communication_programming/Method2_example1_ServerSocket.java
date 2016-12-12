/**
 * @author lxrm
 * @date 20161102
 * @description 基于传输层TCP协议的Socket编程，java网络通信程序
 * 				服务器端程序
 * 				example1，程序功能：服务器端程序等待客户端的输入，接收客户端通过网络发送来的数据并在服务器端屏幕上输出
 * 								之后服务器端将自己接收到的客户端传送来的数据回传给客户端，客户端接收服务器端通过网络传回来的数据并在客户端控制台输出
 * 编程思路：
 * 		step1,建立ServerSocket对象，使得本程序一直监听本程序所在机器的“SERVERPORT=8088”端口
 * 			  使用new直接调用ServerSocket的构造函数来创建ServerSocket对象
 * 			 法一，ServerSocket(int port)//以服务器程序监听端口为参数创建ServerSocket对象
 * 			法二，ServerSocket(int port,int backlog)
 * 			法三，ServerSocket(int port,int backlog,InetAddress bindAddr)
 * 		step2，使用serverSocket对象监听本程序所定义的SERVERPORT端口，一旦发现客户端发来了请求，
 * 			      就立即调用serverSocket对象的accept()函数生成一个Socket对象
 * 		step3,每次有监听到新的客户端请求时，就单独启动一个新的线程来独立处理新的连接（新的通信连接）
 * 				step3.1,建立网络连接输入流和网络连接输出流
 * 				step3.2,使用上面建立的网络输入流从客户端接收数据，或者使用上面建立的网络输出流向客户端发送数据
 * 				step3.3,通信完毕，关闭此次链接
 * 					（关闭网络输入输出流资源）
 * 					（关闭服务器端因client请求而特地新建的socket）
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
	public static final int SERVERPORT=8088;//服务器程序监听的端口，服务器程序一直监听这个端口是否有客户端请求发生
	public static void main(String[] args){
		
		try {
			//step1,建立ServerSocket对象，使得本程序一直监听本程序所在机器的“SERVERPORT=8088”端口
			ServerSocket serverSocket=new ServerSocket(SERVERPORT);//法一
			System.out.println("服务器程序启动，监听端口："+SERVERPORT);
			//step2，使用serverSocket对象监听本程序所定义的SERVERPORT端口，一旦发现客户端发来了请求，就立即调用serverSocket对象的accept()函数生成一个Socket对象
			int number=0;//成功连接上本服务端程序的总访客数目
			while(true){//服务器端程序一直运行，一直监听SERVERPORT端口，
						//如果不使用while循环，那么此服务器程序就只能接收一次客户端请求，处理完该请求之后服务器端程序就结束运行，
						//但是由于此处使用了while循环，所以此服务器程序可以一直运行，一直监听相应端口，一旦有客户端请求发生都会开启新的线程来独立处理不同批次的请求，线程的run()结束，则该次请求结束，关闭那次请求对应的通信链路
				Socket socket=serverSocket.accept();//accept()是一个“阻塞方法”，程序运行到这里时，该方法所在的线程进入阻塞态，等待用户请求，
													//直到有用户请求连接到相应的端口时,才进入运行就绪态
													//重新变成运行态之后，立即新建一个Socket对象，为之后建立用于此次连接的通信链路做准备
				System.out.println("端口"+SERVERPORT+"发现新的客户端请求，服务器端调用accept()函数新建一个Socket对象："+socket);
				//启动一个新的线程来进行这个客户端与服务器端的这次数据交互
				number++;
				Thread t=new EchoThread(socket,number);//通过accept()获得socket对象之后,就可以启动新的线程来做后续处理(建立网络输入输出流、传递数据等)
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//end main
}//end class

class EchoThread extends Thread{
	//线程资源
	private Socket socket;
	int number;
	//线程资源初始化
	public EchoThread(Socket socket,int number){
		this.socket=socket;
		this.number=number;
	}
	public void run(){
		System.out.println("接收到新的客户端请求，这是成功连接到本网站的第"+number+"位访客，用户身份信息如下："+socket);
		try {
			//step3.1,建立网络连接输入流和网络连接输出流
			System.out.println("正在为这个新的客户端请求装配网络输入流、网络输出流对象...");
			BufferedReader inFromClient=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter outToClient=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
			System.out.println("应用于此次连接的网络输入流、输出流对象已经装配完成，下面可以从客户端接收数据或者向客户端发送数据");
			//step3.2,使用上面建立的网络输入流从客户端接收数据，或者使用上面建立的网络输出流向客户端发送数据
			while(true){
				String line=inFromClient.readLine();//接收客户端的数据并保存在line：String中
				System.out.println("服务器端接收到客户端数据："+line);
				if(line==null){
					break;
				}else{
					if(line.trim().equals("BYE")){
						System.out.println("The Client"+number+"输入了单独成行的“BYE”");
						System.out.println("服务器端将要关闭此次连接，number="+number+"   "+socket);
						break;
					}
					System.out.println("connection:number="+number+line);
					outToClient.println("this is from server,我接收到了你发送的数据："+line);
						
				}
				
			}//end while
			//step3.3,通信完毕，关闭此次链接（关闭服务器端因client请求而特地新建的socket）
			inFromClient.close();
			outToClient.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end run()
}//end class EchoThread