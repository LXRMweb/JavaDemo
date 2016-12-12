/**
 * @author lxrm
 * @date 20161113
 * @description 这个类用于描述HashSet类
 * 概述：
 * 		1.HashSet类是基于HashMap实现的
 * 		2.HashSet要求放入的对象必须实现HashCode()方法，放入的对象是以hashCode码作为标识的(即作为HashMap的key的值)
 * 		3.*/
package java_api_dataStructure.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Use_HashSet {
	public static void main(String[] args){
		HashSet set=new HashSet();
		set.add(new Student(001,"lxrm"));
		set.add(new Student(002,"haha"));
		set.add(new Student(001,"lxrm"));
		set.add(new Student(001,"cc"));
		Iterator it=set.iterator();
		while(it.hasNext()){
			Student stu=(Student) it.next();
			stu.display();
		}
	}
}
//HashSet集合中想要存储的元素（Student对象）
class Student{
	private int id;
	private String name;
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	//被存放在HashSet类型的集合中的对象都必须实现hashCode()
	@Override
	public int hashCode(){
		return id*name.hashCode();
	}
	//判断当前对象是否和参数对象obj:Object有相同的值 
	@Override
	public boolean equals(Object obj){
		Student stu2=(Student) obj;
		return id==stu2.id&&name.equals(stu2.name);
	}
	public void display(){
		System.out.println("id="+id+"\t name="+name);
	}
}
