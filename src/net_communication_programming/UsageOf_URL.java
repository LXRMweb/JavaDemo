/**
 * @author lxrm
 * @date 20161101
 * @description 本文件举例讲解URL类的用法
 * 			1）获取URL对象，共有四种方法
 * 				法一，public URL(string spec)//使用完整的url字符串作为参数
 * 				法二，public URL(URL context,String spec)//使用已有URL对象+扩展部分为参数
 * 				法三，public URL(String protocol,String host,String file)//使用协议类型+域名+文件地址为参数
 * 				法四，public URL(String protocol,String host,int port,String file)//使用协议类型+域名+端口号+文件地址为参数
 * 				易错点，调用URL构造函数时，有可能会触发MalformedURLException,因此生成URL对象时，注意处理这一异常，
 * 					  可以抛出异常或者使用try..catch进行捕获
 * 			2)URL对象的成员方法的使用
 * 				2.1）一般成员方法，用于获取URL对象的相关属性
	 * 				public String getProtocol()//该URL对象  的协议
	 * 				public String getHost()//该URL对象的    域名
	 * 				public int getPort()//该URL对象的  端口号
	 * 				public String getFile()//该URL对象的   文件名
	 * 				public String getPath()//获取该URL对象中的路径
	 * 				public String getRef()//获取该URL对象中的锚
	 * 				public String getQuery()//获取该URL对象中的   查询信息
	 * 				public String getUserInfo()//获取使用者信息
	 * 				public String getAuthority()//获取该URL对象的权限信息
 * 					...其他成员方法
 * 				2.2）openStream()方法，使用该方法返回一个InputStream对象，进而读取该URL对象指向的网页资源
 * 					注：使用URL对象的openStream()只能从网页上读取资源，无法从客户端向网页中输入数据，当需要向服务器端发送一些数据的时候，
 * 					必须要借助于URLConnection类对象及其成员方法
 * 					step1，获取URL对象
 * 					step2，使用step1中获得的URL对象调用openStream(),获得InputStream对象
 * 					step3，InputStream-->InputStreamReader-->BufferedReader
 * 					step4，使用BuffedredReader对象中成员方法读取URL对象对应的网页资源，
 * 					step5,对读取到的网络资源数据进行下一步处理（如本程序中是将读进来的数据输出到屏幕上）
 * 					step6，关闭字符串处理流（如本程序中in.close()）
 * */
package net_communication_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UsageOf_URL {
	public static void main(String[] args){
		
		try{
			//1）获取URL对象，共有四种方法
			URL url=new URL("https://www.baidu.com/");//法一获得URL对象，结果：https://www.baidu.com/
			URL url2=new URL(url,"index.html");//法二，结果：https://www.baidu.com/index.html
			URL url3=new URL("http","www.12306.cn","/mormhweb/index.html");//法三，结果：http://www.12306.cn/mormhweb/index.html
			URL url4=new URL("http","www.12306.cn",80,"/mormhweb/index.html#BOTTOM");//法四，结果：http://www.12306.cn:80/mormhweb/index.html#BOTTOM
			System.out.println("1)创建URL对象,共有四种方法");
			System.out.println("   "+url+"\n   "+url2+"\n   "+url3+"\n   "+url4);
			//2)使用URL对象的其他成员方法
			//	2.1）一般成员方法，用于获取URL对象的相关属性
			System.out.println("2)使用URL对象的其他成员方法\n    2.1）一般成员方法，用于获取URL对象的相关属性");
			System.out.println(url4.getProtocol());//结果：http
			System.out.println(url4.getHost());//结果：www.12306.cn
			System.out.println(url4.getPort());//结果：80
			System.out.println(url4.getFile());//结果：/mormhweb/index.html
			System.out.println(url4.getRef());//结果：BOTTOM
			//getFile():String=getPath():String+getQuery():String 即第一个函数的返回值是后两个函数的返回值的叠加结果
			System.out.println(url4.getPath());//结果：/mormhweb/index.html
			System.out.println(url4.getQuery());//结果：null
			System.out.println(url4.getUserInfo());//结果：null
			System.out.println(url4.getAuthority());//结果：www.12306.cn:80
			//2)使用URL对象的其他成员方法
			//	2.2）借助URL中的openStream()方法，读取该URL对象指向的网络资源，并作进一步处理
			System.out.println("2)使用URL对象的其他成员方法\n    2.2）借助URL中的openStream()方法，读取该URL对象指向的网络资源，并作进一步处理");
			BufferedReader in=new BufferedReader(new InputStreamReader(url4.openStream()));//step2-step3
			while(in.readLine()!=null){
				System.out.println(in.readLine());//step4-step5
			}
			in.close();//step6
		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}//end main
	
}//end class
