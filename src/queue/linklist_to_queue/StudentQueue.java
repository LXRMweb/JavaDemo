/*auth:lxrm
 * date：20160812
 * function:使用链表实现的队列
 * 编程思路：尽量调用链表类中的函数来实现StudentQueue类*/
package queue.linklist_to_queue;

import POJO.Student;
import linklist.DoubleEndStudentLinkList;
import linklist.StudentLink;

public class StudentQueue {
	private DoubleEndStudentLinkList queue;//使用链表存储队列元素
	public StudentQueue(){
		queue=new DoubleEndStudentLinkList();
	}
	//存入队列
	public void push(Student stu){
		queue.insertLast(stu);
	}
	//取出队首元素
	public Student pop(){
		StudentLink tmp=queue.deleteFirst();
		Student stu=new Student();
		stu.setId(tmp.student.getId());
		stu.setName(tmp.student.getName());
		return stu;
	}
	//判断队列是否为空
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	//后台打印输出队列中所有元素
	public void displayQueue(){
		System.out.println("队列中所有元素");
		System.out.println("====队首====");
		queue.displayList();
		System.out.println("====队尾====");
	}
}
