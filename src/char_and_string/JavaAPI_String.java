/**
 * @author lxrm
 * @date 20170208
 * @description:本文件讲述javaAPI之String类的用法，用于字符串生成、处理
 * java.lang.String
 * 		概述：String类对象所存储的字符串中的所有字符也是Unicode编码的
 * 			String类中有许多成员方法：包括字符串比较、子串查找、获取子串、复制字符串、转换大小写等多种函数
 * 		String类中的构造函数
 * 			1)public String()
 * 			2)public String(String original)
 * 				参数：是一个String对象
 * 				结果：创建了一个和参数有着相同值的新的String对象
 * 			3)public String(char value[]) 
 * 				参数：char型数组
 * 			4)public String(char value[], int offset, int count)
 * 				参数：char型数组，初始位置，子串长度
 * 				结果：新建的String对象的值是参数value：char[] 的子集，子串是从value[offset]开始，长度为count的子串
 * 			5)public String(int[] codePoints, int offset, int count)
 * 				参数：codePoints:int[] int型数组，其中每个元素的值是字符在Unicode表中的位置（也即单个字符对应的Unicode编码结果）
 * 					offset:int  初始字符下标
 * 					count:int 子串长度
 * 				结果：新建的String对象的值是参数所代表的字符串的子串，子串=codePoints[offset]开始，长度为count的字符串
 * 			6)public String(byte bytes[], int offset, int length, String charsetName)
 * 				功能：将byte数组转变成Unicode码下的字符，并且将其串成子串赋值给新建的String对象
 * 				 @param  bytes
 * 				         The bytes to be decoded into characters
 * 		         @param  offset
 * 				         The index of the first byte to decode
 * 				 @param  length	
 * 				         The number of bytes to decode
 * 				 @param  charsetName
 * 				         The name of a supported {@linkplain java.nio.charset.Charsetcharset}
 * 			  public String(byte bytes[], String charsetName)
 * 				备注：和上述函数唯一的不同之处是，这个函数不用指定待转换byte数组的初始位置和长度，因为这个函数将对整个byte数组进行转换，
 * 					将byte数组值转变成对应编码方式charsetName下的字符，然后串成字符串赋值给新建的String对象
 * 			  public String(byte bytes[], int offset, int length, Charset charset)
 * 				功能：和6)中的构造函数功能一致，只不过这个构造函数的第四个参数是Charset型的，和6)中的不一样
 * 			  public String(byte bytes[], Charset charset)
 * 				备注：直接将   整个  byte数组按照charset对应的解码方式将数值解析成字符，然后串成字符串
 * 			  public String(byte bytes[], int offset, int length)
 * 				备注：使用这个平台的默认编码方式进行解码（即将byte数值解析成对应编码表中的相应字符）
 * 			  public String(byte bytes[])
 * 				备注：使用当前平抬中的默认编码方式进行解码，对整个byte数组进行byte值到character（当前平台默认编码方式下的字符）的转换
 * 			7)public String(StringBuffer buffer)
 * 				功能：创建和stringBuffer中字符序列相同的String对象
 * 			8)public String(StringBuilder builder)
 * 			9)一个被弃用的构造函数，弃用原因：该构造函数并不能保证ASCII码到Character（即Unicode码）字符的转换是正确的
 * 			@Deprecated
 *		    public String(byte ascii[], int hibyte, int offset, int count)
 *				功能：可以将一个ASCII码字符数组转变成Unicode码字符串，并且取转换结果中的字符串的子串作为新建String对象的值
 *				注意：这个函数已经被弃用了
 *
 * 
 * 		String类中的成员函数
 * 			1)public int length()串中字符数
 * 			2)public boolean isEmpty()串中字符数为0时返回值为true
 * 			3)public char charAt(int index)串中特定位置的单个字符，index取值范围：0~length-1
 * 			  public int codePointAt(int index)
 * 				第二个函数和第一个函数的不同之处在于：第二个函数返回值不是单个字符，而是单个字符在Unicode码表中的位置
 * 			  public int codePointBefore(int index)
 * 				这个函数和第二个函数的不同之处在于，这个函数返回index:int前面一个字符对应的Unicode码
 * 			4)public int codePointCount(int beginIndex, int endIndex) 
 * 				功能：返回beginIndex和endIndex之间有多少个Unicode字符
 * 			5)public int offsetByCodePoints(int index, int codePointOffset)
 * 				返回值：index偏移codePointOffset之后的index
 * 			6)void getChars(char dst[], int dstBegin)
 * 				功能：Copy characters from this string into dst starting at dstBegin.
 *                  This method doesn't perform any range checking.
 *                  即将string值复制到char型数组中，存放在该数组的dst[dstBegin],dst[dstBegin+1]...位置上
 *            public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
 *            	功能：将String字符串的一部分字符复制到一个char型数组中
 *            		具体来说是将String[srcBegin]~String[srcEnd-1]这些字符复制到
 *            		dst[dstBegin]，dst[dstBegin+1]...位置上
 *          7)public byte[] getBytes(String charsetName)
 *				功能：将String对象按照参数charsetName:String所指定的编码方式进行编码（即，将字符转变成对应编码方式下的整型数值），
 *					并且将字符对应的编码结果存放在一个byte数组中返回
 *			  public byte[] getBytes(Charset charset)
 *				备注：和上述函数的不同之处在于参数类型不同
 *			  public byte[] getBytes()
 *				备注：和上述两个函数的不同之处在于，这个函数不去显式指定编码方式，而是默认使用该平台的默认编码方式
 *			8)public boolean equals(Object anObject)
 *				返回值：只有参数也是String对象并且和调用者拥有相同的值时返回值为true
 *			  public boolean contentEquals(StringBuffer sb)
 *				功能：将String对象和StringBuffer对象比较，若两者内容相同则返回值为true
 *			  public boolean contentEquals(CharSequence cs)
 *				功能：将String对象和CharSequence对象作比较，若两者内容相同则返回值为true
 *			  public boolean equalsIgnoreCase(String anotherString)
 *				功能：比较两个String对象的内容是否相同（不考虑大小写）
 *			  public boolean regionMatches(int toffset, String other, int ooffset,int len) 
 *				备注：这个函数用于比较两个String对象的子串是否相同
 *			  public boolean regionMatches(boolean ignoreCase, int toffset,
 *                          String other, int ooffset, int len)
 *              备注：这个函数也是用于比较两个String对象的子串是否相同，但这个函数功能更多一些，因为这个函数可以控制比较时是否考虑字母的大小写
 *			9)public int compareTo(String anotherString)
 *				返回值：若两个string对象的值相同，则返回值是0
 *					 若string比参数中的字符小（按照在Unicode表中的位置比较两个字符的大小），则返回值是一个负整数
 *					 若string比参数中的字符大，则返回值是一个正整数
 *					（返回值=this.charAt(k)-anotherString.charAt(k)
 *							或者this.length()-anothorString.length()）
 *			 public int compareToIgnoreCase(String str)
 *				备注：和上述函数的不同之处在于这个函数在比较两个字符串是忽略大小写
 *			10)public boolean startsWith(String prefix, int toffset)
 *				功能：Tests if the substring of this string beginning at the
 *					 specified index starts with the specified prefix.
 *			  public boolean startsWith(String prefix)
 *				功能：看字符串是否是以特定的前缀开头的
 *			  public boolean endsWith(String suffix)
 *			11）public int hashCode()
 *				功能：返回字符串所对应的hash码=s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
 *			12）public int indexOf(int ch)
 *				功能：返回String对象中字符（ch:int）第一次出现的位置下标
 *					如果串中没有指定的字符，返回值是-1
 *				参数：ch:int 单个字符对应的Unicode码（即字符在Unicode码表中的位置）
 *			   public int indexOf(int ch, int fromIndex)
 *				备注：和上述函数的不同之处在于，这个函数是从String[fromIndex]开始往后寻找指定字符ch:int
 *			   public int lastIndexOf(int ch)
 *				返回值：指定字符在字符串中最后一次出现的位置下标，如果串中没有指定字符则返回值为-1
 *			   public int lastIndexOf(int ch, int fromIndex)
 *				备注：和上述第三个函数的不同之处在于，这个函数是从String[fromIndex]开始查找
 *			13)public int indexOf(String str)
 *				功能：Returns the index within this string of the first occurrence of the specified substring.
 *			   public int indexOf(String str, int fromIndex)
 *				备注：和上述函数的不同之处在于，这个函数是从String[fromIndex]开始查找
 *			   public int lastIndexOf(String str)
 *			   public int lastIndexOf(String str, int fromIndex)
 *			14)static int indexOf(char[] source, int sourceOffset, int sourceCount,
 *                     char[] target, int targetOffset, int targetCount,
 *                     int fromIndex)
 *              功能：在char型数组source:char[]中查找target：char[]
 *			 static int lastIndexOf(char[] source, int sourceOffset, int sourceCount,
 *                          char[] target, int targetOffset, int targetCount,
 *                         int fromIndex)
 *          15)public String substring(int beginIndex)
 *          		功能：取子串，返回值为从beginIndex开始到String尾部的子字符串
 *             public String substring(int beginIndex, int endIndex) 
 *             		返回值：String[beginIndex]~String[endIndex-1]
 *             public CharSequence subSequence(int beginIndex, int endIndex)
 *             		备注：这个函数和上述第二个函数功能相同，唯一的不同之处在于返回值类型不同，分别为String对象和CharSequence对象
 *             public boolean contains(CharSequence s)
 *             		功能：判断是否含有子串s
 *          16)public String concat(String str)
 *          		功能：将参数str:String 连接到原有字符串的末尾组合成一个新的字符串并返回
 *          17)public boolean matches(String regex)
 *          		功能：判断该String的值是否符合正则表达式regex:String
 *          18）public String replace(char oldChar, char newChar) 
 *          		功能：用newChar:char替换掉String中的oldChar:char
 *             public String replaceFirst(String regex, String replacement)
 *             		功能：找到该String对象中第一个满足正则表达式regex:String的子串
 *             			并且使用replacement：String替换上述子串
 *             public String replaceAll(String regex, String replacement)
 *             		备注：这个函数和上述第二个函数的不同之处在于，上述第二个函数只是替换掉第一个满足条件的子串，
 *             			而这个函数则是替换掉所有符合正则表达式的子串
 *             public String replace(CharSequence target, CharSequence replacement) 
 *             		功能：使用replacement：CharSequence替换掉该String对象中的所有target：CharSequence
 *          19）分解字符串，分割成若干子串
 *         	   public String[] split(String regex, int limit)
 *         			功能：根据正则表达式regex：String所定义的规则，分割字符串，将分割结果存放到String[]中并返回
 *         			参数：regex：String 正则表达式，定义了字符串分割方法
 *         				limit：int  限制返回值String[]的元素个数，如果给定的limit为一个正整数，那么返回值String[]的大小不会超过limit
 *         							如果给定的limit参数是一个小于或等于0的整数，那么返回值String[]的大小没有限制
 *         	   public String[] split(String regex)
 *         			备注：这个函数相当于上述函数的第二个参数limit:int=0的情况，即返回值String[]的大小没有限制
 *          20)public String toLowerCase(Locale locale)
 *             public String toLowerCase()
 *             public String toUpperCase(Locale locale)
 *             public String toUpperCase()
 *              
 *          21)public String trim()
 *          		功能：删掉String对象中首部以及尾部的空格
 *          		omit省略，删除
 *          22)public String toString()
 *          		返回值：该String对象本身
 *          23)public char[] toCharArray() 
 *          		功能：String对象转变成char型数组
 *          24)public static String format(String format, Object ... args)
 *          		功能：使得参数args:Object按照format:String所指定的格式被格式化成格式化的字符串，
 *          			并且使格式化之后的新字符串使用本地默认的语言环境
 *          			如将Date对象格式化为format所指定的格式的字符串
 *          			再如将其他任意类型数值转变成十进制、十六进制字符串，转换成字符，布尔型字符串等等。
 *          		@param format：String  通过此参数说明期待的格式，format：String中常常含有一些特殊的字符来表示期待的格式，
 *          							    如"%b"与%B用来表示期望相应的参数被格式化为boolean型的数值，示例true
 *          							  再如%h与%H用来表示期望相应的参数被格式化为散列码,示例A05A5198
 *          							 如...（更多特殊字符参见博客：“java基础--->应用实例--->日期及时间字符串格式化”一文）
 *          		@param args：Object  可以有0个或者多个该类型参数
 *          							该类型参数是参数format：String中所引用的变量
 *          		@return 按照要求格式化所得的新的字符串
 *             public static String format(Locale l, String format, Object ... args)
 *             		备注：这个函数和上述函数唯一的不同之处在于，这个函数可以通过参数Locale来指定格式化过程中所使用的语言环境
 *             			而上述函数只能默认地使用本地语言环境
 *          25)public static String valueOf(Object obj) 
 *          		功能：如果参数为空，那么返回值=“null”
 *          			如果参数不为空，那么返回值=obj.toString();
 *             public static String valueOf(char data[])
 *             		返回值：值=char数组的所有字符串成的字符串
 *             public static String copyValueOf(char data[])
 *             		返回值：值=char数组的所有字符串成的字符串
 *             public static String valueOf(char data[], int offset, int count) 
 *             public static String copyValueOf(char data[], int offset, int count)
 *             		返回值：值=char数组的    部分字符   串成的字符串
 *             public static String valueOf(boolean b)
 *             		返回值：如果参数为true，则返回值为值为“true”的String对象
 *             			    如果参数为false，则返回值为值为“false”的String对象
 *             public static String valueOf(char c)
 *             		返回值：长度为1的String对象
 *             public static String valueOf(int i)
 *             public static String valueOf(long l)
 *             public static String valueOf(float f)
 *             public static String valueOf(double d)
 *          26）public native String intern();
 *          
 *
 * 使用实例：
 * 		实例一，创建String对象
 * 			方法一，直接等于双引号包裹的字符串："字符串"
 * 			方法二，使用构造函数public String(char value[])
 * 			方法三，使用构造函数public String(char value[], int offset, int count)
 * 			方法四，使用构造函数public String(int[] codePoints, int offset, int count)
 * 			方法五，将byte数组转变成char字符，然后创建String对象
 * 				  使用构造函数public String(byte bytes[], int offset, int length, String charsetName)
 * 				或者public String(byte bytes[], String charsetName)
 * 				或者public String(byte bytes[], int offset, int length, Charset charset)
 * 				或者public String(byte bytes[], Charset charset)
 * 				或者public String(byte bytes[], int offset, int length)
 * 				或者public String(byte bytes[])
 * 		实例二，String类的成员方法---subString()的用法
 * 		实例十九，字符串分割
 * 			方法一，调用String类的public String[] split(String regex, int limit)
 * 			方法二，调用String类的public String[] split(String regex)
 * 		实例二十一，删除字符串首部以及尾部的空白格
 * 		实例二十四，format函数的应用
 * 			第一部分：用于格式化日期和时间（Date对象）
 * 				方法一，调用String类中的public static String format(String format, Object ... args)
 * 				方法二，调用String类中的public static String format(Locale l,String format, Object ... args)
 * 			第二部分：用于格式化一般形式的参数（其他类型对象）
 * 				方法一，调用String类中的public static String format(String format, Object ... args)
 * 				方法二，调用String类中的public static String format(Locale l,String format, Object ... args)
 * 		*/
