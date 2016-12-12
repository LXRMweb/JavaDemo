/**
 * @author lxrm
 * @date 20161108
 * @description 写数据到文件中
 * 编程思路：
 * 		step1，创建缓冲区
 * 		step2，准备好要写入文件的数据
 
 * 		step4，创建文件输出流
 * 		step5，通过文件输出流将数据写到目的文件中
 * 		step6，数据全部写完之后，将文件输出流关闭，释放相应系统资源（如文件句柄等）
 * 
 * 
 * 相关API：
 * 		FileOutputStream类
 * 			构造函数：public FileOutputStream(String name, boolean append)第二个参数为true时，新的数据会追加到相应文件的尾部，而不是覆盖原文件
 * 				   public FileOutputStream(String name)覆盖原文件而不是往原文件尾部追加数据
 * 					public FileOutputStream(File file)
 * 					 public FileOutputStream(File file, boolean append)
 * 					public FileOutputStream(FileDescriptor fdObj)	
 * 			成员函数
 * 				private native void write(int b, boolean append)
 * 				public void write(int b)
 * 				private native void writeBytes(byte b[], int off, int len, boolean append)
 * 				public void write(byte b[]) 
 * 				public void write(byte b[], int off, int len) 
 * 				。。
 * */
package file_operation;
		
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2_WriteFile {
	public static void main(String[] args){
		//step1
		int size=512;//缓冲区大小，单位为字节
		byte[] buffer=new byte[size];//创建缓冲区
		//step2
		int count=0;
		System.out.println("请输入你想要写入文件的数据：");
		try {
			count=System.in.read(buffer);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//step4
		String path="d:/hello.txt";
		FileOutputStream out=null;
		try {
			out=new FileOutputStream(path);//该函数的作用是：path文件不存在时，创建该文件并写该文件；path文件存在时，   覆盖  原有文件
									/*若想在文件中原有内容的基础上追加新的内容，而不是覆盖，则需要在创建OutputFileStream对象时，在其构造函数中指出*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//step5
			out.write(buffer,0,count);
			//step6
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("您刚才输入的内容已经存放至"+path);
	}
}
