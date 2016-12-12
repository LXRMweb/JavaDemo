/*auth:lxrm
 * date:2016.08.10
 * function:��������
 * ���˼·��
 * 		��Ա������   ֻ��һ����Ա����   firstLink(����ͷ���ڵ�)
 * 		���캯����
 * 		��Ա������isEmpty()�ж������Ƿ�Ϊ��
 * 				insertFirst()������ͷ������һ���ڵ�
 * 				deleteFirst()ɾ������ͷ���Ľڵ�
 * 				deleteLink(String key)ɾ��ָ���ڵ�
 * 				findLink(string key)���ݹؼ��ֲ���ָ���ڵ�
 * 				displayLinkList()*/
package linklist;

public class SingleLinkList {
	private Link firstLink;//����ͷ���ڵ�
	public SingleLinkList(){
		firstLink=null;//�˾仰����ʡ�ԣ���Ϊ������͵ĳ�Ա����Ĭ�ϸ�ֵΪnull
	}
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty(){
		return (firstLink==null);
	}
	//����ͷ������һ���ڵ�
	public void insertFirst(String key,int intData,String str){
		Link newlink=new Link(key,intData,str);
		newlink.next=firstLink;
		firstLink=newlink;
	}
	//ɾ������ͷ���Ľڵ�
	/*@return boolean:����Ϊ��ʱ������ֵΪfalse����ʾ����ʧ��
	 * 					����Ϊ��ʱ������ֵΪtrue����ʾ�����ɹ�*/
	public boolean deleteFirst(){
		if(this.isEmpty()){
			System.out.println("����Ϊ�գ�");
			return false;//����Ϊ��ʱ������ֵΪfalse����ʾ����ʧ��
		}else{
			Link tmp=firstLink;
			firstLink=tmp.next;
			return true;
		}
	}
	//ɾ���ؼ��ֶ�Ӧ�Ľڵ�(ɾ������  �ؼ���==key��ֵ   ������ڵ�)
	/*@param key:��ɾ���ڵ�Ĺؼ���
	 * @return boolean:����Ϊ��ʱ����ֵΪfalse����ʾ����ʧ��
	 * 				����Ϊ��ʱ���Ҳ�ɾ��������������Ӧ�ڵ㲢����true*/
	public boolean deleteLink(String key){
		if(this.isEmpty()){
			System.out.println("����Ϊ��");
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
	/*���ҹؼ���key��Ӧ�Ľڵ�(ֻ���ҳ���һ�����������Ľڵ�)
	 * @return Link :����Ϊ�ջ�������Ϊ�յ���û�в��ҵ���ӦԪ��ʱ����ֵΪnull
	 * 				*/
	public Link findLink(String key){
		if(this.isEmpty()){
			System.out.println("����Ϊ��");
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
			System.out.println("����Ϊ�գ�����û�в��ҵ���������������Ԫ��");
			return null;//���û�в��ҵ�����������Ԫ�أ�����ֵΪnull
		}
	}
	//��̨����������нڵ������
	public void displayLinkList(){
		if(this.isEmpty()){
			System.out.println("����Ϊ��");
			return;
		}else{
			Link current=firstLink;
			System.out.println("��������Ԫ�أ�");
			while(current!=null){
				current.displayLink();
				current=current.next;
			}
			return;
		}	
	}
	
}
