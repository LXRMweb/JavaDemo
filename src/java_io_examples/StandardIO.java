/**
 * @author lxrm
 * @date 20161107
 * @description 这个类专门测试java中标准输入输出流以及标准错误流的用法
 *概述：     对应的类java.lang.System类
 * 			System类中除了有标准输入输出流、标准错误流相关的成员函数之外，还有其他的成员函数
 * 		这些其他的成员函数可以用于操作系统属性、垃圾回收、安全...
 * 			System类不能被实例化，且其成员函数都是static的
 * 			System类中有若干与标准输入输出流、标准错误流处理相关的成员函数，这些成员函数被分成System.in
 * 		System.out和System.err三个域，其中每个域中都不止一个成员函数。
 * 详解：本文件中仅讨论System类中与标准输入输出流、标准错误流有关的函数，主要包括以下三个域的成员函数
 * 			1）System.in域成员函数，标准输入流（默认为键盘），可使用System.setIn(InputStream in)指定新的输入流
 * 					实例一：public int read(byte b[]) throws IOException//从标准输入读取数据到函数参数b:byte[]中，并且返回读取的元素个数
 * 					
 * 			2）System.out域成员函数，标准输出流（默认为屏幕），可使用System.setOut(PrintStream out)指定新的输出方向
 * 			3）System.err域成员函数，标准错误输出流（默认情况下输出错误信息到屏幕），可通过System.setErr(PrintStream err)指定新的错误信息输出方向
 * */
package java_io_examples;

import java.io.IOException;

public class StandardIO {
	public static void main(String[] args){
		System.out.println("请在键盘上输入字符，以回车键结束：");
		byte[] buffer=new byte[100];//输入缓冲区
		int count=0;
		try {
			//实例一
			count= System.in.read(buffer);//从键盘读取数据到缓冲区buffer中,并且将读取的byte类型元素的个数作为返回值赋值给count：int
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("这次一共从标准输入读取了"+count+"个byte类型的元素，分别是：");
		for(int i=0;i<buffer.length;i++){
			System.out.println("buffer["+i+"]="+buffer[i]);
		}
		System.out.println("将byte[] buffer 中的内容转化成字符形式输出：");
		for(int i=0;i<count;i++){
			System.out.print((char)buffer[i]);
		}
		try {
			System.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
