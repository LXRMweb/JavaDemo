/**
 * @author lxrm
 * @date 20161114
 * @description ����������˵�����ɾ��һ���ļ�
 * 		�����ܣ���Ӧ�ļ�����ʱ��ɾ����Ӧ���ļ�
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
