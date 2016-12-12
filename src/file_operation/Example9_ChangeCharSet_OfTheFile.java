/**
 * @author lxrm\
 * @date 20161116
 * @description 将文件由一种编码格式转换成另一种编码格式，如将utf8文件转化成GBK编码方式
 * 				转换完成后将存在两个文件（原文件以及新编码格式的文件）
 * 	         （ 现存问题）没有验证，不知道编码结果对不对
 * @编程思路
 * 		将数据从源文件中读取出来
 * 		调用String构造函数将其转化成另一种编码格式
 * 		将新的编码格式的数据信息存储到另一个文件中
 * 		完全转换完毕，将相应资源释放*/
package file_operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example9_ChangeCharSet_OfTheFile {
	public static void main(String[] args){
		String oldPath="d:/helloGBK.txt";//待处理文件,GBK编码格式
		String newPath="d:/helloCharArray.txt";//处理结果放在这个文件中（即原文件解码后的文件，存放的是String）
		File oldfile=new File(oldPath);
		File newfile=new File(newPath);
		if(!oldfile.exists()||!oldfile.isFile()){//如果待处理文件不存在，则退出程序
			System.out.println("请检查您输入的文件路径是否有误，或者相应位置是否有同名目录");
			return;
		}
		if(!newfile.exists()){
			try {
				newfile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			byte[] buffer=new byte[1024];//缓冲区
			FileInputStream in=new FileInputStream(oldfile);
			FileOutputStream out=new FileOutputStream(newfile);
			while(in.read(buffer)!=-1){
				String str=new String(buffer,0,buffer.length,"GBK");//转换成utf8编码
				out.write(str.getBytes());
			}
			out.close();
			in.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end main

}
