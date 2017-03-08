/**
 * @author lxrm
 * @date 20170129
 * @description ����Java API֮java.lang.Integer����÷�
 * java.lang.Integer
 * 		1��������������װ��int���ֻ����������ͣ�����Ҫ��int���������������ʱ�����Խ����ڸ��������Ӧ����
 * 			Integer���а������ɽ�int����ֵת���string���͵ĳ�Ա������
 * 			�Լ����ɽ�string������ֵת���int����ֵ�ķ���
 * 			�Լ���������int�ͱ����ĳ�Ա��������Ƚϴ�С��intֵ�Ķ����Ʊ�ʾ��ʽ�����������ơ���ת�ȣ�
 * 		2��Integer���еľ�̬��Ա������static���͵ĳ�Ա������
 * 			MIN_VALUE:int  int�ͱ������Ա�ʾ����Сֵ-2^31
 * 			MAX_VALUE:int  int�ͱ������Ա�ʾ�����ֵ2^31-1
 * 			TYPE:Class<Integer>   Integer������Ӧ��ԭʼ�����������ͣ���ֵΪ"int"
 * 	(������)	digits:char[]   �ַ������Ա�ʾ��ֵ���硰123����ʾ��ֵ123�������ַ����е��ַ��������ȡֵ��
 * 							���ڱ�ʾ��ֵ���ַ����е��ַ�ֻ��ȡ��digits�ַ������е�Ԫ�أ���{0-9��a-z}
 * 			public static final int SIZE = 32;//int����ֵ��ռ�ڴ��С����λΪbit
 * 			
 * 		3��Integer���еĹ��캯��
 * 				public Integer(int value)
 * 				public Integer(String s) throws NumberFormatException
 * 					��ע��s:String������һ��ʮ������ʽ����ֵ��������׳�NumberFormatException
 * 		4��Integer���еĳ�Ա����
 * 			��������Щ��Ա�����Ĺ��ܾ���ʹ��2/8/10/16���Ƶ�String����<----->10������ʽ��int����ֵ<----->10������ʽ��Integer����
 * 				<----->byte/short/int/long/float/double����<----->hash��
 * 				֮������໥ת��
 * 				����һЩ��Ա�������ڱȽ�����Integer����,���߱Ƚ�����intֵ
 * 				ĳЩ��Ա�������Է���int����ֵ����ߡ����bit����ֵ��int����ֵ�Ķ����Ʊ�ʾ����0�ĸ���
 * 				��int����ֵ�Ķ����Ʊ�ʾ��ʽ���ƻ�����������bitλ�õ�һ���µ�ֵ
 * 			4.1)��̬��Ա������ֱ��ʹ��Integer.���������������ã�
 * 				4.1.1)public static String toString(int i, int radix)
 * 						���ܣ���int�͵���ֵת����String���󣬲��ҿ���ָ����ʾ��ʽ��10���ơ��˽��ơ�ʮ�����ƣ�
 * 						������i:int ��ת����int�ͱ���
 * 							radix:int ��ֵ�ı�ʾ��ʽ����ֵ����Ϊ10,8,16
 * 						����ֵ��String int�Ͳ���iת����Ľ������һ��String����
 * 						��ע�������Ҫ����ĸת���ɴ�д�ģ����Խ��ʹ��toUpperCase()ʹ�ã�
 * 							{@code Integer.toString(n,radix).toUpperCase()}
 * 					  public static String toString(int i)
 *  					��ע��������������������������ƣ�ֻ�����������Ĭ��ʹ��10���Ʊ�ʾ�����ú����ȼ���Integer.toString(n,10)
 * 				4.1.2) public static String toHexString(int i)
 * 						���ܣ���int�͵���ֵת����String����,����ֻ��ʹ��16���Ʊ�ʾ
 * 							����֮�⣬ת�������һ������ԭ����ֵ�����Ƕ�Ӧ��ԭ��intֵ��һ���޷����������������Ϊ��
 * 								���ԭ����ֵ�Ǹ�ֵ������=ԭ����ֵ+2^32
 * 								���ԭ����ֵ�����ģ�����=ԭ����ֵ
 * 						������i:int ��ת����int����ֵ
 * 						����ֵ��ת����Ľ����������i:int����Ӧ���޷�������
 * 					   public static String toOctalString(int i)
 * 					   public static String toBinaryString(int i)
 * 					           ��ע��������������Ա������ǰ�����������������ƣ����ǰ��з���int�ͱ���ֵת�����޷�������ֵ��ԭ��������ʱת���������ԭ����ֵ��
 * 							ԭ��Ϊ����ʱ����ԭ�ȵ�ֵ+2^32��,�ٽ�ת�������޷�����ֵת����String����ֻ������һ�������Ǳ�ʾ��16������ʽ��
 * 							toOctalString()�Ǳ�ʾ�ɰ˽�����ʽ��toBinaryString()�Ǳ�ʾ�ɶ�������ʽ
 * 				4.1.3��public static int parseInt(String s, int radix) throws NumberFormatException
 * 						���ܣ���String����ת����int����ֵ��ǰ���Ǹ�String�����ʾ����һ����ֵ������string�����е��ַ�ֻ�ܰ�����Ӧ�����µ��ַ���
 * 						������s:String ��ת�����ַ������硰-123�� ��87ab1��
 * 							radix:int ��ʾ����s:Stringֵ�ı�ʾ��ʽ����ȡ��ֵ��2/8/10/16���ֱ��ʾs:String�Ƕ�����/�˽���/ʮ����/ʮ��������ֵ
 * 						����ֵ��int  ����s:String��Ӧ��intֵ����10������ʽ��ʾ��
 * 						�쳣��������s:String,����ת���ַ����к��ж�Ӧ�����²��ó��ֵ��ַ�ʱ���׳�NumberFormatException
 * 							��Integer.parseInt("34ae5h",16)���Ǵ�ģ��ᴥ���쳣����Ϊ16�����²�Ӧ�ó���h�ַ�
 * 					  public static int parseInt(String s) throws NumberFormatException
 * 						��ע��������������������������ƣ�ֻ����Ĭ��string�����ı�ʾ��ʽ��ʮ���Ƶģ����������Ч��Integer.parseInt(String s,10)
 * 			    4.1.4��public static Integer valueOf(String s, int radix) throws NumberFormatException
 * 						���ܣ���4.1.3��С���������еĺ����������ƣ�ֻ����������ת����Integer���󣬶�4.1.3С���к�����ת����int����ֵ
 * 							Ҳ����˵�������Ĺ����ǽ�8/10/16���Ƶ�Stringת����ʮ������ʽ��Integer����
 * 					  public static Integer valueOf(String s) throws NumberFormatException
 * 						��ע�������������������ƣ�ֻ����������Ĭ��s:String����ʮ������ʽ��ʾ��	
 * 				4.1.5��public static Integer valueOf(int i)
 * 						����:��int����ֵת����Integer����
 * 				4.1.6��public static Integer getInteger(String nm)
 * 						���ܣ���ȡϵͳ���ԣ���java.lang.System#getProperty(java.lang.String)��
 * 							�����á�ϵͳ���ԡ���ֵת����Integer���󷵻�
 * 						������nm:String=java.lang.System#getProperty(java.lang.String)
 * 						����ֵ��Integer������ϵͳ����ֵת��������
 * 					  public static Integer getInteger(String nm, int val)
 * 						��ע�������������������ƣ�ֻ����������������һ������val:int,ʹ�����������ϵͳ���Ը���һ��Ĭ��ֵ����ϵͳ����nm:String��ֵΪ��ʱ��
 * 							ϵͳ����nm�����ڣ�����ϵͳ����ֵ�к��в��ܽ���Ϊ���ֵ��ַ�ʱ
 * 							val��ֵ����Ϊint��ֵ����װ��Integer����
 * 						@param   nm   property name.ϵͳ���Ե�  ��������
 * 						@param   val   default value.Ĭ��ֵ������Ӧϵͳ���Ե�ֵΪ��ʱ���߲��ܽ�������ֵ�����߸�ϵͳ���Ը���������ʱ���ò��������ã�����Ϊint��ֵ��װ��Integer����
 *						@return  the {@code Integer} value of the property.��ϵͳ���Ե�ֵ��װ��Integer����
 *					  public static Integer getInteger(String nm, Integer val)
 *						��ע���������ڶ�������������ͬ��ֻ����Ĭ��ֵ����int�͵ģ�����ֱ����һ��Integer����
 *				4.1.7��public static Integer decode(String nm) throws NumberFormatException
 *						���ܣ���String�����ֵ������Integer�����ܹ������ַ�������ĸ֪������ַ����ı�ʾ��ʽ�Ǽ����ƣ�
 *						������nm:String ���������ַ��������nm="0x..."����"0X..."����"#...",�������Ϊ���ַ�����16���Ƶ�
 *												���nm="0...",�������Ϊ���ַ�����8���Ƶ�
 *												���������������֮�⣬���򶼻���Ϊ���ַ�����ʮ���Ƶ�
 *				4.1.8��public static int compare(int x, int y)
 *						 @param  x the first {@code int} to compare
 *						 @param  y the second {@code int} to compare
 * 						 @return the value {@code 0} if {@code x == y};
 *         				   		a value less than {@code 0} if {@code x < y}; and
 *         						a value greater than {@code 0} if {@code x > y}
 *         		4.1.9��public static int highestOneBit(int i)
 *         				���ܣ�����int����ֵ�����bitλ��ֵ
 *         			  public static int lowestOneBit(int i)
 *         				���ܣ�����i:int�����bitλ��ֵ
 *         			  public static int numberOfLeadingZeros(int i)
 *       ����֪�����Ƿ���ȷ�����ܣ�����i:int�Ķ����Ʊ�ʾ����0�ĸ����������λ��ʼ��
 *         			  public static int numberOfTrailingZeros(int i)
 *       ����֪�����Ƿ���ȷ�����ܣ�����i:int�Ķ����Ʊ�ʾ����0�ĸ����������λ��ʼ�� 
 *         			  public static int bitCount(int i)
 *       ����֪�����Ƿ���ȷ�����ܣ�����i:int�Ķ����Ʊ�ʾ���У��ĸ���
 *       		4.1.10��public static int rotateLeft(int i, int distance)
 *       				���ܣ���i:int�Ķ����Ʊ�ʾ��ʽ����distanceλ���õ�һ���µ�ֵ������
 *       			   public static int rotateRight(int i, int distance)
 *       			   public static int reverse(int i)
 *       			   public static int reverseBytes(int i)
 *       		4.1.11�� public static int signum(int i)
 *       					���ܣ��ж�int��ֵ�ķ��ţ������0������ֵΪ0�����������������ֵ��1������Ǹ���������ֵ��-1
 * 			4.2)ʵ����Ա����������ֱ��ʹ������.������()ֱ�ӵ�������ĺ�����ֻ���ȵõ�һ��Integerʵ����Ȼ���ø�ʵ�������������Щ��static��Ա����
 * 				4.2.1��public byte byteValue()
 * 						����:��Integer��������value���byte���Ͳ�����
 * 					  public short shortValue()
 * 					  public int intValue()
 * 					  public long longValue()
 * 					  public float floatValue()
 * 					  public double doubleValue()
 * 			    4.2.2��public String toString()
 * 						���ܣ���Integer�������������ֵת����10������ʽ��String����
 * 				4.2.3��public int hashCode()
 * 						���ܣ���Integer�������������ֵת����hash��
 * 				4.2.4�� public boolean equals(Object obj)
 * 						���ܣ�ֻ�в�����Integer���Ͳ�����ֵ�뱻�Ƚ����������int��ֵ���ʱ������ֵΪtrue
 * 				4.2.5��public int compareTo(Integer anotherInteger)
 * 						���ܣ��Ƚ�����Integer�������ֵ�Ĵ�С�������ȣ��򷵻�ֵ=0
 * 						           ����Ȳ���С���򷵻�ֵΪһ������
 * 							����Ȳ������򷵻�ֵΪһ������
 * 		
 * 
 * 						   
 * 		*/
