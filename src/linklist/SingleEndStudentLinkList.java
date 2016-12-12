/*auth:lxrm
 * date:20160810
 * fuction: ��StudentLinkΪ�ڵ�ĵ�������
 * ���˼·��
 * 		���Ա������firstLink--->�洢����ĵ�һ���ڵ�ĵ�ַ
 * 		���캯������ʼ�����Ա������ʹfirstLink=null
 * 		��Ա��������insertFirst()����*/
package linklist;

import POJO.Student;

public class SingleEndStudentLinkList {
	private StudentLink firstLink;
	public SingleEndStudentLinkList(){
		firstLink=null;
	}
	
	//������ͷ�������½ڵ�
	/*���˼·��
	 * 		step1:�����������ݰ�����   �ڵ�
	 * 		step2��ʹ���²���Ľڵ�ָ��ԭ�������ͷ���ڵ㣨�����½ڵ��nextָ��ԭ�������firstLink��
	 * 		step3: �����������ͷ���ڵ㣨����firstLink=�²���Ľڵ㣩*/
	public void insertFirst(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1:�����������ݰ�����   �ڵ�
		newLink.next=firstLink;//step2��ʹ���²���Ľڵ�ָ��ԭ�������ͷ���ڵ㣨�����½ڵ��nextָ��ԭ�������firstLink��
		firstLink=newLink;//step3: �����������ͷ���ڵ㣨����firstLink=�²���Ľڵ㣩
	}
	//�ڡ�ָ���ڵ㡱��������µĽڵ�
	/*@param:stuId,"ָ���ڵ㡱��ѧ��ѧ��
	 * 		 stu,�����������*/
	public void insertAfterByKey(String stuId,Student stu){
		StudentLink newLink=new StudentLink(stu);//step1�������������ݰ����ɽڵ������
		StudentLink tmp=this.findLinkByKey(stuId);//step2,�����������в���ָ���ڵ�
		//step3:���ݡ�ָ���ڵ㡱�Ĳ��ҽ�����к�������
		if(tmp==null){
			System.out.println("û���ڵ�ǰ�����в��ҵ�stuId="+stuId+"�Ľڵ㣬����ʧ�ܣ�");
			return;
		}else{
			newLink.next=tmp.next;
			tmp.next=newLink;
			return;
		}	
	}
	//ɾ�������е�һ���ڵ�
	public StudentLink deleteFirst(){
		if(this.isEmpty()){
			System.out.println("�������Ϊ�գ�ɾ����һ���ڵ�Ĳ���ʧ��");
			return null;
		}else{
			StudentLink tmp=firstLink;
			firstLink=firstLink.next;
			return tmp;
		}
	}
	//�����в���ָ��stuId�Ľڵ㣬����ɾ�����鵽�ĵ�һ��Ԫ��
	//@return �鵽����������Ԫ��ʱ���ظ�Ԫ�أ�����Ϊ�ջ���û�в��ҵ���ӦԪ��ʱ����ֵΪnull
	/*���˼·��
	 * 		��������ۣ�����Ϊ��ʱ
	 * 				����Ϊ��ʱ     ��firstLink�Ƿ��������Ľڵ�    ��Ҫ�޸�firstLink��ֵ
	 * 				����Ϊ��ʱ     ��firstLink���Ƿ��������Ľڵ�    */
	public StudentLink deleteLinkByKey(String stuId){
		StudentLink tmp=firstLink;
		StudentLink previous=firstLink;
		if(!this.isEmpty()){
			if(firstLink.student.getId().equals(stuId)){//�жϵ�һ���ڵ��Ƿ�Ϊ����������Ԫ��
				firstLink=firstLink.next;//���ǣ�����Ҫ�޸�firstLink
				return tmp;
			}else{
				tmp=firstLink.next;//����һ���ڵ㲻�Ƿ��������Ľڵ㣬���ɵڶ����ڵ�������²���
				while(tmp!=null){
					if(tmp.student.getId().equals(stuId)){
						previous.next=tmp.next;
						return tmp;
					}
					previous=tmp;
					tmp=tmp.next;
				}
				return null;//�����ǿ������ж�û���ҵ�����������Ԫ��ʱ������ֵΪnull
			}
		}else{
			System.out.println("����Ϊ�գ�ɾ����Ӧ�ڵ�Ĳ���ʧ��");
			return null;
		}
	}
	//���ݹؼ��ֲ��Ҷ�Ӧ�Ľڵ㣬����û���ҵ��򷵻�ֵΪnull,���򷵻���Ӧ�Ľڵ�
	public StudentLink findLinkByKey(String stuId){
		StudentLink tmp=firstLink;
		while(tmp!=null){
			if(tmp.student.getId().equals(stuId)){
				System.out.println("����������Ӧ�Ľڵ�");
				tmp.displayLink();
				return tmp;
			}
			tmp=tmp.next;
		}
		System.out.println("û�з���������Ԫ��");
		return null;
	}
	//��̨������������нڵ������
	public void displayList(){
		if(this.isEmpty()){
			System.out.println("����Ϊ��");
			return;
		}else{
			System.out.println("�������нڵ㣺");
			StudentLink currentLink=firstLink;
			while(currentLink!=null){
				currentLink.displayLink();
				currentLink=currentLink.next;
			}
			return;
		}
	}
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty(){
		return firstLink==null;
	}
}
