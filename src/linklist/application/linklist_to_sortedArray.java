/*auth:lxrm
 * date:20160816
 * function:ʹ������ʵ����������
 * ���˼·��������������ŵ����������У�Ȼ��ʹ�������deleteFirst()�������������ݴ����������*/
package linklist.application;

import POJO.Student;
import linklist.OrderedStudentLinkList;
import linklist.StudentLink;

public class linklist_to_sortedArray {
	private OrderedStudentLinkList list;//�����������ڴ����������
	public linklist_to_sortedArray(){
		list=new OrderedStudentLinkList();//���һ��������
	}
	public Student[] toOrderedArray(Student[] student){
		Student[] studentsTmp=new Student[student.length];//���¿���һ��Student[],���ڴ���ź���֮�����������
		//step1�����������ݷ�����������
		for(int i=0;i<student.length;i++){
			list.insertByOrder_firstMin(student[i]);
		}
		//step2��������������һһdeleteFirst()������µ�����ռ�
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
