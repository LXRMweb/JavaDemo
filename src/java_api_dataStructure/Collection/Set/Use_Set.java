/**
 * @author lxrm
 * @date 20161113
 * @description Set��һ���ӿڣ���ʵ������HashSet��TreeSet��LinkedHashSet������
 * 			 ���������˵��������ʵ����Ĳ�֮ͬ��*/
package java_api_dataStructure.Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Use_Set {
	//��Set���ͼ��������Ԫ��
	public static void fill(Set set){
		set.add(Arrays.asList("one two three four five six".split(" ")));
	}
	public static void display(Set set){
		System.out.println(set.getClass().getName().replaceAll("\\w+\\.", ""));
		fill(set);
		fill(set);
		fill(set);//��Ȼ����Set�����������ͬ��Ԫ�أ���������Set���ϲ�����Ԫ���ظ�����������Set������ֻ������һ�ݸ�Ԫ��
		System.out.println(set);
		set.addAll(set);
		set.add("one");
		set.add("one");
		set.add("one");
		System.out.println(set);
		System.out.println("set.contains(\"one\"):"+set.contains("one"));
	}
	public static void main(String[] args){
		display(new HashSet());
		display(new LinkedHashSet());
		//display(new TreeSet());//�׳��쳣
	}
}
