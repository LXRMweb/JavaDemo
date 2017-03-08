/**
 * @author lxrm
 * @date 20170129
 * @description 讲述Java API之java.lang.Integer类的用法
 * java.lang.Integer
 * 		1）概述，这个类封装了int这种基本数据类型，当需要将int看做类对象来处理时，可以借助于该类进行相应操作
 * 			Integer类中包含若干将int型数值转变成string类型的成员方法，
 * 			以及若干将string类型数值转变成int型数值的方法
 * 			以及其他处理int型变量的成员方法（如比较大小，int值的二进制表示形式进行左移右移、反转等）
 * 		2）Integer类中的静态成员常量（static类型的成员常量）
 * 			MIN_VALUE:int  int型变量可以表示的最小值-2^31
 * 			MAX_VALUE:int  int型变量可以表示的最大值2^31-1
 * 			TYPE:Class<Integer>   Integer类所对应的原始基本数据类型，其值为"int"
 * 	(不常用)	digits:char[]   字符串可以表示数值，如“123”表示数值123，但是字符串中的字符不能随便取值。
 * 							用于表示数值的字符串中的字符只能取自digits字符数组中的元素，即{0-9，a-z}
 * 			public static final int SIZE = 32;//int型数值所占内存大小，单位为bit
 * 			
 * 		3）Integer类中的构造函数
 * 				public Integer(int value)
 * 				public Integer(String s) throws NumberFormatException
 * 					备注：s:String必须是一个十进制形式的数值，否则会抛出NumberFormatException
 * 		4）Integer类中的成员方法
 * 			概述：这些成员函数的功能就是使得2/8/10/16进制的String对象<----->10进制形式的int型数值<----->10进制形式的Integer对象
 * 				<----->byte/short/int/long/float/double类型<----->hash码
 * 				之间可以相互转化
 * 				还有一些成员函数用于比较两个Integer对象,或者比较两个int值
 * 				某些成员方法可以访问int型数值的最高、最低bit处的值，int型数值的二进制表示法中0的个数
 * 				将int型数值的二进制表示形式左移或者右移若干bit位得到一个新的值
 * 			4.1)静态成员方法（直接使用Integer.方法名（）来调用）
 * 				4.1.1)public static String toString(int i, int radix)
 * 						功能：将int型的数值转换成String对象，并且可以指定表示形式（10进制、八进制、十六进制）
 * 						参数：i:int 待转换的int型变量
 * 							radix:int 数值的表示形式，其值可以为10,8,16
 * 						返回值：String int型参数i转化后的结果，是一个String对象
 * 						备注：如果需要将字母转换成大写的，可以结合使用toUpperCase()使用，
 * 							{@code Integer.toString(n,radix).toUpperCase()}
 * 					  public static String toString(int i)
 *  					备注：这个函数和上述函数功能相似，只不过这个函数默认使用10进制表示，即该函数等价于Integer.toString(n,10)
 * 				4.1.2) public static String toHexString(int i)
 * 						功能：将int型的数值转换成String对象,但是只能使用16进制表示
 * 							除此之外，转化结果不一定等于原来的值，而是对应于原有int值的一个无符号整数，具体解释为：
 * 								如果原来的值是负值，则结果=原来的值+2^32
 * 								如果原来的值是正的，则结果=原来的值
 * 						参数：i:int 待转化的int型数值
 * 						返回值：转化后的结果，即参数i:int所对应的无符号整数
 * 					   public static String toOctalString(int i)
 * 					   public static String toBinaryString(int i)
 * 					           备注：后面这俩个成员函数和前面所述函数功能相似，都是把有符号int型变量值转换成无符号整数值（原先是正数时转换结果等于原来的值，
 * 							原先为负数时等于原先的值+2^32）,再将转化所得无符号数值转化成String对象，只不过第一个函数是表示成16进制形式，
 * 							toOctalString()是表示成八进制形式，toBinaryString()是表示成二进制形式
 * 				4.1.3）public static int parseInt(String s, int radix) throws NumberFormatException
 * 						功能：将String对象转化成int型数值，前提是该String对象表示的是一个数值（即该string对象中的字符只能包含对应进制下的字符）
 * 						参数：s:String 待转化的字符串，如“-123” “87ab1”
 * 							radix:int 表示参数s:String值的表示形式，可取的值有2/8/10/16，分别表示s:String是二进制/八进制/十进制/十六进制数值
 * 						返回值：int  参数s:String对应的int值（以10进制形式表示）
 * 						异常：当参数s:String,即待转化字符串中含有对应进制下不该出现的字符时，抛出NumberFormatException
 * 							如Integer.parseInt("34ae5h",16)就是错的，会触发异常，因为16进制下不应该出现h字符
 * 					  public static int parseInt(String s) throws NumberFormatException
 * 						备注：这个函数和上述函数功能相似，只不过默认string参数的表示形式是十进制的，这个函数等效于Integer.parseInt(String s,10)
 * 			    4.1.4）public static Integer valueOf(String s, int radix) throws NumberFormatException
 * 						功能：和4.1.3）小结中所陈列的函数功能相似，只不过这里是转化成Integer对象，而4.1.3小结中函数是转化成int型数值
 * 							也就是说本函数的功能是将8/10/16进制的String转化成十进制形式的Integer对象
 * 					  public static Integer valueOf(String s) throws NumberFormatException
 * 						备注：和上述函数功能相似，只不过本函数默认s:String是以十进制形式表示的	
 * 				4.1.5）public static Integer valueOf(int i)
 * 						功能:将int型数值转化成Integer对象
 * 				4.1.6）public static Integer getInteger(String nm)
 * 						功能：获取系统属性（即java.lang.System#getProperty(java.lang.String)）
 * 							并将该“系统属性”的值转化成Integer对象返回
 * 						参数：nm:String=java.lang.System#getProperty(java.lang.String)
 * 						返回值：Integer对象，是系统属性值转化而来的
 * 					  public static Integer getInteger(String nm, int val)
 * 						备注：和上述函数功能相似，只不过这个函数添加了一个参数val:int,使用这个参数给系统属性赋了一个默认值，当系统属性nm:String的值为空时，
 * 							系统属性nm不存在，或者系统属性值中含有不能解析为数字的字符时
 * 							val的值就作为int数值，封装成Integer对象
 * 						@param   nm   property name.系统属性的  属性名称
 * 						@param   val   default value.默认值，当相应系统属性的值为空时或者不能解析成数值，或者该系统属性根本不存在时，该参数起作用，被作为int数值封装成Integer对象
 *						@return  the {@code Integer} value of the property.将系统属性的值封装成Integer对象
 *					  public static Integer getInteger(String nm, Integer val)
 *						备注：和上述第二个函数功能相同，只不过默认值不是int型的，而是直接是一个Integer对象
 *				4.1.7）public static Integer decode(String nm) throws NumberFormatException
 *						功能：将String对象的值解析成Integer对象（能够根据字符串首字母知道这个字符串的表示形式是几进制）
 *						参数：nm:String 待解析的字符串，如果nm="0x..."或者"0X..."或者"#...",程序会认为该字符串是16进制的
 *												如果nm="0...",程序会认为该字符串是8进制的
 *												除了上述四种情况之外，程序都会认为该字符串是十进制的
 *				4.1.8）public static int compare(int x, int y)
 *						 @param  x the first {@code int} to compare
 *						 @param  y the second {@code int} to compare
 * 						 @return the value {@code 0} if {@code x == y};
 *         				   		a value less than {@code 0} if {@code x < y}; and
 *         						a value greater than {@code 0} if {@code x > y}
 *         		4.1.9）public static int highestOneBit(int i)
 *         				功能：返回int型数值的最高bit位的值
 *         			  public static int lowestOneBit(int i)
 *         				功能：返回i:int的最低bit位的值
 *         			  public static int numberOfLeadingZeros(int i)
 *       （不知理解的是否正确）功能：返回i:int的二进制表示法中0的个数（从最高位开始）
 *         			  public static int numberOfTrailingZeros(int i)
 *       （不知理解的是否正确）功能：返回i:int的二进制表示法中0的个数（从最低位开始） 
 *         			  public static int bitCount(int i)
 *       （不知理解的是否正确）功能：返回i:int的二进制表示法中１的个数
 *       		4.1.10）public static int rotateLeft(int i, int distance)
 *       				功能：将i:int的二进制表示形式左移distance位，得到一个新的值并返回
 *       			   public static int rotateRight(int i, int distance)
 *       			   public static int reverse(int i)
 *       			   public static int reverseBytes(int i)
 *       		4.1.11） public static int signum(int i)
 *       					功能：判断int数值的符号，如果是0，返回值为0；如果是正数，返回值是1；如果是负数，返回值是-1
 * 			4.2)实例成员方法，不可直接使用类名.方法名()直接调用下面的函数，只能先得到一个Integer实例，然后用该实例调用下面的这些非static成员方法
 * 				4.2.1）public byte byteValue()
 * 						功能:将Integer对象代表的value变成byte类型并返回
 * 					  public short shortValue()
 * 					  public int intValue()
 * 					  public long longValue()
 * 					  public float floatValue()
 * 					  public double doubleValue()
 * 			    4.2.2）public String toString()
 * 						功能：将Integer对象所代表的数值转化成10进制形式的String对象
 * 				4.2.3）public int hashCode()
 * 						功能：将Integer对象所代表的数值转化成hash码
 * 				4.2.4） public boolean equals(Object obj)
 * 						功能：只有参数是Integer类型并且其值与被比较者所代表的int数值相等时，返回值为true
 * 				4.2.5）public int compareTo(Integer anotherInteger)
 * 						功能：比较两个Integer对象的数值的大小，如果相等，则返回值=0
 * 						           如果比参数小，则返回值为一个负数
 * 							如果比参数大，则返回值为一个正数
 * 		
 * 
 * 						   
 * 		*/
