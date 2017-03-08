/**
 * @author lxrm
 * @date 20170307
 * @description ��������java.util.List�ӿڵ��÷�
 * java.util.List
 * 		������
 * 			1)List�ӿ���Collection�ӿڵ��ӽӿڣ�����List�ӿ�ӵ��Collection�ӿ�����������г�Ա����
 * 			      �������丸�ӿ�Collection������������к���֮�⣬List�ӿ�Ҳ������Լ��ĺ�����ʹ��List����ӵ���Լ�����ɫ
 * 			  List�ӿ�������ӵĺ����У�a)���ڸ����������ʼ���Ԫ�صĳ�Ա����
 * 								 b)���� ListIterator����ĳ�Ա������Collection�ӿ��ж�����һ������Iterator����ĺ�����
 * 								   List�ӿ��г��˿��Ի��Iterator�����⣬�����Ի��ListIterator���󣬿����Ը��෽ʽ����List����Ԫ�أ�
 * 			2)List���������ظ���Ԫ��
 * 					Set�����в��ܽ��Լ���Ϊ�Լ���Ԫ�أ�it is not permissible for a set to contain itself as an element.��
 * 					List�����о������Լ����Լ���Ԫ�أ�it is permissible for a List to contain itself as an element.��
 * 			3��List������Ԫ����һ����˳�򣬼�����Ԫ��˳����Ǹ���Ԫ�ر������˳��
 * 			4��List��������ʹ�����������ʼ����е�Ԫ��
 * 		���캯����
 * 			java�����нӿ�û�й��캯��
 * 		��Ա������
 * 		      	��1������������List��һ���ӿڣ������������к�������û�к�����ģ�Ҳ��û��ʵ�ʵĴ����
 * 					������List�ӿڼ̳���java.util.Collection�ӿڣ�����List�ӿں���Collection�ӿڶ�������к���
 * 					�������г��Ķ���List�ӿ��еĺ����������ر�˵����������Ӧ�ĺ������Ǵ�Collection�ӿ��м̳ж�����
 * 					���ˡ�List�ӿ�����Ӻ�������ע�ģ�����List�ӿڸ���List������������ӵĳ�Ա����������͹��List���ϵ���ɫ����
 * 				��2��int size();//���ؼ�����Ԫ�ظ��������Ԫ�ظ���>Integer.MAX_VALUE,��ô�ú����ķ���ֵ==Integer.MAX_VALUE
 * 				��3��boolean isEmpty();//�����Ƿ�Ϊ��
 * 				��4��boolean contains(Object o);//�������Ƿ����Ԫ��o:Object
 * 				��5��Iterator<E> iterator();//���ؿ��Ա����ü���������Ԫ�ص�һ������������Iterator����
 * ��List�ӿ�����Ӻ�������5.1��ListIterator<E> listIterator();//����һ��ListIterator���������������Iterator�����ڱ���List����
 * ��List�ӿ�����Ӻ�������5.2��ListIterator<E> listIterator(int index);//�͡�5.1���к����������ƣ�
 * 									//ֻ��������������ص�ListIterator��nextָ���Ѿ�ָ����List������index:intλ��
 * 									//֮�� An initial call to {@link ListIterator#next next}.���᷵��List������indexλ�õ�Ԫ��
 *									// An initial call to {@link ListIterator#previous previous} ���᷵��List������index-1λ���ϵ�Ԫ��
 * 				��6��Object[] toArray();//������ת���һ������
 * 				��7��<T> T[] toArray(T[] a);//��������͡�6���������ĺ����������ƣ���������������ж���Ĺ���
 * 					���ܣ�	����������˽�����ת��������֮��
 * 							��ʵ�ּ���Ԫ���������� �� ����Ԫ���������͵�ת����������Ԫ����ԭ������������ת��ɱ������Ĳ���a:T[]��������������͡���T��
 * 							���⣬��ָ���˺�������ֵ�ĳ��ȣ�����ֵ�ĳ��Ⱥͱ������Ĳ�������a:T[]�ĳ���һ�£�
 * 					@return ����ֵ(����)�����ݡ�������Ԫ��
 * 							����ֵ������Ԫ�ص��������͡����ͱ������Ĳ�����������һ��
 * 							����ֵ(����)�ĳ��ȡ����ͱ������Ĳ�������ĳ���һ�£�������Ԫ�ظ���С�ڲ�������a:T[]����ʱ��ʹ��null����λ�Ӷ�ʹ����ֵ���ȴﵽҪ��
 * 				��8��boolean add(E e);//�򼯺��������Ԫ�أ�����Ԫ����ӵ�List��ĩβ
 * 				��9��boolean remove(Object o);//�Ӽ�����ɾ��һ��Ԫ�أ�ɾ��List�����е�һ��o:Object,Ҳ����Ӧ�����±���С�Ĳ���Ԫ��o:Object��
 * 				��10��boolean containsAll(Collection<?> c);//�жϸü������Ƿ�������������е�����Ԫ��
 * 				��11��boolean addAll(Collection<? extends E> c);//�����������е�����Ԫ��׷�ӵ��ü��ϵ�ĩβ���൱��ȡ������
 *��List�ӿ�����Ӻ�������11.2��boolean addAll(int index, Collection<? extends E> c);//��������͡�11���к����������ƣ�ֻ����
 *													//��11���к����ǽ���������׷�ӵ��ü��ϵ�ĩβ�����������ǽ���������׷�ӵ��ü��ϵ�index��int��ʼ��λ��
 * 				��12�� boolean removeAll(Collection<?> c);//�������ִ�к󣬸ü����н����ٺ��в��������е��κ�һ��Ԫ�أ��൱�ڼ��������
 * 				��13�� boolean retainAll(Collection<?> c);//ִ���������֮�󣬸ü����н������ܺ��в��������в����ڵ�Ԫ�أ��൱��ȡ������
 *��List�ӿ�����Ӻ�������13.1��List<E> subList(int fromIndex, int toIndex);//���ظ�List���ϵ�һ���Ӽ�(������ֲ�����)
 * 				��14��void clear();//ִ�иú����󣬼��Ͻ���ɿյ�
 * 				��15�� boolean equals(Object o);//����o:ObjectҲ��һ�����ϣ�������������ж��������ϵ������Ƿ���ͬ
 * 												//�����ҽ�������Ԫ��������ͬ��size��ͬ����Ԫ��������ͬʱ����ֵ����true��
 * 				��16��int hashCode();//���ظü�������Ӧ��hashCode��
 * 					��ע������������ϵ�������ȫ��ͬ����ô���������϶�Ӧ��hashCode��Ҳһ����ͬ
 * 						������a.equals(b)==true����ôһ����a.hashCode()==b.hashCode()
 * 					���ϵ�hashCode���ǰ������¹�ʽ���������
 * 					* <pre>
     				*  int hashCode = 1;
     				*  for (E e : list)
     				*      hashCode = 31*hashCode + (e==null ? 0 : e.hashCode());
     				* </pre>
 *��List�ӿ�����Ӻ�������17��E get(int index);//����List�����ض�λ�ô���Ԫ��
 *��List�ӿ�����Ӻ�������18�� E set(int index, E element);//�滻List�������ض�λ�ô���Ԫ��
 *��List�ӿ�����Ӻ�������19��void add(int index, E element);//��List���ϵ��ض����������һ���µ�Ԫ��element:E�����ҽ���������ӦԪ��������
 *��List�ӿ�����Ӻ�������20��E remove(int index);//ɾ��List�������ض�λ�ô���Ԫ�أ�����ɾ����Ԫ����Ϊ����ֵ���أ����⣬���Ὣ������index:int�����Ԫ������
 *��List�ӿ�����Ӻ�������21��int indexOf(Object o);//����List������o:Object��һ�γ��ֵ�λ���±꣬���List������û�и�Ԫ���򷵻�-1
 *��List�ӿ�����Ӻ�������22��int lastIndexOf(Object o);//����o:Object��List���������һ�γ��ֵ�λ�ã����List������û�и�Ԫ���򷵻�-1
 *��List�ӿ�����Ӻ�������23��
 *��List�ӿ�����Ӻ�������24��
 *��List�ӿ�����Ӻ�������25��		    				
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
