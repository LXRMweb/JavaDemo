/**
 * @author lxrm
 * @date 20161113
 * @description 这个文件举例说明如何遍历集合中的元素*/
package java_api_dataStructure.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		list.add("向ArrayList对象list中添加的第一个字符串");
		for(int i=0;i<9;i++){
			list.add(Integer.toString(i));
		}
		//遍历集合中的元素
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
