/**
 * @author lxrm
 * @date 20161114
 * @description 这个程序举例说明如何创建文件
 * 		程序功能：指定路径不包含相应文件时，则创建文件，已经包含相应文件时，不会创建相应的文件*/
package file_operation;

import java.io.File;
import java.io.IOException;

public class Example4_createFile {
	public static void main(String[] args){
		String path="d:/AppData/";
		File dir=new File(path);
		if(!dir.exists()){//step1:先判断指定的目录是否存在，若不存在，先创建相应目录
			dir.mkdir();
		}
		File file1=new File(path,"hello.txt");
		if(!file1.exists()){//step2：文件不存在时创建文件
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
