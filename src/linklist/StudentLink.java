/*auth:lxrm
 * date:2016.08.10
 * function:����ڵ��࣬�ڵ��д洢����������ΪStudent����
 * */
package linklist;

import POJO.Student;

public class StudentLink {
	public Student student;
	public StudentLink next;
	public StudentLink(Student student){
		this.student=student;//��������ʡ��
		next=null;//��������ʡ��
	}
	public void displayLink(){
		System.out.println("����ڵ㣺stuId-->"+student.getId()+"  stuName-->"+student.getName());
	}
}
