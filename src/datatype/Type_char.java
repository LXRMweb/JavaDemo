/**
 * function:Java的8种基本数据类型之-----char
 * */
package datatype;

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
