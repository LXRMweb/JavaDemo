/**
 * @author lxrm
 * @date 20170208
 * @description:���ļ�����javaAPI֮String����÷��������ַ������ɡ�����
 * java.lang.String
 * 		������String��������洢���ַ����е������ַ�Ҳ��Unicode�����
 * 			String����������Ա�����������ַ����Ƚϡ��Ӵ����ҡ���ȡ�Ӵ��������ַ�����ת����Сд�ȶ��ֺ���
 * 		String���еĹ��캯��
 * 			1)public String()
 * 			2)public String(String original)
 * 				��������һ��String����
 * 				�����������һ���Ͳ���������ֵͬ���µ�String����
 * 			3)public String(char value[]) 
 * 				������char������
 * 			4)public String(char value[], int offset, int count)
 * 				������char�����飬��ʼλ�ã��Ӵ�����
 * 				������½���String�����ֵ�ǲ���value��char[] ���Ӽ����Ӵ��Ǵ�value[offset]��ʼ������Ϊcount���Ӵ�
 * 			5)public String(int[] codePoints, int offset, int count)
 * 				������codePoints:int[] int�����飬����ÿ��Ԫ�ص�ֵ���ַ���Unicode���е�λ�ã�Ҳ�������ַ���Ӧ��Unicode��������
 * 					offset:int  ��ʼ�ַ��±�
 * 					count:int �Ӵ�����
 * 				������½���String�����ֵ�ǲ�����������ַ������Ӵ����Ӵ�=codePoints[offset]��ʼ������Ϊcount���ַ���
 * 			6)public String(byte bytes[], int offset, int length, String charsetName)
 * 				���ܣ���byte����ת���Unicode���µ��ַ������ҽ��䴮���Ӵ���ֵ���½���String����
 * 				 @param  bytes
 * 				         The bytes to be decoded into characters
 * 		         @param  offset
 * 				         The index of the first byte to decode
 * 				 @param  length	
 * 				         The number of bytes to decode
 * 				 @param  charsetName
 * 				         The name of a supported {@linkplain java.nio.charset.Charsetcharset}
 * 			  public String(byte bytes[], String charsetName)
 * 				��ע������������Ψһ�Ĳ�֮ͬ���ǣ������������ָ����ת��byte����ĳ�ʼλ�úͳ��ȣ���Ϊ���������������byte�������ת����
 * 					��byte����ֵת��ɶ�Ӧ���뷽ʽcharsetName�µ��ַ���Ȼ�󴮳��ַ�����ֵ���½���String����
 * 			  public String(byte bytes[], int offset, int length, Charset charset)
 * 				���ܣ���6)�еĹ��캯������һ�£�ֻ����������캯���ĵ��ĸ�������Charset�͵ģ���6)�еĲ�һ��
 * 			  public String(byte bytes[], Charset charset)
 * 				��ע��ֱ�ӽ�   ����  byte���鰴��charset��Ӧ�Ľ��뷽ʽ����ֵ�������ַ���Ȼ�󴮳��ַ���
 * 			  public String(byte bytes[], int offset, int length)
 * 				��ע��ʹ�����ƽ̨��Ĭ�ϱ��뷽ʽ���н��루����byte��ֵ�����ɶ�Ӧ������е���Ӧ�ַ���
 * 			  public String(byte bytes[])
 * 				��ע��ʹ�õ�ǰƽ̧�е�Ĭ�ϱ��뷽ʽ���н��룬������byte�������byteֵ��character����ǰƽ̨Ĭ�ϱ��뷽ʽ�µ��ַ�����ת��
 * 			7)public String(StringBuffer buffer)
 * 				���ܣ�������stringBuffer���ַ�������ͬ��String����
 * 			8)public String(StringBuilder builder)
 * 			9)һ�������õĹ��캯��������ԭ�򣺸ù��캯�������ܱ�֤ASCII�뵽Character����Unicode�룩�ַ���ת������ȷ��
 * 			@Deprecated
 *		    public String(byte ascii[], int hibyte, int offset, int count)
 *				���ܣ����Խ�һ��ASCII���ַ�����ת���Unicode���ַ���������ȡת������е��ַ������Ӵ���Ϊ�½�String�����ֵ
 *				ע�⣺��������Ѿ���������
 *
 * 
 * 		String���еĳ�Ա����
 * 			1)public int length()�����ַ���
 * 			2)public boolean isEmpty()�����ַ���Ϊ0ʱ����ֵΪtrue
 * 			3)public char charAt(int index)�����ض�λ�õĵ����ַ���indexȡֵ��Χ��0~length-1
 * 			  public int codePointAt(int index)
 * 				�ڶ��������͵�һ�������Ĳ�֮ͬ�����ڣ��ڶ�����������ֵ���ǵ����ַ������ǵ����ַ���Unicode����е�λ��
 * 			  public int codePointBefore(int index)
 * 				��������͵ڶ��������Ĳ�֮ͬ�����ڣ������������index:intǰ��һ���ַ���Ӧ��Unicode��
 * 			4)public int codePointCount(int beginIndex, int endIndex) 
 * 				���ܣ�����beginIndex��endIndex֮���ж��ٸ�Unicode�ַ�
 * 			5)public int offsetByCodePoints(int index, int codePointOffset)
 * 				����ֵ��indexƫ��codePointOffset֮���index
 * 			6)void getChars(char dst[], int dstBegin)
 * 				���ܣ�Copy characters from this string into dst starting at dstBegin.
 *                  This method doesn't perform any range checking.
 *                  ����stringֵ���Ƶ�char�������У�����ڸ������dst[dstBegin],dst[dstBegin+1]...λ����
 *            public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
 *            	���ܣ���String�ַ�����һ�����ַ����Ƶ�һ��char��������
 *            		������˵�ǽ�String[srcBegin]~String[srcEnd-1]��Щ�ַ����Ƶ�
 *            		dst[dstBegin]��dst[dstBegin+1]...λ����
 *          7)public byte[] getBytes(String charsetName)
 *				���ܣ���String�����ղ���charsetName:String��ָ���ı��뷽ʽ���б��루�������ַ�ת��ɶ�Ӧ���뷽ʽ�µ�������ֵ����
 *					���ҽ��ַ���Ӧ�ı����������һ��byte�����з���
 *			  public byte[] getBytes(Charset charset)
 *				��ע�������������Ĳ�֮ͬ�����ڲ������Ͳ�ͬ
 *			  public byte[] getBytes()
 *				��ע�����������������Ĳ�֮ͬ�����ڣ����������ȥ��ʽָ�����뷽ʽ������Ĭ��ʹ�ø�ƽ̨��Ĭ�ϱ��뷽ʽ
 *			8)public boolean equals(Object anObject)
 *				����ֵ��ֻ�в���Ҳ��String�����Һ͵�����ӵ����ͬ��ֵʱ����ֵΪtrue
 *			  public boolean contentEquals(StringBuffer sb)
 *				���ܣ���String�����StringBuffer����Ƚϣ�������������ͬ�򷵻�ֵΪtrue
 *			  public boolean contentEquals(CharSequence cs)
 *				���ܣ���String�����CharSequence�������Ƚϣ�������������ͬ�򷵻�ֵΪtrue
 *			  public boolean equalsIgnoreCase(String anotherString)
 *				���ܣ��Ƚ�����String����������Ƿ���ͬ�������Ǵ�Сд��
 *			  public boolean regionMatches(int toffset, String other, int ooffset,int len) 
 *				��ע������������ڱȽ�����String������Ӵ��Ƿ���ͬ
 *			  public boolean regionMatches(boolean ignoreCase, int toffset,
 *                          String other, int ooffset, int len)
 *              ��ע���������Ҳ�����ڱȽ�����String������Ӵ��Ƿ���ͬ��������������ܸ���һЩ����Ϊ����������Կ��ƱȽ�ʱ�Ƿ�����ĸ�Ĵ�Сд
 *			9)public int compareTo(String anotherString)
 *				����ֵ��������string�����ֵ��ͬ���򷵻�ֵ��0
 *					 ��string�Ȳ����е��ַ�С��������Unicode���е�λ�ñȽ������ַ��Ĵ�С�����򷵻�ֵ��һ��������
 *					 ��string�Ȳ����е��ַ����򷵻�ֵ��һ��������
 *					������ֵ=this.charAt(k)-anotherString.charAt(k)
 *							����this.length()-anothorString.length()��
 *			 public int compareToIgnoreCase(String str)
 *				��ע�������������Ĳ�֮ͬ��������������ڱȽ������ַ����Ǻ��Դ�Сд
 *			10)public boolean startsWith(String prefix, int toffset)
 *				���ܣ�Tests if the substring of this string beginning at the
 *					 specified index starts with the specified prefix.
 *			  public boolean startsWith(String prefix)
 *				���ܣ����ַ����Ƿ������ض���ǰ׺��ͷ��
 *			  public boolean endsWith(String suffix)
 *			11��public int hashCode()
 *				���ܣ������ַ�������Ӧ��hash��=s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
 *			12��public int indexOf(int ch)
 *				���ܣ�����String�������ַ���ch:int����һ�γ��ֵ�λ���±�
 *					�������û��ָ�����ַ�������ֵ��-1
 *				������ch:int �����ַ���Ӧ��Unicode�루���ַ���Unicode����е�λ�ã�
 *			   public int indexOf(int ch, int fromIndex)
 *				��ע�������������Ĳ�֮ͬ�����ڣ���������Ǵ�String[fromIndex]��ʼ����Ѱ��ָ���ַ�ch:int
 *			   public int lastIndexOf(int ch)
 *				����ֵ��ָ���ַ����ַ��������һ�γ��ֵ�λ���±꣬�������û��ָ���ַ��򷵻�ֵΪ-1
 *			   public int lastIndexOf(int ch, int fromIndex)
 *				��ע�������������������Ĳ�֮ͬ�����ڣ���������Ǵ�String[fromIndex]��ʼ����
 *			13)public int indexOf(String str)
 *				���ܣ�Returns the index within this string of the first occurrence of the specified substring.
 *			   public int indexOf(String str, int fromIndex)
 *				��ע�������������Ĳ�֮ͬ�����ڣ���������Ǵ�String[fromIndex]��ʼ����
 *			   public int lastIndexOf(String str)
 *			   public int lastIndexOf(String str, int fromIndex)
 *			14)static int indexOf(char[] source, int sourceOffset, int sourceCount,
 *                     char[] target, int targetOffset, int targetCount,
 *                     int fromIndex)
 *              ���ܣ���char������source:char[]�в���target��char[]
 *			 static int lastIndexOf(char[] source, int sourceOffset, int sourceCount,
 *                          char[] target, int targetOffset, int targetCount,
 *                         int fromIndex)
 *          15)public String substring(int beginIndex)
 *          		���ܣ�ȡ�Ӵ�������ֵΪ��beginIndex��ʼ��Stringβ�������ַ���
 *             public String substring(int beginIndex, int endIndex) 
 *             		����ֵ��String[beginIndex]~String[endIndex-1]
 *             public CharSequence subSequence(int beginIndex, int endIndex)
 *             		��ע����������������ڶ�������������ͬ��Ψһ�Ĳ�֮ͬ�����ڷ���ֵ���Ͳ�ͬ���ֱ�ΪString�����CharSequence����
 *             public boolean contains(CharSequence s)
 *             		���ܣ��ж��Ƿ����Ӵ�s
 *          16)public String concat(String str)
 *          		���ܣ�������str:String ���ӵ�ԭ���ַ�����ĩβ��ϳ�һ���µ��ַ���������
 *          17)public boolean matches(String regex)
 *          		���ܣ��жϸ�String��ֵ�Ƿ����������ʽregex:String
 *          18��public String replace(char oldChar, char newChar) 
 *          		���ܣ���newChar:char�滻��String�е�oldChar:char
 *             public String replaceFirst(String regex, String replacement)
 *             		���ܣ��ҵ���String�����е�һ������������ʽregex:String���Ӵ�
 *             			����ʹ��replacement��String�滻�����Ӵ�
 *             public String replaceAll(String regex, String replacement)
 *             		��ע����������������ڶ��������Ĳ�֮ͬ�����ڣ������ڶ�������ֻ���滻����һ�������������Ӵ���
 *             			��������������滻�����з���������ʽ���Ӵ�
 *             public String replace(CharSequence target, CharSequence replacement) 
 *             		���ܣ�ʹ��replacement��CharSequence�滻����String�����е�����target��CharSequence
 *          19���ֽ��ַ������ָ�������Ӵ�
 *         	   public String[] split(String regex, int limit)
 *         			���ܣ�����������ʽregex��String������Ĺ��򣬷ָ��ַ��������ָ�����ŵ�String[]�в�����
 *         			������regex��String ������ʽ���������ַ����ָ��
 *         				limit��int  ���Ʒ���ֵString[]��Ԫ�ظ��������������limitΪһ������������ô����ֵString[]�Ĵ�С���ᳬ��limit
 *         							���������limit������һ��С�ڻ����0����������ô����ֵString[]�Ĵ�Сû������
 *         	   public String[] split(String regex)
 *         			��ע����������൱�����������ĵڶ�������limit:int=0�������������ֵString[]�Ĵ�Сû������
 *          20)public String toLowerCase(Locale locale)
 *             public String toLowerCase()
 *             public String toUpperCase(Locale locale)
 *             public String toUpperCase()
 *              
 *          21)public String trim()
 *          		���ܣ�ɾ��String�������ײ��Լ�β���Ŀո�
 *          		omitʡ�ԣ�ɾ��
 *          22)public String toString()
 *          		����ֵ����String������
 *          23)public char[] toCharArray() 
 *          		���ܣ�String����ת���char������
 *          24)public static String format(String format, Object ... args)
 *          		���ܣ�ʹ�ò���args:Object����format:String��ָ���ĸ�ʽ����ʽ���ɸ�ʽ�����ַ�����
 *          			����ʹ��ʽ��֮������ַ���ʹ�ñ���Ĭ�ϵ����Ի���
 *          			�罫Date�����ʽ��Ϊformat��ָ���ĸ�ʽ���ַ���
 *          			���罫��������������ֵת���ʮ���ơ�ʮ�������ַ�����ת�����ַ����������ַ����ȵȡ�
 *          		@param format��String  ͨ���˲���˵���ڴ��ĸ�ʽ��format��String�г�������һЩ������ַ�����ʾ�ڴ��ĸ�ʽ��
 *          							    ��"%b"��%B������ʾ������Ӧ�Ĳ�������ʽ��Ϊboolean�͵���ֵ��ʾ��true
 *          							  ����%h��%H������ʾ������Ӧ�Ĳ�������ʽ��Ϊɢ����,ʾ��A05A5198
 *          							 ��...�����������ַ��μ����ͣ���java����--->Ӧ��ʵ��--->���ڼ�ʱ���ַ�����ʽ����һ�ģ�
 *          		@param args��Object  ������0�����߶�������Ͳ���
 *          							�����Ͳ����ǲ���format��String�������õı���
 *          		@return ����Ҫ���ʽ�����õ��µ��ַ���
 *             public static String format(Locale l, String format, Object ... args)
 *             		��ע�������������������Ψһ�Ĳ�֮ͬ�����ڣ������������ͨ������Locale��ָ����ʽ����������ʹ�õ����Ի���
 *             			����������ֻ��Ĭ�ϵ�ʹ�ñ������Ի���
 *          25)public static String valueOf(Object obj) 
 *          		���ܣ��������Ϊ�գ���ô����ֵ=��null��
 *          			���������Ϊ�գ���ô����ֵ=obj.toString();
 *             public static String valueOf(char data[])
 *             		����ֵ��ֵ=char����������ַ����ɵ��ַ���
 *             public static String copyValueOf(char data[])
 *             		����ֵ��ֵ=char����������ַ����ɵ��ַ���
 *             public static String valueOf(char data[], int offset, int count) 
 *             public static String copyValueOf(char data[], int offset, int count)
 *             		����ֵ��ֵ=char�����    �����ַ�   ���ɵ��ַ���
 *             public static String valueOf(boolean b)
 *             		����ֵ���������Ϊtrue���򷵻�ֵΪֵΪ��true����String����
 *             			    �������Ϊfalse���򷵻�ֵΪֵΪ��false����String����
 *             public static String valueOf(char c)
 *             		����ֵ������Ϊ1��String����
 *             public static String valueOf(int i)
 *             public static String valueOf(long l)
 *             public static String valueOf(float f)
 *             public static String valueOf(double d)
 *          26��public native String intern();
 *          
 *
 * ʹ��ʵ����
 * 		ʵ��һ������String����
 * 			����һ��ֱ�ӵ���˫���Ű������ַ�����"�ַ���"
 * 			��������ʹ�ù��캯��public String(char value[])
 * 			��������ʹ�ù��캯��public String(char value[], int offset, int count)
 * 			�����ģ�ʹ�ù��캯��public String(int[] codePoints, int offset, int count)
 * 			�����壬��byte����ת���char�ַ���Ȼ�󴴽�String����
 * 				  ʹ�ù��캯��public String(byte bytes[], int offset, int length, String charsetName)
 * 				����public String(byte bytes[], String charsetName)
 * 				����public String(byte bytes[], int offset, int length, Charset charset)
 * 				����public String(byte bytes[], Charset charset)
 * 				����public String(byte bytes[], int offset, int length)
 * 				����public String(byte bytes[])
 * 		ʵ������String��ĳ�Ա����---subString()���÷�
 * 		ʵ��ʮ�ţ��ַ����ָ�
 * 			����һ������String���public String[] split(String regex, int limit)
 * 			������������String���public String[] split(String regex)
 * 		ʵ����ʮһ��ɾ���ַ����ײ��Լ�β���Ŀհ׸�
 * 		ʵ����ʮ�ģ�format������Ӧ��
 * 			��һ���֣����ڸ�ʽ�����ں�ʱ�䣨Date����
 * 				����һ������String���е�public static String format(String format, Object ... args)
 * 				������������String���е�public static String format(Locale l,String format, Object ... args)
 * 			�ڶ����֣����ڸ�ʽ��һ����ʽ�Ĳ������������Ͷ���
 * 				����һ������String���е�public static String format(String format, Object ... args)
 * 				������������String���е�public static String format(Locale l,String format, Object ... args)
 * 		*/
