/**
 * @author lxrm
 * @date 20161111
 * @description ʹ��javaAPI�е�LinkedList��ʵ��ջ�������ݽṹ
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
		System.out.println("ջ��Ԫ�أ�"+stack.top());
		System.out.println("��ջ�е�Ԫ������pop������");
		for(int i=0;i<8;i++){
			System.out.print(stack.pop()+"\t");
		}
	}
}
