/*author:lxrm
 * date:2016/07/27
 * function:使用数组实现一个优先级队列，队列元素是Student类型的
 * 			队列以元素的id属性排列，即Student类型元素的id属性小的同学站在靠近队首的位置
 * 编程思路：元素有序插入，即优先级高的元素放在靠近队首的位置（所以每次插入一个新的队员是都要进行比较，移动，插入速度较慢）
 * 			取出队首元素：经过有序插入形成的队列，队首元素永远都是放在数组的尾部，所以直接取出即可*/
package queue.array_to_queue;

import POJO.Student;

public class StudentPriorityQueue {
	private Student[] studentArray;
	private int head;//队首元素的下标
	private int length;//队列最大允许长度
	public StudentPriorityQueue(int size){
		studentArray=new Student[size];
		head=-1;
		length=size;
	}
	/*向队列中插入一个元素Student（有序插入），student的id小的元素插在队列的靠近队首的位置
	 * @return:插入该元素后队列的队首元素的下标*/
	public int enterQueue(Student stu){
		if(this.isFull()){
			System.out.println("队列已满，stuId="+stu.getId()+"元素插入失败");
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
	/*返回队列队首元素的值，然后将其从队列中删除
	 * @return:队列为空时返回值为null，队列不为空时返回值为队首元素*/
	public Student outQueue(){
		if(this.isEmpty()){
			System.out.println("队列为空，获取队首元素失败");
			return null;
		}else{
			return studentArray[head--];
		}
	}
	//展示队列中所有现有元素
	public void dispalyQueue(){
		for(int j=0;j<=head;j++){
			System.out.println("StudentPriorityArray["+j+"]:"+studentArray[j].getId()+"--->"+studentArray[j].getName());
		}
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
