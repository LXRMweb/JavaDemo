/*auth:lxrm
 * date��20160812
 * function:ʹ������ʵ�ֵĶ���
 * ���˼·�����������������еĺ�����ʵ��StudentQueue��*/
package queue.linklist_to_queue;

import POJO.Student;
import linklist.DoubleEndStudentLinkList;
import linklist.StudentLink;

public class StudentQueue {
	private DoubleEndStudentLinkList queue;//ʹ������洢����Ԫ��
	public StudentQueue(){
		queue=new DoubleEndStudentLinkList();
	}
	//�������
	public void push(Student stu){
		queue.insertLast(stu);
	}
	//ȡ������Ԫ��
	public Student pop(){
		StudentLink tmp=queue.deleteFirst();
		Student stu=new Student();
		stu.setId(tmp.student.getId());
		stu.setName(tmp.student.getName());
		return stu;
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	//��̨��ӡ�������������Ԫ��
	public void displayQueue(){
		System.out.println("����������Ԫ��");
		System.out.println("====����====");
		queue.displayList();
		System.out.println("====��β====");
	}
}
