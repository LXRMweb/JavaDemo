/**
 * @author lxrm
 * @date 20161107
 * @description:这个文件用于讲述File类的成员方法的使用实例
 * 		概述:File对象表示一个路径，或者是一个文件(含有路径的文件)
 * 		构造函数：
 * 			public File(String pathname)根据字符串路径建立文件对象
 * 			public File(String parent,String child)根据父路径字符串和子路径字符串建立文件对象
 * 			public File(File parent,String child)根据父路径对象和子路径字符串建立文件对象
 * 		和文件名处理相关的成员函数：
 * 			String getName()得到一个文件的名称（不包括路径）
 * 			String getPath()得到一个文件的路径名
 * 			String getAbsolutePath()得到一个文件的绝对路径名
 * 			String getParent()
 * 			String renameTo(File newName)
 * 		文件属性相关成员函数：
 * 			boolean exists()
 * 			boolean canWrite()
 * 			boolean canRead()
 * 			boolean isFile()
 * 			boolean isDirectory()
 * 			long lastModified()返回文件最后一次修改时间
 * 			long length()文件长度，多少字节
 * 		其他操作：
 * 			boolean delete()删除当前文件
 * 			boolean mkdir()生成当前File对象所代表的目录,只是生成目录，不能生成文件
 * 			boolean mkdirs()  //这个函数和mkdir()的最大区别在于，前者是创建单层或多层目录，后者只能创建单层目录
 * 			String list()列出当前目录下的文件
 * 			File[] listFiles()列出当前目录下所有子文件以及子目录对应的File对象
 * 			File[] listRoots()列出本机可用系统盘符，C:/  D:/  E:/  ...
 *使用实例：
 *	1） */
package file_operation;

import java.io.File;

public class Use_File {
	public static void main(String[] args){
		String path="/AppData/readme.txt";
		File rootDirectory=new File(path);
		System.out.println("/AppData目录是否存在："+rootDirectory.exists());
		if(!rootDirectory.exists()){//如果该File对象所代表的目录不存在，就调用File对象的mkdir()生成相应目录
			rootDirectory.mkdir();
		}
		String absolutePath=rootDirectory.getAbsolutePath();
		System.out.println("绝对路径："+absolutePath);
	}
}

