/**
 * �Ӽ��̶�ȡ���ݣ�ÿ�ζ�ȡһ�У�ֱ��ĳһ��������ַ���Ϊ��exit��ʱ������whileѭ��
 * */
package java_io_examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1_Enter_exit_to_Quit {
	public static void main(String[] args) throws IOException{
		 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//  BufferedWriter buf2 = new BufferedWriter(new FileWriter("abx.txt"));
		 System.out.println("������һ���ַ�����");
		 String str = buf.readLine();
		  while(!str.equals("exit")){//�Ӽ��̶�ȡ���ݣ�ÿ�ζ�ȡһ�У�ֱ��ĳһ��������ַ���Ϊ��exit��ʱ������whileѭ��
		  // buf2.write(str);
		  // buf2.newLine();
		  // str = buf.readLine();
			  System.out.println("���ղ����������Ϊ��"+str);
			  System.out.println("�������µ��ַ�������enter ��exit�� to quit.��");
			  str = buf.readLine();
		  }
		  buf.close();
		  //buf2.close();
	}//end main
}
