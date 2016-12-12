/*auth:lxrm
 * date:20160927
 * function:���еĽڵ���
 * ���˼·��
 * 		Node��ĳ�Ա����
 * 				�ؼ��֡�
 * 				����������ǻ�����������Ҳ������POJO���󣩡�
 * 				Node���������ָ�������ڵ㣩
 * 		Node��ĳ�Ա����
 * 				��displayNode()��������̨����ڵ���������
 */
package tree;

import POJO.Student;

public class Node {
	private String key;//�ؼ���
	private double data;//����������������ͣ�
	private Student stu;//�����POJO����
	private Node leftChild;//����ָ�����ӽڵ㡱
	private Node rightChild;//����ָ�����ӽڵ㡱
	
	public Node(){}
	
	public Node(String key,double data,Student stu){
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
	public double getData(){
		return this.data;
	}
	public Node getLeftChild(){
		return this.leftChild;
	}
	public void setLeftChild(Node node){
		this.leftChild=node;
	}
	public Node getRightChild(){
		return this.getRightChild();
	}
	public void setRightChild(Node node){
		this.rightChild=node;
	}
}
