/**
 * @author lxrm
 * @date 20161107
 * @description:����ļ����ڽ���File��ĳ�Ա������ʹ��ʵ��
 * 		����:File�����ʾһ��·����������һ���ļ�(����·�����ļ�)
 * 		���캯����
 * 			public File(String pathname)�����ַ���·�������ļ�����
 * 			public File(String parent,String child)���ݸ�·���ַ�������·���ַ��������ļ�����
 * 			public File(File parent,String child)���ݸ�·���������·���ַ��������ļ�����
 * 		���ļ���������صĳ�Ա������
 * 			String getName()�õ�һ���ļ������ƣ�������·����
 * 			String getPath()�õ�һ���ļ���·����
 * 			String getAbsolutePath()�õ�һ���ļ��ľ���·����
 * 			String getParent()
 * 			String renameTo(File newName)
 * 		�ļ�������س�Ա������
 * 			boolean exists()
 * 			boolean canWrite()
 * 			boolean canRead()
 * 			boolean isFile()
 * 			boolean isDirectory()
 * 			long lastModified()�����ļ����һ���޸�ʱ��
 * 			long length()�ļ����ȣ������ֽ�
 * 		����������
 * 			boolean delete()ɾ����ǰ�ļ�
 * 			boolean mkdir()���ɵ�ǰFile�����������Ŀ¼,ֻ������Ŀ¼�����������ļ�
 * 			boolean mkdirs()  //���������mkdir()������������ڣ�ǰ���Ǵ����������Ŀ¼������ֻ�ܴ�������Ŀ¼
 * 			String list()�г���ǰĿ¼�µ��ļ�
 * 			File[] listFiles()�г���ǰĿ¼���������ļ��Լ���Ŀ¼��Ӧ��File����
 * 			File[] listRoots()�г���������ϵͳ�̷���C:/  D:/  E:/  ...
 *ʹ��ʵ����
 *	1�� */
package file_operation;

import java.io.File;

public class Use_File {
	public static void main(String[] args){
		String path="/AppData/readme.txt";
		File rootDirectory=new File(path);
		System.out.println("/AppDataĿ¼�Ƿ���ڣ�"+rootDirectory.exists());
		if(!rootDirectory.exists()){//�����File�����������Ŀ¼�����ڣ��͵���File�����mkdir()������ӦĿ¼
			rootDirectory.mkdir();
		}
		String absolutePath=rootDirectory.getAbsolutePath();
		System.out.println("����·����"+absolutePath);
	}
}

