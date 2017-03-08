/**
 * @author lxrm 
 * @date 20170130
 * @description ����Java API֮java.lang.Long����÷�
 *  java.lang.Long
 *  	1�������������Ӧ��8�ֻ������������е�long�����а������������ڴ���long����ֵ�Լ������ķ���
 *  		������װ��long���ֻ����������ͣ�����Ҫ��long���������������ʱ�����Խ����ڸ��������Ӧ����
 * 			Long���а������ɽ�long����ֵת���string���͵ĳ�Ա������
 * 			�Լ����ɽ�string������ֵת���long����ֵ�ķ���
 * 			�Լ���������long�ͱ����ĳ�Ա�������� �Ƚϴ�С��long����ֵ�Ķ����Ʊ�ʾ��ʽ�����������ơ���ת�ȣ�
 * 		2��Long���еľ�̬��Ա������static���͵ĳ�Ա������
 * 			MIN_VALUE:long  long�ͱ������Ա�ʾ����Сֵ-2^63
 * 			MAX_VALUE:long  long�ͱ������Ա�ʾ�����ֵ2^63-1
 * 			TYPE:Class<Long>   Long������Ӧ��ԭʼ�����������ͣ���ֵΪ"long"
 * 			SIZE:int  long��������ռ�ڴ��С����ֵΪ64bit
 * 		3)Long���еĹ��캯��
 * 			3.1��public Long(long value)
 * 			3.2��public Long(String s) throws NumberFormatException
 * 					��ע��s:String������ʮ���Ƶ�long����ֵ
 * 						s��Stringֻ�ܰ���ʮ������ֵӦ�ú��е��ַ�������ᴥ���쳣
 * 						s:String  ����Ҫ    ��l/L��Ϊ������־����������long����ֵ
 * 		4��Long���еĳ�Ա����  
 * 			������Long���������ɳ�Ա��������Щ��Ա�������Ա��ֳ�������
 * 				��һ������ʵ�ָ��ֽ��Ƶ�String������Long����long����ֵ֮���ת��
 * 				�ڶ����Ա�������ڽ�Long������������long����ֵת����byte��short��int��long��float��double��string��hashCode 
 * 				�������Ա�������ڱȽ�����Long�������long����ֵ�Ĵ�С
 * 				�������Ա�������ڲ���long����ֵ��bitλ������ߡ����bitλ���������ƣ���ת��0�ĸ�����1�ĸ����ȣ�
 * 				�����ж�long����ֵ�ķ��ţ���������
 * 			4.1��Long���еľ�̬��Ա������static��Ա������
 *(�з���10������ʽ��long����ֵ-->2/8/10/16������ʽ���з���String����)
 *				4.1.1)public static String toString(long i, int radix)
 * 						���ܣ���long�͵���ֵת����2/8/10/16���Ʊ�ʾ���ַ���,����ԭ�з���
 * 						 @param   i:long      a {@code long} to be converted to a string.��ת����long����ֵ
 *						 @param   radix:int   the radix to use in the string representation.ָ������Ҫ�����long����ֵת���ɼ����Ƶ��ַ���
 * 						 @return  String      a string representation of the argument in the specified radix.   2/8/10/16���Ʊ�ʾ���ַ���
 * 						���÷�����
 *          				{@code Long.toString(n��radix).toUpperCase()}��д��ʽ
 *          				{@code Long.toString(n��radix)}Сд��ʽ
 *          		public static String toString(long i)
 *          			��ע����������Ĺ��ܺ����������������ƣ�ֻ�����������ֻ�ܽ���ת����10������ʽ���ַ���������ԭ��long����ֵ�������ţ�
 *          				���������Ч�����������н�radix��ֵΪ10�����
 *          				��{@code Long.toString(long i)=Long.toString(long i,10)}
 *(�з���10������ʽ��long����ֵ-->�޷���ʮ������ʽ��long����ֵ-->2/8/16������ʽ���޷���String����)
 * 				4.1.2�� public static String toHexString(long i)
 * 						���ܣ���10���Ʊ�ʾ���з���long����ֵת����10���Ʊ�ʾ���޷���long����ֵ��Ȼ���޷���long����ֵת����ʮ�����Ʊ�ʾ���ַ���
 * 							���ԭ��long����ֵ�����ģ���ô��Ӧ���޷���long����ֵ=ԭ����ֵ
 * 							���ԭ��long����ֵ�Ǹ��ģ���ô��Ӧ���޷���long����ֵ=ԭ����ֵ+2^64
 * 						 @param   i:long   a {@code long} to be converted to a string.
 * 						 @return  String   the string representation of the unsigned {@code long}
 *          					value represented by the argument in hexadecimalʮ������
 *          					(base&nbsp;16).
 *          			���÷�����
 *          				{@code Long.toHexString(n).toUpperCase()}��д��ʽ
 *          				{@code Long.toHexString(n)}Сд��ʽ
 *          		public static String toOctalString(long i)
 *          		public static String toBinaryString(long i)
 *          			��ע��������������������һ�������������ƣ������Ƚ��з���long��ֵiת�����޷���long����ֵ��Ȼ���ٽ��޷���long����ֵת�����ַ�����
 *          				Ψһ�����������ַ����ı�ʾ��ʽ��ͬ��hex��ʮ�����ƣ�octal�ǰ˽��ƣ�binary�Ƕ������ַ���
 *(2/8/10/16������ʽ���ַ���-->ʮ������ʽ��long����ֵ������ԭ�������ţ�)
 *				4.1.3��public static long parseLong(String s, int radix) throws NumberFormatException
 *						���ܣ���һ��2/8/10/16��17/18/19...���Ƶ��ַ���������һ���з��ţ������ţ���long����ֵ
 *							radixָ�����ַ����Ľ��ƣ�string�в�Ӧ�ú��ж�Ӧ����֮����ַ���Ʃ��radix=8ʱ�����s:String�к����ַ�8,9��a֮����ַ�����ô����ͻ��׳��쳣
 *							
 *						@param      s       the {@code String} containing the
 *				                            {@code long} representation to be parsed.
 *											s:string �в�Ӧ�ú��н���֮����ַ�
 *											s:String�п�����+ ��- ����
 *											s:String�в�Ҫ��L/l����ʾ���ַ�����long����ֵ
 *				        @param      radix   the radix to be used while parsing {@code s}.Ҳ���ַ���s:String�Ľ���
 *			            @return     the {@code long} represented by the string argument in
 *				     		        the specified radix.
 *	     				@throws     NumberFormatException  if the string does not contain a
 *						            parsable {@code long}.
 *				   public static long parseLong(String s) throws NumberFormatException
 *						��ע�������������������ƣ�ֻ����������Ĭ��string�ı�ʾ��ʽ��10���ƣ������������������н�radix��ֵΪ10��Ч����һ����
 *							��{@code Long.parseLong(String s)=Long.parseLong(String s,10)}
 *(2/8/10/16..������ʽ���ַ���--->Long���󣨱���ԭ�������ţ�)
 *				4.1.4�� public static Long valueOf(String s, int radix) throws NumberFormatException
 *						��ע����4.1.3��С���е�һ�������������ƣ�ֻ�����и���ͬ�ĵ㣬��������ķ���ֵ��Long���󣬶�����ĺ����ķ���ֵ��long����ֵ
 *							����������������õ���Long���������Ĵ������õ���Long������һ����
 *							{@code new Long(Long.parseLong(s, radix))}
 *							��Ч�� {@code Long.valueOf(s,radix)}
 *					public static Long valueOf(String s) throws NumberFormatException
 *						��ע�������������������ƣ�ֻ����������Ĭ��s:String��ʮ������ʽ��long��ֵ
 *				4.1.5��public static Long decode(String nm) throws NumberFormatException
 *						���ܣ���4.1.4��С�������������������ƣ�Ҳ�ǽ��ַ���ת����Long����ֻ����������������ܣ�
 *							��Ϊ�����������Զ�ʶ���nm:String�Ľ��ƣ������ڵ��ó���ʱ��ʽ��ָ��string�Ľ���
 *							nm��String������0x/0X/#��ͷ�ģ���ôLong.decode(nm)������Ϊnm:String��ʮ�����Ƶ�
 *							nm��String������0��ͷ�ģ���ôLong.decode(nm)������Ϊnm:String�ǰ˽��Ƶ�
 *							����֮�⣬Long.decode(nm)������Ϊnm:String��ʮ���Ƶ�
 *��10���Ƶ�long����ֵ--->10���Ƶ�Long����
 *				4.1.6��public static Long valueOf(long l) 
 *						���ܣ���long����ֵ��װ��Long����
 *�����ϵͳ���Ե�ֵ(��java.lang.System#getProperty(java.lang.String) ),������ת����Long����
 *				4.1.7)public static Long getLong(String nm)
 *						���ܣ�
 *						������nm:String ϵͳ���Ե�����
 *						����ֵ����Ϊnm:String��ϵͳ���Ե�ֵת���ɵ�Long����
 *					 public static Long getLong(String nm, long val)
 *						��ע�������������������������ƣ�ֻ��������������һ������val:long,�������һ��������ǲ������õģ�ֻ�����¼�������»�������
 *							��ϵͳ����nm�����ڻ��� if the property does not have the correct numeric format, 
 *							or if the specified name is empty or null.
 *							������������»Ὣ����val:long��ֵ��װ��Long���󲢷���
 *					 public static Long getLong(String nm, Long val)
 *						��ע����������������ڶ��������������ƣ�ֻ������������ĵڶ���������������һ��Long���󣬶���long�ͱ���
 *							����������֮ͬ���������������һ���ص���ǣ���������ܹ��Զ�ʶ��nm:String��ϵͳ���ԣ��ı�ʾ��ʽ�Ǽ����Ƶ�
 *							��nm:string���ԡ�0x/0x/#����ͷ��ʱ����Ϊnm��ʮ�����Ƶ�
 *							��nm:string���ԡ�0����ͷ��ʱ����Ϊnm�ǰ˽��Ƶ�
 *							�����������Ϊnm��ʮ���Ƶ�
 *							���⣬����nm�Ǽ����Ƶı�ʾ��ʽ����������string��ĩβ��L/l��Ϊ��־λ�������string��ʾ����long����ֵ����������
 *���Ƚ�����long�ͱ���ֵ�Ĵ�С��
 *				4.1.8��public static int compare(long x, long y)
 *��bitλ������
 *				4.1.9�� public static long highestOneBit(long i)
 *					   public static long lowestOneBit(long i)
 *					   public static int numberOfLeadingZeros(long i)
 *					   public static int numberOfTrailingZeros(long i)
 *					   public static int bitCount(long i)
 *						public static long rotateLeft(long i, int distance)
 *						public static long rotateRight(long i, int distance)
 *						public static long reverse(long i)
 *						public static long reverseBytes(long i)
 *	���ж�ԭ��long����ֵ�ķ��ţ���������
 *				4.1.10��public static int signum(long i)
 *						����ֵ����i:long������ʱ������ֵΪ1����0ʱ������ֵ��0���Ǹ���ʱ������ֵ��-1
 * 			4.2��Long���е�ʵ����Ա�����������Ȼ�ȡLongʵ�������ܵ���������������������
 * ��Long�����������long����ֵ--->byte��short��int��long��float��double����ֵ��
 * 				4.2.1�� public byte byteValue()
 * 						public short shortValue()
 * 						public int intValue()
 * 						public long longValue()
 * 						public float floatValue()
 * 						 public double doubleValue()
 * ��Long�����������long����ֵ--->String����ֵ��
 * 				4.2.3��public String toString()
 * ��Long�����������long����ֵ--->hashCode��
 * 				4.2.4��public int hashCode()
 * ���Ƚ�����Long����Ĵ�С��
 * 				4.2.5��public boolean equals(Object obj)
 * 				4.2.6��public int compareTo(Long anotherLong)
 * 				4.2.7����̬��������ֱ�ӵ���public static int compare(long x, long y)
 * 
 *  
 *  */
