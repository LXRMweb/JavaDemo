/**
 * @author lxrm
 * @date 20161113
 * @description 这个文件介绍TreeSet类的整体情况
 * 概述：
 * 		1.存放至TreeSet类中的元素会自动排好序
 * 		2.TreeSet集合中不允许放入null值*/
package javaAPI_dataStructure;

import java.util.TreeSet;

public class Eaxmple7_Use_TreeSet {
	public static void main(String[] args){
		TreeSet set=new TreeSet();
		set.add(12);
		set.add(34);
		set.add(23);
		System.out.println(set);//结果：[12, 23, 34]
								//结果分析：已经将结果排好序
	}
}
