/**
 * @author lxrm
 * @date 20161101
 * @description java网络编程有三种方式，具体包含基于应用层的网络编程、基于传输层的两种网络编程方式
 * 				本程序讲解第二种方式，即基于传输层的低层次网络编程，其中传输层协议是TCP协议
 * 		三种网络编程方式的比较：
 * 			应用场合不同，基于URL的高层次的网络编程可以使用http协议跨越网络防火墙，所以适用于面向Internet
 * 		的通信，而基于Socket和TCP协议的低层次的网络编程更适合于内部通信（同一个网段的局域网主机间的通信）
 * 
 * 				本程序讲解第二种方式，即基于传输层TCP协议的Socket编程，这种编程方法涉及到如下几个类：
 * 				Socket类，
 * 					1）其内部成员方法可以用于建立通信连接
 * 					      其成员方法getInputStream()和getOutputStream()分别可用于创建网络输入流、网络输出流对象
 * 					2）close()方法可以关闭socket对象，释放其占用的资源
 * 				SocketServer类，
 * 					1）用于监听端口
 * 					       其成员方法accept()可以用于监听端口，没有请求时处于使所处线程处于阻塞态，客户端请求来临时，由阻塞态变成就绪态
 * 					       重新变成运行态之后立马创建新的Socket对象，
 * 					
 * 编程思路：包含两个java文件，
 * 			客户端程序.java（该程序的编写规则请参见Method2_example1_ClientSocket.java）
 * 			服务器端程序.java（该程序的编写规则请参见Method2_example1_ServerSocket.java）
 * 两个程序的交互过程：
 * 		step1，先启动服务器端程序
 * 				服务器程序运行，创建了ServerSocket对象，且使服务器端程序绑定了“SERVERPORT”端口
 * 				调用serverSocket.accept()函数，使得accept()所在线程处于阻塞态，等待客户端向“SERVERPORT”端口发出连接请求
 * 		step2，启动客户端程序
 * 				客户端创建Socket对象，向服务器端发出连接请求
 * 		step3，服务器端程序接受客户端的连接请求
 * 				客户端发出连接请求被服务端accept()函数捕获，则accept()所在服务器线程进入就绪态，
 * 				再次变成运行态后立即创建Socket对象
 * 				之后又利用上面所得Socket对象以及其他资源（如本例中number）开启一个新的线程
 * 				线程中去处理此次连接的后续工作（包括网络输入输出流的建立，数据交互，通信完成后的资源的释放等等）
 * 		step4，客户端与服务器端进行数据交互
 * 				通信以流的方式进行，所以首先要打开两端Socket的输入和输出流
 * 				然后按照某种约定的协议对Socket进行读写操作（即服务器端Socket监听某个端口是否有来自客户端的请求，
 * 												客户端向服务器端发出请求，服务器端接受请求
 * 												服务器端向客户端发出回应消息）
 * 		step5，根据终止条件判定通信结束，关闭并释放相应的资源
 * 		
 */
package net_communication_programming;

public class Method2_BasedOnSocket_TCP_TransitionLayer {
	public static void main(String[] args){
		
	}

}
