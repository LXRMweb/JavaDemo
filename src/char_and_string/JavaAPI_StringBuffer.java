/**
 * @author chen
 * @date 20170303
 * @description �����򽲽�java.lang.StringBuffer����÷�
 * java.lang.StringBuffer
 * 	������
 * 		1��StringBuffer����ص�
 * 			a.�����̰߳�ȫ�ģ���Ӧ�ĵط���synchronized���η�
 * 			b.StringBuffer�������ڴ洢 A mutable���ɱ�ġ� sequence of characters.
 * 				ÿ��StringBuffer������һ������������ֵ������������ʱ��StringBuffer������Զ�����������������һ���µ�internal buffer array��	
 * 			c.java API�л���һ�������API�������ƹ��ܵ�class����StringBuilder������StringBuilder���̲߳���ȫ�ģ���û��synchronized
 * 			d.����Ҫ�̰߳�ȫ��ʱ�򣬽���ʹ��StringBuilder����ΪStringBuilder���ܱ�֤�̰߳�ȫ��StringBuffer����
 * 			       ��Ҫ�̰߳�ȫ��ʱ�򣬽���ʹ��StringBuffer
 * 	���Ա����
 * 	���캯��
 * 		 1��public StringBuffer()��
 * 					����һ��StringBuffer����
 * 					�ö���ĳ�ʼֵΪnull
 * 					�ö���ĳ�ʼ����Ϊ16��character
 * 		 2��public StringBuffer(int capacity)
 * 					����һ��StringBuffer����
 * 					�ö���ĳ�ʼֵΪnull
 * 					����ͨ������capacity��int��ָ�����ʼ����,�ö���ĳ�ʼ����Ϊcapacity��character
 * 		 3��public StringBuffer(String str)
 * 					����һ��StringBuffer����
 * 					�ö���ĳ�ʼֵΪ����str:String
 * 					�ö���ĳ�ʼ����Ϊ16��character+str.length()
 * 		 4�� public StringBuffer(CharSequence seq)
 * 					����һ��StringBuffer����
 * 					�ö���ĳ�ʼֵΪ����seq:CharSequence
 * 					�ö���ĳ�ʼ����Ϊ16��character+seq.length()
 * 	��Ա����
 * 		��̬��Ա����
 * 		ʵ����Ա����
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
 *					append:׷��          
 *			14)public synchronized StringBuffer append(String str)
 *			15)public synchronized StringBuffer append(StringBuffer sb)
 *					�������sb:StringBuffer��ֵΪ�գ���ô�����ڵ����ߵ�ĩβ��ӡ�null�����ĸ��ַ�
 *			16)public StringBuffer append(CharSequence s)    
 *					�������s:CharSequence��ֵΪ�գ���ô�����ڵ����ߵ�ĩβ��ӡ�null�����ĸ��ַ�  
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
