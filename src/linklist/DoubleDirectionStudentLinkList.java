/*auth:lxrm
 * date:20160817
 * function:˫����������˫����������˫������*/
package linklist;

import POJO.Student;

public class DoubleDirectionStudentLinkList {
	private DoubleDirectionStudentLink firstLink;
	private DoubleDirectionStudentLink lastLink;
	public DoubleDirectionStudentLinkList(){
		firstLink=null;
		lastLink=null;
	}
	//������ͷ�������½ڵ�
	/*@param Student:����������
	 * @return void
	 * 
	 * ���˼·��*/
	public void insertFirst(Student stu){
		DoubleDirectionStudentLink newLink=new DoubleDirectionStudentLink(stu);
		if(this.isEmpty()){
			firstLink=newLink;
			lastLink=newLink;
		}else{
			firstLink.previous=newLink;//step1
			newLink.next=firstLink;//step2
			firstLink=newLink;//step3
		}
	}
	//������β�������½ڵ�
	public void insertLast(Student stu){
		DoubleDirectionStudentLink newLink=new DoubleDirectionStudentLink(stu);
		if(this.isEmpty()){
			firstLink=newLink;
			lastLink=newLink;
		}else{
			lastLink.next=newLink;
			newLink.previous=lastLink;
			lastLink=newLink;
		}
	}
	//��ָ���Ľڵ�   ����   �����µĽڵ�
	/*@param  key_stuId:ָ���ڵ�Ĺؼ��ֵ�ֵ���ڸýڵ��������µĽڵ�
	 * @param stu:�������data
	*/
	public void insertAfter(String key_stuId,Student stu){
		DoubleDirectionStudentLink newLink=new DoubleDirectionStudentLink(stu);
		if(this.findLink(key_stuId)==null){
			System.out.println("������û��ָ���ڵ㣬��û��stuId="+key_stuId+"�Ľڵ㣬����ʧ�ܣ�");
			return;
		}else{
			DoubleDirectionStudentLink keyLink=this.findLink(key_stuId);
			if(keyLink==lastLink){
				lastLink.next=newLink;
				newLink.previous=lastLink;
				lastLink=newLink;
				return;
			}else{
				newLink.previous=keyLink;
				newLink.next=keyLink.next;
				keyLink.next.previous=newLink;
				keyLink.next=newLink;
				return;
			}
		}
	}
	//����ָ���ؼ��ֵĽڵ�
	//@return DoubleDirectionStudentLink���󣺵����ҵ�ָ���ڵ�ʱ����ֵΪָ���ڵ��ַ��δ���ҵ�ʱ����ֵΪnull
	public DoubleDirectionStudentLink findLink(String key_stuId){
		DoubleDirectionStudentLink current=firstLink;//��firstLink��ʼ����
		DoubleDirectionStudentLink tmp=null;//�洢��ѯ���
		while(current!=null){
			if(current.stu.getId().equals(key_stuId)){
				tmp=current;
				break;
			}
			current=current.next;
		}
		return tmp;
	}
	//ɾ������ͷ��Ԫ�أ��������ڴ�����ͷ����ʼ������������
	public DoubleDirectionStudentLink deleteFirst(){
		if(this.isEmpty()){
			System.out.println("����Ϊ�գ�ɾ��ͷ��Ԫ�صĲ���ʧ�ܣ�");
			return null;
		}else if(firstLink.next==null){//������ֻ��һ��Ԫ�ص����
			lastLink=null;
		}
		DoubleDirectionStudentLink tmp=firstLink;
		firstLink=firstLink.next;
		if(firstLink!=null){
			firstLink.previous=null;
		}
		return tmp;
	}
	//ɾ������β��Ԫ�أ������ر�ɽȥ�Ľڵ�ĵ�ַ
	public DoubleDirectionStudentLink deleteLast(){
		if(this.isEmpty()){
			System.out.println("����Ϊ�գ�ɾ��ͷ��Ԫ�صĲ���ʧ�ܣ�");
			return null;
		}else if(lastLink.previous==null){//������ֻ��һ���ڵ�����
			firstLink=null;
		}
		DoubleDirectionStudentLink tmp=lastLink;
		lastLink=lastLink.previous;
		if(lastLink!=null){
			lastLink.next=null;
		}
		return tmp;
	}
	public boolean isEmpty(){
		return firstLink==null;
	}
	//��������:�������������ͷ����β����Ԫ��
	public void displayForward(){
		DoubleDirectionStudentLink current=firstLink;
		System.out.println("����������Ԫ�أ�����ͷ��--->����β��");
		while(current!=null){
			current.dispalyLink();
			current=current.next;
		}
	}
	//��������:�������������β����ͷ����Ԫ��
	public void displayBackword(){
		DoubleDirectionStudentLink current=lastLink;
		System.out.println("����������Ԫ�أ�����β����--->����ͷ��");
		while(current!=null){
			current.dispalyLink();
			current=current.previous;
		}
	}
	//��ȡ��XxxLinkList��ĵ����������
	public DoubleDirectionStudentLinkListIterator getIterator(){
		return new DoubleDirectionStudentLinkListIterator(this);//this����linkList
	}
	//setter��getter
	public void setFirstLink(DoubleDirectionStudentLink link){
		this.firstLink=link;
	}
	public DoubleDirectionStudentLink getFirstLink(){
		return this.firstLink;
	}	
}
