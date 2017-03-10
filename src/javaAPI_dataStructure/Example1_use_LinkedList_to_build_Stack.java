/**
 * @author lxrm
 * @date 20161111
 * @description 使用javaAPI中的LinkedList来实现栈这种数据结构
 * */
package javaAPI_dataStructure;

import java.util.LinkedList;

public class Example1_use_LinkedList_to_build_Stack {
	LinkedList list;
	public Example1_use_LinkedList_to_build_Stack(){
		list=new LinkedList();
	}
	public Object pop(){
		return list.removeFirst();
	}
	public void push(Object obj){
		list.addFirst(obj);
	}
	public Object top(){
		return list.getFirst();
	}
	public static void main(String[] args){
		Example1_use_LinkedList_to_build_Stack stack=new Example1_use_LinkedList_to_build_Stack();
		for(int i=0;i<8;i++){
			stack.push(Integer.toString(i));
		}
		System.out.println("栈顶元素："+stack.top());
		System.out.println("将栈中的元素依次pop出来：");
		for(int i=0;i<8;i++){
			System.out.print(stack.pop()+"\t");
		}
	}
}
