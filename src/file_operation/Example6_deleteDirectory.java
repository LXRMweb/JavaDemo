/**
 * @author lxrm
 * @date 20161114
 * @description ����������˵�����ɾ��һ��Ŀ¼�Լ���Ŀ¼��������Ŀ¼�����ļ�
 * 		�����ܣ���ӦĿ¼����ʱ��ɾ��Ŀ¼���ļ���
 * 			        ���Ҷ�������Ŀ¼�ݹ���øú�����ɾ����Ӧ��Ŀ¼���ļ�
 */
package file_operation;

import java.io.File;

public class Example6_deleteDirectory {
	public static void main(String[] args){
		String dir="d:/AppData";
		File directory=new File(dir);
		System.out.println(directory.getAbsolutePath()+"�Ƿ���ڣ�"+directory.exists());
		if(directory.exists()&&directory.isDirectory()){
			System.out.println("ɾ����Ŀ¼�Լ�����Ŀ¼��Ŀ¼���ļ�...");
			deleteDirectory(directory);
		}
	}//end main
	/**
	 * @param dir:File �������������һ����ʵ���ڵ�Ŀ¼*/
	public static void deleteDirectory(File dir){
		File[] files=dir.listFiles();//�г�Ŀ¼�������ļ��Լ���Ŀ¼
		for(int i=0;i<files.length;i++){
			if(files[i].isFile()){//ɾ����ǰĿ¼�µ������ļ�
				files[i].delete();
			}else{//������Ŀ¼���ݹ����deleteDirectory()
				deleteDirectory(files[i]);
			}
		}
		dir.delete();//ɾ���Ѿ���ɿ�Ŀ¼�ĵ�ǰĿ¼
	}
}
