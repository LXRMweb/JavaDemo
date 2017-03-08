/**
 * @author chen
 * @date 20170305
 * @description ��������������ʽ���÷�
 * ������������ʽʵ��������һЩԪ�ַ����Ӷ��ɵ�һ���ַ���
 * 	         ������ʽ�������ڼ���һ���ַ����Ƿ�����һ���ĸ�ʽҪ��
 * Ӧ��ʵ����
 * 		ʵ��һ��ʹ��������ʽ��֤һ���ַ����Ƿ���һ����Ч��Email��ַ*/
package char_and_string;

public class Application2_RegularExpressions_FormatMactch {
	/*
	 * ʵ��һ��ʹ��������ʽ��֤һ���ַ����Ƿ���һ����Ч��Email��ַ
	 * @param email:String ��������ַ���
	 * @return boolean �����������ЧEmail��ַ���򷵻�ֵΪtrue�����򷵻�false
	 */
	public static boolean isEmail(String email){
		String regularExpression="\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";//������ʽ��һ����һϵ��Ԫ�ַ���ϳɵ��ַ�����
		if(email.matches(regularExpression)){
			System.out.println("��ȷ��"+email+"����Ч��Email��ַ");
			return true;
		}else{
			System.out.println("����"+email+"����Ч��Email��ַ");
			return false;
		}//end if	
	}//end isEmail()
	
	public static void main(String[] args){
		String email1="198@163.com";
		String email2="134@hi.cn";
		String email3="13447@@";
		Application2_RegularExpressions_FormatMactch.isEmail(email1);
		Application2_RegularExpressions_FormatMactch.isEmail(email2);
		Application2_RegularExpressions_FormatMactch.isEmail(email3);
	}

}//end class
