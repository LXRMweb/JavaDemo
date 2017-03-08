/**
 * @author chen
 * @date 20170308
 * @description 本程序介绍java.util.Map接口的定义
 * java.util.Map
 * 		概述：
 * 			1）Map集合中存储的是key-value对
 * 			2）Map集合中key值是不可重复的，value值是可以重复的
 * 				is not permissible for a map to contain itself as a key.
 * 				While it is permissible for a map to contain itself as a value,
 * 			3）Map集合中一个key只能对应于一个value，不可对应于多个value
 * 			4）Map接口中定义了一个内部接口
 * 		成员函数：
 * 			【1】概述，由于Map实际上是一个接口，所以下面所介绍的函数都没有函数体，也即它们的函数体都是空的
 * 			【2】int size();//返回Map集合中的key-value mapping的数目，如果总个数>Integer.MAX_VALUE,那么该函数的返回值==Integer.MAX_VALUE
 * 			【3】boolean isEmpty();//集合是否为空
 * 			【4】boolean containsKey(Object key);//看该Map集合中是否含有参数所指定的键值
 * 			【5】boolean containsValue(Object value);//看该Map集合中是否含有该函数的参数所指定的value（可能有多个key都对应于该value哦）
 * 			【6】V get(Object key);//返回key对应的value，若集合中没有该键值，则返回null
 * 								//但是返回值为null有两种情况：一，Map集合中本就没有该key;二，Map集合中有该key，但是该key原本所对应的value就是null
 * 			【7】V put(K key, V value);//往集合中添加新的key-value对，若果该Map集合中本来已经有了相应的key，那么原来的value将被覆盖
 * 								//如果原来就有该key，那么该函数的返回值是该key原来对应的value值
 * 								//如果集合中原来没有该key或者该key原来对应的值为null,那么该函数的返回值是null
 * 			【8】V remove(Object key);//删除Map集合中的该键值对，若果该key存在，则返回值是该key所对应的value
 * 								//如果Map集合中本身就没有该键值对或者该key所对应的value本身就==null,则该函数的返回值是null
 * 			【9】void putAll(Map<? extends K, ? extends V> m);//将另一个Map集合放至该Map集合
 * 			【10】 void clear();//清空该Map集合
 * 			【11】Set<K> keySet();//返回该Map集合中所有key所组成的Set类型的集合
 * 								//可以通过key所组成的Set类型的集合调用<tt>Iterator.remove</tt>, <tt>Set.remove</tt>,
 * 								//<tt>removeAll</tt>, <tt>retainAll</tt>, and <tt>clear</tt> operations.
 * 								//上述操作将会删除Map集合中相应的key-value对
 * 								//不能通过key所组成的Set集合调用 <tt>add</tt> or <tt>addAll</tt> operations.来操作Map集合
 * 			【12】Collection<V> values();//返回该Map集合中所有value所构成的Collection集合
 * 								//The collection supports element removal, which removes the corresponding
 * 								// mapping from the map, via the <tt>Iterator.remove</tt>,
 * 								// <tt>Collection.remove</tt>, <tt>removeAll</tt>,
 * 								// <tt>retainAll</tt> and <tt>clear</tt> operations.  It does not
 * 								// support the <tt>add</tt> or <tt>addAll</tt> operations.
 * 			【13】Set<Map.Entry<K, V>> entrySet();//这个函数返回Map集合中存在的所有key-value mapping
 *  							//The Set supports element removal, which removes the corresponding
 * 								// mapping from the map, via the <tt>Iterator.remove</tt>,
 * 								// <tt>Set.remove</tt>, <tt>removeAll</tt>,
 * 								// <tt>retainAll</tt> and <tt>clear</tt> operations.  It does not
 * 								// support the <tt>add</tt> or <tt>addAll</tt> operations.
 *"Map接口中定义的inner private interface"【14】interface Entry<K,V> 
 *			【15】boolean equals(Object o);//判断两个Map集合是否是相同的Map集合
 *			【16】int hashCode();//返回该Map集合所对应的hashCode码
 *						//如果两个Map集合对应的equals()函数的返回值为true，那么这两个Map集合的hashCode码一定相等
 * */
package javaAPI_dataStructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaAPI_Map {
	public static void main(String[] args){
		Map map=new HashMap();
	}

}
