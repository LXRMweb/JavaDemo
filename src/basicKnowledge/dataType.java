/**
 * @author lxrm
 * @date 20161026
 * @description:����ļ�����java�������������֪ʶ��
 * 		1��java���������ͷֳɻ����������ͺ͸���������������
 * 		2��java������������
 * 			2.1���������ͣ�				  byte    	short    int      long
 * 									  8bit   	16bit    32bit    64bit
 * 			  		ȡֵ��Χ��ʮ���ƣ�-128~127
 * 				   	 ��0��ͷ���˽��ƣ�-0177~0177
 * 				��0X��0x��ͷ��ʮ�����ƣ�-0X7f~0x7f
 * 			2.2���������ͣ�float double
 * 			2.3���ַ����ͣ�char
 * 			2.4���������ͣ�boolean
 * 		3��java������������
 * 			�����
 * 			�ӿ�
 * 			����*/
package basicKnowledge;

public class dataType {
	public static void main(String[] args){
/*2.3���ַ����ͣ�char
		 * char:
		 * 		��ֵ����һ��char ch='a';
		 * 		��ֵ��������char ch='\u0008';  //????����λʮ������Unicode
		 * 		��ֵ��������char ch='ת���ַ�';//һЩ�ַ����뾭��ת���ֵ���ַ�����
		 * 		עһ���ַ�����'a' '\u0008' 'ת���ַ�'���˿��Ը�ֵ��char�ͱ����⣬�����Ը�ֵ��float��int�ͱ�������Ϊ�ַ�����ʵ���Ͼ���һ������
		 * 			char ch='a';
		 * 			int i='a';
		 * 			float j='a';*/
		//��ֵ����һ
		char ch1='a';
		//��ֵ������
		char ch2='\u005d';
		char ch11='\u1000';
		//��ֵ������
		char ch3='\b';//�˸�   '\u0008'
		char ch4='\t';//ˮƽ�Ʊ����'\u0009'
		char ch5='\n';//���У�    '\u000a
		char ch6='\f';//������'\u000c'
		char ch7='\r';//�س���    '\u000d
		char ch8='\"';//˫���ţ�'\0022'
		char ch9='\'';//�����ţ�'\u0027'
		char ch10='\\';//��б��'\'��'\u005c'
		System.out.println(ch1+" "+ch2+" "+ch11+" "+ch5+" "+ch6+" "+ch8+""+ch9+" "+ch10);
		//עһ
		int i='a';
		float f='a';
		double d='a';
		System.out.println("�ַ�����'a'��ֵ��int�ͱ�����"+i+'\n'+"�ַ�����'a'��ֵ��float�ͱ�����"+f+'\n'+"�ַ�����'a'��ֵ��double�ͱ�����"+d);

/*2.4���������ͣ�boolean
		 *boolean�������ͱ�����ֵ����true��false֮�⣬���ܱ���ֵ������ֵ */
		boolean flag=false;
		boolean flag2=true;//�����ͱ�����ֵ����true��false֮�⣬���ܱ���ֵ������ֵ
	}
	
}
