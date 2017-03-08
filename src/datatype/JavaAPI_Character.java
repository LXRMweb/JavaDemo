/**
 * @author lxrm 
 * @date 20170131
 * @description ����Java API֮java.lang.Character����÷�
 *  java.lang.Character
 *  	1�������������Ӧ��8�ֻ������������е�char��char��һ��16bit���ַ�������char�ͱ������Ա�ʾUnicode������е������ַ���Unicode��񸲸������ġ�Ӣ�ġ��������������Լ�һЩ������ţ�
 *  		���а������������ڴ���char����ֵ�Լ������ķ���
 *  		������װ��char���ֻ����������ͣ�����Ҫ��char���������������ʱ�����Խ����ڸ��������Ӧ����
 * 			Character���а������ɽ�char����ֵת���String���͵ĳ�Ա������
 * 			�Լ����ɽ�String������ֵת���char����ֵ�ķ���
 * 			�Լ���������char�ͱ����ĳ�Ա�������� �Ƚϴ�С��char����ֵ�Ķ����Ʊ�ʾ��ʽ�����������ơ���ת�ȣ�
 * 			��char����ֵ�Ӵ�д��Сд��Сд���д
 * 			�ж�һ��char��ֵ�Ǵ�д�Ļ���Сд�ģ��Ƿ������֣��Ƿ�����ĸ
 * 		2��Character���еľ�̬��Ա������static���͵ĳ�Ա������
 * 			public static final int MIN_RADIX = 2;//���ַ�����ʽ��ʾ��char����ֵ����С������������Сʹ�ö����Ʊ�ʾ
 * 			public static final int MAX_RADIX = 36;//���ַ�����ʽ��ʾ��char����ֵ�����������������ʹ����ʮ�����Ʊ�ʾ
 * 			public static final char MIN_VALUE = '\u0000';//char�ͱ�������ȡ������Сֵ����0
 * 			public static final char MAX_VALUE = '\uFFFF';//char�ͱ�������ȡ�������ֵ����2^16-1
 * 			TYPE:Class<Character>   char������Ӧ��ԭʼ�����������ͣ���ֵΪ"char"
 * 			SIZE:int   ��ʾchar����ֵ��ռ�ڴ��С����λΪbit
 * 			public static final byte UNASSIGNED = 0;
 * 			public static final byte UPPERCASE_LETTER = 1;
 * 			public static final byte LOWERCASE_LETTER = 2;
 * 			public static final byte TITLECASE_LETTER = 3;
 * 			public static final byte MODIFIER_LETTER = 4;
 * 			public static final byte OTHER_LETTER = 5;
 * 			public static final byte NON_SPACING_MARK = 6;
 * 			public static final byte ENCLOSING_MARK = 7;
 * 			public static final byte COMBINING_SPACING_MARK = 8;
 * 			...
 * 			...
 * 
 * 		3)Character���еĹ��캯��(��������Character�����)
 * 			3.1��public Character(char value)
 * 			
 * 
 * 		4)char���еĳ�Ա����
 * 			4.1����̬��Ա����
 * ��char������ֵ--->String��
 * 				4.1.1) public static String toString(char c) 
 * 						���ܣ���c:charת�����ַ��������أ����ص��ַ�������Ϊ1��ֻ�����ַ�c:char
 * ��char������ֵ--->Character�����
 * 				4.1.2��public static Character valueOf(char c)
 * 						���ܣ���c:char��װ��Character����󲢷���
 * 							ʹ�������Ա������char��ֵ��װ��Character�������Character��Ĺ��캯��Character(char c)����ȡCharacter����Ч������
 * 							��Ϊ�����Ա����ӵ�и��õĿռ������ʣ�Ҳ����
 * ���ж�һ��codePoint�Ƿ�����Ч���е㣩
 * 				4.1.3��public static boolean isValidCodePoint(int codePoint)
 * 						@return {@code true} if the specified code point value is between
 *         						{@link #MIN_CODE_POINT} and
 *        						{@link #MAX_CODE_POINT} inclusive;
 *         						{@code false} otherwise.
 * ���ж�char�Ǵ�д�Ļ���Сд�ģ�
 * 				4.1.4��public static boolean isLowerCase(char ch)
 * 						����ֵ�����ch:char��Сд�ģ�����ֵ��true�����򷵻�ֵ��false
 * 					 public static boolean isLowerCase(int codePoint)
 * 						������codePoint��int�Ǵ������ַ���Unicode���е�λ��
 * 						����ֵ�����Unicode����codePoint������ĸ��Сд�ģ�����ֵ��true�����򷵻�ֵ��false
 * 						��ע����������������������������ڣ������������ͨ��codePoint��int���ʵ�Unicode����е������ַ���
 * 							���������������ܷ��ʵ�Unicode����е������ַ�����Ϊch:char��16bit�ģ�
 * 							����ch:charֻ�ܷ��ʵ�Unicode�����ϰ벿�ֵ�����
 * 				     public static boolean isUpperCase(char ch)
 * 					 public static boolean isUpperCase(int codePoint)
 * ���ж�char��ֵ�ǲ������֣�
 * 				4.1.5��public static boolean isDigit(char ch)
 * 						���ܣ������ж�ch:char�Ƿ���һ������
 * 					  public static boolean isDigit(int codePoint)
 * 						��ע���������Ҳ�������ж�һ���ַ��Ƿ������֣�ֻ��������������ܸ�ǿ��Щ����Ϊ�������ʹ���ַ���Unicode���е�λ�÷���Unicode���е��ַ�
 * 							codePoint��int��32λ�ģ����Է��ʵ�Unicode���е������ַ�
 * 							���ǵ�һ������ʹ��16λ��ch��char�Ƿ��ʲ���Unicode���е������ַ��ģ�ֻ�ܷ��ʵ��ϰ벿���ַ�
 * ����д��Сд��Сд���д��
 * 				4.1.6��public static char toLowerCase(char ch)
 * 					  public static int toLowerCase(int codePoint)
 * 			4.2��ʵ����Ա����
 * ��Character�����������char����ֵ--->char����ֵ��
 * 				4.2.1�� public char charValue()
 * ��Character�����������char����ֵ--->hashCode��
 * 				4.2.2��public int hashCode()
 * ��Character�����������char����ֵ--->string�ַ�����
 * 				4.2.3��public String toString()
 * ���Ƚ�����Character����Ĵ�С��
 * 				4.2.5��public boolean equals(Object obj)
 * 				
 */
package datatype;

public class JavaAPI_Character {
	public static void main(String[] args){
		Character ch=new Character('a');
		
	}
}
