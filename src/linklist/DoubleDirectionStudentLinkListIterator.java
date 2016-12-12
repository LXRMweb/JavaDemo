/*auth:lxrm
 * date:20160817
 * function：链表类的迭代器类
 * 			使用该迭代器类就可以在XxxLinkList链表类之外的地方（如main函数中或者其他类中）访问操作链表的各个节点
 * */
package linklist;

public class DoubleDirectionStudentLinkListIterator {
	private DoubleDirectionStudentLink previous;//存放当前节点的前一个节点的地址
	private DoubleDirectionStudentLink current;//存放当前节点地址
	private DoubleDirectionStudentLinkList linkList;
	//构造函数：初始化链表迭代器
	//使得current指向链表的firstLink第一个节点，previous=null
	public DoubleDirectionStudentLinkListIterator(DoubleDirectionStudentLinkList list){
		linkList=list;
		this.reset();
	}
	public void reset(){
		current=linkList.getFirstLink();
		previous=null;
	}
	public boolean isEnd(){
		return current.next==null;
	}
	public void nextLink(){
		previous=current;
		current=current.next; 
	}
	public DoubleDirectionStudentLink getCurrent(){
		return current;
	}
}
