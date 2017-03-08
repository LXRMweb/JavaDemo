/**
 * @author chen
 * @date 20170317
 * @description:��������Collection�ӿ�
 * java.util.Collection
 * 		������Collection�ӿ���Set��List�ӿڵĸ��ӿڣ�Collection�ӿ��ж�����һЩ
 * 			���ڼ���Ԫ�ز����ķ����������ӽӿ��Լ��ӽӿڵ�ʵ�������̳�
 * 		���캯��
 * 			java�нӿڲ����й��캯��
 * 		��Ա������
 * 			��1������������Collectionʵ������һ���ӿڣ��������������ܵĺ�����û�к����壬Ҳ�����ǵĺ����嶼�ǿյ�
 * 			��2��int size();//���ؼ�����Ԫ�ظ��������Ԫ�ظ���>Integer.MAX_VALUE,��ô�ú����ķ���ֵ==Integer.MAX_VALUE
 * 			��3��boolean isEmpty();//�����Ƿ�Ϊ��
 * 			��4��boolean contains(Object o);//�������Ƿ����Ԫ��o:Object
 * 			��5��Iterator<E> iterator();//���ؿ��Ա����ü���������Ԫ�ص�һ������������Iterator����
 * 			��6��Object[] toArray();//������ת���һ������
 * 			��7��<T> T[] toArray(T[] a);//��������͡�6���������ĺ����������ƣ���������������ж���Ĺ���
 * 					���ܣ�	����������˽�����ת��������֮��
 * 							��ʵ�ּ���Ԫ���������� �� ����Ԫ���������͵�ת����������Ԫ����ԭ������������ת��ɱ������Ĳ���a:T[]��������������͡���T��
 * 							���⣬��ָ���˺�������ֵ�ĳ��ȣ�����ֵ�ĳ��Ⱥͱ������Ĳ�������a:T[]�ĳ���һ�£�
 * 					@return ����ֵ(����)�����ݡ�������Ԫ��
 * 							����ֵ������Ԫ�ص��������͡����ͱ������Ĳ�����������һ��
 * 							����ֵ(����)�ĳ��ȡ����ͱ������Ĳ�������ĳ���һ�£�������Ԫ�ظ���С�ڲ�������a:T[]����ʱ��ʹ��null����λ�Ӷ�ʹ����ֵ���ȴﵽҪ��
 * 			��8��boolean add(E e);//�򼯺��������Ԫ��
 * 			��9��boolean remove(Object o);//�Ӽ�����ɾ��һ��Ԫ��
 * 			��10��boolean containsAll(Collection<?> c);//�жϸü������Ƿ�������������е�����Ԫ��
 * 			��11��boolean addAll(Collection<? extends E> c);//�����������е�����Ԫ����ӵ��ü����У��൱��ȡ������
 * 			��12�� boolean removeAll(Collection<?> c);//�������ִ�к󣬸ü����н����ٺ��в��������е��κ�һ��Ԫ�أ��൱�ڼ��������
 * 			��13�� boolean retainAll(Collection<?> c);//ִ���������֮�󣬸ü����н������ܺ��в��������в����ڵ�Ԫ�أ��൱��ȡ������
 * 			��14��void clear();//ִ�иú����󣬼��Ͻ���ɿյ�
 * 			��15�� boolean equals(Object o);//����o:ObjectҲ��һ�����ϣ�������������ж��������ϵ������Ƿ���ͬ
 * 			��16��int hashCode();//���ظü�������Ӧ��hashCode��
 * 					��ע������������ϵ�������ȫ��ͬ����ô���������϶�Ӧ��hashCode��Ҳһ����ͬ
 * 						������a.equals(b)==true����ôһ����a.hashCode()==b.hashCode()
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
