/*auth:lxrm
 * date:20160812
 * function:˫������
 * 			�ڵ��д洢��������Student����*/
package linklist;

import POJO.Student;

public class DoubleEndStudentLinkList {
	private StudentLink firstLink;
	private StudentLink lastLink;
	public DoubleEndStudentLinkList(){
		firstLink=null;
		lastLink=null;
	}
	
	/*****************��Ա����****************/
	
	//������ͷ�������½ڵ�
		/*���˼·��
		 * 		step1:�����������ݰ�����   �ڵ�
		 * 		step2��ʹ���²���Ľڵ�ָ��ԭ�������ͷ���ڵ㣨�����½ڵ��nextָ��ԭ�������firstLink��
		 * 		step3: �����������ͷ���ڵ㣨����firstLink=�²���Ľڵ㣩
		 * 		step4:��������β���ڵ㣨ֻ�в����½ڵ�֮ǰ������Ϊ�յ��������Ҫ���£�
		 * ����״��һ��һ��Ҫ��step4����step2ǰ�棬������������½ڵ�����Ͳ��ǿ�������*/
	public void insertFirst(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1,�����������ݰ���������ڵ������
		if(this.isEmpty()){
			lastLink=newLink;//step4
		}
		newLink.next=firstLink;//step2
		firstLink=newLink;//step3
	}
	//����β�������½ڵ�
	/*���˼·��
	 * 	 ����״��һ��һ��Ҫ��step2����step3ǰ�棬������������½ڵ�����Ͳ��ǿ�������
	 * 	����״��һ��ע��step3��һ��Ҫ��else����У���Ҳ��step3ֻ��������ǿյ�ʱ�����ִ�У������׳�����ָ���쳣����*/
	public void insertLast(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1:����
		if(this.isEmpty()){
			firstLink=newLink;//step2:��������ͷ���ڵ�ֵ
		}else{
			lastLink.next=newLink;//step3:β�������½ڵ�
		}
		lastLink=newLink;
	}
	//ɾ������ͷ���ڵ�
	/*���˼·����������  ����Ϊ�� /������ֻ��һ���ڵ�/���������������������Ͻڵ�
	 * ����״��һ��Ҫע��������ֻ��һ���ڵ����������˲���firstLink֮�⣬��Ҫ��lastLink��ֵΪnull*/
	public StudentLink deleteFirst(){
		if(this.isEmpty()){
			System.out.println("����Ϊ�գ�����ʧ��");
			return null;
		}else if(firstLink.next==null){//������ֻ��һ���ڵ�����
			lastLink=null;
		}
			StudentLink tmp=firstLink;//��ɾ���Ľڵ�
			firstLink=firstLink.next;
			return tmp;
	}
	//��̨��ӡ����������нڵ�����ֵ
	public void displayList(){
		StudentLink current=firstLink;
		System.out.println("���������нڵ㣺");
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
	}
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty(){
		return firstLink==null;
	}
}
