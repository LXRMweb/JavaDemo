/**
 * @author lxrm
 * @date 20161113
 * @description ����ļ�����˵����α��������е�Ԫ��*/
package javaAPI_dataStructure;

import java.util.Iterator;
import java.util.Vector;

public class Application2_IteratVector {
	public static void main(String[] args){
		Vector vector=new Vector();
		for(int i=0;i<8;i++){
			vector.addElement(Integer.toString(i));
		}
		//���������е�Ԫ��
		Iterator iterator=vector.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