package datatype;

public class JavaAPI_Long {
	public static void main(String[] args){
		System.out.println("java.lang.Long���÷�ʾ����");
		
		//2��Long���еľ�̬��Ա����
		System.out.println("\nLong���еľ�̬��Ա����public static final vectorName=value;");
		System.out.println("Long.MIN_VALUE="+Long.MIN_VALUE);
		System.out.println("Long.MAX_VALUE="+Long.MAX_VALUE);
		System.out.println("Long.Type="+Long.TYPE);
		System.out.println("Long.SIZE="+Long.SIZE);
		
		System.out.println("\nLong���еľ�̬��Ա������");
		//4.1��Long���еľ�̬��Ա����
		//4.1.1����10������ʽ��long�͵���ֵת����2/8/10/16���Ʊ�ʾ���ַ���
		System.out.println("============================================");
		System.out.println("��10������ʽ��long�͵���ֵת����2/8/10/16���Ʊ�ʾ���ַ���-----����long����ֵ��ԭ�з��ţ������ţ�");
		System.out.println("Long.toString(long i,int radix)�����÷�ʾ��");
		System.out.println("Long.toString(-123L,2)="+Long.toString(-123L, 2));
		System.out.println("Long.toString(-123L,8)="+Long.toString(-123L, 8));
		System.out.println("Long.toString(-123L,10)="+Long.toString(-123L, 10));
		System.out.println("Long.toString(-123L,16)="+Long.toString(-123L, 16));
		System.out.println("---------------------------------------------");
		System.out.println("��10������ʽ��long�͵���ֵת����2/8/10/16���Ʊ�ʾ���ַ���-----�Ƚ���ת��long����ֵת�����޷���long����ֵ����ת�����ַ���");
		System.out.println("Long.toHexString(long i)�����÷�ʾ��");
		System.out.println("Long.toHexString(-123)="+Long.toHexString(-123));
		System.out.println("Long.toOctalString(long i)�����÷�ʾ��");
		System.out.println("Long.toOctalString(-123)="+Long.toOctalString(-123));
		System.out.println("Long.toBinaryString(long i)�����÷�ʾ��");
		System.out.println("Long.toBinaryString(-123)="+Long.toBinaryString(-123));
		//4.1.3)��1/2/3/4..8/10/16/...32....���Ƶ��з����ַ���ת�����з���long����ֵ
		System.out.println("============================================");
		System.out.println("��2/8/10/16...23...36..���Ʊ�ʾ���ַ���ת�����з��ŵ�10���Ƶ�long����ֵ-----����ԭ�з��ţ������ţ�");
		System.out.println("Long.parseLong(String s,int radix)�������÷���");
		System.out.println("Long.parseLong(\"1000110\",2)="+Long.parseLong("1000110", 2));
		System.out.println("Long.parseLong(\"734100\",8)="+Long.parseLong("734100", 8));
		System.out.println("Long.parseLong(\"-1398\",10)="+Long.parseLong("-1398", 10));
		System.out.println("Long.parseLong(\"-123afe\",16)="+Long.parseLong("-123afe", 16));
		System.out.println("Long.parseLong(\"123ahdlxrm\",36)="+Long.parseLong("123ahdlxrm", 36));
		
		
		//ͨ�����캯������Long���󣬲�ͨ��Long�������Long���е�ʵ������
		Long l1=new Long(123L);
		Long l2=new Long("482");
	}

}
