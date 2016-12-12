/*auth:lxrm
 * date:20160812
 * function:双端链表
 * 			节点中存储的数据是Student对象*/
package linklist;

import POJO.Student;

public class DoubleEndStudentLinkList {
	private StudentLink firstLink;
	private StudentLink lastLink;
	public DoubleEndStudentLinkList(){
		firstLink=null;
		lastLink=null;
	}
	
	/*****************成员方法****************/
	
	//在链表头部插入新节点
		/*编程思路：
		 * 		step1:将待插入数据包裹成   节点
		 * 		step2：使得新插入的节点指向原来链表的头部节点（即让新节点的next指向原来链表的firstLink）
		 * 		step3: 更新新链表的头部节点（即令firstLink=新插入的节点）
		 * 		step4:更新链表尾部节点（只有插入新节点之前的链表为空的情况下需要更新）
		 * 编程易错点一：一定要将step4放在step2前面，否则你插入了新节点后他就不是空链表了*/
	public void insertFirst(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1,将待插入数据包裹成链表节点类对象
		if(this.isEmpty()){
			lastLink=newLink;//step4
		}
		newLink.next=firstLink;//step2
		firstLink=newLink;//step3
	}
	//链表尾部插入新节点
	/*编程思路：
	 * 	 编程易错点一：一定要将step2放在step3前面，否则你插入了新节点后他就不是空链表了
	 * 	编程易错点一：注意step3，一定要在else语句中，（也即step3只有在链表非空的时候才能执行，否则将抛出“空指针异常”）*/
	public void insertLast(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1:包裹
		if(this.isEmpty()){
			firstLink=newLink;//step2:更新链表头部节点值
		}else{
			lastLink.next=newLink;//step3:尾部插入新节点
		}
		lastLink=newLink;
	}
	//删除链表头部节点
	/*编程思路：分类讨论  链表为空 /链表中只有一个节点/链表有两个或者两个以上节点
	 * 编程易错点一：要注意链表中只有一个节点的情况，除了操作firstLink之外，还要将lastLink赋值为null*/
	public StudentLink deleteFirst(){
		if(this.isEmpty()){
			System.out.println("链表为空，操作失败");
			return null;
		}else if(firstLink.next==null){//链表中只有一个节点的情况
			lastLink=null;
		}
			StudentLink tmp=firstLink;//待删除的节点
			firstLink=firstLink.next;
			return tmp;
	}
	//后台打印输出链表所有节点数据值
	public void displayList(){
		StudentLink current=firstLink;
		System.out.println("链表中所有节点：");
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
	}
	//判断链表是否为空
	public boolean isEmpty(){
		return firstLink==null;
	}
}
