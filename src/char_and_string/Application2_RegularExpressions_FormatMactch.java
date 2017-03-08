/**
 * @author chen
 * @date 20170305
 * @description 本程序讲述正则表达式的用法
 * 概述：正则表达式实际上是由一些元字符连接而成的一个字符串
 * 	         正则表达式常被用于检验一个字符串是否满足一定的格式要求
 * 应用实例：
 * 		实例一，使用正则表达式验证一个字符串是否是一个有效的Email地址*/
package char_and_string;

public class Application2_RegularExpressions_FormatMactch {
	/*
	 * 实例一，使用正则表达式验证一个字符串是否是一个有效的Email地址
	 * @param email:String 待检验的字符串
	 * @return boolean 如果参数是有效Email地址，则返回值为true，否则返回false
	 */
	public static boolean isEmail(String email){
		String regularExpression="\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";//正则表达式（一个由一系列元字符组合成的字符串）
		if(email.matches(regularExpression)){
			System.out.println("正确："+email+"是有效的Email地址");
			return true;
		}else{
			System.out.println("错误："+email+"是无效的Email地址");
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
