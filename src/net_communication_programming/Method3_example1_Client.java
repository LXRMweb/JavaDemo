/**
 * @author lxrm
 * @date 20161102
 * @description 基于传输层UDP协议的java网络通信程序
 * 				客户端程序
 * 编程思路：
 * 		step1,创建DatagramSocket对象
 * 			法一，DatagramSocket()
 * 			法二，DatagramSocket(int port)//以本机端口号为参数
 * 			法三，DatagramSocket(int port,InetAddress laddr)//以本机端口号和本机IP为参数
 * 			注：创建DatagramSocket对象时，如果没有指明本地端口号和IP，系统会自动为其绑定一个可用的本地端口号和可用的本地IP地址
 * 			易错：创建该对象时，容易触发SocketException,必须在程序中进行处理（捕获或抛出）
 * 		 step2,通信（向目的端发送UDP数据报（也即DatagramPacket对象）
 * 				     或者   接收外部发送过来的数据报（也即DatagramPacket对象））
 * 
 *			状况一： 向目的端发送UDP数据报（也即DatagramPacket对象）
 *				1-step2.1准备好要发送的数据，封装成DatagramPacket对象
 * 					法二，DatagramPacket(byte buf[],int length,InetAddress addr,int port)//用于数据报发送端
 *  				法四，DatagramPacket(byte buf[],int offset,int length,InetAddress addr,int port)//用于数据报发送端
 *  						说明：buf：byte[] 数据报数据
 *  							length:int  数据报中数据长度
 *  							addr：InetAddress 目的IP
 *  							port：int 目的端口
 *  							offset：int 数据报的位移量
 *  			1-step2.2,使用DatagramSocket对象中的send()函数将UDP数据报(也即DatagramPacket对象)发送出去
 *  				调用了DatagramSocket对象中的send()函数之后，UDP数据报(也即DatagramPacket对象)会根据也即DatagramPacket对象中目的IP以及目的端口寻址
 *  				找可行的路径将数据报发送到目的端
 *  
 *  		状况二：接收服务器端发送过来的数据报（也即DatagramPacket对象）
 *  			2-step2.1 创建“空的”DatagramPacket对象，并且指定缓冲区及其大小，为接收服务器端发送过来的UDP数据报（接收外部发送过来的数据报（也即DatagramPacket对象））做准备
 *  				法一，DatagramPacket(byte buf[],int length)//用于数据报接收
 *  				法三，DatagramPacket(byte buf[],int offset,int length)//用于数据报接收端
 *  						说明：buf：byte[] 数据报数据
 *  							length:int  数据报中数据长度
 *  							offset：int 数据报的位移量
 *  			2-step2.2调用DatagramSocket对象的receive()接收UDP数据报
 *  				调用receive()函数之后，receive()所在的线程将会进入阻塞态，直至它接收到外部发送过来的UDP数据报时才转入就绪态
 *  	step3，通信结束，关闭socket，释放相应资源
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
			//step1，创建DatagramSocket对象，指定本地IP和本地端口号（如果没有显式地指明本地端口号和IP，系统会自动为其绑定一个可用的本地端口号和可用的本地IP地址
			DatagramSocket socket=new DatagramSocket();
			/*step2,通信
			 * 	状况二：接收服务器端发送过来的数据报（也即DatagramPacket对象）
			 * 		1-step2.1准备好要发送的数据，封装成DatagramPacket对象
			 */
			byte[] buf=new byte[256];//创建缓冲区
			InetAddress addr=InetAddress.getLocalHost();
			DatagramPacket packet=new DatagramPacket(buf,buf.length,addr,SERVERPORT);
			//		1-step2.2,发送UDP数据报
			socket.send(packet);//其中参数packet：DatagramPacket是待发送的UDP数据报
			/*step2,通信
			 * 	状况一： 向目的端发送UDP数据报（也即DatagramPacket对象）
			 * 		2-step2.1 创建“空的”DatagramPacket对象，并且指定缓冲区及其大小，为接收服务器端发送过来的UDP数据报（接收外部发送过来的数据报（也即DatagramPacket对象））做准备
			 */
			DatagramPacket packetToPutReceivedUDP=new DatagramPacket(buf,buf.length);
			//		2-step2.2调用DatagramSocket对象的receive()接收UDP数据报
			socket.receive(packetToPutReceivedUDP);//其中参数packetToPutReceivedUDP:DatagramPacket用于存放从外部接收到的UDP数据报(也即DatagramPacket对象
			System.out.println("client:从客户端接收到了新的UDP数据报，"+packetToPutReceivedUDP.getData().toString());
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
