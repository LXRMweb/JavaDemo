/**
 * @author chen
 * @date 20170310
 * @description 本程序讲述LinkedList类的用法
 * java.util.LinkedList
 * 		概述：
 * 			1)LinkedList是List接口的实现类,它使用双向链表来实现list集合
 * 			2）LinkedList集合中允许元素为null
 * 			3）LinkedList集合中允许通过index来访问元素，但是每次访问都要遍历实现它的双向链表
 * 			4）LinkedList是线程不安全的
 * 					如果需要保证其线程安全性，可以通过如下办法来实现LinkedList集合的线程安全性：
 * 					List list = Collections.synchronizedList(new LinkedList(...));
 * 					即，在创建LinkedList集合的时候，就调用Collections#synchronizedList()使该集合变成synchronized
 * 			5)由于LinkedList是List接口的实现类，所以它拥有List接口的所有成员方法
 * 				同时，LinkedList类中还添加了一些专门用于LinkedList集合的成员方法
 * 		构造函数：
 * 			【1】public LinkedList()创建一个空的LinkedList集合
 * 			【2】public LinkedList(Collection<? extends E> c)创建一个新的LinkedList集合，且集合拥有参数集合c中的所有元素
 * 			【3】
 * 		成员函数：
 * 			【1】public E getFirst()//Returns the first element in this list.
 * 			【2】public E getLast()//Returns the last element in this list.
 * 			【3】public E removeFirst()//Removes and returns the first element from this list.
 * 			【4】public E removeLast()//Removes and returns the last element from this list.
 * 			【5】public void addFirst(E e)//Inserts the specified element at the beginning of this list.
 * 			【6】public void addLast(E e)//Appends the specified element to the end of this list.
 * 			【7】 public boolean contains(Object o)//Returns {@code true} if this list contains the specified element.
 * 			【8】public int size()//Returns the number of elements in this list.
 * 			【9】public boolean add(E e)//Appends the specified element to the end of this list.
 * 			【10】public boolean remove(Object o)//Removes the first occurrence of the specified element 
 * 							from this list,if it is present. If this list does not contain the element, 
 * 							it is unchanged.
 * 			【11】public boolean addAll(Collection<? extends E> c) //Appends all of the elements 
 * 							in the specified collection to the end of this list, 
 * 							in the order that they are returned by the specified collection's iterator. 
 * 			【12】public boolean addAll(int index, Collection<? extends E> c)//1）Inserts all of the elements 
 * 							in the specified collection into this list, starting at the specified position. 
 * 							2）Shifts the element currently at that position 
 * 							(if any) and any subsequent elements to the right (increases their indices).  
 * 							3）The new elements will appear in the list in the order that 
 * 							they are returned by the specified collection's iterator.
 * 			【13】public void clear()//清空当前集合
 * 			【14】public E get(int index)//通过索引访问集合中特定位置处的元素
 * 			【15】public E set(int index, E element)//使用element：E替换集合index：int位置上的元素
 * 			【16】public void add(int index, E element)//在集合index:int位置上插入element:E,并且将原来的元素及其后面的元素右移
 * 			【17】public E remove(int index)//删除集合中特定位置上的元素并将该元素作为返回值返回，后面的元素左移
 * 			【18】public int indexOf(Object o) //Returns the index of the first occurrence of the specified element
 * 							in this list, or -1 if this list does not contain the element.
 * 			【19】public int lastIndexOf(Object o)//Returns the index of the last occurrence of the specified element
 *							in this list, or -1 if this list does not contain the element.
 *			【20】public E peek()//查询该list中的第一个元素
 *			【21】public E element()//查询该list中的第一个元素
 *			【22】public E poll()//删除该list中第一个元素，并将该元素作为返回值返回
 *			【23】public E remove()//删除该list中第一个元素，并将该元素作为返回值返回
 *			【24】public boolean offer(E e)//Adds the specified element as the tail (last element) of this list.
 *			【25】public boolean offerFirst(E e)//Inserts the specified element at the front of this list.
 *			【26】public boolean offerLast(E e)//Inserts the specified element at the end of this list.
 *			【27】 public E peekFirst()//Retrieves【检索】, but does not remove, the first element of this list,
 *							or returns {@code null} if this list is empty.
 *			【28】 public E peekLast()//Retrieves【检索】, but does not remove, the last element of this list,
 * 							or returns {@code null} if this list is empty.
 * 			【29】public E pollFirst()//Retrieves【检索】 and removes the first element of this list,
 *							or returns {@code null} if this list is empty.
 *			【30】public E pollLast()//Retrieves and removes the last element of this list,
 *							or returns {@code null} if this list is empty.
 *			【31】public void push(E e)//Pushes an element onto the stack represented by this list.  In other
 *							words, inserts the element at the front of this list.
 *			【32】public E pop()//Pops an element from the stack represented by this list.  In other
 *							words, removes and returns the first element of this list.
 *			【33】public boolean removeFirstOccurrence(Object o) //Removes the first occurrence of the 
 *							specified element in this list (when traversing【遍历】 the list from head to tail【尾部】).
 *							If the list does not contain the element, it is unchanged.
 *			【34】 public boolean removeLastOccurrence(Object o)//Removes the last occurrence of the 
 *							specified element in this list (when traversing【遍历】 the list from head to tail【尾部】).
 *							If the list does not contain the element, it is unchanged.
 *			【35】public ListIterator<E> listIterator(int index) //返回一个迭代器ListIterator，并且该迭代器的当前位置是index:int
 *			【36】public Iterator<E> descendingIterator()//返回一个DesendingIterator对象，DesendingIterator是Iterator接口的实现类
 *							使得可以以降序遍历LinkedList集合中的所有元素
 *			【37】public Object clone()//returns a shallow copy of this {@code LinkedList}. (The elements
 *							themselves are not cloned.)
 *			【38】public Object[] toArray()//Returns an array containing all of the elements in this list
 *							in proper sequence (from first to last element).
 *			【39】public <T> T[] toArray(T[] a)//Returns an array containing all of the elements in this list in
 * 							proper sequence (from first to last element);
 * 							并且完成元素类型的转换：如果list中元素类型和参数数组元素类型一致，则直接将list集合转化成数组并返回
 * 											如果list集合中元素类型和参数数组元素类型不一致，则应该将list集合中元素类型转变成参数数组元素类型
 * 							并且根据情况填充null作为返回值数组中的元素：如果list.size()<a.length，那么再返回值数组的后面补充null
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
