/*author:lxrm
 * date:2016/07/27
 * function:ʹ������ʵ��һ�����ȼ����У�����Ԫ����Student���͵�
 * 			������Ԫ�ص�id�������У���Student����Ԫ�ص�id����С��ͬѧվ�ڿ������׵�λ��
 * ���˼·��Ԫ��������룬�����ȼ��ߵ�Ԫ�ط��ڿ������׵�λ�ã�����ÿ�β���һ���µĶ�Ա�Ƕ�Ҫ���бȽϣ��ƶ��������ٶȽ�����
 * 			ȡ������Ԫ�أ�������������γɵĶ��У�����Ԫ����Զ���Ƿ��������β��������ֱ��ȡ������*/
package queue.array_to_queue;

import POJO.Student;

public class StudentPriorityQueue {
	private Student[] studentArray;
	private int head;//����Ԫ�ص��±�
	private int length;//�������������
	public StudentPriorityQueue(int size){
		studentArray=new Student[size];
		head=-1;
		length=size;
	}
	/*������в���һ��Ԫ��Student��������룩��student��idС��Ԫ�ز��ڶ��еĿ������׵�λ��
	 * @return:�����Ԫ�غ���еĶ���Ԫ�ص��±�*/
	public int enterQueue(Student stu){
		if(this.isFull()){
			System.out.println("����������stuId="+stu.getId()+"Ԫ�ز���ʧ��");
			return head;
		}else{
			int j=head;
			while(j>=0&&studentArray[j].getId().compareTo(stu.getId())<0){
				studentArray[j+1]=studentArray[j];
				j--;
			}
			studentArray[++j]=stu;
			return ++head;
		}
	}
	/*���ض��ж���Ԫ�ص�ֵ��Ȼ����Ӷ�����ɾ��
	 * @return:����Ϊ��ʱ����ֵΪnull�����в�Ϊ��ʱ����ֵΪ����Ԫ��*/
	public Student outQueue(){
		if(this.isEmpty()){
			System.out.println("����Ϊ�գ���ȡ����Ԫ��ʧ��");
			return null;
		}else{
			return studentArray[head--];
		}
	}
	//չʾ��������������Ԫ��
	public void dispalyQueue(){
		for(int j=0;j<=head;j++){
			System.out.println("StudentPriorityArray["+j+"]:"+studentArray[j].getId()+"--->"+studentArray[j].getName());
		}
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		return head==-1?true:false;
	}
	//�ж϶����Ƿ�����
	public boolean isFull(){
		return head==length-1?true:false;
	}
}
