/**
 * @author lxrm
 * @date 20161101
 * @description java网络编程有三种方式，具体包含基于应用层的网络编程、基于传输层的两种网络编程方式
 * 				本程序讲解第一种方式，即基于应用层URL的网络编程，这种网络编程方式涉及到如下类
 * 		三种网络编程方式的比较：
 * 			应用场合不同，基于URL的高层次的网络编程可以使用http协议跨越网络防火墙，所以适用于面向Internet
 * 		的通信，而基于Socket和TCP协议的低层次的网络编程更适合于内部通信（同一个网段的局域网主机间的通信）
 * 				
 * 				本程序讲解第一种方式，即基于应用层URL的网络编程，这种网络编程方式涉及到如下类				
 *			    URL类，
 * 					可以用于定位互联网上的资源
 * 					资源存在的情况下，可以使用流的方式读取该资源（但只能读取，无法完成向服务器传送数据的任务）
 * 					URL类无法独自完成向服务器传送数据的任务
 * 				URLConnection类，
 * 					定位到资源后可以使用该类中的方法读取资源内容且获得头信息
 * 					可用于提交表单数据，也就是可以向服务器传送数据
 * 				URLEncoder类，
 * 					用于将普通格式的字符串转化成MIME格式的字符串（即合法的URL地址）
 * 				URLDecoder类，
 * 					用于将MIME格式的字符串(URL)转化成普通格式的字符串
 * 编程思路：
 * 		step1，创建URL对象
 * 				法一，public URL(string spec)//使用完整的url字符串作为参数
 * 				法二，public URL(URL context,String spec)//使用已有URL对象+扩展部分为参数
 * 				法三，public URL(String protocol,String host,String file)//使用协议类型+域名+文件地址为参数
 * 				法四，public URL(String protocol,String host,int port,String file)//使用协议类型+域名+端口号+文件地址为参数
 * 				易错点，调用URL构造函数时，有可能会触发MalformedURLException,因此生成URL对象时，注意处理这一异常，
 * 					  可以抛出异常或者使用try..catch进行捕获
 * 		step2，使用URL的openConnection()获得URLConnection对象
 * 				获得URLConnection对象的过程也就是建立网络通信链接的过程
 * 				如果连接过程失败，则会触发IOException异常
 * 		step3，调用URLConnection对象的各个成员方法获取或者设置各个参数
 * 		step4，建立到远程对象的实际连接
 * 		step5，“远程对象”变为可用，可以获取远程对象的一些属性信息
 * 		step6.1，读取远程对象的内容
 * 		step6.2，向服务器端发送数据*/
package net_communication_programming;

import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Method1_BasedOnURL_ApplicationLayer {
	public static void main(String[] args){
		try {
			//step1，创建URL对象
			URL url=new URL("https://www.baidu.com/");//法一获得URL对象，结果：https://www.baidu.com/
			URL url2=new URL(url,"index.html");//法二，结果：https://www.baidu.com/index.html
			URL url3=new URL("http","www.12306.cn","/mormhweb/index.html");//法三，结果：http://www.12306.cn/mormhweb/index.html
			URL url4=new URL("http","www.12306.cn",80,"/mormhweb/index.html");//法四，结果：http://www.12306.cn:80/mormhweb/index.html
			System.out.println("step1,创建URL对象");
			System.out.println(url+"\n"+url2+"\n"+url3+"\n"+url4);
			//step2，使用URL的openConnection()获得URLConnection对象
			URLConnection urlConn=url.openConnection();
			//step3，调用URLConnection对象的各个成员方法获取或者设置各个参数
			urlConn.setDoInput(true);
			urlConn.setDoOutput(true);//设置成可以向服务器端写数据
			//step4，建立到远程对象的实际连接
			urlConn.connect();
			//step5，“远程对象”变为可用
			System.out.println(urlConn.getContentType());//结果：text/html
			System.out.println(urlConn.getContentEncoding());//结果：null
			System.out.println(urlConn.getContentLength());//结果：2443
			System.out.println(urlConn.getDate());//举例19700101日多少毫秒，结果：1477997394000
			//step6，读取远程对象的内容
			Scanner in=new Scanner(urlConn.getInputStream());
			while(in.hasNextLine()){
				System.out.println(in.nextLine());
			}
			//step6.2，向服务器端发送数据
			//PrintStream out=new PrintStream(urlConn.getOutputStream());
			//out.println("this is from client1");
		}catch(UnknownHostException e){
			System.out.println(e);
		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
