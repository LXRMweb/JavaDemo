/*auth:lxrm
 * date:20160816
 * function:使用链表实现有序数组
 * 编程思路：将无序的数组存放到有序链表中，然后使用链表的deleteFirst()函数将链表数据存放至数组中*/
package linklist.application;

import POJO.Student;
import linklist.OrderedStudentLinkList;
import linklist.StudentLink;

public class linklist_to_sortedArray {
	private OrderedStudentLinkList list;//有序链表，用于存放数组数据
	public linklist_to_sortedArray(){
		list=new OrderedStudentLinkList();//获得一个空链表
	}
	public Student[] toOrderedArray(Student[] student){
		Student[] studentsTmp=new Student[student.length];//重新开辟一个Student[],用于存放排好序之后的数组数据
		//step1：将数组数据放入有序链表
		for(int i=0;i<student.length;i++){
			list.insertByOrder_firstMin(student[i]);
		}
		//step2：将链表中数据一一deleteFirst()后放入新的数组空间
		for(int i=0;i<student.length;i++){
			StudentLink tmp=list.deleteFirst();
			tmp.displayLink();
			Student stuTmp=new Student();
			stuTmp.setId(tmp.student.getId());
			stuTmp.setName(tmp.student.getName());
			studentsTmp[i]=stuTmp;
		}
		return studentsTmp;
	}
}
