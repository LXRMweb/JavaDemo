/**
 * @author:lxrm
 * @date:20170205
 * @description:这个类讲述JavaAPI中用于数值格式化的类DecimalFormat
 * java.text.DecimalFormat
 * 		1)概述：这个类可以用于用于格式化数字
 * 			a.用于格式化十进制数字
 * 			b.可以将数值格式化为整数、浮点数、科学计数法、百分数等
 * 			c.可以控制数字的精度
 * 			d.可以为数字加上单位
 * 			e.需要使用一些特殊符号来说明想要呈现的格式，DecimalFormat类中定义了一些特殊符号，来表示不同的格式要求：
 * 				如0代表十进制数字字符，当对应位有数值存在时，显示数值；没有数值存在时显示为0
 * 				如#代表十进制数字字符，当对应位有数值存在时，显示数值；没有数值存在时不显示
 * 				如.代表小数分隔符或者货币小数分隔符
 * 				如-代表负号
 * 				如,代表分组分隔符
 * 				如E代表科学计数法
 * 				如%代表百分数
 * 				如\u2030代表千分数
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
						 *          <td>Separates mantissa基数 and exponent指数 in scientific notation.科学计数法
						 *              <em>Need not be quoted in prefix or suffix.</em>
						 *     <tr valign=top>
						 *          <td><code>;</code>
						 *          <td>Subpattern boundary
						 *          <td>Yes
						 *          <td>Separates positive and negative subpatterns
						 *     <tr valign=top bgcolor="#eeeeff">百分数
						 *          <td><code>%</code>
						 *          <td>Prefix or suffix
						 *          <td>Yes
						 *          <td>Multiply by 100 and show as percentage
						 *     <tr valign=top>千分数
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
 * 		2)DecimalFormat类中的静态成员常量
 * 		3)DecimalFormat类中的构造函数
 * 				3.1) public DecimalFormat(String pattern)
 * 				3.2) public DecimalFormat (String pattern, DecimalFormatSymbols symbols)
 * 		4)DecimalFormat类中的成员函数
 *使用实例：使用DecimalFormat类来格式化数值的显示形式
 *		实例一，在创建DecimalFormat对象的时候就指定“格式” 
 *				代码：见本类中的method1()函数
 *		实例二，创建DecimalFormat对象的时候不指定“格式”，而是使用DecimalFormat类中的applyPattern(String pattern)方法来指定"格式"
 *				代码：见本类中的method2()函数
 *		实例三，编写程序展示特殊符号0和#的区别
 *				代码：见main函数中相应代码块
 *		实例四，编写程序展示百分号和千分号的用法
 *				代码：见main函数中相应代码块
 *		实例五，编写程序展示如何给数值添加单位
 *				代码：见main函数中的相应代码块
 **/
package operator_and_math;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class JavaAPI_DecimalFormat {
	
	//实例一，在创建DecimalFormat对象的时候就指定“格式” 
	static private void method1(String pattern,double num){
		DecimalFormat df=new DecimalFormat(pattern);
		System.out.println("原来的值："+num+"  pattern:"+pattern+"  格式化后的结果："+df.format(num));
	} 
	//实例二，在创建DecimalFormat对象的时候并不指定格式，而是调用DecimalFormat类中的applyPattern()函数来指定格式
	static private void method2(String pattern,double num){
		DecimalFormat df=new DecimalFormat();
		df.applyPattern(pattern);
		System.out.println("原来的值："+num+"  pattern:"+pattern+"  格式化后的结果："+df.format(num));
	}
	public static void main(String[] args){
		
		//DecimalFormat类中用于定义数值格式的特殊字符
		System.out.println("\nDecimalFormat类中用于定义数值格式的特殊字符:0 # . , - E % \u00A4 \u2030 ' ");
		/*实例三，可用于定义数值格式的特殊字符0和#的区别
		 * 		0和#都是代表一个十进制数字，但是前者在没有数字的位置显示0，后者则不显示
		 * 		即0--->没有数值的地方显示成0
		 * 		 #--->没有数值的地方空着，不显示数字
		 */
		System.out.println("1)0和#的区别：");
		JavaAPI_DecimalFormat.method1("000,000.00", 23456.12);//结果：023,456.12
		JavaAPI_DecimalFormat.method1("###,###.##", 23456.12);//结果：23,456.12
		JavaAPI_DecimalFormat.method2("###,###.000", 23456.12);//结果：23,456.12
		System.out.println("2)百分号和千分号：");
		JavaAPI_DecimalFormat.method1("0.00%", 0.12);//结果：023,456.12
		JavaAPI_DecimalFormat.method1("0.000\u2030", 0.12);//结果：23,456.12
		JavaAPI_DecimalFormat.method2("0.###%", 0.12);//结果：23,456.12
		System.out.println("3)人民币符号：");
		JavaAPI_DecimalFormat.method1("0.00\u00A4", 0.12);//结果：023,456.12
		JavaAPI_DecimalFormat.method1("0.000\u2030", 0.12);//结果：23,456.12
		System.out.println("4)给数值添加单位：");
		JavaAPI_DecimalFormat.method1("###m/s", 56);//结果：023,456.12
		JavaAPI_DecimalFormat.method1("##.##kg", 0.12);//结果：23,456.12
	}

}
