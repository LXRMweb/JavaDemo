/**
 * @author lxrm
 * @date 20161113
 * @description ����ļ�����TreeSet����������
 * ������
 * 		1.�����TreeSet���е�Ԫ�ػ��Զ��ź���
 * 		2.TreeSet�����в��������nullֵ*/
package javaAPI_dataStructure;

import java.util.TreeSet;

public class Eaxmple7_Use_TreeSet {
	public static void main(String[] args){
		TreeSet set=new TreeSet();
		set.add(12);
		set.add(34);
		set.add(23);
		System.out.println(set);//�����[12, 23, 34]
								//����������Ѿ�������ź���
	}
}
