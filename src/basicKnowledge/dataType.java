/**
 * @author lxrm
 * @date 20161026
 * @description:这个文件讲解java中数据类型相关知识点
 * 		1）java中数据类型分成基本数据类型和复合数据类型两类
 * 		2）java基本数据类型
 * 			2.1）整数类型：				  byte    	short    int      long
 * 									  8bit   	16bit    32bit    64bit
 * 			  		取值范围（十进制）-128~127
 * 				   	 以0开头（八进制）-0177~0177
 * 				以0X或0x开头（十六进制）-0X7f~0x7f
 * 			2.2）浮点类型：float double
 * 			2.3）字符类型：char
 * 			2.4）布尔类型：boolean
 * 		3）java符合数据类型
 * 			类对象
 * 			接口
 * 			数组*/
package basicKnowledge;

public class dataType {
	public static void main(String[] args){
/*2.3）字符类型：char
		 * char:
		 * 		赋值方法一：char ch='a';
		 * 		赋值方法二：char ch='\u0008';  //????是四位十六进制Unicode
		 * 		赋值方法三：char ch='转义字符';//一些字符必须经过转义后赋值给字符变量
		 * 		注一：字符常量'a' '\u0008' '转义字符'除了可以赋值给char型变量外，还可以赋值给float、int型变量，因为字符常量实际上就是一个数字
		 * 			char ch='a';
		 * 			int i='a';
		 * 			float j='a';*/
		//赋值方法一
		char ch1='a';
		//赋值方法二
		char ch2='\u005d';
		char ch11='\u1000';
		//赋值方法三
		char ch3='\b';//退格，   '\u0008'
		char ch4='\t';//水平制表符，'\u0009'
		char ch5='\n';//换行，    '\u000a
		char ch6='\f';//表格符，'\u000c'
		char ch7='\r';//回车，    '\u000d
		char ch8='\"';//双引号，'\0022'
		char ch9='\'';//单引号，'\u0027'
		char ch10='\\';//反斜线'\'，'\u005c'
		System.out.println(ch1+" "+ch2+" "+ch11+" "+ch5+" "+ch6+" "+ch8+""+ch9+" "+ch10);
		//注一
		int i='a';
		float f='a';
		double d='a';
		System.out.println("字符常量'a'赋值给int型变量："+i+'\n'+"字符常量'a'赋值给float型变量："+f+'\n'+"字符常量'a'赋值给double型变量："+d);

/*2.4）布尔类型：boolean
		 *boolean：布尔型变量的值除了true和false之外，不能被赋值成其他值 */
		boolean flag=false;
		boolean flag2=true;//布尔型变量的值除了true和false之外，不能被赋值成其他值
	}
	
}
