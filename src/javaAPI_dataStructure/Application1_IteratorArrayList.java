/**
 * @author lxrm
 * @date 20161113
 * @description ����ļ�����˵����α��������е�Ԫ��*/
package javaAPI_dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class Application1_IteratorArrayList {
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		list.add("��ArrayList����list�����ӵĵ�һ���ַ���");
		for(int i=0;i<9;i++){
			list.add(Integer.toString(i));
		}
		//���������е�Ԫ��
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}