/**
 * @author chen
 * @date 20170308
 * @description ���������java.util.Map�ӿڵĶ���
 * java.util.Map
 * 		������
 * 			1��Map�����д洢����key-value��
 * 			2��Map������keyֵ�ǲ����ظ��ģ�valueֵ�ǿ����ظ���
 * 				is not permissible for a map to contain itself as a key.
 * 				While it is permissible for a map to contain itself as a value,
 * 			3��Map������һ��keyֻ�ܶ�Ӧ��һ��value�����ɶ�Ӧ�ڶ��value
 * 			4��Map�ӿ��ж�����һ���ڲ��ӿ�
 * 		��Ա������
 * 			��1������������Mapʵ������һ���ӿڣ��������������ܵĺ�����û�к����壬Ҳ�����ǵĺ����嶼�ǿյ�
 * 			��2��int size();//����Map�����е�key-value mapping����Ŀ������ܸ���>Integer.MAX_VALUE,��ô�ú����ķ���ֵ==Integer.MAX_VALUE
 * 			��3��boolean isEmpty();//�����Ƿ�Ϊ��
 * 			��4��boolean containsKey(Object key);//����Map�������Ƿ��в�����ָ���ļ�ֵ
 * 			��5��boolean containsValue(Object value);//����Map�������Ƿ��иú����Ĳ�����ָ����value�������ж��key����Ӧ�ڸ�valueŶ��
 * 			��6��V get(Object key);//����key��Ӧ��value����������û�иü�ֵ���򷵻�null
 * 								//���Ƿ���ֵΪnull�����������һ��Map�����б���û�и�key;����Map�������и�key�����Ǹ�keyԭ������Ӧ��value����null
 * 			��7��V put(K key, V value);//������������µ�key-value�ԣ�������Map�����б����Ѿ�������Ӧ��key����ôԭ����value��������
 * 								//���ԭ�����и�key����ô�ú����ķ���ֵ�Ǹ�keyԭ����Ӧ��valueֵ
 * 								//���������ԭ��û�и�key���߸�keyԭ����Ӧ��ֵΪnull,��ô�ú����ķ���ֵ��null
 * 			��8��V remove(Object key);//ɾ��Map�����еĸü�ֵ�ԣ�������key���ڣ��򷵻�ֵ�Ǹ�key����Ӧ��value
 * 								//���Map�����б����û�иü�ֵ�Ի��߸�key����Ӧ��value�����==null,��ú����ķ���ֵ��null
 * 			��9��void putAll(Map<? extends K, ? extends V> m);//����һ��Map���Ϸ�����Map����
 * 			��10�� void clear();//��ո�Map����
 * 			��11��Set<K> keySet();//���ظ�Map����������key����ɵ�Set���͵ļ���
 * 								//����ͨ��key����ɵ�Set���͵ļ��ϵ���<tt>Iterator.remove</tt>, <tt>Set.remove</tt>,
 * 								//<tt>removeAll</tt>, <tt>retainAll</tt>, and <tt>clear</tt> operations.
 * 								//������������ɾ��Map��������Ӧ��key-value��
 * 								//����ͨ��key����ɵ�Set���ϵ��� <tt>add</tt> or <tt>addAll</tt> operations.������Map����
 * 			��12��Collection<V> values();//���ظ�Map����������value�����ɵ�Collection����
 * 								//The collection supports element removal, which removes the corresponding
 * 								// mapping from the map, via the <tt>Iterator.remove</tt>,
 * 								// <tt>Collection.remove</tt>, <tt>removeAll</tt>,
 * 								// <tt>retainAll</tt> and <tt>clear</tt> operations.  It does not
 * 								// support the <tt>add</tt> or <tt>addAll</tt> operations.
 * 			��13��Set<Map.Entry<K, V>> entrySet();//�����������Map�����д��ڵ�����key-value mapping
 *  							//The Set supports element removal, which removes the corresponding
 * 								// mapping from the map, via the <tt>Iterator.remove</tt>,
 * 								// <tt>Set.remove</tt>, <tt>removeAll</tt>,
 * 								// <tt>retainAll</tt> and <tt>clear</tt> operations.  It does not
 * 								// support the <tt>add</tt> or <tt>addAll</tt> operations.
 *"Map�ӿ��ж����inner private interface"��14��interface Entry<K,V> 
 *			��15��boolean equals(Object o);//�ж�����Map�����Ƿ�����ͬ��Map����
 *			��16��int hashCode();//���ظ�Map��������Ӧ��hashCode��
 *						//�������Map���϶�Ӧ��equals()�����ķ���ֵΪtrue����ô������Map���ϵ�hashCode��һ�����
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
