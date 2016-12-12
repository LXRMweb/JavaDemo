/*auth:lxrm
 * date:20160816
 * function:��������    ���չؼ�ֵ��������
 * 			����ڵ�������ΪStudent��     ����Student��id����ֵ����(����ͷ��idֵ��С)*/
package linklist;

import POJO.Student;

public class OrderedStudentLinkList {
	private StudentLink firstLink;
	public OrderedStudentLinkList(){
		firstLink=null;
	}
	/*�������в����µĽڵ㣬������˳����룬Ҳ��ʹ���γɵ�����Խ����ͷ����λ��stuIdԽС��*/
	public void insertByOrder_firstMin(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1:���ݰ���������ڵ��ʽ
		StudentLink current=firstLink;
		StudentLink previous=null;
		//step2:����Ӧ�ò����λ��
		while(current!=null&&current.student.getId().compareTo(stu.getId())<0){
			previous=current;
			current=current.next;
		}
		/*step3�����ݲ��ҽ����������
		 * 		1)��Ҫ����Ľڵ���firstLinkǰ��ʱ
		 * 		2)��Ҫ����Ľڵ㲻��firstLinkǰ��ʱ*/
		if(previous==null){
			firstLink=newLink;
		}else{
			previous.next=newLink;
		}
		newLink.next=current;
	}
	/*�������в����µĽڵ㣬������˳����룬Ҳ��ʹ���γɵ�����Խ����ͷ����λ��stuIdԽ��*/
	public void insertByOrder_firstMax(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1:�����ݰ����ɽڵ����
		StudentLink current=firstLink;
		StudentLink previous=null;
		while(current!=null){//step2�����Ҵ������λ��
			if(current.student.getId().compareTo(stu.getId())<0){
				break;
			}
			previous=current;
			current=current.next;
		}
		//step3������step2�Ľ�����������
		if(previous==null){//������λ����firstLinkǰ��ʱ
			newLink.next=firstLink; 
			firstLink=newLink;
		}else{//������λ�ò�����firstLinkǰ��ʱ
			previous.next=newLink;
			newLink.next=current;
		}
	}
	//ɾ������ͷ��Ԫ��
	/*@return StudentLink :����ɾ���Ľڵ����ĵ�ַ*/
	public StudentLink deleteFirst(){
		StudentLink tmp=firstLink;
		firstLink=firstLink.next;
		return tmp;
	}
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty(){
		return firstLink==null;
	}
	//��̨��ӡ���������нڵ�
	public void displayList(){
		if(this.isEmpty()){
			System.out.println("��ǰ����Ϊ��");
		}else{
			StudentLink tmp=firstLink;
			while(tmp!=null){
				tmp.displayLink();
				tmp=tmp.next;
			}
		}
	}
}
