/**
 * @author chen
 * @date 20170317
 * @description:本程序讲述Collection接口
 * java.util.Collection
 * 		概述：Collection接口是Set和List接口的父接口，Collection接口中定义了一些
 * 			用于集合元素操作的方法，被其子接口以及子接口的实现类所继承
 * 		构造函数
 * 			java中接口不能有构造函数
 * 		成员函数：
 * 			【1】概述，由于Collection实际上是一个接口，所以下面所介绍的函数都没有函数体，也即它们的函数体都是空的
 * 			【2】int size();//返回集合中元素个数，如果元素个数>Integer.MAX_VALUE,那么该函数的返回值==Integer.MAX_VALUE
 * 			【3】boolean isEmpty();//集合是否为空
 * 			【4】boolean contains(Object o);//集合中是否包含元素o:Object
 * 			【5】Iterator<E> iterator();//返回可以遍历该集合中所有元素的一个迭代器（即Iterator对象）
 * 			【6】Object[] toArray();//将集合转变成一个数组
 * 			【7】<T> T[] toArray(T[] a);//这个函数和【6】中所给的函数功能类似，但是这个函数还有额外的功能
 * 					功能：	这个函数除了将集合转换成数组之外
 * 							还实现集合元素数据类型 到 数组元素数据类型的转换（将集合元素由原来的数据类型转变成本函数的参数a:T[]所代表的数据类型——T）
 * 							另外，还指定了函数返回值的长度（返回值的长度和本函数的参数数组a:T[]的长度一致）
 * 					@return 返回值(数组)的内容——集合元素
 * 							返回值中数组元素的数据类型——和本函数的参数数据类型一致
 * 							返回值(数组)的长度——和本函数的参数数组的长度一致，当集合元素个数小于参数数组a:T[]长度时，使用null填充空位从而使返回值长度达到要求
 * 			【8】boolean add(E e);//向集合中添加新元素
 * 			【9】boolean remove(Object o);//从集合中删除一个元素
 * 			【10】boolean containsAll(Collection<?> c);//判断该集合中是否包含参数集合中的所有元素
 * 			【11】boolean addAll(Collection<? extends E> c);//将参数集合中的所有元素添加到该集合中（相当于取并集）
 * 			【12】 boolean removeAll(Collection<?> c);//这个函数执行后，该集合中将不再含有参数集合中的任何一个元素（相当于集合相减）
 * 			【13】 boolean retainAll(Collection<?> c);//执行这个函数之后，该集合中将不可能含有参数集合中不存在的元素（相当于取交集）
 * 			【14】void clear();//执行该函数后，集合将变成空的
 * 			【15】 boolean equals(Object o);//参数o:Object也是一个集合，这个函数用于判断两个集合的内容是否相同
 * 			【16】int hashCode();//返回该集合所对应的hashCode码
 * 					备注：如果两个集合的内容完全相同，那么这两个集合对应的hashCode码也一定相同
 * 						即，若a.equals(b)==true，那么一定有a.hashCode()==b.hashCode()
 * */
package javaAPI_dataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class JavaAPI_Collection {
	public static void main(String[] args){
		Collection collection=new ArrayList();
	}

}
