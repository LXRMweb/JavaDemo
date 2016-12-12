/**
 * @author lxrm
 * @date 20161101
 * @description 这个类主要举例说明InetAddress类及其子类Inet4Adress、Inet6Adress的用法
 * 				这些类是java的IP地址封装类，有了这些类，开发人员可以不必了解IP数据包的细节知识，
 * 				直接通过这些类中的成员方法进行IP地址相关的操作
 * 			1）获取InetAddress对象
 * 				1.1)说明，由于InetAddress的构造函数是私有的，所以不能使用其构造函数获取该对象
 * 					常常使用InetAddress类中的static方法来获取InetAddress对象实例
 * 				1.2)InetAddress类中用于获取InetAddress对象的static函数有多个
 *	 				public static InetAddress getByName(String host)//参数host为IP对应的域名
					public static InetAddress getLocalHost()
 *	 				public static InetAddress[] getAllByName(String host)//一个域名可能对应多个IP
					public static InetAddress getByAddress(byte[] addr)
					public static InetAddress getByAddress(String host,byte[] addr)
			    1.3)使用上述static函数来获取InetAddress对象的时候要注意有可能会发生异常，如无法访问DNS或者没有查找到对应的
			    	对象时，就会触发UnknownHostException异常，所以必须把获取InetAddress对象的语句放在try...catch中
 * 			2）InetAddress类中的其他成员方法（实例成员方法）
 * 				2.1）概述，通过1）中方法获取了InetAddress对象之后，就可以使用所获得的对象调用该类中的实例成员方法
 * 				2.2）public String getHostName()//获取InetAddress对象对应的域名
 * 					public String getHostAddress()//获取InetAddress对象对应的IP
 * 					public byte[] getAddress()//获取InetAddress对象对应的IP，以byte[]形式展示
 * 					...//其他“实例成员方法”
 * 				*/
package net_communication_programming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class UsageOf_InetAddress {
	public static void main(String[] args){
		InetAddress address = null;
		//1)获取InetAddress对象
		try{
			System.out.println("1)通过调用InetAddress类中的static方法获得InetAddress对象：\n");
			address=InetAddress.getLocalHost();
			System.out.println("   InetAddress.getLocalHost()结果\n   "+address+"\n");//结果：chen-PC/10.203.23.66
			address=InetAddress.getByName("localhost");
			System.out.println("   InetAddress.getByName(\"localhost\")结果\n   "+address+"\n");//结果：localhost/127.0.0.1
			address=InetAddress.getByName("www.baidu.com");
			System.out.println("   InetAddress.getByName(\"www.baidu.com\")结果\n   "+address+"\n");//结果：www.baidu.com/61.135.169.125
			InetAddress[] addrs=InetAddress.getAllByName("www.baidu.com");
			System.out.println("   InetAddress.getAllByName(\"www.baidu.com\")结果   ");
			for(InetAddress addr:addrs){
				System.out.println("   "+addr);
			}//结果：www.baidu.com/61.135.169.121
				// www.baidu.com/61.135.169.125
		}catch(UnknownHostException e){
			System.out.println(e);
		}
		//2)通过1)中获取的InetAddress对象调用InetAddress类中的“实例成员方法”
		System.out.println("2)通过1)中所获得的InetAddress对象调用InetAddress类中的实例方法");
		System.out.println("   "+address.getHostName());//结果：www.baidu.com
		System.out.println("   "+address.getHostAddress());//结果：  61.135.169.121
		System.out.println("   "+address.getAddress().toString());//结果：[B@1afae45
	}//end of main
}//end of class
