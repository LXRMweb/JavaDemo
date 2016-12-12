/*
 * author:lxrm
 * date:2016/07/26
 * function:这是一个由数组实现的队列（循环队列），队列中元素是long型数据
 * */
package queue.array_to_queue;

public class LongQueue {
	private long[] queueArray;//数组，用于存放队列元素
	private int head;/****************************队列头部元素下标=  head+1  ***/
	private int end;//队列尾部元素下标
	private int num;//队列中现有元素个数
	private int length;//队列最大长度
	public LongQueue(int size){
		queueArray=new long[size];
		num=0;//初始队列是空的
		head=-1;
		end=-1;
		length=size;
	}
	/*往队列中添加元素
	 * @return int end:添加了该元素后队尾元素的下标*/
	public int enterQueue(long element){
		if(this.isFull()){
			System.out.println("企图往已满队列中添加元素，添加失败");
			return end;//队尾元素下标
		}else{
			++end;
			end=(end<=length-1)?end:0;//实现循环机制
			queueArray[end]=element;
			num++;//每次往队列中添加一个元素之后就要更改一下num(队列中现有元素数目)
			return end;
		}
	}
	/*
	 * 返回队首元素并将该元素从队列中删除
	 * @return：队列为空时返回值为-1;
	 * 			队列不为空时返回的是队首元素的值*/
	public long outQueue(){
		if(this.isEmpty()){
			System.out.println("不正确的操作，企图从空队列中获取元素");
			return -1;
		}else{
			long tmp=queueArray[++head];
			head=(head<=length-1)?head:0;
			num--;//每次从队列中取出一个元素之后就要更改一下num(队列中现有元素数目)
			return tmp;
		}
	}
	/*查看队列中所有元素，按照队列顺序显示*/
	public boolean displayQueue(){
		if(this.isEmpty()){
			System.out.println("队列为空");
			return false;
		}else{
			System.out.println("队列所有元素，按照入队先后顺序显示");
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
	/*查看队首元素的值
	 * @return：队列为空时返回值为-1;
	 * 			队列不为空时返回的是队首元素的值*/
	public long peekHead(){
		return this.isEmpty()?-1:queueArray[head+1];
	}
	
	/** //查看队尾元素的值
	 * @return：队列为空时返回值为-1;
	 * 			队列不为空时返回的是队首元素的值
	 * */
	public long peekEnd(){
		return this.isEmpty()?-1:queueArray[end];
	}
	//判断队列是否为空
	public boolean isEmpty(){
		return num==0?true:false;
	}
	//判断队列是否已满
	public boolean isFull(){
		return num==length?true:false;
	}
	//返回队列可以取到的最大长度
	public int length(){
		return length;
	}
	//返回队列中现有元素个数
	public int num(){
		return num;
	}
}
