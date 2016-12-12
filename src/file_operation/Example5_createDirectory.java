/**
 * @author lxrm
 * @date 20161114
 * @description 这个程序举例说明如何创建目录
 * 		程序功能：相应目录不存在时，创建相应目录；已经存在时，不创建
 */
package file_operation;

import java.io.File;

public class Example5_createDirectory {
	public static void main(String[] args){
		String path="D:/AppData/files";
		File directory=new File(path);
		System.out.println("目录是否存在："+directory.exists());
		if(!directory.exists()){//该File对象所代表的目录不存在时，才去调用File对象的mkdirs()去创建相应目录
			System.out.println("创建相应的目录");
			boolean flag=directory.mkdirs();//注意mkdirs()和mkdir()的区别
			System.out.println("是否创建成功："+flag);
		}
		System.out.println("目录是否存在："+directory.exists());
	}//end main	
}
