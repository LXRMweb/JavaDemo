/**
 * @author lxrm 
 * @date 20170131
 * @description 讲述Java API之java.lang.Character类的用法
 *  java.lang.Character
 *  	1）概述：该类对应于8种基本数据类型中的char，char是一个16bit的字符变量，char型变量可以表示Unicode编码表中的所有字符（Unicode表格覆盖了中文、英文、其他各种语言以及一些特殊符号）
 *  		类中包含了若干用于处理char型数值以及变量的方法
 *  		这个类封装了char这种基本数据类型，当需要将char看做类对象来处理时，可以借助于该类进行相应操作
 * 			Character类中包含若干将char型数值转变成String类型的成员方法，
 * 			以及若干将String类型数值转变成char型数值的方法
 * 			以及其他处理char型变量的成员方法（如 比较大小，char型数值的二进制表示形式进行左移右移、反转等）
 * 			将char型数值从大写变小写，小写变大写
 * 			判断一个char型值是大写的还是小写的，是否是数字，是否是字母
 * 		2）Character类中的静态成员常量（static类型的成员常量）
 * 			public static final int MIN_RADIX = 2;//以字符串形式表示的char型数值的最小进制数，即最小使用二进制表示
 * 			public static final int MAX_RADIX = 36;//以字符串形式表示的char型数值的最大进制数，即最大使用三十六进制表示
 * 			public static final char MIN_VALUE = '\u0000';//char型变量可以取到的最小值，是0
 * 			public static final char MAX_VALUE = '\uFFFF';//char型变量可以取到的最大值，是2^16-1
 * 			TYPE:Class<Character>   char类所对应的原始基本数据类型，其值为"char"
 * 			SIZE:int   表示char型数值所占内存大小，单位为bit
 * 			public static final byte UNASSIGNED = 0;
 * 			public static final byte UPPERCASE_LETTER = 1;
 * 			public static final byte LOWERCASE_LETTER = 2;
 * 			public static final byte TITLECASE_LETTER = 3;
 * 			public static final byte MODIFIER_LETTER = 4;
 * 			public static final byte OTHER_LETTER = 5;
 * 			public static final byte NON_SPACING_MARK = 6;
 * 			public static final byte ENCLOSING_MARK = 7;
 * 			public static final byte COMBINING_SPACING_MARK = 8;
 * 			...
 * 			...
 * 
 * 		3)Character类中的构造函数(用于生成Character类对象)
 * 			3.1）public Character(char value)
 * 			
 * 
 * 		4)char类中的成员函数
 * 			4.1）静态成员函数
 * （char类型数值--->String）
 * 				4.1.1) public static String toString(char c) 
 * 						功能：将c:char转换成字符串并返回，返回的字符串长度为1，只包含字符c:char
 * （char类型数值--->Character类对象）
 * 				4.1.2）public static Character valueOf(char c)
 * 						功能：将c:char封装成Character类对象并返回
 * 							使用这个成员方法将char数值封装成Character对象比用Character类的构造函数Character(char c)来获取Character对象效果更好
 * 							因为这个成员函数拥有更好的空间利用率，也更快
 * （判断一个codePoint是否是有效的切点）
 * 				4.1.3）public static boolean isValidCodePoint(int codePoint)
 * 						@return {@code true} if the specified code point value is between
 *         						{@link #MIN_CODE_POINT} and
 *        						{@link #MAX_CODE_POINT} inclusive;
 *         						{@code false} otherwise.
 * （判断char是大写的还是小写的）
 * 				4.1.4）public static boolean isLowerCase(char ch)
 * 						返回值：如果ch:char是小写的，返回值是true，否则返回值是false
 * 					 public static boolean isLowerCase(int codePoint)
 * 						参数：codePoint：int是待鉴别字符在Unicode表中的位置
 * 						返回值：如果Unicode表中codePoint处的字母是小写的，返回值是true，否则返回值是false
 * 						备注：这个函数和上述函数的区别在于，这个函数可以通过codePoint：int访问到Unicode表格中的所有字符，
 * 							但是上述函数则不能访问到Unicode表格中的所有字符，因为ch:char是16bit的，
 * 							所以ch:char只能访问到Unicode表中上半部分的内容
 * 				     public static boolean isUpperCase(char ch)
 * 					 public static boolean isUpperCase(int codePoint)
 * （判断char的值是不是数字）
 * 				4.1.5）public static boolean isDigit(char ch)
 * 						功能：用于判断ch:char是否是一个数字
 * 					  public static boolean isDigit(int codePoint)
 * 						备注：这个函数也适用于判断一个字符是否是数字，只不过这个函数功能更强大些，因为这个函数使用字符在Unicode表中的位置访问Unicode表中的字符
 * 							codePoint：int是32位的，可以访问到Unicode表中的所有字符
 * 							但是第一个函数使用16位的ch：char是访问不到Unicode表中的所有字符的，只能访问到上半部分字符
 * （大写变小写，小写变大写）
 * 				4.1.6）public static char toLowerCase(char ch)
 * 					  public static int toLowerCase(int codePoint)
 * 			4.2）实例成员函数
 * （Character对象所代表的char型数值--->char型数值）
 * 				4.2.1） public char charValue()
 * （Character对象所代表的char型数值--->hashCode）
 * 				4.2.2）public int hashCode()
 * （Character对象所代表的char型数值--->string字符串）
 * 				4.2.3）public String toString()
 * （比较两个Character对象的大小）
 * 				4.2.5）public boolean equals(Object obj)
 * 				
 */
package datatype;

public class JavaAPI_Character {
	public static void main(String[] args){
		Character ch=new Character('a');
		
	}
}
