/**
 * @author chen
 * @date 20170310
 * @description ��������LinkedList����÷�
 * java.util.LinkedList
 * 		������
 * 			1)LinkedList��List�ӿڵ�ʵ����,��ʹ��˫��������ʵ��list����
 * 			2��LinkedList����������Ԫ��Ϊnull
 * 			3��LinkedList����������ͨ��index������Ԫ�أ�����ÿ�η��ʶ�Ҫ����ʵ������˫������
 * 			4��LinkedList���̲߳���ȫ��
 * 					�����Ҫ��֤���̰߳�ȫ�ԣ�����ͨ�����°취��ʵ��LinkedList���ϵ��̰߳�ȫ�ԣ�
 * 					List list = Collections.synchronizedList(new LinkedList(...));
 * 					�����ڴ���LinkedList���ϵ�ʱ�򣬾͵���Collections#synchronizedList()ʹ�ü��ϱ��synchronized
 * 			5)����LinkedList��List�ӿڵ�ʵ���࣬������ӵ��List�ӿڵ����г�Ա����
 * 				ͬʱ��LinkedList���л������һЩר������LinkedList���ϵĳ�Ա����
 * 		���캯����
 * 			��1��public LinkedList()����һ���յ�LinkedList����
 * 			��2��public LinkedList(Collection<? extends E> c)����һ���µ�LinkedList���ϣ��Ҽ���ӵ�в�������c�е�����Ԫ��
 * 			��3��
 * 		��Ա������
 * 			��1��public E getFirst()//Returns the first element in this list.
 * 			��2��public E getLast()//Returns the last element in this list.
 * 			��3��public E removeFirst()//Removes and returns the first element from this list.
 * 			��4��public E removeLast()//Removes and returns the last element from this list.
 * 			��5��public void addFirst(E e)//Inserts the specified element at the beginning of this list.
 * 			��6��public void addLast(E e)//Appends the specified element to the end of this list.
 * 			��7�� public boolean contains(Object o)//Returns {@code true} if this list contains the specified element.
 * 			��8��public int size()//Returns the number of elements in this list.
 * 			��9��public boolean add(E e)//Appends the specified element to the end of this list.
 * 			��10��public boolean remove(Object o)//Removes the first occurrence of the specified element 
 * 							from this list,if it is present. If this list does not contain the element, 
 * 							it is unchanged.
 * 			��11��public boolean addAll(Collection<? extends E> c) //Appends all of the elements 
 * 							in the specified collection to the end of this list, 
 * 							in the order that they are returned by the specified collection's iterator. 
 * 			��12��public boolean addAll(int index, Collection<? extends E> c)//1��Inserts all of the elements 
 * 							in the specified collection into this list, starting at the specified position. 
 * 							2��Shifts the element currently at that position 
 * 							(if any) and any subsequent elements to the right (increases their indices).  
 * 							3��The new elements will appear in the list in the order that 
 * 							they are returned by the specified collection's iterator.
 * 			��13��public void clear()//��յ�ǰ����
 * 			��14��public E get(int index)//ͨ���������ʼ������ض�λ�ô���Ԫ��
 * 			��15��public E set(int index, E element)//ʹ��element��E�滻����index��intλ���ϵ�Ԫ��
 * 			��16��public void add(int index, E element)//�ڼ���index:intλ���ϲ���element:E,���ҽ�ԭ����Ԫ�ؼ�������Ԫ������
 * 			��17��public E remove(int index)//ɾ���������ض�λ���ϵ�Ԫ�ز�����Ԫ����Ϊ����ֵ���أ������Ԫ������
 * 			��18��public int indexOf(Object o) //Returns the index of the first occurrence of the specified element
 * 							in this list, or -1 if this list does not contain the element.
 * 			��19��public int lastIndexOf(Object o)//Returns the index of the last occurrence of the specified element
 *							in this list, or -1 if this list does not contain the element.
 *			��20��public E peek()//��ѯ��list�еĵ�һ��Ԫ��
 *			��21��public E element()//��ѯ��list�еĵ�һ��Ԫ��
 *			��22��public E poll()//ɾ����list�е�һ��Ԫ�أ�������Ԫ����Ϊ����ֵ����
 *			��23��public E remove()//ɾ����list�е�һ��Ԫ�أ�������Ԫ����Ϊ����ֵ����
 *			��24��public boolean offer(E e)//Adds the specified element as the tail (last element) of this list.
 *			��25��public boolean offerFirst(E e)//Inserts the specified element at the front of this list.
 *			��26��public boolean offerLast(E e)//Inserts the specified element at the end of this list.
 *			��27�� public E peekFirst()//Retrieves��������, but does not remove, the first element of this list,
 *							or returns {@code null} if this list is empty.
 *			��28�� public E peekLast()//Retrieves��������, but does not remove, the last element of this list,
 * 							or returns {@code null} if this list is empty.
 * 			��29��public E pollFirst()//Retrieves�������� and removes the first element of this list,
 *							or returns {@code null} if this list is empty.
 *			��30��public E pollLast()//Retrieves and removes the last element of this list,
 *							or returns {@code null} if this list is empty.
 *			��31��public void push(E e)//Pushes an element onto the stack represented by this list.  In other
 *							words, inserts the element at the front of this list.
 *			��32��public E pop()//Pops an element from the stack represented by this list.  In other
 *							words, removes and returns the first element of this list.
 *			��33��public boolean removeFirstOccurrence(Object o) //Removes the first occurrence of the 
 *							specified element in this list (when traversing�������� the list from head to tail��β����).
 *							If the list does not contain the element, it is unchanged.
 *			��34�� public boolean removeLastOccurrence(Object o)//Removes the last occurrence of the 
 *							specified element in this list (when traversing�������� the list from head to tail��β����).
 *							If the list does not contain the element, it is unchanged.
 *			��35��public ListIterator<E> listIterator(int index) //����һ��������ListIterator�����Ҹõ������ĵ�ǰλ����index:int
 *			��36��public Iterator<E> descendingIterator()//����һ��DesendingIterator����DesendingIterator��Iterator�ӿڵ�ʵ����
 *							ʹ�ÿ����Խ������LinkedList�����е�����Ԫ��
 *			��37��public Object clone()//returns a shallow copy of this {@code LinkedList}. (The elements
 *							themselves are not cloned.)
 *			��38��public Object[] toArray()//Returns an array containing all of the elements in this list
 *							in proper sequence (from first to last element).
 *			��39��public <T> T[] toArray(T[] a)//Returns an array containing all of the elements in this list in
 * 							proper sequence (from first to last element);
 * 							�������Ԫ�����͵�ת�������list��Ԫ�����ͺͲ�������Ԫ������һ�£���ֱ�ӽ�list����ת�������鲢����
 * 											���list������Ԫ�����ͺͲ�������Ԫ�����Ͳ�һ�£���Ӧ�ý�list������Ԫ������ת��ɲ�������Ԫ������
 * 							���Ҹ���������null��Ϊ����ֵ�����е�Ԫ�أ����list.size()<a.length����ô�ٷ���ֵ����ĺ��油��null
 * */
package javaAPI_dataStructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class JavaAPI_LinkedList {
	public static void main(String[] args){
		List list=new LinkedList();
		
	}
}
