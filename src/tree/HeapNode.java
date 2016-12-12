/**
 * @description: 堆中节点类，由于堆是使用数组存储的二叉树，所以堆的节点类中不必有引用，引用之类的属性是不必要的*/
package tree;

import POJO.Student;

public class HeapNode {
	private String key;//关键字
	private double data;//数据项（基本数据类型）
	private Student stu;//数据项（POJO对象）
	
	public HeapNode(){}
	
	public HeapNode(String key,double data,Student stu){
		this.key=key;
		this.data=data;
		this.stu=stu;
	}
	//输出节点中的数据内容
	public void displayNode(){
		System.out.println("节点关键字key="+this.key);
		System.out.println("节点数据内容：data:double="+this.data+"    Student.name="+this.stu.getName());
	}
	public String getKey(){
		return this.key;
	}
	public void setKey(String key){
		this.key=key;
	}
	public double getData(){
		return this.data;
	}
}
