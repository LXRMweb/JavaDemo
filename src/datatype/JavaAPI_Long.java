/**
 * @author lxrm 
 * @date 20170130
 * @description 讲述Java API之java.lang.Long类的用法
 *  java.lang.Long
 *  	1）概述：该类对应于8种基本数据类型中的long，类中包含了若干用于处理long型数值以及变量的方法
 *  		这个类封装了long这种基本数据类型，当需要将long看做类对象来处理时，可以借助于该类进行相应操作
 * 			Long类中包含若干将long型数值转变成string类型的成员方法，
 * 			以及若干将string类型数值转变成long型数值的方法
 * 			以及其他处理long型变量的成员方法（如 比较大小，long型数值的二进制表示形式进行左移右移、反转等）
 * 		2）Long类中的静态成员常量（static类型的成员常量）
 * 			MIN_VALUE:long  long型变量可以表示的最小值-2^63
 * 			MAX_VALUE:long  long型变量可以表示的最大值2^63-1
 * 			TYPE:Class<Long>   Long类所对应的原始基本数据类型，其值为"long"
 * 			SIZE:int  long型数据所占内存大小，其值为64bit
 * 		3)Long类中的构造函数
 * 			3.1）public Long(long value)
 * 			3.2）public Long(String s) throws NumberFormatException
 * 					备注：s:String必须是十进制的long型数值
 * 						s：String只能包含十进制数值应该含有的字符，否则会触发异常
 * 						s:String  不需要    以l/L作为结束标志来表明这是long型数值
 * 		4）Long类中的成员函数  
 * 			综述：Long类中有若干成员函数，这些成员函数可以被分成若干类
 * 				第一类用于实现各种进制的String对象与Long对象、long型数值之间的转换
 * 				第二类成员函数用于将Long对象所包含的long型数值转化成byte、short、int、long、float、double、string、hashCode 
 * 				第三类成员函数用于比较俩个Long对象或者long型数值的大小
 * 				第四类成员函数用于操作long型数值的bit位（如最高、最低bit位，左移右移，反转，0的个数，1的个数等）
 * 				用于判断long型数值的符号（即正负）
 * 			4.1）Long类中的静态成员函数（static成员函数）
 *(有符号10进制形式的long型数值-->2/8/10/16进制形式的有符号String对象)
 *				4.1.1)public static String toString(long i, int radix)
 * 						功能：将long型的数值转化成2/8/10/16进制表示的字符串,保留原有符号
 * 						 @param   i:long      a {@code long} to be converted to a string.待转换的long型数值
 *						 @param   radix:int   the radix to use in the string representation.指明你想要将你的long型数值转化成几进制的字符串
 * 						 @return  String      a string representation of the argument in the specified radix.   2/8/10/16进制表示的字符串
 * 						调用方法：
 *          				{@code Long.toString(n，radix).toUpperCase()}大写形式
 *          				{@code Long.toString(n，radix)}小写形式
 *          		public static String toString(long i)
 *          			备注：这个函数的功能和上述函数功能相似，只不过这个函数只能将其转化成10进制形式的字符串（保留原有long型数值的正负号）
 *          				这个函数等效于上述函数中将radix赋值为10的情况
 *          				即{@code Long.toString(long i)=Long.toString(long i,10)}
 *(有符号10进制形式的long型数值-->无符号十进制形式的long型数值-->2/8/16进制形式的无符号String对象)
 * 				4.1.2） public static String toHexString(long i)
 * 						功能：将10进制表示的有符号long型数值转化成10进制表示的无符号long型数值，然后将无符号long型数值转化成十六进制表示的字符串
 * 							如果原有long型数值是正的，那么对应的无符号long型数值=原来的值
 * 							如果原有long型数值是负的，那么对应的无符号long型数值=原来的值+2^64
 * 						 @param   i:long   a {@code long} to be converted to a string.
 * 						 @return  String   the string representation of the unsigned {@code long}
 *          					value represented by the argument in hexadecimal十六进制
 *          					(base&nbsp;16).
 *          			调用方法：
 *          				{@code Long.toHexString(n).toUpperCase()}大写形式
 *          				{@code Long.toHexString(n)}小写形式
 *          		public static String toOctalString(long i)
 *          		public static String toBinaryString(long i)
 *          			备注：这两个函数和上述第一个函数功能相似，都是先将有符号long型值i转化成无符号long型数值，然后再将无符号long型数值转化成字符串，
 *          				唯一的区别在于字符串的表示形式不同，hex是十六进制，octal是八进制，binary是二进制字符串
 *(2/8/10/16进制形式的字符串-->十进制形式的long型数值（保留原有正负号）)
 *				4.1.3）public static long parseLong(String s, int radix) throws NumberFormatException
 *						功能：将一个2/8/10/16、17/18/19...进制的字符串解析成一个有符号（正负号）的long型数值
 *							radix指明该字符串的进制，string中不应该含有对应进制之外的字符，譬如radix=8时，如果s:String中含有字符8,9，a之类的字符，那么程序就会抛出异常
 *							
 *						@param      s       the {@code String} containing the
 *				                            {@code long} representation to be parsed.
 *											s:string 中不应该含有进制之外的字符
 *											s:String中可以有+ 、- 符号
 *											s:String中不要用L/l来表示该字符串是long型数值
 *				        @param      radix   the radix to be used while parsing {@code s}.也即字符串s:String的进制
 *			            @return     the {@code long} represented by the string argument in
 *				     		        the specified radix.
 *	     				@throws     NumberFormatException  if the string does not contain a
 *						            parsable {@code long}.
 *				   public static long parseLong(String s) throws NumberFormatException
 *						备注：和上述函数功能相似，只不过本函数默认string的表示形式是10进制，本函数和上述函数中将radix赋值为10的效果是一样的
 *							即{@code Long.parseLong(String s)=Long.parseLong(String s,10)}
 *(2/8/10/16..进制形式的字符串--->Long对象（保留原有正负号）)
 *				4.1.4） public static Long valueOf(String s, int radix) throws NumberFormatException
 *						备注：和4.1.3）小节中第一个函数功能相似，只不过有个不同的点，这个函数的返回值是Long对象，二上面的函数的返回值是long型数值
 *							即调用这个函数所得到的Long对象和下面的代码所得到的Long对象是一样的
 *							{@code new Long(Long.parseLong(s, radix))}
 *							等效于 {@code Long.valueOf(s,radix)}
 *					public static Long valueOf(String s) throws NumberFormatException
 *						备注：和上述函数功能相似，只不过本函数默认s:String是十进制形式的long数值
 *				4.1.5）public static Long decode(String nm) throws NumberFormatException
 *						功能：和4.1.4）小结中所述函数功能相似，也是将字符串转换成Long对象，只不过这个函数更智能，
 *							因为本函数可以自动识别出nm:String的进制，不用在调用程序时显式地指明string的进制
 *							nm：String若是以0x/0X/#开头的，那么Long.decode(nm)函数认为nm:String是十六进制的
 *							nm：String若是以0开头的，那么Long.decode(nm)函数认为nm:String是八进制的
 *							除此之外，Long.decode(nm)函数认为nm:String是十进制的
 *（10进制的long型数值--->10进制的Long对象）
 *				4.1.6）public static Long valueOf(long l) 
 *						功能：将long型数值包装成Long对象
 *（获得系统属性的值(即java.lang.System#getProperty(java.lang.String) ),并将其转化成Long对象）
 *				4.1.7)public static Long getLong(String nm)
 *						功能：
 *						参数：nm:String 系统属性的名称
 *						返回值：名为nm:String的系统属性的值转化成的Long对象
 *					 public static Long getLong(String nm, long val)
 *						备注：本函数和上述函数功能相似，只不过本函数多了一个参数val:long,这个参数一般情况下是不起作用的，只有如下几种情况下会起作用
 *							当系统属性nm不存在或者 if the property does not have the correct numeric format, 
 *							or if the specified name is empty or null.
 *							上述几种情况下会将参数val:long的值封装成Long对象并返回
 *					 public static Long getLong(String nm, Long val)
 *						备注：这个函数和上述第二个函数功能类似，只不过这个函数的第二个参数的类型是一个Long对象，而非long型变量
 *							除了上述不同之处，这个函数还有一个特点就是，这个函数能够自动识别nm:String（系统属性）的表示形式是几进制的
 *							当nm:string是以“0x/0x/#”开头的时候，认为nm是十六进制的
 *							当nm:string是以“0”开头的时候，认为nm是八进制的
 *							其他情况下认为nm是十进制的
 *							另外，无论nm是几进制的表示形式，都不允许string的末尾以L/l作为标志位表明这个string表示的是long型数值，否则会出错
 *（比较两个long型变量值的大小）
 *				4.1.8）public static int compare(long x, long y)
 *（bit位操作）
 *				4.1.9） public static long highestOneBit(long i)
 *					   public static long lowestOneBit(long i)
 *					   public static int numberOfLeadingZeros(long i)
 *					   public static int numberOfTrailingZeros(long i)
 *					   public static int bitCount(long i)
 *						public static long rotateLeft(long i, int distance)
 *						public static long rotateRight(long i, int distance)
 *						public static long reverse(long i)
 *						public static long reverseBytes(long i)
 *	（判断原有long型数值的符号，即正负）
 *				4.1.10）public static int signum(long i)
 *						返回值：当i:long是正数时，返回值为1；是0时，返回值是0；是负数时，返回值是-1
 * 			4.2）Long类中的实例成员函数（必须先获取Long实例，才能调用下面所述各个函数）
 * （Long对象所代表的long型数值--->byte、short、int、long、float、double型数值）
 * 				4.2.1） public byte byteValue()
 * 						public short shortValue()
 * 						public int intValue()
 * 						public long longValue()
 * 						public float floatValue()
 * 						 public double doubleValue()
 * （Long对象所代表的long型数值--->String型数值）
 * 				4.2.3）public String toString()
 * （Long对象所代表的long型数值--->hashCode）
 * 				4.2.4）public int hashCode()
 * （比较两个Long对象的大小）
 * 				4.2.5）public boolean equals(Object obj)
 * 				4.2.6）public int compareTo(Long anotherLong)
 * 				4.2.7）静态函数，可直接调用public static int compare(long x, long y)
 * 
 *  
 *  */
