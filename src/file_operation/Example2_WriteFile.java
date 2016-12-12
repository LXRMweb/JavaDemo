/**
 * @author lxrm
 * @date 20161108
 * @description д���ݵ��ļ���
 * ���˼·��
 * 		step1������������
 * 		step2��׼����Ҫд���ļ�������
 
 * 		step4�������ļ������
 * 		step5��ͨ���ļ������������д��Ŀ���ļ���
 * 		step6������ȫ��д��֮�󣬽��ļ�������رգ��ͷ���Ӧϵͳ��Դ�����ļ�����ȣ�
 * 
 * 
 * ���API��
 * 		FileOutputStream��
 * 			���캯����public FileOutputStream(String name, boolean append)�ڶ�������Ϊtrueʱ���µ����ݻ�׷�ӵ���Ӧ�ļ���β���������Ǹ���ԭ�ļ�
 * 				   public FileOutputStream(String name)����ԭ�ļ���������ԭ�ļ�β��׷������
 * 					public FileOutputStream(File file)
 * 					 public FileOutputStream(File file, boolean append)
 * 					public FileOutputStream(FileDescriptor fdObj)	
 * 			��Ա����
 * 				private native void write(int b, boolean append)
 * 				public void write(int b)
 * 				private native void writeBytes(byte b[], int off, int len, boolean append)
 * 				public void write(byte b[]) 
 * 				public void write(byte b[], int off, int len) 
 * 				����
 * */
package file_operation;
		
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2_WriteFile {
	public static void main(String[] args){
		//step1
		int size=512;//��������С����λΪ�ֽ�
		byte[] buffer=new byte[size];//����������
		//step2
		int count=0;
		System.out.println("����������Ҫд���ļ������ݣ�");
		try {
			count=System.in.read(buffer);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//step4
		String path="d:/hello.txt";
		FileOutputStream out=null;
		try {
			out=new FileOutputStream(path);//�ú����������ǣ�path�ļ�������ʱ���������ļ���д���ļ���path�ļ�����ʱ��   ����  ԭ���ļ�
									/*�������ļ���ԭ�����ݵĻ�����׷���µ����ݣ������Ǹ��ǣ�����Ҫ�ڴ���OutputFileStream����ʱ�����乹�캯����ָ��*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			//step5
			out.write(buffer,0,count);
			//step6
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���ղ�����������Ѿ������"+path);
	}
}
