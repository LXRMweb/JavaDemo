/*auth:lxrm
 * date:20160817
 * function��������ĵ�������
 * 			ʹ�øõ�������Ϳ�����XxxLinkList������֮��ĵط�����main�����л����������У����ʲ�������ĸ����ڵ�
 * */
package linklist;

public class DoubleDirectionStudentLinkListIterator {
	private DoubleDirectionStudentLink previous;//��ŵ�ǰ�ڵ��ǰһ���ڵ�ĵ�ַ
	private DoubleDirectionStudentLink current;//��ŵ�ǰ�ڵ��ַ
	private DoubleDirectionStudentLinkList linkList;
	//���캯������ʼ�����������
	//ʹ��currentָ�������firstLink��һ���ڵ㣬previous=null
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
