/**
 * @author chen
 * @date 20170303
 * @description �����򽲽�java.lang.StringBuilder����÷�
 * java.lang.StringBuilder
 * 	������
 * 		1��StringBuilder����ص�
 * 			a.�����̲߳���ȫ�ģ���ȫû��synchronized���η�
 * 			b.����ֵ�ǿɱ���ַ����У�ÿ��StringBuffer������һ������������ֵ������������ʱ��StringBuffer������Զ�����������������һ���µ�internal buffer array��
 * 				StringBuilder�������ڴ洢 A mutable���ɱ�ġ� sequence of characters. 
 * 			c.java API�л���һ�������API�������ƹ��ܵ�class����StringBuffer������StringBuilder���̲߳���ȫ�ģ���StringBuffer���̰߳�ȫ��
 * 	���Ա����
 * 		
 * 	���캯��
 * 		��java.lang.StringBuffer���еĹ��캯��һ��
 *  ��Ա����
 *  	��java.lang.StringBuffer���еĳ�Ա����һ�£�ֻ���������еĳ�Ա������û��synchronized���η�
 */
package char_and_string;

public class JavaAPI_StringBuilder {
	public static void main(String[] args){
		StringBuilder str=new StringBuilder();
	}

}
