/*auth:lxrm
 * date:2016.08.10
 * function:链表节点类，节点中存储的数据类型为Student对象
 * */
package linklist;

import POJO.Student;

public class StudentLink {
	public Student student;
	public StudentLink next;
	public StudentLink(Student student){
		this.student=student;//该语句可以省略
		next=null;//该语句可以省略
	}
	public void displayLink(){
		System.out.println("链表节点：stuId-->"+student.getId()+"  stuName-->"+student.getName());
	}
}
