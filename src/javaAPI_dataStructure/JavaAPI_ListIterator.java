/**
 * @author chen
 * @date 20170310
 * @description ��������ListIterator�ӿڵ��÷�
 * java.util.ListIterator�ӿ�
 * 		������
 * 			1)ListIterator�ӿڼ̳���Iterator�ӿڣ�������ӵ��Iterator�ӿ��ж�������г�Ա����
 * 			2)Iterator���������������ͼ��ϵı���������ListIteratorֻ������List����ʵ�������͵ļ��ϵı���
 * 			3)����ListIterator��һ���ӿڣ������������г������к�������û�з������
 * 		���캯����
 * 			����ListIterator��һ���ӿڣ�������û�й��캯��
 * 		��Ա������
 * 			������������ListIterator�̳���Iterator�ӿڣ�������ӵ��Iterator�ӿ�������������г�Ա������
 * 				�������г��ĺ����У����С��̳���Iterator���ģ�����ʾ�ú��������丸�ӿ�Iterator�̳ж�����
 *���̳���Iterator�ӿڡ���1��boolean hasNext();//���List�����л�����һ��Ԫ���򷵻�true
 *���̳���Iterator�ӿڡ���2��E next();//���ؼ�������һ��Ԫ��
 *				        ��3��boolean hasPrevious();//�������List���ϵ�ʱ�����ǰ�滹��Ԫ�أ��ͷ���true
 *				        ��4��E previous();//��ϡ�3���к���������List���ϵķ������������������ڷ������ʱ���ؼ���Ԫ�ص�ֵ
 *				        ��5��int nextIndex();//������һ��Ԫ�ص�����,����ֵȡֵ��ΧΪ1~List.size()
 *				        ��6��int previousIndex();//����ǰһ��Ԫ�ص�����������ֵȡֵ��ΧΪ-1~List.size()-2
 *���̳���Iterator�ӿڡ���7��void remove();//ɾ������Ԫ��
 *				        ��8��void set(E e);//�滻�����е�Ԫ��
 *					��9��void add(E e);//�ڵ�ǰ����λ�õ�ǰ��һ��λ��    ����   ��ǰ����λ�õĺ���һ��λ��    ���һ���µ�Ԫ�ص�������
 *									  //�������ڵ�ǰ����λ�õ� ֮ǰ ���� ֮�� �����Ԫ�أ���Ҫ����������˳��������ǵ������
 *									//�����{@link #next}����Ҫ�ڵ�ǰλ�õ�ǰһ��λ�ô�����
 *									//�����{@link #previous}������Ҫ�ڵ�ǰλ�õĺ�һ��λ�ô�����
*/
package javaAPI_dataStructure;

public class JavaAPI_ListIterator {

}
