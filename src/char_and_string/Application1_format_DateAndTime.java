/**
 * @author lxrm
 * @date 20170304
 * @description �����򽲽���ν�������ʱ����и�ʽ����ʹ��Date��������ʾ��������ʱ��
 * 			���������Ҫ�ĸ�ʽ
 * ���˼·��
 * 		ʹ��java.lang.String���е�format()������ʵ��������ʱ���ַ����ĸ�ʽ��*/
package char_and_string;

import java.util.Date;

public class Application1_format_DateAndTime {
	public static void main(String[] args){
		System.out.println("\nString.format()�������ڸ�ʽ��Date�Ͷ���");
		Date date=new Date();
		/*�÷�һ������format()������õ�����String�������ա��¡��꣩
		 * 			Ȼ������Ҫ�ĸ�ʽ������String������ϳ��Լ���Ҫ�ı�����ʽ
		 */		
		String month=String.format("%tm", date);
		String day=String.format("%td", date);
		String hour=String.format("%tH", date);
		String minute=String.format("%tM", date);
		String second=String.format("%tS", date);
		System.out.println("������"+month+"��"+day+"��");
		System.out.println("ʱ�� ��"+hour+"ʱ"+minute+"��"+second+"��");
		
		/*�÷�����ֱ��ʹ�ø�ʽ�ַ����������ĸ�ʽ�����ͬʱ�����С��ա��¡��ꡱ��String����
		 * 
		 */
		String formatedDate=String.format("%tF", date);
		System.out.println("���ڣ�"+formatedDate);
		
		/*�÷�������ʽ������Date�Ͷ���֮�⣬�������͵Ķ���
		 * */
		String hex=String.format("%x", 400);//��400��ʽ��Ϊ16���Ƶ��ַ���
		String octal=String.format("%o", 400);//��400��ʽ��Ϊ8���Ƶ��ַ���
		//String scientificNotation=String.format("%e", 400);//bug:ʹ�ÿ�ѧ��������ʾ400
		System.out.println("\nString.format()�������ڸ�ʽ���������Ͷ���");
		System.out.println("400��ʮ��������ʽ��"+hex);
		System.out.println("400�İ˽�����ʽ��"+octal);
		//System.out.println("400�Ŀ�ѧ��������ʾ��ʽ��"+scientificNotation);
	}
}
