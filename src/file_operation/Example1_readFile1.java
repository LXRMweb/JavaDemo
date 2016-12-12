/**
 * @author lxrm
 * @date 20161107
 * @description ����ļ�չʾ���ļ���ȡ�ı��˼·
 * �����ܣ�ÿ�δ�d:/index.html�ļ��ж�ȡsize�ֽڵ��ļ����ݲ��洢�ڻ�����buffer��byte[size]�У�
 * 		  ע���п��ܶ�ȡ�����ʱ�����һ�ζ�ȡ�������ݲ���size�ֽڴ�СŶ��
 * 		  ��������buffer:byte[size]�е�����ת��String�������Ļ
 * ���˼·��
 * 		step1������������
 * 		step2�������ļ�����������
 * 		step3����ȡ�ļ����ݵ�������buffer��byte[]��
 * 		step4���Զ�ȡ�����ļ���������������
 * 		step5���ļ�����ȫ������֮�󣬹ر����������ͷ���ռ�õ����ϵͳ��Դ(���ͷ��ļ������)
 * 
 * ���javaAPI��
 * 		FileInputStream��
 * 			���캯��
 * 				public FileInputStream(String name)
 * 				public FileInputStream(File file)
 * 				public FileInputStream(FileDescriptor fdObj)
 * 			read() //���ļ��������ж�ȡone byte���ݣ����û��������ã��˷�����������
 * 			read(byte[] b) //���������ж�ȡ���b.length���ֽڵ����ݣ��ŵ�b:byte[]�У���ĳЩ�������֮ǰ���˷���������
 * 			read(byte[] b,int off,int len) //���������ж�ȡ���len���ֽڷŵ�b������������ֵoff��ʼ��λ�ã�������
 * 			
 * */
package file_operation;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Example1_readFile1 {
	public static void main(String[] args){
		
		//step1
		int size=512;//��������С����λΪbyte
		byte[] buffer=new byte[size];//���仺����
		int num=0;//ÿ�ζ�ȡʱʵ�ʶ�ȡ�������ݴ�С����λΪbyte
		int totalNum=0;//��¼���ļ��ж�ȡ�����ֽ�����Ŀ
		//step2
		FileInputStream in=null;//�ļ�����������
		try {
			in = new FileInputStream("d:/index.html");
			/*
			 * String path="d:/index.html";
			 * File file=new File(path);
			 * if(file.exists()){
			 * 		in=new FileInputStream(file);
			 * }
			 */
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			//step3
			while((num=in.read(buffer,0,size))!=-1){//ÿ�δ��ļ��ж�ȡsize�ֽڵ����ݷŵ�������buffer:byte[]��0��ʼ��λ�ã���ȡ���ĵ�ĩβʱ����ֵΪ-1������whileѭ��
			//step4
				totalNum+=num;
				System.out.print(new String(buffer,0,num));
			}
			System.out.println("d:/index.html  �ļ��ܴ�С��"+totalNum+"�ֽ�");
			//step5
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
