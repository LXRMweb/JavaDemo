/**
 * @author lxrm
 * @date 20161110
 * @description ����ļ���ʵ�ֵĹ����ǣ���D:/AppDataĿ¼�������ӵ��ļ�����Ŀ¼�Զ����ݵ�D:/AppData/backupĿ¼��
 *						ÿ�������������󣬳��򶼻�Ա�ԴĿ¼�ͱ���Ŀ¼�µ��ļ��Լ���Ŀ¼���������ԴĿ¼��ĳ���ļ��ĸ���ʱ��
 *						Ҫ���ڱ���Ŀ¼�¸��ļ��ĸ���ʱ�䣬��ԴĿ¼�¸��ļ�����һ�ݵ�����Ŀ¼ 
 *״̬������ļ��ǲ������ģ���û������ʵ���ļ����ݹ���*/
package file_operation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3_AutoBackup {
	public static void main(String[] args){
		String sourcePath="D:/AppData";
		String backupPath="/backup";
		File source=new File(sourcePath);
		File backup=new File(source,backupPath);
		if(!source.exists()){
			source.mkdir();
		}
		if(!backup.exists()){
			backup.mkdir();
		}
		new Example3_AutoBackup().update(source,backup);
	}
	/*���ܣ���ԴĿ¼�е��ļ����ݵ�����Ŀ¼*/
	private boolean update(File source,File backup){
		String[] files=source.list();
		System.out.println("ԴĿ¼��"+source.getAbsolutePath()+"\n���ļ����������ļ��Լ���Ŀ¼��");
		for(int i=0;i<files.length;i++){
			File file=new File(files[i]);
			this.getInfo(file);
		}
		return false;
	}
	private void getInfo(File file){
		SimpleDateFormat date=new SimpleDateFormat("yyyy��MM��dd��hhʱmm��");
		if(file.isDirectory()){
			System.out.println("��Ŀ¼\t"+file.getPath()+"\t"+file.lastModified());
		}else{
			System.out.println("�ļ�\t"+file.getName()+"\t"+file.length()+"\t"+date.format(new Date(file.lastModified())));
		}
		
	}
}
