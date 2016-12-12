/**
 * @author lxrm
 * @date 20161102
 * @description 基于传输层TCP协议的Socket编程，java网络通信程序
 * 				客户端程序
 * 				example1，程序功能：服务器端程序等待客户端的输入，接收客户端通过网络发送来的数据并在服务器端屏幕上输出
 * 								之后服务器端将自己接收到的客户端传送来的数据回传给客户端，客户端接收服务器端通过网络传回来的数据并在客户端控制台输出
 * 编程思路：
 * 		step1，建立Socket对象（通信链路的一端：客户端Socket）
 * 				客户端Socket可以直接使用new调用Socket类的构造函数来创建
 * 				法一，Socket(InetAdress address,int port)//以服务器方IP和端口号为参数
 * 				法二，Socket(String host,int port)//以服务器方域名和端口号为参数建立客户端Socket
 * 				法三，Socket(InetAddress address,int port,InetAddress localAddress,int localPort)//以服务器端ip、服务器端端口号，客户端本地IP，客户端本地端口号为参数创建客户端Socket
 * 				法四，Socket(String host,int port,InetAddress localAddress,int localPort)//以服务器端域名、端口号，客户端IP、端口号为参数创建客户端Socket				
 * 				法五，Socket(SocketImpl impl)//impl是Socket的父类
 * 				注：如果创建该对象时没有显示声明本地IP以及端口号，系统会自动为其绑定一个可用的本地IP以及端口号
 * 				易错点一：创建Socket的过程中可能会触发IOExecption,在程序中必须作出处理（捕获 或 抛出）
 * 		step2，调用socket对象的成员方法开启客户端的自动刷新的网络输出流（通过该输出流可以向服务器端发送数据）
 * 		step3,调用socket对象的成员方法开启客户端Socket的网络输入流（通过该输入流对象可以从服务器端接收数据）
 * 		step4，使用上面建立的通讯链路进行数据交互。
 * 				经过step1-step3，已经建立了客户端和服务器端的双向通信链路，接下来可以使用step2中网络输出流对象传送客户端数据到服务器端
 * 			  	也可使用step3中网络输入流对象接收服务器端传送过来的数据并在客户端作进一步处理（如显示等）
 * 		step5,通信结束，关闭相应资源
 * 				关闭网络输入输出流资源
 * 				关闭标准输入流资源
 * 				关闭客户端Socket对象	*/
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
	private static final int SERVERPORT=8088;//通信中客户端的目的端口（即服务器端口）
	public static void main(String[] args){
		try {
			//step1，客户端建立Socket对象
			Socket clientSocket=new Socket("localhost",SERVERPORT);//法二,设服务器域名为localhost，服务器端口为8088
			System.out.println("客户端建立了Socket对象，clientSocket="+clientSocket);
			//step2，开启客户端的自动刷新的网络输出流（通过该输出流可以向服务器端发送数据）
			PrintWriter outToServer=new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())),true);
			//step3,开启客户端Socket的网络输入流（通过该输入流对象可以从服务器端接收数据）
			BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("客户端Socket开启了网络输入、输出流");
			//step4，使用上面建立的通信链路进行数据交互
			//例，客户端从键盘输入数据作为客户端数据，传送到服务器端
			//	同时，客户端接收来自服务器端的数据，并且在客户端标准输出（输出到屏幕上）
			BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("请输入要传送到服务器端的数据，以BYE独占一行结束：");
			while(true){
				outToServer.println(stdin.readLine());//从键盘输入数据，并通过网络输出流对象将其发送至服务器端
				String str=inFromServer.readLine();//通过clientSocket的网络输入流对象获取服务器端发送来的数据，并保存在str:String中
				if(str==null){
					break;
				}
				System.out.println(str);//客户端对接收到的服务器数据的进一步处理（本程序中就是直接标准输出了）
			}
			//step5,通信结束，关闭客户端Socket
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
