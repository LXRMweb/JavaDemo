/**
 * @author lxrm 
 * @date 20170131
 * @description 讲述Java API之java.lang.Byte类的用法
 *  java.lang.Byte
 *  	1）概述：该类对应于8种基本数据类型中的byte，类中包含了若干用于处理byte型数值以及变量的方法
 *  		这个类封装了byte这种基本数据类型，当需要将byte看做类对象来处理时，可以借助于该类进行相应操作
 * 			Byte类中包含若干将byte型数值转变成String类型的成员方法，
 * 			以及若干将String类型数值转变成byte型数值的方法
 * 			以及其他处理byte型变量的成员方法（如 比较大小，byte型数值的二进制表示形式进行左移右移、反转等）
 * 		2）Byte类中的静态成员常量（static类型的成员常量）
 * 			MIN_VALUE：byte   表示byte型变量可以取到的最小值-2^7=-128
 * 			MAX_VALUE:byte   表示byte型变量可以取到的最大值2^7-1=127
 * 			TYPE:Class<Byte>   byte类所对应的原始基本数据类型，其值为"byte"
 * 			SIZE:int   表示byte型数值所占内存大小，单位为bit
 * 
 * 		3)Byte类中的构造函数(用于生成Byte类对象)
 * 			3.1）public Byte(byte value)
 * 			3.2） public Byte(String s) throws NumberFormatException
 * 					备注：参数s:String必须是十进制形式的byte数值
 * 
 * 		4)Byte类中的成员函数
 * 			4.1）静态成员函数
 * （byte类型数值--->String（十进制形式））
 * 				4.1.1)public static String toString(byte b)
 * 						功能：将b:byte转化成string（十进制形式的string）并返回
 * （byte类型数值--->Byte类对象）
 * 				4.1.2）public static Byte valueOf(byte b)
 * 						功能：将b:byte封装成Byte类对象并返回
 * 							使用这个成员方法将byte数值封装成Byte对象比用Byte类的构造函数Byte(byte b)来获取Byte对象效果更好
 * 							因为这个成员函数拥有更好的空间利用率，也更快
 * （将各种进制形式2/8/10/16..的string--->byte型数值）
 * 				4.1.3）public static byte parseByte(String s, int radix)throws NumberFormatException
 * 						功能：将radix进制的string解析成byte型数值
 * 					   public static byte parseByte(String s) throws NumberFormatException
 * 						功能：将10进制的string解析成byte数值
 * （将各种进制形式2/8/10/16..的string--->Byte类对象）
 * 				4.1.4）public static Byte valueOf(String s, int radix)
 * 						功能：将radix进制的string解析成Byte类对象
 * 					  public static Byte valueOf(String s) throws NumberFormatException
 * 						功能：将10进制的string解析成Byte类对象
 * 					 public static Byte decode(String nm)throws NumberFormatException
 * 						功能：将8/10/16进制的string解析成Byte对象，这个函数与上述两个函数有点区别：这个函数比上述两个函数更加智能化，
 * 							因为这个函数能自动识别string的表示形式是几进制的，不用编程人员手动识别待解析string是几进制的
 * 							nm:String是以“0x/0X/#”开头的时候，该函数认为nm:string是十六进制的
 * 							nm：String是以“0”开头的时候，该函数认为nm:String是八进制的
 * 							其他情况下，认为是十进制的
 * 							除此之外，该函数还能自动识别nm:String中的正负号
 * 							
 * 			4.2）实例成员函数
 * （Byte对象所代表的byte型数值--->byte、short、int、long、float、double型数值）
 * 				4.2.1） public byte byteValue()
 * 						public short shortValue()
 * 						public int intValue()
 * 						public long longValue()
 * 						public float floatValue()
 * 						 public double doubleValue()
 * （Byte对象所代表的byte型数值--->String型数值）
 * 				4.2.3）public String toString()
 * （Byte对象所代表的byte型数值--->hashCode）
 * 				4.2.4）public int hashCode()
 * （比较两个Long对象的大小）
 * 				4.2.5）public boolean equals(Object obj)
 * 				4.2.6）public int compareTo(Byte anotherByte)
 * 				4.2.7）静态函数，可直接调用public static int compare(byte x, byte y)
 */
package datatype;

public class JavaAPI_Byte {
	public static void main(String[] args){
		System.out.println("java.lang.Byte类用法示例：");
		
		//2）Byte类中的静态成员常量
		System.out.println("\nByte类中的静态成员常量public static final vectorName=value;");
		System.out.println("Byte.MIN_VALUE="+Byte.MIN_VALUE);
		System.out.println("Byte.MAX_VALUE="+Byte.MAX_VALUE);
		System.out.println("Byte.Type="+Byte.TYPE);
		System.out.println("Byte.SIZE="+Byte.SIZE);
		

		//3）使用Byte类的构造函数获得Byte类对象，然后使用Byte类对象调用Byte类中的实例成员函数
		byte param=34;//byte就是一个8位的整数（注意他的取值范围即可）
		Byte b=new Byte(param);
		//第二种构造函数
		Byte b2=new Byte("127");//一定要注意取值范围哦，byte型变量的取值范围为-128~127
	}

}
