/**
 * @description: ���нڵ��࣬���ڶ���ʹ������洢�Ķ����������ԶѵĽڵ����в��������ã�����֮��������ǲ���Ҫ��*/
package tree;

import POJO.Student;

public class HeapNode {
	private String key;//�ؼ���
	private double data;//����������������ͣ�
	private Student stu;//�����POJO����
	
	public HeapNode(){}
	
	public HeapNode(String key,double data,Student stu){
		this.key=key;
		this.data=data;
		this.stu=stu;
	}
	//����ڵ��е���������
	public void displayNode(){
		System.out.println("�ڵ�ؼ���key="+this.key);
		System.out.println("�ڵ��������ݣ�data:double="+this.data+"    Student.name="+this.stu.getName());
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
