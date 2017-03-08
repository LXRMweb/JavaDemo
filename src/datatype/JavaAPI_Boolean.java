/**
 * @author lxrm 
 * @date 20170130
 * @description ����Java API֮java.lang.Boolean����÷�
 *  java.lang.Boolean
 *  	1�������������Ӧ��8�ֻ������������е�boolean�����а������������ڴ���boolean����ֵ�Լ������ķ���
 *  		������װ��boolean���ֻ����������ͣ�����Ҫ��boolean���������������ʱ�����Խ����ڸ��������Ӧ����
 * 			Boolean���а������ɽ�boolean����ֵת���String���͵ĳ�Ա������
 * 			�Լ����ɽ�String������ֵת���boolean����ֵ�ķ���
 * 			�Լ���������boolean�ͱ����ĳ�Ա�������� �Ƚϴ�С��boolean����ֵ�Ķ����Ʊ�ʾ��ʽ�����������ơ���ת�ȣ�
 * 		2��Boolean���еľ�̬��Ա������static���͵ĳ�Ա������
 * 			TRUE:Boolean     TRUE��һ��Boolean����,�Ҹ�Boolean�����Ӧ�Ļ�ֵ��true
 * 			FALSE:Boolean     FALSE��һ��Boolean�����Ҹ�Boolean�����Ӧ�Ļ�ֵ��false
 * 			TYPE:Class<Boolean>   Boolean������Ӧ��ԭʼ�����������ͣ���ֵΪ"boolean"
 * 			
 * 		3)Boolean���еĹ��캯��(��������Boolean����)
 * 			3.1)public Boolean(boolean value)
 * 			3.2)public Boolean(String s)
 * 					��ע����s="true"(�����ִ�Сд)ʱ�����ɵ�Boolean�������true
 * 						s="�κ������ַ���"�����ɵ�Boolean���󶼴���false
 * 		4)Boolean���еĳ�Ա����
 * 			4.1����̬��Ա����
 * ��string--->boolean��ֵ��
 * 				4.1.1��public static boolean parseBoolean(String s)
 * 							���ܣ���String���������boolean����ֵ
 * 							����ֵ����һ��boolean����ֵ��
 * 									��s:String="true"(�����ִ�Сд)ʱ������ֵ��true
 * 									��s:String="�����ַ���"	ʱ������ֵ��false						 
 * ��boolean��ֵ--->Boolean����
 * 				4.1.2��public static Boolean valueOf(boolean b)
 * ��String--->Boolean����
 * 				4.1.3��public static Boolean valueOf(String s)
 * 							����ֵ����һ��Boolean����
 * 									��s:String="true"(�����ִ�Сд)ʱ������ֵ�Ǵ���true��Boolean����
 * 									��s:String="�����ַ���"	ʱ������ֵ�Ǵ���false��Boolean����
 * ��boolean--->String����
 * 				4.1.4��public static String toString(boolean b)
 * 							����ֵ�����b:boolean=true,��ô����ֵ���ַ�����true��
 * 								    ���b:boolean=false,��ô����ֵ���ַ�����false��
 * ��ϵͳ����(��java.lang.System#getProperty(String name))---->boolean��
 * 				4.1.5�� public static boolean getBoolean(String name)
 * 							@param   name   the system property name.
 * 							����ֵ��ֻ��ϵͳ����name��ֵ=="true"ʱ������ֵ��true
 * ���Ƚ�����boolean������ֵ��
 * 				4.1.6��public static int compare(boolean x, boolean y)
 * 							 @return the value {@code 0} if {@code x == y};
 *         							a value less than {@code 0} if {@code !x && y}; and
 *         							a value greater than {@code 0} if {@code x && !y}
 * 			4.2��ʵ����Ա����
 * 				4.2.1��public boolean booleanValue()
 * 							���ܣ�����Boolean�����booleanֵ
 * 				4.2.2��public String toString()
 * 							����ֵ�����b:boolean=true,��ô����ֵ���ַ�����true��
 * 								    ���b:boolean=false,��ô����ֵ���ַ�����false��
 * 				4.2.3��public int hashCode()
 * 							����ֵ�����b:boolean=true,��ô����ֵ��int����ֵ1231
 * 								    ���b:boolean=false,��ô����ֵ��int����ֵ1237
 * 				4.2.4�� public boolean equals(Object obj)
 * 				4.2.5��public int compareTo(Boolean b) 
 * 							@return  zero if this object represents the same boolean value as the
 *         							 argument; a positive value if this object represents true
 *        							 and the argument represents false; and a negative value if
 *          						 this object represents false and the argument represents true
 * 
 */
package datatype;

public class JavaAPI_Boolean {
	public static void main(String[] args){
		
		//ʹ��Boolean���еĹ��캯��������Boolean�����
		Boolean b1=new Boolean(true);//������һ������true��Boolean����
		Boolean b2=new Boolean("ok");//������һ������false��Boolean����
		Boolean b3=new Boolean("tRue");//������һ������true��Boolean����
	}
}
