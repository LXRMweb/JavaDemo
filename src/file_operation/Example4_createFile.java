/**
 * @author lxrm
 * @date 20161114
 * @description ����������˵����δ����ļ�
 * 		�����ܣ�ָ��·����������Ӧ�ļ�ʱ���򴴽��ļ����Ѿ�������Ӧ�ļ�ʱ�����ᴴ����Ӧ���ļ�*/
package file_operation;

import java.io.File;
import java.io.IOException;

public class Example4_createFile {
	public static void main(String[] args){
		String path="d:/AppData/";
		File dir=new File(path);
		if(!dir.exists()){//step1:���ж�ָ����Ŀ¼�Ƿ���ڣ��������ڣ��ȴ�����ӦĿ¼
			dir.mkdir();
		}
		File file1=new File(path,"hello.txt");
		if(!file1.exists()){//step2���ļ�������ʱ�����ļ�
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
