/**
 * @author chen
 * @date 20170308
 * @description 本程序讲述java.util.Set接口的定义
 * java.util.Set
 * 		概述：
 * 			1)Set集合中不允许有重复的元素
 * 				最多只能有一个值为null的元素
 * 				要特别注意Set集合中的元素，当改变某个元素的值时，一定不要使得改变后的结果和其他元素相同
 * 				Set集合中不能将自己作为自己的元素（it is not permissible for a set to contain itself as an element.）
 * 				List集合中就允许自己是自己的元素（it is permissible for a List to contain itself as an element.）
 * 			2)Set接口是Collection接口的子接口，所以Set继承了Collection接口中所定义的所有函数
 * 				Set接口没有新定义其它函数
 * 		成员函数定义：
 * 			【1】概述：Set接口是Collection接口的子接口，所以Set继承了Collection接口中所定义的所有函数
 * 					下面所列出的函数中，绝大多数都是从Collection接口继承而来
 * 					除了标注有“Set接口相对于Collection接口新增函数”的成员函数是Set接口特有的函数之外
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
 * 								//如果集合中没有该元素，那么添加该元素，并且返回true
 * 								//如果集合中已经有了该元素，那么这个函数将不会改变现有Set集合，并且返回值为false
 * 			【9】boolean remove(Object o);//从集合中删除一个元素
 * 			【10】boolean containsAll(Collection<?> c);//判断该集合中是否包含参数集合中的所有元素
 * 			【11】boolean addAll(Collection<? extends E> c);//将参数集合中的所有元素添加到该集合中（相当于取并集）
 * 			【12】 boolean removeAll(Collection<?> c);//这个函数执行后，该集合中将不再含有参数集合中的任何一个元素（相当于集合相减）
 * 			【13】 boolean retainAll(Collection<?> c);//执行这个函数之后，该集合中将不可能含有参数集合中不存在的元素（相当于取交集）
 * 			【14】void clear();//执行该函数后，集合将变成空的
 * 			【15】 boolean equals(Object o);//参数o:Object也是一个集合，这个函数用于判断两个Set集合的内容是否相同
 * 								//当且仅当两个Set集合的size相同，且一个集合中的所有元素恰好都在另一个集合中可以找到（反过来也成立）时，返回值是true
 * 								//也即只要两个Set集合互相包含（不考虑元素顺序），该函数的返回值就是true
 * 			【16】int hashCode();//返回该Set集合所对应的hashCode码
 * 					备注：如果两个集合的内容完全相同，那么这两个集合对应的hashCode码也一定相同
 * 						即，若a.equals(b)==true，那么一定有a.hashCode()==b.hashCode()
 * “Set接口相对于Collection接口新增的函数”
 * 			没有这样的函数
 * 			Set接口没有自定义的函数，其成员函数都是从java.util.Collection接口继承而来
 * 			*/
package javaAPI_dataStructure;

import java.util.HashSet;
import java.util.Set;

public class JavaAPI_Set {
	public static void main(String[] args){
		Set set=new HashSet();
	}
}
