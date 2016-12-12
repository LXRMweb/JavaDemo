/**
 * @author lxrm
 * @date 20161113
 * @description Set是一个接口，其实现类有HashSet、TreeSet、LinkedHashSet这三种
 * 			 本程序举例说明这三种实现类的不同之处*/
package java_api_dataStructure.Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Use_Set {
	//往Set类型集合中添加元素
	public static void fill(Set set){
		set.add(Arrays.asList("one two three four five six".split(" ")));
	}
	public static void display(Set set){
		System.out.println(set.getClass().getName().replaceAll("\\w+\\.", ""));
		fill(set);
		fill(set);
		fill(set);//虽然想向Set集合中添加相同的元素，但是由于Set集合不允许元素重复，所以最终Set集合中只保留了一份该元素
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
		//display(new TreeSet());//抛出异常
	}
}
