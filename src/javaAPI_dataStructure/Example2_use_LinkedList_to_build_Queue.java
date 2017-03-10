/**
 * @author lxrm
 * @date 20161111
 * @description 使用javaAPI中的LinkedList来实现队列这种数据结构*/
package javaAPI_dataStructure;

import java.util.LinkedList;

public class Example2_use_LinkedList_to_build_Queue {
	LinkedList list;
	public Example2_use_LinkedList_to_build_Queue(){
		list=new LinkedList();
	}
	public void push(Object e){
		list.addLast(e);
	}
	public Object pop(){
		return list.removeFirst();
	}
	public Object peek(){
		return list.getFirst();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public static void main(String[] args){
		Example2_use_LinkedList_to_build_Queue queue=new Example2_use_LinkedList_to_build_Queue();
		for(int i=0;i<8;i++){
			queue.push(Integer.toString(i+9));
		}
		System.out.println("队首元素："+queue.peek());
		System.out.println("将队列中元素依次pop出来");
		for(int i=0;i<8;i++){
			System.out.print(queue.pop()+"\t");
		}
	}
}
