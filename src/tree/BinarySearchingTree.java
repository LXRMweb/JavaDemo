/**author��lxrm
 * date:20160927
 * function:����������(Tree�࣬�����һ������������������нڵ�)
 * 				���������Ǹ���������
 * 				������������ӽڵ�ؼ�ֵ<���ڵ�ؼ�ֵ<���ӽڵ�ؼ�ֵ��
 * 				������Σ�����������������������������Ļ����������������п��ܱ�ɲ�ƽ�������ߺ��в�ƽ������������һ������Ч�ʾͻ��úܵ�
 * ���˼·����ʹ�����ӵķ�ʽ���������鷽ʽ��
 * 		��Ա����
 * 			ֻ��һ����Ա���� root:Node
 * 		���캯��
 * 		��Ա����
 * 			��insertNode()
 * 			findNode(String key)
 * 			deleteNode()
 * 			��������*/
package tree;

import POJO.Student;

public class BinarySearchingTree {
	Node root;
	public BinarySearchingTree(){
		root=null;//��ʼ�����õ�һ��������û���κνڵ�
	}
	/**
	 * @description:�����в���һ���ڵ�
	 * @param id:String ������ڵ�Ĺؼ��ֵ�ֵ
	 * @param data:double ������ڵ���������ͨ�������ͣ�
	 * @param stu:Student ������ڵ�������POJO�����������ݣ�
	 * ���˼·��
	 * 		step1�������������ݷ�װ�����ڵ����Node����
	 * 		step2���ж����Ƿ�Ϊ�գ���Ϊ�գ�root=newNode��������Ϊ��ת��step3
	 * 		step3������Ϊ�յ�״���£�ÿ��Ҫ�����µĽڵ�ʱ����Ҫ���ҵ�newNodeӦ�ò����λ�ã��Ӹ��ڵ㿪ʼ���ң�
	 * 					�Ӹ��ڵ㿪ʼ���Ҵ�����λ��
	 * 					������λ��һ������������һ����Ҷ�ӽڵ㡱
	 * 					�����½ڵ�====��newNode�趨Ϊ���ҵ���Ҷ�ӽڵ�����ӽڵ�������ӽڵ�
	 */
	public void insert(String key,double data,Student stu){
		Node newNode=new Node(key,data,stu);//step1:�����ݷ�װ��Node�������ڵ����
		if(root==null){
			root=newNode;//step2���ж����Ƿ�Ϊ�գ���Ϊ�յ�ʱ�򣬸ýڵ���Ϊ���ڵ㣬����ת��step3
		}else{//step3������Ϊ�յ�ʱ�򣬲����½ڵ�Ӧ�ò����λ��(ÿ�ζ��Ӹ��ڵ㿪ʼ����)��Ȼ������½ڵ�
			Node current=root;//ÿ�ζ��Ӹ��ڵ㿪ʼ����     �������µĽڵ�Ӧ�ò����λ�ã�
			Node parent=null;
			//ʹ������whileѭ���ҵ�������λ�á�(parent�ڵ㼴Ϊ������ڵ�ĸ��ڵ�)
			while(current!=null){
				parent=current;
				if(newNode.getKey().compareTo(current.getKey())<0){
					current=current.getLeftChild();
				}else{
					current=current.getRightChild();
				}
			}
			if(newNode.getKey().compareTo(parent.getKey())<0){
				parent.setLeftChild(newNode);
			}else{
				parent.setRightChild(newNode);
			}
		}
		
	}
	/**
	 * @description:ɾ����������ĳ���ڵ�
	 * @param key:String ��ɾ���ڵ�Ĺؼ��ֵ�ֵ
	 * ���˼·��
	 * step1,��ǰ������Ϊ��ʱֱ���˳�deleteNode()��������������Ϊ��ʱ���ڵ�ǰ�����������в��Ҷ�Ӧ�Ľڵ�
	 * step2,���ݲ��ҽ������һ�����������ڷǿն�������û�в��ҵ���Ӧ�ڵ㣬��ֱ���˳�deleteNode()����
	 * 		���ǲ��ҵ���Ӧ�Ľڵ㣬���һ���ֳ���������ֱ���
	 * 			���һ����ɾ���ڵ���Ҷ�ӽڵ�ʱ��ֻ�轫���ڵ����Ӧ������Ϊnull����
	 * 					���ڵ��Ǹ��ڵ�ʱ
	 * 					��ɾ���ڵ��Ǹ��ڵ�����ӽڵ�ʱ
	 * 					��ɾ���ڵ��Ǹ��ڵ�����ӽڵ�ʱ
	 * 			���������ɾ���ڵ�������������߽���������ʱ
	 * 					��ɾ���ڵ��Ǹ��ڵ�ʱ
	 * 					��ɾ���ڵ����丸�ڵ�����ӽڵ�ʱ
	 * 					��ɾ���ڵ����丸�ڵ�����ӽڵ�ʱ
	 * 			���������ɾ���ڵ��������������������ʱ
	 * 				step3.1 ���Ҵ�ɾ���ڵ�ġ���̽ڵ㡱(Ҳ���������������нڵ��йؼ�ֵ�ȴ�ɾ���ڵ�ؼ�ֵ���ֱ��������нڵ�Ĺؼ�ֵ��С)
	 * 									  (��̽ڵ��Ǵ�ɾ���ڵ�ġ�����������С�ڵ㡱
	 * 									  (��̽ڵ�һ���Ǵ�ɾ���ڵ�����ӽڵ�        �������ӽڵ��������ڵ�
	 * 									  (��̽ڵ�һ��û�����ӽڵ�
	 * 				step3.2 ���ݺ�̽ڵ�ľ������������һ������
	 * 						�����һ��3.2.1����̽ڵ��Ǵ�ɾ���ڵ�����ӽڵ�
	 * 									step1�����Ƚ���ɾ���ڵ��滻�ɺ�̽ڵ㣨Ҳ����˵�ô�ɾ���ڵ�ĸ��ڵ�ָ���̽ڵ㣬ԭ����ָ���ɾ���ڵ�����ָ���ɾ���ڵ�ĺ�̽ڵ㣩
	 * 										����ɾ���ڵ��Ǹ��ڵ�ʱ
	 * 										����ɾ���ڵ㲻�Ǹ��ڵ�ʱ
	 * 											����ɾ���ڵ����丸�ڵ�����ӽڵ�ʱ�����丸�ڵ�����ӽڵ����ӵ���ɾ���ڵ�ĺ�̽ڵ�
	 * 											����ɾ���ڵ����丸�ڵ�����ӽڵ�ʱ�����丸�ڵ�����ӽڵ����ӵ���̽ڵ�
	 * 									step2����Σ�����ɾ���ڵ���������Ƶ���̽ڵ�����ӽڵ㴦��Ҳ����ʹ��ɾ���ڵ��������������̽ڵ����������
	 * 						���������3.2.2��̽ڵ��Ǵ�ɾ���ڵ�����ӽڵ��������ڵ�ʱ
	 * 									step1������̸��ڵ��leftChild�ֶ�ָ���̽ڵ�successor�����ӽڵ㣨Ҳ������̽ڵ��������ת�Ƶ����ô���λ�ã�
	 * 									step2������̽ڵ�successor��Node��rightChild�ֶ�ָ��Ҫɾ���ڵ�����ӽڵ㣨Ҳ������ɾ���ڵ��������ת�Ƶ���ȷ��λ�ã�
	 * 									step3������ɾ���ڵ�current��Node�����ĸ��ڵ��rightChild�ֶΣ�����leftChild�ֶΣ��Ƴ������Ұ�����ֶ�����Ϊ��̽ڵ�successor
	 * 									step4����current�����ӽڵ��current�Ƴ���������̽ڵ�successor��leftChild�ֶ�
	 * */
	public void deleteNode(String key){
		if(this.isEmpty()){
			System.out.println("��ǰ����������Ϊ�յģ��޷����нڵ�ɾ������");
			return;
		}else{
			//��ǰ��������Ϊ��ʱ���Ȳ��ҵ�key��Ӧ�Ľڵ�
			Node current=root;//��ɾ���ڵ�
			Node parent=null;//��ɾ���ڵ�ĸ��ڵ�
			boolean isLeftChild=true;//��ɾ���ڵ����丸�ڵ�����ӽڵ�ʱ��ֵΪtrue
			while(!key.equals(current.getKey())){
				parent=current;
				if(key.compareTo(current.getKey())<0){
					current=current.getLeftChild();
				}else{
					current=current.getRightChild();
					isLeftChild=false;
				}
				if(current==null){
					System.out.println("��ǰ��������û�в��ҵ�key="+key+"�Ľڵ�,�޷�����ɾ������");
					return;
				}
			}
			//�ӷǿն������в��ҵ���Ӧ�Ľڵ��Ҫ�ֳ�������������ֱ���������ɽڵ�ɾ������
			/**���һ����ɾ���ڵ���Ҷ�ӽڵ�����
			 * 		�״��һ��ֱ�ӽ���ɾ��Ҷ�ӽڵ���Ϊnull���޷��ﵽɾ��Ч���ģ�����JVM���ڴ��������й�
			 * 
			 */
			if(current.getLeftChild()==null&&current.getRightChild()==null){
				if(current==root){
					root=null;
				}else if(isLeftChild){
					parent.setLeftChild(null);
				}else{
					parent.setRightChild(null);
				}
			}else if(current.getLeftChild()!=null&&current.getRightChild()==null){//���������ɾ���ڵ�ֻӵ��������ʱ
				if(current==root){//��ɾ���ڵ��Ǹ��ڵ�ʱ
					root=current.getLeftChild();
				}else if(isLeftChild){//��ɾ���ڵ����丸�ڵ�����ӽڵ�ʱ
					parent.setLeftChild(current.getLeftChild());
				}else{//��ɾ���ڵ����丸�ڵ�����ӽڵ�ʱ
					parent.setRightChild(current.getLeftChild());
				}
			}else if(current.getLeftChild()==null&&current.getRightChild()!=null){//���������ɾ���ڵ�ֻӵ��������ʱ
				if(current==root){
					root=current.getRightChild();
				}else if(isLeftChild){
					parent.setLeftChild(current.getRightChild());
				}else{
					parent.setRightChild(current.getRightChild());
				}
			}else{//���������ɾ���ڵ��ӵ����������ӵ��������ʱ
				Node successor=current.getRightChild();//successor:Node Ϊ��ɾ���ڵ�ĺ�̽ڵ�
				Node successorParent=current;//successorParent:Node �Ǻ�̽ڵ�ĸ��ڵ�
				//step3.1���Ҵ�ɾ���ڵ�ĺ�̽ڵ�
				while(successor.getLeftChild()!=null){
					successorParent=successor;
					successor=successor.getLeftChild();
				}
				//step3.2���ݲ��ҵ��ĺ�̽ڵ��״�����з�������ۣ���ͬ�����Ҫ����ͬ�ĺ�������
					/*
					 *step3.2 ���ݺ�̽ڵ�ľ������������һ������
					 * 						�����һ��3.2.1����̽ڵ��Ǵ�ɾ���ڵ�����ӽڵ�
					 * 									step1�����Ƚ���ɾ���ڵ��滻�ɺ�̽ڵ㣨Ҳ����˵�ô�ɾ���ڵ�ĸ��ڵ�ָ���̽ڵ㣬ԭ����ָ���ɾ���ڵ�����ָ���ɾ���ڵ�ĺ�̽ڵ㣩
					 * 										����ɾ���ڵ��Ǹ��ڵ�ʱ���ø��ڵ����ӵ���̽ڵ�
					 * 										����ɾ���ڵ㲻�Ǹ��ڵ�ʱ
					 * 											����ɾ���ڵ����丸�ڵ�����ӽڵ�ʱ�����丸�ڵ�����ӽڵ����ӵ���ɾ���ڵ�ĺ�̽ڵ�
					 * 											����ɾ���ڵ����丸�ڵ�����ӽڵ�ʱ�����丸�ڵ�����ӽڵ����ӵ���̽ڵ�
					 * 									step2����Σ�����ɾ���ڵ���������Ƶ���̽ڵ�����ӽڵ㴦��Ҳ����ʹ��ɾ���ڵ��������������̽ڵ����������
					 * 						���������3.2.2��̽ڵ��Ǵ�ɾ���ڵ�����ӽڵ��������ڵ�ʱ
					 * 									step1������̸��ڵ��leftChild�ֶ�ָ���̽ڵ�successor�����ӽڵ㣨Ҳ������̽ڵ��������ת�Ƶ����ô���λ�ã�
					 * 									step2������̽ڵ�successor��Node��rightChild�ֶ�ָ��Ҫɾ���ڵ�����ӽڵ㣨Ҳ������ɾ���ڵ��������������̽ڵ����������
					 * 									step3������ɾ���ڵ�current��Node�����ĸ��ڵ��rightChild�ֶΣ�����leftChild�ֶΣ��Ƴ������Ұ�����ֶ�����Ϊ��̽ڵ�successor
					 * 									step4����current�����ӽڵ��current�Ƴ���������̽ڵ�successor��leftChild�ֶ� (Ҳ������ɾ���ڵ��������������̽ڵ��������)
								 */
				if(successor==current.getRightChild()){//3.2.1��̽ڵ��Ǵ�ɾ���ڵ�����ӽڵ�ʱ
					//step1:���Ƚ���ɾ���ڵ��滻�ɺ�̽ڵ�
					if(current==root){
						root=successor;
					}else if(isLeftChild){
						parent.setLeftChild(successor);
					}else{
						parent.setRightChild(successor);
					}
					//step2����ν���ɾ���ڵ��������ת������̽ڵ��leftChild�ֶΣ�ʹ���Ϊ��̽ڵ��������
					successor.setLeftChild(current.getLeftChild());
				}else{//3.2.2��̽ڵ��Ǵ�ɾ���ڵ�����ӽڵ��������ڵ�ʱ
					successorParent.setLeftChild(successor.getRightChild());//step1������̽ڵ��������������̸��ڵ��������
					successor.setRightChild(current.getRightChild());//step2������ɾ���ڵ��������������̽ڵ��������
					if(current==root){//step3������ɾ���ڵ�ĸ��ڵ�������ɴ�ɾ���ڵ�ת���̽ڵ�
						root=successor;
					}else if(isLeftChild){
						parent.setLeftChild(successor);
					}else{
						parent.setRightChild(successor);
					}
					successor.setLeftChild(current.getLeftChild());//step4:����ɾ���ڵ��������������̽ڵ��������
				}
				
			}
		}
	}
	/**
	 * @description����������������Ҷ�������һ��"��ӵ�����ӽڵ���ӵ�����ӽڵ�Ľڵ�"�ġ���̽ڵ㡱����̽ڵ���Ǹýڵ���������е���С�ڵ㣩
	 * @param current:Node ���ǲ�������ڵ�ĺ�̽ڵ�(current�ڵ�����ӵ�����ӽڵ㣬��ӵ�����ӽڵ�)
	 * @return successor:Node ��̽ڵ㣬�����ڵ�current��Node�ĺ�̽ڵ�*/
	public Node findSuccessor(Node current){
		//�������Ƿ��������������findSuccessor(Node current)���������
		if(current.getLeftChild()==null||current.getRightChild()==null){
			System.out.println("�������ԣ��������Ĳ���������һ����ӵ�����ӽڵ���ӵ�����ӽڵ�Ķ����������ڵ�");
			return null;
		}
		Node successor=current.getRightChild();
		while(successor.getLeftChild()!=null){
			successor=successor.getLeftChild();
		}
		return successor;
	}
	
