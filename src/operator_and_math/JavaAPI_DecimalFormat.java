/**
 * @author:lxrm
 * @date:20170205
 * @description:����ི��JavaAPI��������ֵ��ʽ������DecimalFormat
 * java.text.DecimalFormat
 * 		1)���������������������ڸ�ʽ������
 * 			a.���ڸ�ʽ��ʮ��������
 * 			b.���Խ���ֵ��ʽ��Ϊ����������������ѧ���������ٷ�����
 * 			c.���Կ������ֵľ���
 * 			d.����Ϊ���ּ��ϵ�λ
 * 			e.��Ҫʹ��һЩ���������˵����Ҫ���ֵĸ�ʽ��DecimalFormat���ж�����һЩ������ţ�����ʾ��ͬ�ĸ�ʽҪ��
 * 				��0����ʮ���������ַ�������Ӧλ����ֵ����ʱ����ʾ��ֵ��û����ֵ����ʱ��ʾΪ0
 * 				��#����ʮ���������ַ�������Ӧλ����ֵ����ʱ����ʾ��ֵ��û����ֵ����ʱ����ʾ
 * 				��.����С���ָ������߻���С���ָ���
 * 				��-������
 * 				��,�������ָ���
 * 				��E�����ѧ������
 * 				��%����ٷ���
 * 				��\u2030����ǧ����
 * 						 * <blockquote>
						 * <table border=0 cellspacing=3 cellpadding=0 summary="Chart showing symbol,
						 *  location, localized, and meaning.">
						 *     <tr bgcolor="#ccccff">
						 *          <th align=left>Symbol
						 *          <th align=left>Location
						 *          <th align=left>Localized?
						 *          <th align=left>Meaning
						 *     <tr valign=top>
						 *          <td><code>0</code>
						 *          <td>Number
						 *          <td>Yes
						 *          <td>Digit
						 *     <tr valign=top bgcolor="#eeeeff">
						 *          <td><code>#</code>
						 *          <td>Number
						 *          <td>Yes
						 *          <td>Digit, zero shows as absent
						 *     <tr valign=top>
						 *          <td><code>.</code>
						 *          <td>Number
						 *          <td>Yes
						 *          <td>Decimal separator or monetary decimal separator
						 *     <tr valign=top bgcolor="#eeeeff">
						 *          <td><code>-</code>
						 *          <td>Number
						 *          <td>Yes
						 *          <td>Minus sign
						 *     <tr valign=top>
						 *          <td><code>,</code>
						 *          <td>Number
						 *          <td>Yes
						 *          <td>Grouping separator
						 *     <tr valign=top bgcolor="#eeeeff">
						 *          <td><code>E</code>
						 *          <td>Number
						 *          <td>Yes
						 *          <td>Separates mantissa���� and exponentָ�� in scientific notation.��ѧ������
						 *              <em>Need not be quoted in prefix or suffix.</em>
						 *     <tr valign=top>
						 *          <td><code>;</code>
						 *          <td>Subpattern boundary
						 *          <td>Yes
						 *          <td>Separates positive and negative subpatterns
						 *     <tr valign=top bgcolor="#eeeeff">�ٷ���
						 *          <td><code>%</code>
						 *          <td>Prefix or suffix
						 *          <td>Yes
						 *          <td>Multiply by 100 and show as percentage
						 *     <tr valign=top>ǧ����
						 *          <td><code>&#92;u2030</code>
						 *          <td>Prefix or suffix
						 *          <td>Yes
						 *          <td>Multiply by 1000 and show as per mille value
						 *     <tr valign=top bgcolor="#eeeeff">
						 *          <td><code>&#164;</code> (<code>&#92;u00A4</code>)
						 *          <td>Prefix or suffix
						 *          <td>No
						 *          <td>Currency sign, replaced by currency symbol.  If
						 *              doubled, replaced by international currency symbol.
						 *              If present in a pattern, the monetary decimal separator
						 *              is used instead of the decimal separator.
						 *     <tr valign=top>
						 *          <td><code>'</code>
						 *          <td>Prefix or suffix
						 *          <td>No
						 *          <td>Used to quote special characters in a prefix or suffix,
						 *              for example, <code>"'#'#"</code> formats 123 to
						 *              <code>"#123"</code>.  To create a single quote
						 *              itself, use two in a row: <code>"# o''clock"</code>.
						 * </table>
						 * </blockquote>
 * 		2)DecimalFormat���еľ�̬��Ա����
 * 		3)DecimalFormat���еĹ��캯��
 * 				3.1) public DecimalFormat(String pattern)
 * 				3.2) public DecimalFormat (String pattern, DecimalFormatSymbols symbols)
 * 		4)DecimalFormat���еĳ�Ա����
 *ʹ��ʵ����ʹ��DecimalFormat������ʽ����ֵ����ʾ��ʽ
 *		ʵ��һ���ڴ���DecimalFormat�����ʱ���ָ������ʽ�� 
 *				���룺�������е�method1()����
 *		ʵ����������DecimalFormat�����ʱ��ָ������ʽ��������ʹ��DecimalFormat���е�applyPattern(String pattern)������ָ��"��ʽ"
 *				���룺�������е�method2()����
 *		ʵ��������д����չʾ�������0��#������
 *				���룺��main��������Ӧ�����
 *		ʵ���ģ���д����չʾ�ٷֺź�ǧ�ֺŵ��÷�
 *				���룺��main��������Ӧ�����
 *		ʵ���壬��д����չʾ��θ���ֵ��ӵ�λ
 *				���룺��main�����е���Ӧ�����
 **/
