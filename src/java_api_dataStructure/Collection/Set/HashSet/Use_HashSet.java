/**
 * @author lxrm
 * @date 20161113
 * @description �������������HashSet��
 * ������
 * 		1.HashSet���ǻ���HashMapʵ�ֵ�
 * 		2.HashSetҪ�����Ķ������ʵ��HashCode()����������Ķ�������hashCode����Ϊ��ʶ��(����ΪHashMap��key��ֵ)
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
//HashSet��������Ҫ�洢��Ԫ�أ�Student����
class Student{
	private int id;
	private String name;
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	//�������HashSet���͵ļ����еĶ��󶼱���ʵ��hashCode()
	@Override
	public int hashCode(){
		return id*name.hashCode();
	}
	//�жϵ�ǰ�����Ƿ�Ͳ�������obj:Object����ͬ��ֵ 
	@Override
	public boolean equals(Object obj){
		Student stu2=(Student) obj;
		return id==stu2.id&&name.equals(stu2.name);
	}
	public void display(){
		System.out.println("id="+id+"\t name="+name);
	}
}
