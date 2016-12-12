/**
 * @author lxrm
 * @date 20161114
 * @description 这个程序举例说明如何删除一个文件
 * 		程序功能：相应文件存在时，删除相应的文件
 */
package file_operation;

import java.io.File;

public class Example6_deleteFile {
	public static void main(String[] args){
		File file1=new File("d:/AppData/hello.txt");
		if(file1.exists()&&file1.isFile()){
			file1.delete();
		}
	}

}
