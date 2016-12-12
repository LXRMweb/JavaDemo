/*auth:lxrm
 * date:20160927
 * function:树中的节点类
 * 编程思路：
 * 		Node类的成员变量
 * 				关键字、
 * 				数据项（可以是基本数据类型也可以是POJO对象）、
 * 				Node类对象（用于指向其他节点）
 * 		Node类的成员方法
 * 				如displayNode()函数，后台输出节点数据内容
 */
package tree;

import POJO.Student;

public class Node {
	private String key;//关键字
	private double data;//数据项（基本数据类型）
	private Student stu;//数据项（POJO对象）
	private Node leftChild;//用于指向“左子节点”
	private Node rightChild;//用于指向“右子节点”
	
	public Node(){}
	
	public Node(String key,double data,Student stu){
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