	/**
	 * @description:���ݹؼ��ֵ�ֵ�ڶ������в��Ҷ�Ӧ�ڵ㣬����ȡ�ڵ�������
	 * @param key:String �ؼ��֣��ó�Ա�������Ǹ��ݽڵ��key���Ե�ֵ���Ҷ�Ӧ�Ľڵ��
	 * @return :Node ���ҽ���������ݹؼ��ֲ��ҵ��Ľڵ�
	 * ���˼·��
	 * 		step1:���ж������������Ƿ�Ϊ�գ���Ϊ���򷵻�ֵΪnull,��Ϊ��ʱ����step2
	 * 		step2����������Ϊ��ʱ�Ӹ��ڵ㿪ʼ���ң�������ǰ��ѯ�ڵ���Ϊcurrent��Node
	 * 			  ����ǰ��ѯ�ڵ�Ĺؼ��ֵ�ֵǡ�õ��ڲ���key,��ǰ��ѯ�ڵ����Ҫ���ҵĽڵ�
	 * 			  ������key��ֵС�ڵ�ǰ�ڵ�ؼ��ֵ�ֵ�����ڵ�ǰ���ҽڵ���������в�����Ӧ�Ľڵ�
	 * 			  ������key��ֵС�ڵ�ǰ�ڵ�ؼ��ֵ�ֵ�����ڵ�ǰ���ҽڵ���������в�����Ӧ�Ľڵ㣬���ѭ��
	 * 			   �������  ��������whileѭ����*/
	public Node find(String key){
		if(this.isEmpty()){
			System.out.println("����������Ϊ�գ�û�в��ҵ���Ӧ�ڵ�");
			return null;
		}else{
			Node current=root;//������������Ϊ��ʱ���Ӹ��ڵ㿪ʼ����
			while(current!=null){
				if(current.getKey().equals(key)){
					break;//һ�����ҵ��ؼ�ֵ��Ӧ�Ľڵ㣬����������whileѭ��
				}else if(key.compareTo(current.getKey())<0){
					current=current.getLeftChild();
				}else{
					current=current.getRightChild();
				}
			}
			if(current==null){
				System.out.println("������������Ϊ�գ�����Ҳû���ҵ��ؼ�ֵkey="+key+"�Ľڵ�");
			}else{
				System.out.println("������������Ϊ�գ����Ҳ��ҵ��ؼ���key="+key+"��Ӧ�Ľڵ���");
			}
			return current;
		}
	}
	/**
	 * @description:���Ҷ����������йؼ���ֵ��С�Ľڵ�
	 * @return  :Node ���ҵ��Ľڵ�
	 * ���˼·���Ӹ��ڵ㿪ʼ��һֱ���ҵ�ǰ�ڵ�����ӽڵ㣬ֱ������һ��û�����ӽڵ�Ľڵ㣬�ýڵ���Ǹ������������йؼ�ֵ��С�Ľڵ�*/
	public Node nodeWithMinKey(){
		if(this.isEmpty()){
			System.out.println("��ǰ����������Ϊ�գ�û����С�ڵ�");
			return null;
		}else{
			Node current=root;
			Node parent=null;
			while(current!=null){
				parent=current;
				current=current.getLeftChild();
			}
			System.out.println("��ǰ�����������Ĺؼ�����С�Ľڵ㣺key="+parent.getKey());
			return parent;
		}
	}
	/**
	 * @author lxrm
	 * @description ���Ҷ����������ؼ�ֵ���Ľڵ�
	 * ���˼·���Ӹ��ڵ㿪ʼ��һֱ���ҵ�ǰ�ڵ�����ӽڵ㣬ֱ��ĳ���ڵ�����ӽڵ�Ϊ�գ���ô�ýڵ���ǵ�ǰ�����������йؼ�ֵ���Ľڵ�*/
	public Node nodeWithMaxKey(){
		if(this.isEmpty()){
			System.out.println("��ǰ����������Ϊ�յģ����������ڵ�");
			return null;
		}else{
			Node parent=null;
			Node current=root;
			while(current!=null){
				parent=current;
				current=current.getRightChild();
			}
			return parent;
		}
	}
	
