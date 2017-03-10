/**
 * @author lxrm
 * @date 20161113
 * @description 这个文件举例说明如何遍历集合中的元素*/
package javaAPI_dataStructure;

import java.util.Iterator;
import java.util.Vector;

public class Application2_IteratVector {
	public static void main(String[] args){
		Vector vector=new Vector();
		for(int i=0;i<8;i++){
			vector.addElement(Integer.toString(i));
		}
		//遍历集合中的元素
		Iterator iterator=vector.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
