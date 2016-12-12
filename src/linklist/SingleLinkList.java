/*auth:lxrm
 * date:2016.08.10
 * function:单向链表
 * 编程思路：
 * 		成员变量，   只有一个成员变量   firstLink(链表头部节点)
 * 		构造函数，
 * 		成员方法，isEmpty()判断链表是否为空
 * 				insertFirst()在链表头部插入一个节点
 * 				deleteFirst()删除链表头部的节点
 * 				deleteLink(String key)删除指定节点
 * 				findLink(string key)根据关键字查找指定节点
 * 				displayLinkList()*/
package linklist;

public class SingleLinkList {
	private Link firstLink;//链表头部节点
	public SingleLinkList(){
		firstLink=null;//此句话可以省略，因为类对象型的成员变量默认赋值为null
	}
	//判断链表是否为空
	public boolean isEmpty(){
		return (firstLink==null);
	}
	//链表头部插入一个节点
	public void insertFirst(String key,int intData,String str){
		Link newlink=new Link(key,intData,str);
		newlink.next=firstLink;
		firstLink=newlink;
	}
	//删除链表头部的节点
	/*@return boolean:链表为空时，返回值为false，表示操作失败
	 * 					链表不为空时，返回值为true，表示操作成功*/
	public boolean deleteFirst(){
		if(this.isEmpty()){
			System.out.println("链表为空！");
			return false;//链表为空时，返回值为false，表示操作失败
		}else{
			Link tmp=firstLink;
			firstLink=tmp.next;
			return true;
		}
	}
	//删除关键字对应的节点(删除所有  关键字==key的值   的链表节点)
	/*@param key:待删除节点的关键字
	 * @return boolean:链表为空时返回值为false，表示操作失败
	 * 				链表不为空时查找并删除链表中所有相应节点并返回true*/
	public boolean deleteLink(String key){
		if(this.isEmpty()){
			System.out.println("链表为空");
			return false;
		}else{
			Link current=firstLink;
			if(firstLink.key.equals(key)){
				firstLink=firstLink.next;
			}
			while(current.next!=null){
				if(current.next.key.equals(key)){
					Link tmp=current.next;
					current.next=tmp.next;
				}
				current=current.next;
			}
			return true;
		}
	}
	/*查找关键字key对应的节点(只查找出第一个符合条件的节点)
	 * @return Link :链表为空或者链表不为空但是没有查找到相应元素时返回值为null
	 * 				*/
	public Link findLink(String key){
		if(this.isEmpty()){
			System.out.println("链表为空");
			return null;
		}else{
			Link current=firstLink;
			while(current!=null){
				if(current.key.equals(key)){
					return current;
				}else{
					current=current.next;
				}
			}
			System.out.println("链表不为空，但是没有查找到符合条件的链表元素");
			return null;//如果没有查找到符合条件的元素，返回值为null
		}
	}
	//后台输出链表所有节点的内容
	public void displayLinkList(){
		if(this.isEmpty()){
			System.out.println("链表为空");
			return;
		}else{
			Link current=firstLink;
			System.out.println("链表所有元素：");
			while(current!=null){
				current.displayLink();
				current=current.next;
			}
			return;
		}	
	}
	
}