	/**
	 * @description:�������������������inOrder��
	 * 				���������������ʹ�����������нڵ㰴�չؼ���ֵ���򱻷��ʵ�
	 * 				��������������һ����public void inOrder(Node current){}
	 * 						 ����һ����public void displayAll(){}
	 * @param  current:Node �����Բ����ڵ�Ϊ���ڵ����������Ҫ��������������ʱ��������Ϊroot���ڵ㼴��
	 * ���˼·��ʹ�õݹ麯��ʵ��
	 * 		     ��ֹ����Ϊ�ڵ�Ϊ�գ�Ҳ����һ���ڵ�ΪҶ�ӽڵ㣩
	 * 		     �ݹ���ã��Ե�ǰ�ڵ�����ӽڵ�Ϊ������
	 * 		     ��ǰ�ڵ��Ӧ�Ĳ������籾����������ڵ��key��data���Ե�ֵ����Ļ��ʵ�ʹ�������һ���ֿ���Ϊ�������������޸Ľڵ����ݡ�����ڵ����ݵ��ļ��ȵȣ�
	 * 		     �ݹ���ã��Ե�ǰ�ڵ�����ӽڵ�Ϊ������*/
	public void inOrder(Node current){
		if(current!=null){
			inOrder(current.getLeftChild());
			System.out.println("�ڵ�key="+current.getKey()+"   �ڵ�����data:double="+current.getData());
			inOrder(current.getRightChild());
		}
	}
	public void displayAll(){
		this.inOrder(root);//��ʼ����Ϊroot������inOrder()������Ҳ���Ǳ�������������
	}
	
	/**
	 * description:�ж����Ƿ�Ϊ��
	 * @return ��boolean  true��ʾ�˶���������Ϊ�յ�
	 * */
	public boolean isEmpty(){
		if(root==null){
			System.out.println("�˶����������ǿյ�");
			return true;
		}else{
			return false;
		}
	}
}