package char_and_string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Locale;

public class JavaAPI_String {
	public static void main(String[] args) throws UnsupportedEncodingException{
		//ʵ��һ������String����
		//����һ��
		String str11 = "abc";
		//��������
		char data[] = {'a', 'b', 'c'};
		String str12 = new String(data);
		System.out.println("����ַ���str12��"+str12);//���������ַ���str12:abc
		//��������
		String str13=new String(data,1,2);
		System.out.println("����ַ���str13��"+str13);//���������ַ���str13:bc
		//�����ģ�
		int charPoints[]={97,98,99};
		String str14=new String(charPoints,1,2);
		System.out.println("����ַ���str14��"+str14);//���������ַ���str14:bc
		//������
		byte bytes[]={0,97,97,98,0,99,0,97};
		String str15=new String(bytes,0,6,"UTF-8");
		String str16=new String(bytes,0,6,"Unicode");
		String str17=new String(bytes,"UTF-8");
		String str18=new String(bytes,0,6);
		System.out.println("����ַ���str15��"+str15);//���������ַ���str15:�ո�aab�ո�c
		System.out.println("����ַ���str16��"+str16);//���:a��c
		System.out.println("����ַ���str17��"+str17);//���:�ո�aab�ո�c�ո�a
		System.out.println("����ַ���str18��"+str18);//���:��str15���һ����˵����ƽ̨��Ĭ�ϱ��뷽ʽ��UTF-8
		
		//ʵ��������Ա����subString()���÷�
		String c = "abc".substring(2,3);
		String str3="abc";
		String d = str3.substring(1, 2);
		
		//ʵ���壬ʹ�ñ�׼���������ַ���
		String str4="test";
		String str5="hello";
		System.out.println(str4);
		System.out.println("str4="+str4);
		System.out.println(str5+str4);//�����hellotest
		
		//ʵ��ʮ�ţ��ַ����ָ�
		System.out.println("\nʹ��String���еĳ�Ա��������һ��������ַ������зָ");
		// 			����һ������String���public String[] split(String regex, int limit)
		System.out.println("1)����myStr.split(regex,limit)");
		String str191="lxrm:chen:wang:ma:li";
		String strs[]=str191.split(":",3);
		for(int i=0;i<strs.length;i++){
			System.out.println("strs["+i+"]="+strs[i]);
		}
		// 			������������String���public String[] split(String regex)
		System.out.println("2)����myStr.split(regex)");
		String str192="lxrm:chen:wang:ma:li";
		String strs2[]=str191.split(":");
		for(int i=0;i<strs2.length;i++){
			System.out.println("strs2["+i+"]="+strs2[i]);
		}
		
		//ʵ����ʮһ��ɾ���ַ����ײ��Լ�β���Ŀհ׸�
		System.out.println("\nɾ���ַ����ײ��Լ�β���Ŀհ׸�");
		String str211=" hello world! ";
		String str212=str211.trim();
		System.out.println("ɾ��ǰ��"+str211+"   str.length()="+str211.length());
		System.out.println("ɾ����"+str212+"   str2.length()="+str212.length());
		
		//ʵ����ʮ�ģ�format()������Ӧ��ʵ��
			//��һ���֣����ڸ�ʽ�����ں�ʱ�䣨Date����
		System.out.println("String���е�format()������ʹ��ʵ����");
		System.out.println("1)ʹ��String���е�format()������ʽ��������ʱ���ַ���");
				//ʵ��һ
		Date date=new Date();//����ʽ������
		String format1="%te";//�ڴ��ĸ�ʽ���籾��������ʾ�����ڶ�Ӧ��һ�����е���һ��
		System.out.println("�����Ǳ��µĵڣ�"+String.format(format1, date)+"��");//����������Ǳ��µĵ�8��
				//ʵ����
		String year=String.format("%tY", date);
		String month=String.format("%tm", date);
		String day=String.format("%td", date);
		String hour=String.format("%tH", date);
		String minute=String.format("%tM", date);
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute);//�����2017-02-08 20:13
				//ʵ������ֱ��ʹ�������ʽ
		System.out.println(String.format("%tF", date));//�����2017-02-08
			//�ڶ����֣����ڸ�ʽ��һ����ʽ�Ĳ������������Ͷ���
		System.out.println("2)ʹ��String���е�format()������ʽ��һ�����Ͳ���");
		String str241=String.format("%d", 400/2);
		String str242=String.format("%b",3>5);
		String str243=String.format("%x",200);
		System.out.println("ʮ������ʾ��"+str241);//�����200
		System.out.println("��������ʾ��"+str242);//�����false
		System.out.println("ʮ��������ʾ��"+str243);//�����c8
	}
}
