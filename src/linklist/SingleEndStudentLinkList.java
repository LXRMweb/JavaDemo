/*auth:lxrm
 * date:20160810
 * fuction: 以StudentLink为节点的单向链表
 * 编程思路：
 * 		类成员变量，firstLink--->存储链表的第一个节点的地址
 * 		构造函数，初始化类成员变量，使firstLink=null
 * 		成员函数，如insertFirst()函数*/
package linklist;

import POJO.Student;

public class SingleEndStudentLinkList {
	private StudentLink firstLink;
	public SingleEndStudentLinkList(){
		firstLink=null;
	}
	
	//在链表头部插入新节点
	/*编程思路：
	 * 		step1:将待插入数据包裹成   节点
	 * 		step2：使得新插入的节点指向原来链表的头部节点（即让新节点的next指向原来链表的firstLink）
	 * 		step3: 更新新链表的头部节点（即令firstLink=新插入的节点）*/
	public void insertFirst(Student stu){
		StudentLink newLink=new StudentLink(stu);//step1:将待插入数据包裹成   节点
		newLink.next=firstLink;//step2：使得新插入的节点指向原来链表的头部节点（即让新节点的next指向原来链表的firstLink）
		firstLink=newLink;//step3: 更新新链表的头部节点（即令firstLink=新插入的节点）
	}
	//在“指定节点”后面插入新的节点
	/*@param:stuId,"指定节点”的学生学号
	 * 		 stu,待插入的数据*/
	public void insertAfterByKey(String stuId,Student stu){
		StudentLink newLink=new StudentLink(stu);//step1，将待插入数据包裹成节点类对象
		StudentLink tmp=this.findLinkByKey(stuId);//step2,在现有链表中查找指定节点
		//step3:根据“指定节点”的查找结果进行后续操作
		if(tmp==null){
			System.out.println("没有在当前链表中查找到stuId="+stuId+"的节点，操作失败！");
			return;
		}else{
			newLink.next=tmp.next;
			tmp.next=newLink;
			return;
		}	
	}
	//删除链表中第一个节点
	public StudentLink deleteFirst(){
		if(this.isEmpty()){
			System.out.println("链表本身就为空，删除第一个节点的操作失败");
			return null;
		}else{
			StudentLink tmp=firstLink;
			firstLink=firstLink.next;
			return tmp;
		}
	}
	//链表中查找指定stuId的节点，并且删除所查到的第一个元素
	//@return 查到符合条件的元素时返回该元素，链表为空或者没有查找到相应元素时返回值为null
	/*编程思路：
	 * 		分情况讨论，链表为空时
	 * 				链表不为空时     且firstLink是符合条件的节点    需要修改firstLink的值
	 * 				链表不为空时     且firstLink不是符合条件的节点    */
	public StudentLink deleteLinkByKey(String stuId){
		StudentLink tmp=firstLink;
		StudentLink previous=firstLink;
		if(!this.isEmpty()){
			if(firstLink.student.getId().equals(stuId)){//判断第一个节点是否为符合条件的元素
				firstLink=firstLink.next;//若是，则需要修改firstLink
				return tmp;
			}else{
				tmp=firstLink.next;//若第一个节点不是符合条件的节点，则由第二个节点继续往下查找
				while(tmp!=null){
					if(tmp.student.getId().equals(stuId)){
						previous.next=tmp.next;
						return tmp;
					}
					previous=tmp;
					tmp=tmp.next;
				}
				return null;//整个非空链表中都没有找到符合条件的元素时，返回值为null
			}
		}else{
			System.out.println("链表为空，删除相应节点的操作失败");
			return null;
		}
	}
	//根据关键字查找对应的节点，若是没有找到则返回值为null,否则返回相应的节点
	public StudentLink findLinkByKey(String stuId){
		StudentLink tmp=firstLink;
		while(tmp!=null){
			if(tmp.student.getId().equals(stuId)){
				System.out.println("链表中有相应的节点");
				tmp.displayLink();
				return tmp;
			}
			tmp=tmp.next;
		}
		System.out.println("没有符合条件的元素");
		return null;
	}
	//后台输出链表中所有节点的内容
	public void displayList(){
		if(this.isEmpty()){
			System.out.println("链表为空");
			return;
		}else{
			System.out.println("链表所有节点：");
			StudentLink currentLink=firstLink;
			while(currentLink!=null){
				currentLink.displayLink();
				currentLink=currentLink.next;
			}
			return;
		}
	}
	//判断链表是否为空
	public boolean isEmpty(){
		return firstLink==null;
	}
}
