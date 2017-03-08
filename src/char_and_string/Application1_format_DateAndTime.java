/**
 * @author lxrm
 * @date 20170304
 * @description 本程序讲解如何将日期与时间进行格式化，使得Date对象所表示的日期与时间
 * 			变成我们想要的格式
 * 编程思路：
 * 		使用java.lang.String类中的format()函数来实现日期与时间字符串的格式化*/
package char_and_string;

import java.util.Date;

public class Application1_format_DateAndTime {
	public static void main(String[] args){
		System.out.println("\nString.format()函数用于格式化Date型对象");
		Date date=new Date();
		/*用法一：先用format()函数获得单个的String对象（如日、月、年）
		 * 			然后按照想要的格式将单个String对象组合成自己想要的表现形式
		 */		
		String month=String.format("%tm", date);
		String day=String.format("%td", date);
		String hour=String.format("%tH", date);
		String minute=String.format("%tM", date);
		String second=String.format("%tS", date);
		System.out.println("今天是"+month+"月"+day+"日");
		System.out.println("时间 ："+hour+"时"+minute+"分"+second+"秒");
		
		/*用法二：直接使用格式字符串中完整的格式，获得同时包含有“日、月、年”的String对象
		 * 
		 */
		String formatedDate=String.format("%tF", date);
		System.out.println("日期："+formatedDate);
		
		/*用法三：格式化除了Date型对象之外，其他类型的对象
		 * */
		String hex=String.format("%x", 400);//将400格式化为16进制的字符串
		String octal=String.format("%o", 400);//将400格式化为8进制的字符串
		//String scientificNotation=String.format("%e", 400);//bug:使用科学计数法表示400
		System.out.println("\nString.format()函数用于格式化其他类型对象：");
		System.out.println("400的十六进制形式："+hex);
		System.out.println("400的八进制形式："+octal);
		//System.out.println("400的科学计数法表示形式："+scientificNotation);
	}
}
