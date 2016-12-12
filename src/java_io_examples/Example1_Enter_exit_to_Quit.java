/**
 * 从键盘读取数据，每次读取一行，直到某一行输入的字符串为“exit”时，跳出while循环
 * */
package java_io_examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1_Enter_exit_to_Quit {
	public static void main(String[] args) throws IOException{
		 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//  BufferedWriter buf2 = new BufferedWriter(new FileWriter("abx.txt"));
		 System.out.println("请输入一个字符串：");
		 String str = buf.readLine();
		  while(!str.equals("exit")){//从键盘读取数据，每次读取一行，直到某一行输入的字符串为“exit”时，跳出while循环
		  // buf2.write(str);
		  // buf2.newLine();
		  // str = buf.readLine();
			  System.out.println("您刚才输入的内容为："+str);
			  System.out.println("请输入新的字符串：（enter “exit” to quit.）");
			  str = buf.readLine();
		  }
		  buf.close();
		  //buf2.close();
	}//end main
}
