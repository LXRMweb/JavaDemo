/**
 * @author chen
 * @date 20170308
 * @description ��������java.util.Set�ӿڵĶ���
 * java.util.Set
 * 		������
 * 			1)Set�����в��������ظ���Ԫ��
 * 				���ֻ����һ��ֵΪnull��Ԫ��
 * 				Ҫ�ر�ע��Set�����е�Ԫ�أ����ı�ĳ��Ԫ�ص�ֵʱ��һ����Ҫʹ�øı��Ľ��������Ԫ����ͬ
 * 				Set�����в��ܽ��Լ���Ϊ�Լ���Ԫ�أ�it is not permissible for a set to contain itself as an element.��
 * 				List�����о������Լ����Լ���Ԫ�أ�it is permissible for a List to contain itself as an element.��
 * 			2)Set�ӿ���Collection�ӿڵ��ӽӿڣ�����Set�̳���Collection�ӿ�������������к���
 * 				Set�ӿ�û���¶�����������
 * 		��Ա�������壺
 * 			��1��������Set�ӿ���Collection�ӿڵ��ӽӿڣ�����Set�̳���Collection�ӿ�������������к���
 * 					�������г��ĺ����У�����������Ǵ�Collection�ӿڼ̳ж���
 * 					���˱�ע�С�Set�ӿ������Collection�ӿ������������ĳ�Ա������Set�ӿ����еĺ���֮��
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
 * 								//���������û�и�Ԫ�أ���ô��Ӹ�Ԫ�أ����ҷ���true
 * 								//����������Ѿ����˸�Ԫ�أ���ô�������������ı�����Set���ϣ����ҷ���ֵΪfalse
 * 			��9��boolean remove(Object o);//�Ӽ�����ɾ��һ��Ԫ��
 * 			��10��boolean containsAll(Collection<?> c);//�жϸü������Ƿ�������������е�����Ԫ��
 * 			��11��boolean addAll(Collection<? extends E> c);//�����������е�����Ԫ����ӵ��ü����У��൱��ȡ������
 * 			��12�� boolean removeAll(Collection<?> c);//�������ִ�к󣬸ü����н����ٺ��в��������е��κ�һ��Ԫ�أ��൱�ڼ��������
 * 			��13�� boolean retainAll(Collection<?> c);//ִ���������֮�󣬸ü����н������ܺ��в��������в����ڵ�Ԫ�أ��൱��ȡ������
 * 			��14��void clear();//ִ�иú����󣬼��Ͻ���ɿյ�
 * 			��15�� boolean equals(Object o);//����o:ObjectҲ��һ�����ϣ�������������ж�����Set���ϵ������Ƿ���ͬ
 * 								//���ҽ�������Set���ϵ�size��ͬ����һ�������е�����Ԫ��ǡ�ö�����һ�������п����ҵ���������Ҳ������ʱ������ֵ��true
 * 								//Ҳ��ֻҪ����Set���ϻ��������������Ԫ��˳�򣩣��ú����ķ���ֵ����true
 * 			��16��int hashCode();//���ظ�Set��������Ӧ��hashCode��
 * 					��ע������������ϵ�������ȫ��ͬ����ô���������϶�Ӧ��hashCode��Ҳһ����ͬ
 * 						������a.equals(b)==true����ôһ����a.hashCode()==b.hashCode()
 * ��Set�ӿ������Collection�ӿ������ĺ�����
 * 			û�������ĺ���
 * 			Set�ӿ�û���Զ���ĺ��������Ա�������Ǵ�java.util.Collection�ӿڼ̳ж���
 * 			*/
package javaAPI_dataStructure;

import java.util.HashSet;
import java.util.Set;

public class JavaAPI_Set {
	public static void main(String[] args){
		Set set=new HashSet();
	}
}
