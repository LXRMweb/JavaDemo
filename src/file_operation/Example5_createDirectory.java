/**
 * @author lxrm
 * @date 20161114
 * @description ����������˵����δ���Ŀ¼
 * 		�����ܣ���ӦĿ¼������ʱ��������ӦĿ¼���Ѿ�����ʱ��������
 */
package file_operation;

import java.io.File;

public class Example5_createDirectory {
	public static void main(String[] args){
		String path="D:/AppData/files";
		File directory=new File(path);
		System.out.println("Ŀ¼�Ƿ���ڣ�"+directory.exists());
		if(!directory.exists()){//��File�����������Ŀ¼������ʱ����ȥ����File�����mkdirs()ȥ������ӦĿ¼
			System.out.println("������Ӧ��Ŀ¼");
			boolean flag=directory.mkdirs();//ע��mkdirs()��mkdir()������
			System.out.println("�Ƿ񴴽��ɹ���"+flag);
		}
		System.out.println("Ŀ¼�Ƿ���ڣ�"+directory.exists());
	}//end main	
}