package char_and_string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Locale;

public class JavaAPI_String {
	public static void main(String[] args) throws UnsupportedEncodingException{
		//实例一，创建String对象
		//方法一，
		String str11 = "abc";
		//方法二，
		char data[] = {'a', 'b', 'c'};
		String str12 = new String(data);
		System.out.println("输出字符串str12："+str12);//结果：输出字符串str12:abc
		//方法三，
		String str13=new String(data,1,2);
		System.out.println("输出字符串str13："+str13);//结果：输出字符串str13:bc
		//方法四，
		int charPoints[]={97,98,99};
		String str14=new String(charPoints,1,2);
		System.out.println("输出字符串str14："+str14);//结果：输出字符串str14:bc
		//方法五
		byte bytes[]={0,97,97,98,0,99,0,97};
		String str15=new String(bytes,0,6,"UTF-8");
		String str16=new String(bytes,0,6,"Unicode");
		String str17=new String(bytes,"UTF-8");
		String str18=new String(bytes,0,6);
		System.out.println("输出字符串str15："+str15);//结果：输出字符串str15:空格aab空格c
		System.out.println("输出字符串str16："+str16);//结果:a慢c
		System.out.println("输出字符串str17："+str17);//结果:空格aab空格c空格a
		System.out.println("输出字符串str18："+str18);//结果:和str15结果一样，说明该平台下默认编码方式是UTF-8
		
		//实例二，成员方法subString()的用法
		String c = "abc".substring(2,3);
		String str3="abc";
		String d = str3.substring(1, 2);
		
		//实例五，使用标准输出流输出字符串
		String str4="test";
		String str5="hello";
		System.out.println(str4);
		System.out.println("str4="+str4);
		System.out.println(str5+str4);//结果：hellotest
		
		//实例十九，字符串分割
		System.out.println("\n使用String类中的成员方法按照一定规则对字符串进行分割：");
		// 			方法一，调用String类的public String[] split(String regex, int limit)
		System.out.println("1)调用myStr.split(regex,limit)");
		String str191="lxrm:chen:wang:ma:li";
		String strs[]=str191.split(":",3);
		for(int i=0;i<strs.length;i++){
			System.out.println("strs["+i+"]="+strs[i]);
		}
		// 			方法二，调用String类的public String[] split(String regex)
		System.out.println("2)调用myStr.split(regex)");
		String str192="lxrm:chen:wang:ma:li";
		String strs2[]=str191.split(":");
		for(int i=0;i<strs2.length;i++){
			System.out.println("strs2["+i+"]="+strs2[i]);
		}
		
		//实例二十一，删除字符串首部以及尾部的空白格
		System.out.println("\n删除字符串首部以及尾部的空白格：");
		String str211=" hello world! ";
		String str212=str211.trim();
		System.out.println("删除前："+str211+"   str.length()="+str211.length());
		System.out.println("删除后："+str212+"   str2.length()="+str212.length());
		
		//实例二十四，format()函数的应用实例
			//第一部分：用于格式化日期和时间（Date对象）
		System.out.println("String类中的format()函数的使用实例：");
		System.out.println("1)使用String类中的format()函数格式化日期与时间字符串");
				//实例一
		Date date=new Date();//带格式化日期
		String format1="%te";//期待的格式：如本例中是显示该日期对应于一个月中的哪一天
		System.out.println("今天是本月的第："+String.format(format1, date)+"天");//结果：今天是本月的第8天
				//实例二
		String year=String.format("%tY", date);
		String month=String.format("%tm", date);
		String day=String.format("%td", date);
		String hour=String.format("%tH", date);
		String minute=String.format("%tM", date);
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute);//结果：2017-02-08 20:13
				//实例三，直接使用组合形式
		System.out.println(String.format("%tF", date));//结果：2017-02-08
			//第二部分：用于格式化一般形式的参数（其他类型对象）
		System.out.println("2)使用String类中的format()函数格式化一般类型参数");
		String str241=String.format("%d", 400/2);
		String str242=String.format("%b",3>5);
		String str243=String.format("%x",200);
		System.out.println("十进制显示："+str241);//结果：200
		System.out.println("布尔型显示："+str242);//结果：false
		System.out.println("十六进制显示："+str243);//结果：c8
	}
}
