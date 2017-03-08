/**
 * @author lxrm 
 * @date 20170130
 * @description 讲述Java API之java.lang.Boolean类的用法
 *  java.lang.Boolean
 *  	1）概述：该类对应于8种基本数据类型中的boolean，类中包含了若干用于处理boolean型数值以及变量的方法
 *  		这个类封装了boolean这种基本数据类型，当需要将boolean看做类对象来处理时，可以借助于该类进行相应操作
 * 			Boolean类中包含若干将boolean型数值转变成String类型的成员方法，
 * 			以及若干将String类型数值转变成boolean型数值的方法
 * 			以及其他处理boolean型变量的成员方法（如 比较大小，boolean型数值的二进制表示形式进行左移右移、反转等）
 * 		2）Boolean类中的静态成员常量（static类型的成员常量）
 * 			TRUE:Boolean     TRUE是一个Boolean对象,且该Boolean对象对应的基值是true
 * 			FALSE:Boolean     FALSE是一个Boolean对象，且该Boolean对象对应的基值是false
 * 			TYPE:Class<Boolean>   Boolean类所对应的原始基本数据类型，其值为"boolean"
 * 			
 * 		3)Boolean类中的构造函数(用于生成Boolean对象)
 * 			3.1)public Boolean(boolean value)
 * 			3.2)public Boolean(String s)
 * 					备注：当s="true"(不区分大小写)时，生成的Boolean对象代表true
 * 						s="任何其他字符串"，生成的Boolean对象都代表false
 * 		4)Boolean类中的成员函数
 * 			4.1）静态成员函数
 * （string--->boolean数值）
 * 				4.1.1）public static boolean parseBoolean(String s)
 * 							功能：将String对象解析成boolean型数值
 * 							返回值：是一个boolean型数值，
 * 									当s:String="true"(不区分大小写)时，返回值是true
 * 									当s:String="其他字符串"	时，返回值是false						 
 * （boolean数值--->Boolean对象）
 * 				4.1.2）public static Boolean valueOf(boolean b)
 * （String--->Boolean对象）
 * 				4.1.3）public static Boolean valueOf(String s)
 * 							返回值：是一个Boolean对象
 * 									当s:String="true"(不区分大小写)时，返回值是代表true的Boolean对象
 * 									当s:String="其他字符串"	时，返回值是代表false的Boolean对象
 * （boolean--->String对象）
 * 				4.1.4）public static String toString(boolean b)
 * 							返回值：如果b:boolean=true,那么返回值是字符串“true”
 * 								    如果b:boolean=false,那么返回值是字符串“false”
 * （系统属性(即java.lang.System#getProperty(String name))---->boolean）
 * 				4.1.5） public static boolean getBoolean(String name)
 * 							@param   name   the system property name.
 * 							返回值：只有系统属性name的值=="true"时，返回值是true
 * （比较两个boolean变量的值）
 * 				4.1.6）public static int compare(boolean x, boolean y)
 * 							 @return the value {@code 0} if {@code x == y};
 *         							a value less than {@code 0} if {@code !x && y}; and
 *         							a value greater than {@code 0} if {@code x && !y}
 * 			4.2）实例成员函数
 * 				4.2.1）public boolean booleanValue()
 * 							功能：返回Boolean对象的boolean值
 * 				4.2.2）public String toString()
 * 							返回值：如果b:boolean=true,那么返回值是字符串“true”
 * 								    如果b:boolean=false,那么返回值是字符串“false”
 * 				4.2.3）public int hashCode()
 * 							返回值：如果b:boolean=true,那么返回值是int型数值1231
 * 								    如果b:boolean=false,那么返回值是int型数值1237
 * 				4.2.4） public boolean equals(Object obj)
 * 				4.2.5）public int compareTo(Boolean b) 
 * 							@return  zero if this object represents the same boolean value as the
 *         							 argument; a positive value if this object represents true
 *        							 and the argument represents false; and a negative value if
 *          						 this object represents false and the argument represents true
 * 
 */
package datatype;

public class JavaAPI_Boolean {
	public static void main(String[] args){
		
		//使用Boolean类中的构造函数来创建Boolean类对象
		Boolean b1=new Boolean(true);//生成了一个代表true的Boolean对象
		Boolean b2=new Boolean("ok");//生成了一个代表false的Boolean对象
		Boolean b3=new Boolean("tRue");//生成了一个代表true的Boolean对象
	}
}
