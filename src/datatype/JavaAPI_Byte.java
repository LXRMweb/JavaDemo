/**
 * @author lxrm 
 * @date 20170131
 * @description ����Java API֮java.lang.Byte����÷�
 *  java.lang.Byte
 *  	1�������������Ӧ��8�ֻ������������е�byte�����а������������ڴ���byte����ֵ�Լ������ķ���
 *  		������װ��byte���ֻ����������ͣ�����Ҫ��byte���������������ʱ�����Խ����ڸ��������Ӧ����
 * 			Byte���а������ɽ�byte����ֵת���String���͵ĳ�Ա������
 * 			�Լ����ɽ�String������ֵת���byte����ֵ�ķ���
 * 			�Լ���������byte�ͱ����ĳ�Ա�������� �Ƚϴ�С��byte����ֵ�Ķ����Ʊ�ʾ��ʽ�����������ơ���ת�ȣ�
 * 		2��Byte���еľ�̬��Ա������static���͵ĳ�Ա������
 * 			MIN_VALUE��byte   ��ʾbyte�ͱ�������ȡ������Сֵ-2^7=-128
 * 			MAX_VALUE:byte   ��ʾbyte�ͱ�������ȡ�������ֵ2^7-1=127
 * 			TYPE:Class<Byte>   byte������Ӧ��ԭʼ�����������ͣ���ֵΪ"byte"
 * 			SIZE:int   ��ʾbyte����ֵ��ռ�ڴ��С����λΪbit
 * 
 * 		3)Byte���еĹ��캯��(��������Byte�����)
 * 			3.1��public Byte(byte value)
 * 			3.2�� public Byte(String s) throws NumberFormatException
 * 					��ע������s:String������ʮ������ʽ��byte��ֵ
 * 
 * 		4)Byte���еĳ�Ա����
 * 			4.1����̬��Ա����
 * ��byte������ֵ--->String��ʮ������ʽ����
 * 				4.1.1)public static String toString(byte b)
 * 						���ܣ���b:byteת����string��ʮ������ʽ��string��������
 * ��byte������ֵ--->Byte�����
 * 				4.1.2��public static Byte valueOf(byte b)
 * 						���ܣ���b:byte��װ��Byte����󲢷���
 * 							ʹ�������Ա������byte��ֵ��װ��Byte�������Byte��Ĺ��캯��Byte(byte b)����ȡByte����Ч������
 * 							��Ϊ�����Ա����ӵ�и��õĿռ������ʣ�Ҳ����
 * �������ֽ�����ʽ2/8/10/16..��string--->byte����ֵ��
 * 				4.1.3��public static byte parseByte(String s, int radix)throws NumberFormatException
 * 						���ܣ���radix���Ƶ�string������byte����ֵ
 * 					   public static byte parseByte(String s) throws NumberFormatException
 * 						���ܣ���10���Ƶ�string������byte��ֵ
 * �������ֽ�����ʽ2/8/10/16..��string--->Byte�����
 * 				4.1.4��public static Byte valueOf(String s, int radix)
 * 						���ܣ���radix���Ƶ�string������Byte�����
 * 					  public static Byte valueOf(String s) throws NumberFormatException
 * 						���ܣ���10���Ƶ�string������Byte�����
 * 					 public static Byte decode(String nm)throws NumberFormatException
 * 						���ܣ���8/10/16���Ƶ�string������Byte��������������������������е���������������������������������ܻ���
 * 							��Ϊ����������Զ�ʶ��string�ı�ʾ��ʽ�Ǽ����Ƶģ����ñ����Ա�ֶ�ʶ�������string�Ǽ����Ƶ�
 * 							nm:String���ԡ�0x/0X/#����ͷ��ʱ�򣬸ú�����Ϊnm:string��ʮ�����Ƶ�
 * 							nm��String���ԡ�0����ͷ��ʱ�򣬸ú�����Ϊnm:String�ǰ˽��Ƶ�
 * 							��������£���Ϊ��ʮ���Ƶ�
 * 							����֮�⣬�ú��������Զ�ʶ��nm:String�е�������
 * 							
 * 			4.2��ʵ����Ա����
 * ��Byte�����������byte����ֵ--->byte��short��int��long��float��double����ֵ��
 * 				4.2.1�� public byte byteValue()
 * 						public short shortValue()
 * 						public int intValue()
 * 						public long longValue()
 * 						public float floatValue()
 * 						 public double doubleValue()
 * ��Byte�����������byte����ֵ--->String����ֵ��
 * 				4.2.3��public String toString()
 * ��Byte�����������byte����ֵ--->hashCode��
 * 				4.2.4��public int hashCode()
 * ���Ƚ�����Long����Ĵ�С��
 * 				4.2.5��public boolean equals(Object obj)
 * 				4.2.6��public int compareTo(Byte anotherByte)
 * 				4.2.7����̬��������ֱ�ӵ���public static int compare(byte x, byte y)
 */
package datatype;

public class JavaAPI_Byte {
	public static void main(String[] args){
		System.out.println("java.lang.Byte���÷�ʾ����");
		
		//2��Byte���еľ�̬��Ա����
		System.out.println("\nByte���еľ�̬��Ա����public static final vectorName=value;");
		System.out.println("Byte.MIN_VALUE="+Byte.MIN_VALUE);
		System.out.println("Byte.MAX_VALUE="+Byte.MAX_VALUE);
		System.out.println("Byte.Type="+Byte.TYPE);
		System.out.println("Byte.SIZE="+Byte.SIZE);
		

		//3��ʹ��Byte��Ĺ��캯�����Byte�����Ȼ��ʹ��Byte��������Byte���е�ʵ����Ա����
		byte param=34;//byte����һ��8λ��������ע������ȡֵ��Χ���ɣ�
		Byte b=new Byte(param);
		//�ڶ��ֹ��캯��
		Byte b2=new Byte("127");//һ��Ҫע��ȡֵ��ΧŶ��byte�ͱ�����ȡֵ��ΧΪ-128~127
	}

}