package datatype;

public class JavaAPI_Integer {
	public static void main(String[] args){
		//2)Integer类中的静态成员常量，可以使用Integer.常量名  来操作
		System.out.println("java.lang.Integer类中的成员变量：");
		System.out.println("Integer.MIN_VALUE="+Integer.MIN_VALUE);//结果：-2147483648
		System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);//结果：2147483647
		System.out.println("Integer.TYPE="+Integer.TYPE);//结果：int
		
		//4.1）静态成员方法
		//4.1.1）十进制形式的int型数值转化成2/8/10/16进制形式的String对象（保留原有符号）
		System.out.println("\n有符号int型数值转换成String对象（保留原来数值符号）：");
		System.out.println("1）Integer.toString(int i,int radix)用法示例：");
		System.out.println("Integer.toString(-123, 10)  "+Integer.toString(-123, 10));//结果：“-123”
		System.out.println("Integer.toString(-123, 8)  "+Integer.toString(-123, 8));//结果：“-173”
		System.out.println("Integer.toString(-123, 2)  "+Integer.toString(-123, 2));//结果：“-1111011”
		System.out.println("Integer.toString(-123, 16)  "+Integer.toString(-123, 16));//结果：“-7b”
		System.out.println("Integer.toString(123, 16)  "+Integer.toString(123, 16));//结果：“7b”
		System.out.println("Integer.toString(123, 16).toUpperCase()  "+Integer.toString(123, 16).toUpperCase());//结果：“7B”
		System.out.println("2）Integer.toString(int i)用法示例：");
		System.out.println("Integer.toString(-123)  "+Integer.toString(-123));//结果：“-123”
		System.out.println("小结：Integer.toString(int i)等效于Integer.toString(int i,10),即，默认使用十进制形式表示");
		//4.1.2）十进制形式的int型数值转化成无符号整数，再转化成2/8/16String对象（正数数值不变，负数数值变成原有值+2^32）
		System.out.println("\n有符号int型数值转换成无符号类型整数，再转化成String对象（负数变成正数，正数还是正数）：");
		System.out.println("1）Integer.toHexString(int i)的用法示例：");
		System.out.println("Integer.toHexString(-123)  "+Integer.toHexString(-123));//结果：“ffff ff85”
		System.out.println("Integer.toHexString(123)"+Integer.toHexString(123));//结果："7b"
		System.out.println("2）Integer.toOctalString(int i)的用法示例：");
		System.out.println("Integer.toOctalString(-123)  "+Integer.toOctalString(-123));//结果："37777777605"
		System.out.println("Integer.toOctalString(123)  "+Integer.toOctalString(123));//结果："173"
		System.out.println("3）Integer.toBinaryString(int i)的用法示例：");
		System.out.println("Integer.toBinaryString(-123)  "+Integer.toBinaryString(-123));//结果："11111111111111111111111110000101
		System.out.println("Integer.toBinaryString(123)  "+Integer.toBinaryString(123));//结果："1111011"
		//4.1.3)将2/8/10/16进制的String对象解析成int型数值（10进制形式的int值）
		System.out.println("\n将String类型对象转换成int类型数值（前提是你的String对象必须是一个数值）");
		System.out.println("1）Integer.toPerseInt(String str,int radix)的用法示例：");
		System.out.println("Integer.toPerseInt(\"0010100011\",2)  "+Integer.parseInt("0010100011",2));//结果:163
		System.out.println("Integer.toPerseInt(\"137\",8)  "+Integer.parseInt("137",8));//结果：95
		System.out.println("Integer.toPerseInt(\"123\",10)  "+Integer.parseInt("123",10));//结果:123
		System.out.println("Integer.toPerseInt(\"1fe2\",16)  "+Integer.parseInt("1fe2",16));//结果：8162
		System.out.println("Integer.toPerseInt(\"-1fe2\",16)  "+Integer.parseInt("-1fe2",16));//结果：-8162
		System.out.println("2）Integer.toPerseInt(String str)的用法示例：");
		System.out.println("Integer.toPerseInt(\"-123\")  "+Integer.parseInt("-123"));
		System.out.println("总结：Integer.toPerseInt(String str)等效于Integer.toPerseInt(String str，10)");
	}

}
