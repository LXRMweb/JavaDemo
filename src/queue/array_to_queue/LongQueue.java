/*
 * author:lxrm
 * date:2016/07/26
 * function:����һ��������ʵ�ֵĶ��У�ѭ�����У���������Ԫ����long������
 * */
package queue.array_to_queue;

public class LongQueue {
	private long[] queueArray;//���飬���ڴ�Ŷ���Ԫ��
	private int head;/****************************����ͷ��Ԫ���±�=  head+1  ***/
	private int end;//����β��Ԫ���±�
	private int num;//����������Ԫ�ظ���
	private int length;//������󳤶�
	public LongQueue(int size){
		queueArray=new long[size];
		num=0;//��ʼ�����ǿյ�
		head=-1;
		end=-1;
		length=size;
	}
	/*�����������Ԫ��
	 * @return int end:����˸�Ԫ�غ��βԪ�ص��±�*/
	public int enterQueue(long element){
		if(this.isFull()){
			System.out.println("��ͼ���������������Ԫ�أ����ʧ��");
			return end;//��βԪ���±�
		}else{
			++end;
			end=(end<=length-1)?end:0;//ʵ��ѭ������
			queueArray[end]=element;
			num++;//ÿ�������������һ��Ԫ��֮���Ҫ����һ��num(����������Ԫ����Ŀ)
			return end;
		}
	}
	/*
	 * ���ض���Ԫ�ز�����Ԫ�شӶ�����ɾ��
	 * @return������Ϊ��ʱ����ֵΪ-1;
	 * 			���в�Ϊ��ʱ���ص��Ƕ���Ԫ�ص�ֵ*/
	public long outQueue(){
		if(this.isEmpty()){
			System.out.println("����ȷ�Ĳ�������ͼ�ӿն����л�ȡԪ��");
			return -1;
		}else{
			long tmp=queueArray[++head];
			head=(head<=length-1)?head:0;
			num--;//ÿ�δӶ�����ȡ��һ��Ԫ��֮���Ҫ����һ��num(����������Ԫ����Ŀ)
			return tmp;
		}
	}
	/*�鿴����������Ԫ�أ����ն���˳����ʾ*/
	public boolean displayQueue(){
		if(this.isEmpty()){
			System.out.println("����Ϊ��");
			return false;
		}else{
			System.out.println("��������Ԫ�أ���������Ⱥ�˳����ʾ");
			if(head<end){
				for(int j=head+1;j<=end;j++){
					System.out.println(queueArray[j]);
				}
				return true;
			}else{
				for(int j=head+1;j<length;j++){
					System.out.println(queueArray[j]);
				}
				for(int j=0;j<=end;j++){
					System.out.println(queueArray[j]);
				}
				return true;
			}
		}
	}
	
	/**
	/*�鿴����Ԫ�ص�ֵ
	 * @return������Ϊ��ʱ����ֵΪ-1;
	 * 			���в�Ϊ��ʱ���ص��Ƕ���Ԫ�ص�ֵ*/
	public long peekHead(){
		return this.isEmpty()?-1:queueArray[head+1];
	}
	
	/** //�鿴��βԪ�ص�ֵ
	 * @return������Ϊ��ʱ����ֵΪ-1;
	 * 			���в�Ϊ��ʱ���ص��Ƕ���Ԫ�ص�ֵ
	 * */
	public long peekEnd(){
		return this.isEmpty()?-1:queueArray[end];
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		return num==0?true:false;
	}
	//�ж϶����Ƿ�����
	public boolean isFull(){
		return num==length?true:false;
	}
	//���ض��п���ȡ������󳤶�
	public int length(){
		return length;
	}
	//���ض���������Ԫ�ظ���
	public int num(){
		return num;
	}
}
