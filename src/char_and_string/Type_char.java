/**
 * function:Java的8种基本数据类型之-----char
 * 概述：char是java的8种基本数据类型之中的一种，用于存储单个字符，一个char型变量占用两个字节存储空间。
 * 		         每一个字符都对应与一个int型数值，这个对应关系用专业术语来讲就是“字符的编码方式”。现在存在多种编码方式，
 * 		如ASCII、ISO-8859-1、Unicode、utf-8、gbk等等。这些编码方式本身所包含的字符可能不同，字符对应的编码结果
 * 		所占用的空间大小可能不同，编码方式可能不同。
 * 			java中char型变量存储的字符是Unicode编码方式下的字符，char型变量可以被赋值为Unicode表中的单个字符，
 * 		或者单个字符对应于Unicode表格中的位置，或者转义字符。
 * */
package char_and_string;

public class Type_char {

	public static void main(String args[]){
		char ch='a';//方法一，单引号内的单个字符（字符可以为Unicode表中任意一个字符）
		char ch2=97;//方法二，Unicode表中该字符对应的位置下标，取值范围为0-65535，也即0x0000-0xffff(十六进制)
		for(int i=0;i<=65535;i++){
			ch2=(char)i;
			System.out.print(ch2+" ");
		}
		System.out.println("转义字符：");
		//方法三，转义字符
		char ch3='\\';
		char ch4='\u2605';
		System.out.println(ch3+" "+ch4);
		Integer integer1=new Integer(23);
	}

}
