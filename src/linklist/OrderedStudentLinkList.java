/*auth:lxrm
 * date:20160816
 * function:有序链表    按照关键值有序排列
 * 			链表节点中数据为Student型     按照Student的id属性值排列(链表头部id值较小)*/
package linklist;

import POJO.Student;

public class OrderedStudentLinkList {
	private StudentLink firstLink;
	public OrderedStudentLinkList(){
		firstLink=null;
	}
	/*向链表中插入新的节点，（按照顺序插入，也即使得形成的链表越靠进头部的位置stuId越小）*/
	public void insertByOrder_firstMin(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1:数据包裹成链表节点格式
		StudentLink current=firstLink;
		StudentLink previous=null;
		//step2:查找应该插入的位置
		while(current!=null&&current.student.getId().compareTo(stu.getId())<0){
			previous=current;
			current=current.next;
		}
		/*step3：根据查找结果分类讨论
		 * 		1)当要插入的节点在firstLink前面时
		 * 		2)当要插入的节点不在firstLink前面时*/
		if(previous==null){
			firstLink=newLink;
		}else{
			previous.next=newLink;
		}
		newLink.next=current;
	}
	/*向链表中插入新的节点，（按照顺序插入，也即使得形成的链表越靠进头部的位置stuId越大）*/
	public void insertByOrder_firstMax(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1:将数据包裹成节点对象
		StudentLink current=firstLink;
		StudentLink previous=null;
		while(current!=null){//step2：查找待插入的位置
			if(current.student.getId().compareTo(stu.getId())<0){
				break;
			}
			previous=current;
			current=current.next;
		}
		//step3：根据step2的结果分情况讨论
		if(previous==null){//待插入位置在firstLink前面时
			newLink.next=firstLink; 
			firstLink=newLink;
		}else{//待插入位置不是在firstLink前面时
			previous.next=newLink;
			newLink.next=current;
		}
	}
	//删除链表头部元素
	/*@return StudentLink :返回删除的节点对象的地址*/
	public StudentLink deleteFirst(){
		StudentLink tmp=firstLink;
		firstLink=firstLink.next;
		return tmp;
	}
	//判断链表是否为空
	public boolean isEmpty(){
		return firstLink==null;
	}
	//后台打印链表中所有节点
	public void displayList(){
		if(this.isEmpty()){
			System.out.println("当前链表为空");
		}else{
			StudentLink tmp=firstLink;
			while(tmp!=null){
				tmp.displayLink();
				tmp=tmp.next;
			}
		}
	}
}