package datatype;

public class JavaAPI_Long {
	public static void main(String[] args){
		System.out.println("java.lang.Long类用法示例：");
		
		//2）Long类中的静态成员常量
		System.out.println("\nLong类中的静态成员常量public static final vectorName=value;");
		System.out.println("Long.MIN_VALUE="+Long.MIN_VALUE);
		System.out.println("Long.MAX_VALUE="+Long.MAX_VALUE);
		System.out.println("Long.Type="+Long.TYPE);
		System.out.println("Long.SIZE="+Long.SIZE);
		
		System.out.println("\nLong类中的静态成员函数：");
		//4.1）Long类中的静态成员函数
		//4.1.1）将10进制形式的long型的数值转化成2/8/10/16进制表示的字符串
		System.out.println("============================================");
		System.out.println("将10进制形式的long型的数值转化成2/8/10/16进制表示的字符串-----保留long型数值的原有符号（正负号）");
		System.out.println("Long.toString(long i,int radix)函数用法示例");
		System.out.println("Long.toString(-123L,2)="+Long.toString(-123L, 2));
		System.out.println("Long.toString(-123L,8)="+Long.toString(-123L, 8));
		System.out.println("Long.toString(-123L,10)="+Long.toString(-123L, 10));
		System.out.println("Long.toString(-123L,16)="+Long.toString(-123L, 16));
		System.out.println("---------------------------------------------");
		System.out.println("将10进制形式的long型的数值转化成2/8/10/16进制表示的字符串-----先将待转化long型数值转化成无符号long型数值，再转化成字符串");
		System.out.println("Long.toHexString(long i)函数用法示例");
		System.out.println("Long.toHexString(-123)="+Long.toHexString(-123));
		System.out.println("Long.toOctalString(long i)函数用法示例");
		System.out.println("Long.toOctalString(-123)="+Long.toOctalString(-123));
		System.out.println("Long.toBinaryString(long i)函数用法示例");
		System.out.println("Long.toBinaryString(-123)="+Long.toBinaryString(-123));
		//4.1.3)将1/2/3/4..8/10/16/...32....进制的有符号字符串转化成有符号long型数值
		System.out.println("============================================");
		System.out.println("将2/8/10/16...23...36..进制表示的字符串转化成有符号的10进制的long型数值-----保留原有符号（正负号）");
		System.out.println("Long.parseLong(String s,int radix)函数的用法：");
		System.out.println("Long.parseLong(\"1000110\",2)="+Long.parseLong("1000110", 2));
		System.out.println("Long.parseLong(\"734100\",8)="+Long.parseLong("734100", 8));
		System.out.println("Long.parseLong(\"-1398\",10)="+Long.parseLong("-1398", 10));
		System.out.println("Long.parseLong(\"-123afe\",16)="+Long.parseLong("-123afe", 16));
		System.out.println("Long.parseLong(\"123ahdlxrm\",36)="+Long.parseLong("123ahdlxrm", 36));
		
		
		//通过构造函数创建Long对象，并通过Long对象调用Long类中的实例方法
		Long l1=new Long(123L);
		Long l2=new Long("482");
	}

}
