/**
 * @author lxrm
 * @date 20161114
 * @description 遍历目录及其子目录
 * 现存缺点：程序输出结果不便于观察各个目录及其子目录的层级关系
 * 		     且lastModified()返回值没有格式化成人类易于理解的格式
 * */
package file_operation;

import java.io.File;

public class Example7_iterate_dir {
	public static void main(String[] args){
		String directory="d:/AppData";
		File dir=new File(directory);
		if(dir.exists()&&dir.isDirectory()){
			iterateDirectory(dir);
		}
	}//end main
	public static void iterateDirectory(File dir){
		System.out.println("<dir>\t"+dir.getPath()+"\t"+dir.lastModified());
		File[] list=dir.listFiles();
		for(int i=0;i<list.length;i++){
			if(list[i].isFile()){
				System.out.println("<file>\t"+list[i].getName()+"\t"+list[i].lastModified());
			}else{
				iterateDirectory(list[i]);
			}
		}
	}

}
