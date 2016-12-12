/**
 * @author lxrm
 * @date 20161114
 * @description 这个程序举例说明如何删除一个目录以及该目录下所有子目录、子文件
 * 		程序功能：相应目录存在时，删除目录下文件，
 * 			        并且对于其子目录递归调用该函数来删除相应子目录中文件
 */
package file_operation;

import java.io.File;

public class Example6_deleteDirectory {
	public static void main(String[] args){
		String dir="d:/AppData";
		File directory=new File(dir);
		System.out.println(directory.getAbsolutePath()+"是否存在："+directory.exists());
		if(directory.exists()&&directory.isDirectory()){
			System.out.println("删除该目录以及其子目录、目录下文件...");
			deleteDirectory(directory);
		}
	}//end main
	/**
	 * @param dir:File 这个参数必须是一个真实存在的目录*/
	public static void deleteDirectory(File dir){
		File[] files=dir.listFiles();//列出目录下所有文件以及子目录
		for(int i=0;i<files.length;i++){
			if(files[i].isFile()){//删除当前目录下的所有文件
				files[i].delete();
			}else{//对于子目录，递归调用deleteDirectory()
				deleteDirectory(files[i]);
			}
		}
		dir.delete();//删除已经变成空目录的当前目录
	}
}
