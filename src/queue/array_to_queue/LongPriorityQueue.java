/*
 * author:lxrm
 * date:2016/07/26
 * function:����һ��ʹ������ʵ�ֵ����ȼ����У����а��ն���Ԫ�ص�ֵ�Ĵ�С��������
 * 			Ԫ��ֵԽС��Ԫ�ط��ڶ�����Խ�������׵�λ�ã������ȴ���
 * 			������Ԫ������Ϊlong*/
package queue.array_to_queue;

public class LongPriorityQueue {
	private long[] priorityArray;
	private int head;//����Ԫ�ص�λ��
	private int length;//���е���󳤶�
	public LongPriorityQueue(int size){
		priorityArray=new long[size];
		length=size;
		head=-1;
	}
	/*������в���һ��Ԫ�أ�������룩��ֵС��Ԫ�ز��ڶ��еĿ������׵�λ��
	 * @return:�����Ԫ�غ���еĶ���Ԫ�ص��±�*/
	public int enterQueue(long element){
		if(this.isFull()){
			System.out.println("����������Ԫ�ز���ʧ�ܣ�");
			return head;
		}else{
			int j=this.head;
			while(j>=0&&priorityArray[j]<element){
				priorityArray[j+1]=priorityArray[j];
				j--;
			}
			priorityArray[++j]=element;
			return ++head;
		}
	}
	
	/*���ض��ж���Ԫ�ص�ֵ��Ȼ����Ӷ�����ɾ��
	 * @return:����Ϊ��ʱ����ֵΪ-1�����в�Ϊ��ʱ����ֵΪ����Ԫ��*/
	public long outQueue(){
		return this.isEmpty()?-1:priorityArray[head--];
	}
	/*���ض��ж���Ԫ�ص�ֵ,��������Ӷ�����ɾ��
	 * @return:����Ϊ��ʱ����ֵΪ-1�����в�Ϊ��ʱ����ֵΪ����Ԫ��*/
	public long peekHead(){
		return this.isEmpty()?-1:priorityArray[head];
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
