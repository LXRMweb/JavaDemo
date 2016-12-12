/*
 * author:lxrm
 * date:2016/07/26
 * function:这是一个使用数组实现的优先级队列，队列按照队列元素的值的大小进行排列
 * 			元素值越小，元素放在队列中越靠进队首的位置，被优先处理
 * 			队列中元素类型为long*/
package queue.array_to_queue;

public class LongPriorityQueue {
	private long[] priorityArray;
	private int head;//队首元素的位置
	private int length;//队列的最大长度
	public LongPriorityQueue(int size){
		priorityArray=new long[size];
		length=size;
		head=-1;
	}
	/*向队列中插入一个元素（有序插入），值小的元素插在队列的靠近队首的位置
	 * @return:插入该元素后队列的队首元素的下标*/
	public int enterQueue(long element){
		if(this.isFull()){
			System.out.println("队列已满，元素插入失败！");
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
	
	/*返回队列队首元素的值，然后将其从队列中删除
	 * @return:队列为空时返回值为-1，队列不为空时返回值为队首元素*/
	public long outQueue(){
		return this.isEmpty()?-1:priorityArray[head--];
	}
	/*返回队列队首元素的值,并不将其从队列中删除
	 * @return:队列为空时返回值为-1，队列不为空时返回值为队首元素*/
	public long peekHead(){
		return this.isEmpty()?-1:priorityArray[head];
	}
	//判断队列是否为空
	public boolean isEmpty(){
		return head==-1?true:false;
	}
	//判断队列是否已满
	public boolean isFull(){
		return head==length-1?true:false;
	}
}
