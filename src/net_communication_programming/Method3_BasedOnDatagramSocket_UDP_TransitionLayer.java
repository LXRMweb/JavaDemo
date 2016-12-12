/**
 * @author lxrm
 * @date 20161101
 * @description java网络编程有三种方式，具体包含基于应用层的网络编程、基于传输层的两种网络编程方式
 * 				本程序讲解第二种方式，即基于传输层的低层次网络编程，其中传输层协议是TCP协议
 * 		三种网络编程方式的比较：
 * 			应用场合不同，基于URL的高层次的网络编程可以使用http协议跨越网络防火墙，所以适用于面向Internet
 * 		的通信，而基于Socket和TCP协议的低层次的网络编程更适合于内部通信（同一个网段的局域网主机间的通信）；
 *		面向内部通信的TCP协议传送数据拥有可靠性，基于UDP的通信没有可靠性，但是传输效率较高，适用于实时性要求高
 * 		但是可靠性要求没有那么高的内部通信（如直播系统）。
 * 
 * 				本程序讲解第三种方式，即基于传输层UDP协议的java网络编程，这种编程方法涉及到如下几个类：
 * 				DatagramSocket类，
 * 						1）用于在程序之间建立传送数据报的通信连接
 * 						2）创建DatagramSocket对象
 * 							法一，DatagramSocket()
 * 							法二，DatagramSocket(int port)//以本机端口号为参数
 * 							法三，DatagramSocket(int port,InetAddress laddr)//以本机端口号和本机IP为参数
 * 							注：创建DatagramSocket对象时，如果没有指明本地端口号和IP，系统会自动为其绑定一个可用的本地端口号和可用的本地IP地址
 * 							易错：创建该对象时，容易触发SocketException,必须在程序中进行处理（捕获或抛出）
 * 						3）使用该对象的receive(接收到的数据的存放地址)方法
 * 							receive()会使它所在的线程处于阻塞态，等待数据报的到来，直到收到一个数据报为止
 * 						4）使用该对象的send(待发送DatagramPacket对象)方法
 * 							send()会根据数据报（即DatagramPacket对象）中的目的地址来寻址以传递数据报
 * 				DatagramPacket类，
 * 						1）用来表示一个UDP数据报，它是客户端和服务器端传输的数据的载体
 * 						2）创建DatagramPacket对象
 * 							法一，DatagramPacket(byte buf[],int length)//用于数据报接收端
 * 							法二，DatagramPacket(byte buf[],int length,InetAddress addr,int port)//用于数据报发送端
 *  						法三，DatagramPacket(byte buf[],int offset,int length)//用于数据报接收端
 *  						法四，DatagramPacket(byte buf[],int offset,int length,InetAddress addr,int port)//用于数据报发送端
 *  						说明：buf：byte[] 数据报数据
 *  							length:int  数据报中数据长度
 *  							addr：InetAddress 目的IP
 *  							port：int 目的端口
 *  							offset：int 数据报的位移量
 *  						易错点：创建DatagramPacket对象时的注意事项（编程思路）
 *  							数据报发送端，使用法二或法四去创建DatagramPacket对象，作为待发送的数据的载体
 *  							数据报接收端，使用法一或法三创建    “空的”  DatagramPacket对象，并且要指定接收数据的缓冲区及其长度，等待接收数据
 * 编程思想：包含两个程序
 * 			客户端程序
 * 			服务器端程序
 * 客户端程序和服务器端程序的交互过程：
 * */
package net_communication_programming;

public class Method3_BasedOnDatagramSocket_UDP_TransitionLayer {

}
