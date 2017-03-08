/**
 * @author chen
 * @date 20170303
 * @description 本程序讲解java.lang.StringBuffer类的用法
 * java.lang.StringBuffer
 * 	概述：
 * 		1）StringBuffer类的特点
 * 			a.它是线程安全的，相应的地方有synchronized修饰符
 * 			b.StringBuffer对象用于存储 A mutable【可变的】 sequence of characters.
 * 				每个StringBuffer对象都有一个容量，在其值超过该容量的时候，StringBuffer对象会自动扩充其容量（创建一个新的internal buffer array）	
 * 			c.java API中还有一个和这个API有着类似功能的class——StringBuilder，不过StringBuilder是线程不安全的，即没有synchronized
 * 			d.不需要线程安全的时候，建议使用StringBuilder，因为StringBuilder比能保证线程安全的StringBuffer更快
 * 			       需要线程安全的时候，建议使用StringBuffer
 * 	类成员变量
 * 	构造函数
 * 		 1）public StringBuffer()：
 * 					创建一个StringBuffer对象
 * 					该对象的初始值为null
 * 					该对象的初始容量为16个character
 * 		 2）public StringBuffer(int capacity)
 * 					创建一个StringBuffer对象
 * 					该对象的初始值为null
 * 					可以通过参数capacity：int来指定其初始容量,该对象的初始容量为capacity个character
 * 		 3）public StringBuffer(String str)
 * 					创建一个StringBuffer对象
 * 					该对象的初始值为参数str:String
 * 					该对象的初始容量为16个character+str.length()
 * 		 4） public StringBuffer(CharSequence seq)
 * 					创建一个StringBuffer对象
 * 					该对象的初始值为参数seq:CharSequence
 * 					该对象的初始容量为16个character+seq.length()
 * 	成员函数
 * 		静态成员函数
 * 		实例成员函数
 * 			1) public synchronized int length() 
 * 			2)public synchronized int capacity()
 * 			3)public synchronized void ensureCapacity(int minimumCapacity)
 * 			4)public synchronized void trimToSize()
 * 			5)public synchronized void setLength(int newLength)
 * 			6)public synchronized char charAt(int index)
 * 			7)public synchronized int codePointAt(int index)
 * 			8)public synchronized int codePointBefore(int index)
 * 			9)public synchronized int codePointCount(int beginIndex, int endIndex)
 * 			10)public synchronized int offsetByCodePoints(int index, int codePointOffset)
 * 			11)public synchronized void getChars(int srcBegin, int srcEnd, char[] dst,
 *                                     int dstBegin)
 *			12)public synchronized void setCharAt(int index, char ch) 
 *			13)public synchronized StringBuffer append(Object obj)
 *					append:追加          
 *			14)public synchronized StringBuffer append(String str)
 *			15)public synchronized StringBuffer append(StringBuffer sb)
 *					如果参数sb:StringBuffer的值为空，那么将会在调用者的末尾添加“null”这四个字符
 *			16)public StringBuffer append(CharSequence s)    
 *					如果参数s:CharSequence的值为空，那么将会在调用者的末尾添加“null”这四个字符  
 *			17)public synchronized StringBuffer append(CharSequence s, int start, int end)
 *			18)public synchronized StringBuffer append(char[] str)
 *			19) public synchronized StringBuffer append(char[] str, int offset, int len)
 *			20)public synchronized StringBuffer append(boolean b)
 *			21)public synchronized StringBuffer append(char c)
 *			22)public synchronized StringBuffer append(int i)
 *				public synchronized StringBuffer append(long lng)
 *				public synchronized StringBuffer append(float f)
 *				public synchronized StringBuffer append(double d)
 *			23)public synchronized StringBuffer appendCodePoint(int codePoint) 
 *			24)public synchronized StringBuffer delete(int start, int end)
 *				public synchronized StringBuffer deleteCharAt(int index) 
 *			25)public synchronized StringBuffer replace(int start, int end, String str) 
 *			26)public synchronized String substring(int start)
 *				public synchronized CharSequence subSequence(int start, int end)
 *				public synchronized String substring(int start, int end) 
 *			27)public synchronized StringBuffer insert(int index, char[] str, int offset,int len)
               public synchronized StringBuffer insert(int offset, Object obj) 
               public synchronized StringBuffer insert(int offset, String str)
               public synchronized StringBuffer insert(int offset, char[] str)
               public StringBuffer insert(int dstOffset, CharSequence s)
                public synchronized StringBuffer insert(int dstOffset, CharSequence s,int start, int end)
                public StringBuffer insert(int offset, boolean b)
                public synchronized StringBuffer insert(int offset, char c)
                 public StringBuffer insert(int offset, int i)
                 public StringBuffer insert(int offset, long l)
                 public StringBuffer insert(int offset, float f)
                 public StringBuffer insert(int offset, double d)
           28)public int indexOf(String str)
           		public synchronized int indexOf(String str, int fromIndex) 
           		public int lastIndexOf(String str)
           		 public synchronized int lastIndexOf(String str, int fromIndex)
           29)public synchronized StringBuffer reverse() 
           30)public synchronized String toString()
           
                
 * */
package char_and_string;

public class JavaAPI_StringBuffer {
	public static void main(String[] args){
		StringBuffer st=new StringBuffer();
	}//end main
}//end class
