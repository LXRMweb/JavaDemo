/*auth:lxrm
 * date:20160817
 * function:双向链表（既是双端链表又是双向链表）*/
package linklist;

import POJO.Student;

public class DoubleDirectionStudentLinkList {
	private DoubleDirectionStudentLink firstLink;
	private DoubleDirectionStudentLink lastLink;
	public DoubleDirectionStudentLinkList(){
		firstLink=null;
		lastLink=null;
	}
	//在链表头部插入新节点
	/*@param Student:待插入数据
	 * @return void
	 * 
	 * 编程思路：*/
	public void insertFirst(Student stu){
		DoubleDirectionStudentLink newLink=new DoubleDirectionStudentLink(stu);
		if(this.isEmpty()){
			firstLink=newLink;
			lastLink=newLink;
		}else{
			firstLink.previous=newLink;//step1
			newLink.next=firstLink;//step2
			firstLink=newLink;//step3
		}
	}
	//在链表尾部插入新节点
	public void insertLast(Student stu){
		DoubleDirectionStudentLink newLink=new DoubleDirectionStudentLink(stu);
		if(this.isEmpty()){
			firstLink=newLink;
			lastLink=newLink;
		}else{
			lastLink.next=newLink;
			newLink.previous=lastLink;
			lastLink=newLink;
		}
	}
	//在指定的节点   后面   插入新的节点
	/*@param  key_stuId:指定节点的关键字的值，在该节点后面插入新的节点
	 * @param stu:待插入的data
	*/
	public void insertAfter(String key_stuId,Student stu){
		DoubleDirectionStudentLink newLink=new DoubleDirectionStudentLink(stu);
		if(this.findLink(key_stuId)==null){
			System.out.println("链表中没有指定节点，即没有stuId="+key_stuId+"的节点，操作失败！");
			return;
		}else{
			DoubleDirectionStudentLink keyLink=this.findLink(key_stuId);
			if(keyLink==lastLink){
				lastLink.next=newLink;
				newLink.previous=lastLink;
				lastLink=newLink;
				return;
			}else{
				newLink.previous=keyLink;
				newLink.next=keyLink.next;
				keyLink.next.previous=newLink;
				keyLink.next=newLink;
				return;
			}
		}
	}
	//查找指定关键字的节点
	//@return DoubleDirectionStudentLink对象：当查找到指定节点时返回值为指定节点地址，未查找到时返回值为null
	public DoubleDirectionStudentLink findLink(String key_stuId){
		DoubleDirectionStudentLink current=firstLink;//从firstLink开始查找
		DoubleDirectionStudentLink tmp=null;//存储查询结果
		while(current!=null){
			if(current.stu.getId().equals(key_stuId)){
				tmp=current;
				break;
			}
			current=current.next;
		}
		return tmp;
	}
	//删除链表头部元素，可以用于从链表头部开始遍历整个链表
	public DoubleDirectionStudentLink deleteFirst(){
		if(this.isEmpty()){
			System.out.println("链表为空，删除头部元素的操作失败！");
			return null;
		}else if(firstLink.next==null){//链表中只有一个元素的情况
			lastLink=null;
		}
		DoubleDirectionStudentLink tmp=firstLink;
		firstLink=firstLink.next;
		if(firstLink!=null){
			firstLink.previous=null;
		}
		return tmp;
	}
	//删除链表尾部元素，并返回北山去的节点的地址
	public DoubleDirectionStudentLink deleteLast(){
		if(this.isEmpty()){
			System.out.println("链表为空，删除头部元素的操作失败！");
			return null;
		}else if(lastLink.previous==null){//链表中只有一个节点的情况
			firstLink=null;
		}
		DoubleDirectionStudentLink tmp=lastLink;
		lastLink=lastLink.previous;
		if(lastLink!=null){
			lastLink.next=null;
		}
		return tmp;
	}
	public boolean isEmpty(){
		return firstLink==null;
	}
	//遍历函数:依次输出从链表头部到尾部的元素
	public void displayForward(){
		DoubleDirectionStudentLink current=firstLink;
		System.out.println("链表中所有元素：链表头部--->链表尾部");
		while(current!=null){
			current.dispalyLink();
			current=current.next;
		}
	}
	//遍历函数:依次输出从链表尾部到头部的元素
	public void displayBackword(){
		DoubleDirectionStudentLink current=lastLink;
		System.out.println("链表中所有元素：链表尾部部--->链表头部");
		while(current!=null){
			current.dispalyLink();
			current=current.previous;
		}
	}
	//获取该XxxLinkList类的迭代器类对象
	public DoubleDirectionStudentLinkListIterator getIterator(){
		return new DoubleDirectionStudentLinkListIterator(this);//this代表本linkList
	}
	//setter、getter
	public void setFirstLink(DoubleDirectionStudentLink link){
		this.firstLink=link;
	}
	public DoubleDirectionStudentLink getFirstLink(){
		return this.firstLink;
	}	
}
