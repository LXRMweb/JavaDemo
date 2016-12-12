/**
 * @author lxrm
 * @date 20161114
 * @description ����Ŀ¼������Ŀ¼
 * �ִ�ȱ�㣺���������������ڹ۲����Ŀ¼������Ŀ¼�Ĳ㼶��ϵ
 * 		     ��lastModified()����ֵû�и�ʽ���������������ĸ�ʽ
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
