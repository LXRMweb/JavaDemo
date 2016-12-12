/**
 * @author LXRM
 * @date 20161101
 * @description ����ļ����ھ���˵��URLEncoder��URLDecoder���÷�
 * 				�����������ڽ���ͨ�ַ���ת����MIME��ʽ���ַ���(URL),��֮
 * 		����һ������ͨ��ʽ�ַ������MIME��ʽ�ַ���
 * 		���Ӷ�����MIME��ʽ�ַ��������ͨ��ʽ�ַ���
 * 				*/
package net_communication_programming;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UsageOf_URLEncoder {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String str="��ͨ�ַ���    & #...";
		System.out.println("ԭʼ�ַ�������ͨ�ַ�����"+str);
		//����һ������ͨ��ʽ�ַ������MIME��ʽ�ַ���
		String strMIME=URLEncoder.encode(str);
		System.out.println("������ַ�����MIME��ʽ��"+strMIME);//�����������ַ�����MIME��ʽ��%C6%D5%CD%A8%D7%D6%B7%FB%B4%AE++++%26+%23...
		//���Ӷ�����MIME��ʽ�ַ��������ͨ��ʽ�ַ���
		String strDecode=URLDecoder.decode(strMIME);
		System.out.println("MIME��ʽ�ַ�����������"+strDecode);//�����MIME��ʽ�ַ�������������ͨ�ַ���    & #...
	}
}
