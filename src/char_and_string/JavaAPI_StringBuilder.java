/**
 * @author chen
 * @date 20170303
 * @description 本程序讲解java.lang.StringBuilder类的用法
 * java.lang.StringBuilder
 * 	概述：
 * 		1）StringBuilder类的特点
 * 			a.它是线程不安全的，完全没有synchronized修饰符
 * 			b.它的值是可变的字符序列，每个StringBuffer对象都有一个容量，在其值超过该容量的时候，StringBuffer对象会自动扩充其容量（创建一个新的internal buffer array）
 * 				StringBuilder对象用于存储 A mutable【可变的】 sequence of characters. 
 * 			c.java API中还有一个和这个API有着类似功能的class——StringBuffer，不过StringBuilder是线程不安全的，而StringBuffer是线程安全的
 * 	类成员变量
 * 		
 * 	构造函数
 * 		和java.lang.StringBuffer类中的构造函数一致
 *  成员函数
 *  	和java.lang.StringBuffer类中的成员函数一致，只不过本类中的成员函数都没有synchronized修饰符
 */
package char_and_string;

public class JavaAPI_StringBuilder {
	public static void main(String[] args){
		StringBuilder str=new StringBuilder();
	}

}
