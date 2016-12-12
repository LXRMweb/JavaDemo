/*auth:lxrm
 * date:20160812
 * fuction：使用链表这种数据存储结构实现stack
 * 编程思路：
 * 		tips1，栈就是链表，一个栈是由一个链表来实现的，所以StudentStack类中可以使用XxxLinkList类中的isEmpty()函数和displayList()函数来编写Stack的相应函数
 * 		tip2，总之就是,Xxxstack中想要实现某个函数时，尽量调用LinkList类中现有的函数即可*/
package linklist.application;

import POJO.Student;
import linklist.SingleEndStudentLinkList;
import linklist.StudentLink;

public class StudentStack {
	private SingleEndStudentLinkList stack;//一个单端链表其实就是一个栈
	public StudentStack(){
		stack=new SingleEndStudentLinkList();
	}
	//入栈函数
	public void push(Student stu){
		stack.insertFirst(stu);
	}
	//出栈函数
	public Student pop(){
		Student tmp=new Student();
		StudentLink link=stack.deleteFirst();
		if(link!=null){
			tmp.setId(link.student.getId());
			tmp.setName(link.student.getName());
			return tmp;
		}else{
			System.out.println("栈为空");
			return null;
		}	
	}
	//判断栈是否为空
	public boolean isEmpty(){
		return stack.isEmpty();//调用链表类中的isEmpty()函数
	}
	//输出站中所有元素（从栈顶到栈底的顺序）
	public void displayStack(){
		System.out.println("=====栈顶=====");
		stack.displayList();//调用链表类中的displayList()函数
		System.out.println("=====栈底=====");
	}
}