package datatype;

public class JavaAPI_Integer {
	public static void main(String[] args){
		//2)Integer���еľ�̬��Ա����������ʹ��Integer.������  ������
		System.out.println("java.lang.Integer���еĳ�Ա������");
		System.out.println("Integer.MIN_VALUE="+Integer.MIN_VALUE);//�����-2147483648
		System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);//�����2147483647
		System.out.println("Integer.TYPE="+Integer.TYPE);//�����int
		
		//4.1����̬��Ա����
		//4.1.1��ʮ������ʽ��int����ֵת����2/8/10/16������ʽ��String���󣨱���ԭ�з��ţ�
		System.out.println("\n�з���int����ֵת����String���󣨱���ԭ����ֵ���ţ���");
		System.out.println("1��Integer.toString(int i,int radix)�÷�ʾ����");
		System.out.println("Integer.toString(-123, 10)  "+Integer.toString(-123, 10));//�������-123��
		System.out.println("Integer.toString(-123, 8)  "+Integer.toString(-123, 8));//�������-173��
		System.out.println("Integer.toString(-123, 2)  "+Integer.toString(-123, 2));//�������-1111011��
		System.out.println("Integer.toString(-123, 16)  "+Integer.toString(-123, 16));//�������-7b��
		System.out.println("Integer.toString(123, 16)  "+Integer.toString(123, 16));//�������7b��
		System.out.println("Integer.toString(123, 16).toUpperCase()  "+Integer.toString(123, 16).toUpperCase());//�������7B��
		System.out.println("2��Integer.toString(int i)�÷�ʾ����");
		System.out.println("Integer.toString(-123)  "+Integer.toString(-123));//�������-123��
		System.out.println("С�᣺Integer.toString(int i)��Ч��Integer.toString(int i,10),����Ĭ��ʹ��ʮ������ʽ��ʾ");
		//4.1.2��ʮ������ʽ��int����ֵת�����޷�����������ת����2/8/16String����������ֵ���䣬������ֵ���ԭ��ֵ+2^32��
		System.out.println("\n�з���int����ֵת�����޷���������������ת����String���󣨸����������������������������");
		System.out.println("1��Integer.toHexString(int i)���÷�ʾ����");
		System.out.println("Integer.toHexString(-123)  "+Integer.toHexString(-123));//�������ffff ff85��
		System.out.println("Integer.toHexString(123)"+Integer.toHexString(123));//�����"7b"
		System.out.println("2��Integer.toOctalString(int i)���÷�ʾ����");
		System.out.println("Integer.toOctalString(-123)  "+Integer.toOctalString(-123));//�����"37777777605"
		System.out.println("Integer.toOctalString(123)  "+Integer.toOctalString(123));//�����"173"
		System.out.println("3��Integer.toBinaryString(int i)���÷�ʾ����");
		System.out.println("Integer.toBinaryString(-123)  "+Integer.toBinaryString(-123));//�����"11111111111111111111111110000101
		System.out.println("Integer.toBinaryString(123)  "+Integer.toBinaryString(123));//�����"1111011"
		//4.1.3)��2/8/10/16���Ƶ�String���������int����ֵ��10������ʽ��intֵ��
		System.out.println("\n��String���Ͷ���ת����int������ֵ��ǰ�������String���������һ����ֵ��");
		System.out.println("1��Integer.toPerseInt(String str,int radix)���÷�ʾ����");
		System.out.println("Integer.toPerseInt(\"0010100011\",2)  "+Integer.parseInt("0010100011",2));//���:163
		System.out.println("Integer.toPerseInt(\"137\",8)  "+Integer.parseInt("137",8));//�����95
		System.out.println("Integer.toPerseInt(\"123\",10)  "+Integer.parseInt("123",10));//���:123
		System.out.println("Integer.toPerseInt(\"1fe2\",16)  "+Integer.parseInt("1fe2",16));//�����8162
		System.out.println("Integer.toPerseInt(\"-1fe2\",16)  "+Integer.parseInt("-1fe2",16));//�����-8162
		System.out.println("2��Integer.toPerseInt(String str)���÷�ʾ����");
		System.out.println("Integer.toPerseInt(\"-123\")  "+Integer.parseInt("-123"));
		System.out.println("�ܽ᣺Integer.toPerseInt(String str)��Ч��Integer.toPerseInt(String str��10)");
	}

}
