/**
 * @author lxrm
 * @date 20170307
 * @description 本程序讲述java.util.List接口的用法
 * java.util.List
 * 		概述：
 * 			1)List接口是Collection接口的子接口，所以List接口拥有Collection接口所定义的所有成员函数
 * 			      除了有其父接口Collection中所定义的所有函数之外，List接口也添加了自己的函数，使得List集合拥有自己的特色
 * 			  List接口中新添加的函数有：a)用于根据索引访问集合元素的成员函数
 * 								 b)返回 ListIterator对象的成员函数（Collection接口中定义了一个返回Iterator对象的函数，
 * 								   List接口中除了可以获得Iterator对象外，还可以获得ListIterator对象，可以以更多方式遍历List集合元素）
 * 			2)List集合允许重复的元素
 * 					Set集合中不能将自己作为自己的元素（it is not permissible for a set to contain itself as an element.）
 * 					List集合中就允许自己是自己的元素（it is permissible for a List to contain itself as an element.）
 * 			3）List集合中元素有一定的顺序，集合中元素顺序就是各个元素被插入的顺序
 * 			4）List集合允许使用索引来访问集合中的元素
 * 		构造函数：
 * 			java语言中接口没有构造函数
 * 		成员函数：
 * 		      	【1】概述，由于List是一个接口，所以下述所有函数都是没有函数体的，也即没有实际的代码块
 * 					且由于List接口继承了java.util.Collection接口，所以List接口含有Collection接口定义的所有函数
 * 					下面所列出的都是List接口中的函数，除非特别说明，否则相应的函数都是从Collection接口中继承而来的
 * 					加了“List接口新添加函数”标注的，都是List接口根据List集合特性新添加的成员函数，用以凸显List集合的特色功能
 * 				【2】int size();//返回集合中元素个数，如果元素个数>Integer.MAX_VALUE,那么该函数的返回值==Integer.MAX_VALUE
 * 				【3】boolean isEmpty();//集合是否为空
 * 				【4】boolean contains(Object o);//集合中是否包含元素o:Object
 * 				【5】Iterator<E> iterator();//返回可以遍历该集合中所有元素的一个迭代器（即Iterator对象）
 * “List接口新添加函数”【5.1】ListIterator<E> listIterator();//返回一个ListIterator对象，这个迭代器比Iterator更适于遍历List集合
 * “List接口新添加函数”【5.2】ListIterator<E> listIterator(int index);//和【5.1】中函数功能类似，
 * 									//只不过这个函数返回的ListIterator的next指针已经指在了List集合中index:int位置
 * 									//之后 An initial call to {@link ListIterator#next next}.将会返回List集合中index位置的元素
 *									// An initial call to {@link ListIterator#previous previous} 将会返回List集合中index-1位置上的元素
 * 				【6】Object[] toArray();//将集合转变成一个数组
 * 				【7】<T> T[] toArray(T[] a);//这个函数和【6】中所给的函数功能类似，但是这个函数还有额外的功能
 * 					功能：	这个函数除了将集合转换成数组之外
 * 							还实现集合元素数据类型 到 数组元素数据类型的转换（将集合元素由原来的数据类型转变成本函数的参数a:T[]所代表的数据类型——T）
 * 							另外，还指定了函数返回值的长度（返回值的长度和本函数的参数数组a:T[]的长度一致）
 * 					@return 返回值(数组)的内容——集合元素
 * 							返回值中数组元素的数据类型——和本函数的参数数据类型一致
 * 							返回值(数组)的长度——和本函数的参数数组的长度一致，当集合元素个数小于参数数组a:T[]长度时，使用null填充空位从而使返回值长度达到要求
 * 				【8】boolean add(E e);//向集合中添加新元素，将新元素添加到List的末尾
 * 				【9】boolean remove(Object o);//从集合中删除一个元素（删除List集合中第一个o:Object,也即对应集合下标最小的参数元素o:Object）
 * 				【10】boolean containsAll(Collection<?> c);//判断该集合中是否包含参数集合中的所有元素
 * 				【11】boolean addAll(Collection<? extends E> c);//将参数集合中的所有元素追加到该集合的末尾（相当于取并集）
 *“List接口新添加函数”【11.2】boolean addAll(int index, Collection<? extends E> c);//这个函数和【11】中函数功能类似，只不过
 *													//【11】中函数是将参数集合追加到该集合的末尾，而本函数是将参数集合追加到该集合的index：int开始的位置
 * 				【12】 boolean removeAll(Collection<?> c);//这个函数执行后，该集合中将不再含有参数集合中的任何一个元素（相当于集合相减）
 * 				【13】 boolean retainAll(Collection<?> c);//执行这个函数之后，该集合中将不可能含有参数集合中不存在的元素（相当于取交集）
 *“List接口新添加函数”【13.1】List<E> subList(int fromIndex, int toIndex);//返回该List集合的一个子集(左包含又不包含)
 * 				【14】void clear();//执行该函数后，集合将变成空的
 * 				【15】 boolean equals(Object o);//参数o:Object也是一个集合，这个函数用于判断两个集合的内容是否相同
 * 												//（当且仅当两个元素类型相同，size相同，且元素依序都相同时返回值才是true）
 * 				【16】int hashCode();//返回该集合所对应的hashCode码
 * 					备注：如果两个集合的内容完全相同，那么这两个集合对应的hashCode码也一定相同
 * 						即，若a.equals(b)==true，那么一定有a.hashCode()==b.hashCode()
 * 					集合的hashCode码是按照如下公式计算出来的
 * 					* <pre>
     				*  int hashCode = 1;
     				*  for (E e : list)
     				*      hashCode = 31*hashCode + (e==null ? 0 : e.hashCode());
     				* </pre>
 *“List接口新添加函数”【17】E get(int index);//返回List集合特定位置处的元素
 *“List接口新添加函数”【18】 E set(int index, E element);//替换List集合中特定位置处的元素
 *“List接口新添加函数”【19】void add(int index, E element);//在List集合的特定索引处添加一个新的元素element:E，并且将集合中相应元素往后移
 *“List接口新添加函数”【20】E remove(int index);//删除List集合中特定位置处的元素，并将删除的元素作为返回值返回；另外，还会将集合中index:int后面的元素左移
 *“List接口新添加函数”【21】int indexOf(Object o);//返回List集合中o:Object第一次出现的位置下标，如果List集合中没有该元素则返回-1
 *“List接口新添加函数”【22】int lastIndexOf(Object o);//返回o:Object在List集合中最后一次出现的位置，如果List集合中没有该元素则返回-1
 *“List接口新添加函数”【23】
 *“List接口新添加函数”【24】
 *“List接口新添加函数”【25】		    				
 * 				*/
package javaAPI_dataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class JavaAPI_List {
	public static void main(String[] args){
		List list=new ArrayList();
	}

}
