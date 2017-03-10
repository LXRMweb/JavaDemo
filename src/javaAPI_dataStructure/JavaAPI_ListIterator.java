/**
 * @author chen
 * @date 20170310
 * @description 本程序讲述ListIterator接口的用法
 * java.util.ListIterator接口
 * 		概述：
 * 			1)ListIterator接口继承了Iterator接口，所以它拥有Iterator接口中定义的所有成员方法
 * 			2)Iterator可以用于所有类型集合的遍历，但是ListIterator只能用于List及其实现类类型的集合的遍历
 * 			3)由于ListIterator是一个接口，所以下面所列出的所有函数都是没有方法体的
 * 		构造函数：
 * 			由于ListIterator是一个接口，所以它没有构造函数
 * 		成员函数：
 * 			【概述】由于ListIterator继承了Iterator接口，所以它拥有Iterator接口中所定义的所有成员方法，
 * 				下面所列出的函数中，带有“继承自Iterator”的，都表示该函数是由其父接口Iterator继承而来的
 *“继承自Iterator接口”【1】boolean hasNext();//如果List集合中还有下一个元素则返回true
 *“继承自Iterator接口”【2】E next();//返回集合中下一个元素
 *				        【3】boolean hasPrevious();//反向遍历List集合的时候，如果前面还有元素，就返回true
 *				        【4】E previous();//结合【3】中函数，用于List集合的反向遍历，这个函数用于反向遍历时返回集合元素的值
 *				        【5】int nextIndex();//返回下一个元素的索引,返回值取值范围为1~List.size()
 *				        【6】int previousIndex();//返回前一个元素的索引，返回值取值范围为-1~List.size()-2
 *“继承自Iterator接口”【7】void remove();//删除集合元素
 *				        【8】void set(E e);//替换集合中的元素
 *					【9】void add(E e);//在当前索引位置的前面一个位置    或者   当前索引位置的后面一个位置    添加一个新的元素到集合中
 *									  //至于是在当前索引位置的 之前 还是 之后 添加新元素，则要看你现在是顺序遍历还是倒序遍历
 *									//如果是{@link #next}，则要在当前位置的前一个位置处插入
 *									//如果是{@link #previous}，则是要在当前位置的后一个位置处插入
*/
package javaAPI_dataStructure;

public class JavaAPI_ListIterator {

}