package operator_and_math;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class JavaAPI_DecimalFormat {
	
	//ʵ��һ���ڴ���DecimalFormat�����ʱ���ָ������ʽ�� 
	static private void method1(String pattern,double num){
		DecimalFormat df=new DecimalFormat(pattern);
		System.out.println("ԭ����ֵ��"+num+"  pattern:"+pattern+"  ��ʽ����Ľ����"+df.format(num));
	} 
	//ʵ�������ڴ���DecimalFormat�����ʱ�򲢲�ָ����ʽ�����ǵ���DecimalFormat���е�applyPattern()������ָ����ʽ
	static private void method2(String pattern,double num){
		DecimalFormat df=new DecimalFormat();
		df.applyPattern(pattern);
		System.out.println("ԭ����ֵ��"+num+"  pattern:"+pattern+"  ��ʽ����Ľ����"+df.format(num));
	}
	public static void main(String[] args){
		
		//DecimalFormat�������ڶ�����ֵ��ʽ�������ַ�
		System.out.println("\nDecimalFormat�������ڶ�����ֵ��ʽ�������ַ�:0 # . , - E % \u00A4 \u2030 ' ");
		/*ʵ�����������ڶ�����ֵ��ʽ�������ַ�0��#������
		 * 		0��#���Ǵ���һ��ʮ�������֣�����ǰ����û�����ֵ�λ����ʾ0����������ʾ
		 * 		��0--->û����ֵ�ĵط���ʾ��0
		 * 		 #--->û����ֵ�ĵط����ţ�����ʾ����
		 */
		System.out.println("1)0��#������");
		JavaAPI_DecimalFormat.method1("000,000.00", 23456.12);//�����023,456.12
		JavaAPI_DecimalFormat.method1("###,###.##", 23456.12);//�����23,456.12
		JavaAPI_DecimalFormat.method2("###,###.000", 23456.12);//�����23,456.12
		System.out.println("2)�ٷֺź�ǧ�ֺţ�");
		JavaAPI_DecimalFormat.method1("0.00%", 0.12);//�����023,456.12
		JavaAPI_DecimalFormat.method1("0.000\u2030", 0.12);//�����23,456.12
		JavaAPI_DecimalFormat.method2("0.###%", 0.12);//�����23,456.12
		System.out.println("3)����ҷ��ţ�");
		JavaAPI_DecimalFormat.method1("0.00\u00A4", 0.12);//�����023,456.12
		JavaAPI_DecimalFormat.method1("0.000\u2030", 0.12);//�����23,456.12
		System.out.println("4)����ֵ��ӵ�λ��");
		JavaAPI_DecimalFormat.method1("###m/s", 56);//�����023,456.12
		JavaAPI_DecimalFormat.method1("##.##kg", 0.12);//�����23,456.12
	}

}
