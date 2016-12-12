/**
 * @author lxrm
 * @date 20161107
 * @description 这个文件展示了文件读取的编程思路
 * 程序功能：每次从d:/index.html文件中读取size字节的文件数据并存储在缓冲区buffer：byte[size]中，
 * 		  注意有可能读取到最后时，最后一次读取到的数据不足size字节大小哦，
 * 		  将缓冲区buffer:byte[size]中的数据转成String输出到屏幕
 * 编程思路：
 * 		step1：创建缓冲区
 * 		step2：创建文件输入流对象
 * 		step3：读取文件数据到缓冲区buffer：byte[]中
 * 		step4：对读取到的文件数据作后续处理
 * 		step5：文件数据全部读完之后，关闭输入流，释放其占用的相关系统资源(如释放文件句柄等)
 * 
 * 相关javaAPI：
 * 		FileInputStream类
 * 			构造函数
 * 				public FileInputStream(String name)
 * 				public FileInputStream(File file)
 * 				public FileInputStream(FileDescriptor fdObj)
 * 			read() //从文件输入流中读取one byte数据，如果没有输入可用，此方法将会阻塞
 * 			read(byte[] b) //从输入流中读取最多b.length个字节的数据，放到b:byte[]中，在某些输入可用之前，此方法将阻塞
 * 			read(byte[] b,int off,int len) //从输入流中读取最多len个字节放到b数组中以索引值off开始的位置，会阻塞
 * 			
 * */
package file_operation;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Example1_readFile1 {
	public static void main(String[] args){
		
		//step1
		int size=512;//缓冲区大小，单位为byte
		byte[] buffer=new byte[size];//分配缓冲区
		int num=0;//每次读取时实际读取到的数据大小，单位为byte
		int totalNum=0;//记录从文件中读取到的字节总数目
		//step2
		FileInputStream in=null;//文件输入流对象
		try {
			in = new FileInputStream("d:/index.html");
			/*
			 * String path="d:/index.html";
			 * File file=new File(path);
			 * if(file.exists()){
			 * 		in=new FileInputStream(file);
			 * }
			 */
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			//step3
			while((num=in.read(buffer,0,size))!=-1){//每次从文件中读取size字节的数据放到缓冲区buffer:byte[]从0开始的位置，读取到文档末尾时返回值为-1，跳出while循环
			//step4
				totalNum+=num;
				System.out.print(new String(buffer,0,num));
			}
			System.out.println("d:/index.html  文件总大小："+totalNum+"字节");
			//step5
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
