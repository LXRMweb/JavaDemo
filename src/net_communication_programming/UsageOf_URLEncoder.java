/**
 * @author LXRM
 * @date 20161101
 * @description 这个文件用于举例说明URLEncoder和URLDecoder的用法
 * 				这两个类用于将普通字符串转化成MIME格式的字符串(URL),或反之
 * 		例子一，将普通格式字符串变成MIME格式字符串
 * 		例子二，将MIME格式字符串变成普通格式字符串
 * 				*/
package net_communication_programming;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UsageOf_URLEncoder {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String str="普通字符串    & #...";
		System.out.println("原始字符串，普通字符串："+str);
		//例子一，将普通格式字符串变成MIME格式字符串
		String strMIME=URLEncoder.encode(str);
		System.out.println("编码后字符串，MIME格式："+strMIME);//结果：编码后字符串，MIME格式：%C6%D5%CD%A8%D7%D6%B7%FB%B4%AE++++%26+%23...
		//例子二，将MIME格式字符串变成普通格式字符串
		String strDecode=URLDecoder.decode(strMIME);
		System.out.println("MIME格式字符串解码结果："+strDecode);//结果：MIME格式字符串解码结果：普通字符串    & #...
	}
}
