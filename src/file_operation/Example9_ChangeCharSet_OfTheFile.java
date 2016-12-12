/**
 * @author lxrm\
 * @date 20161116
 * @description ���ļ���һ�ֱ����ʽת������һ�ֱ����ʽ���罫utf8�ļ�ת����GBK���뷽ʽ
 * 				ת����ɺ󽫴��������ļ���ԭ�ļ��Լ��±����ʽ���ļ���
 * 	         �� �ִ����⣩û����֤����֪���������Բ���
 * @���˼·
 * 		�����ݴ�Դ�ļ��ж�ȡ����
 * 		����String���캯������ת������һ�ֱ����ʽ
 * 		���µı����ʽ��������Ϣ�洢����һ���ļ���
 * 		��ȫת����ϣ�����Ӧ��Դ�ͷ�*/
package file_operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example9_ChangeCharSet_OfTheFile {
	public static void main(String[] args){
		String oldPath="d:/helloGBK.txt";//�������ļ�,GBK�����ʽ
		String newPath="d:/helloCharArray.txt";//��������������ļ��У���ԭ�ļ��������ļ�����ŵ���String��
		File oldfile=new File(oldPath);
		File newfile=new File(newPath);
		if(!oldfile.exists()||!oldfile.isFile()){//����������ļ������ڣ����˳�����
			System.out.println("������������ļ�·���Ƿ����󣬻�����Ӧλ���Ƿ���ͬ��Ŀ¼");
			return;
		}
		if(!newfile.exists()){
			try {
				newfile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			byte[] buffer=new byte[1024];//������
			FileInputStream in=new FileInputStream(oldfile);
			FileOutputStream out=new FileOutputStream(newfile);
			while(in.read(buffer)!=-1){
				String str=new String(buffer,0,buffer.length,"GBK");//ת����utf8����
				out.write(str.getBytes());
			}
			out.close();
			in.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end main

}
