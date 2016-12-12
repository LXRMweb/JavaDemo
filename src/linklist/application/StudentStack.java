/*auth:lxrm
 * date:20160812
 * fuction��ʹ�������������ݴ洢�ṹʵ��stack
 * ���˼·��
 * 		tips1��ջ��������һ��ջ����һ��������ʵ�ֵģ�����StudentStack���п���ʹ��XxxLinkList���е�isEmpty()������displayList()��������дStack����Ӧ����
 * 		tip2����֮����,Xxxstack����Ҫʵ��ĳ������ʱ����������LinkList�������еĺ�������*/
package linklist.application;

import POJO.Student;
import linklist.SingleEndStudentLinkList;
import linklist.StudentLink;

public class StudentStack {
	private SingleEndStudentLinkList stack;//һ������������ʵ����һ��ջ
	public StudentStack(){
		stack=new SingleEndStudentLinkList();
	}
	//��ջ����
	public void push(Student stu){
		stack.insertFirst(stu);
	}
	//��ջ����
	public Student pop(){
		Student tmp=new Student();
		StudentLink link=stack.deleteFirst();
		if(link!=null){
			tmp.setId(link.student.getId());
			tmp.setName(link.student.getName());
			return tmp;
		}else{
			System.out.println("ջΪ��");
			return null;
		}	
	}
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return stack.isEmpty();//�����������е�isEmpty()����
	}
	//���վ������Ԫ�أ���ջ����ջ�׵�˳��
	public void displayStack(){
		System.out.println("=====ջ��=====");
		stack.displayList();//�����������е�displayList()����
		System.out.println("=====ջ��=====");
	}
}
