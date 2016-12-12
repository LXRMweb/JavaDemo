/**author：lxrm
 * date:20160927
 * function:二叉搜索树(Tree类，该类的一个对象包含了树的所有节点)
 * 				（首先他是个二叉树，
 * 				（其次他的左子节点关键值<父节点关键值<右子节点关键值）
 * 				（再其次，如果插入的数据序列有序或基本有序的话，二叉搜索树极有可能变成不平衡树或者含有不平衡子树，这样一来树的效率就会变得很低
 * 编程思路：（使用链接的方式，而非数组方式）
 * 		成员变量
 * 			只有一个成员变量 root:Node
 * 		构造函数
 * 		成员函数
 * 			如insertNode()
 * 			findNode(String key)
 * 			deleteNode()
 * 			遍历函数*/
package tree;

import POJO.Student;

public class BinarySearchingTree {
	Node root;
	public BinarySearchingTree(){
		root=null;//初始化，得到一个空树，没有任何节点
	}
	/**
	 * @description:往树中插入一个节点
	 * @param id:String 待插入节点的关键字的值
	 * @param data:double 待插入节点的数据项（普通数据类型）
	 * @param stu:Student 带插入节点的数据项（POJO对象类型数据）
	 * 编程思路：
	 * 		step1：将待插入数据封装成树节点对象（Node对象）
	 * 		step2：判断树是否为空，若为空，root=newNode，若树不为空转入step3
	 * 		step3：树不为空的状况下，每次要插入新的节点时，都要先找到newNode应该插入的位置（从根节点开始查找）
	 * 					从根节点开始查找待插入位置
	 * 					待插入位置一定是现有树的一个“叶子节点”
	 * 					插入新节点====将newNode设定为查找到的叶子节点的左子节点或者右子节点
	 */
	public void insert(String key,double data,Student stu){
		Node newNode=new Node(key,data,stu);//step1:将数据封装成Node对象（树节点对象）
		if(root==null){
			root=newNode;//step2：判断树是否为空，树为空的时候，该节点设为根节点，否则转入step3
		}else{//step3：树不为空的时候，查找新节点应该插入的位置(每次都从根节点开始查找)，然后插入新节点
			Node current=root;//每次都从根节点开始查找     （查找新的节点应该插入的位置）
			Node parent=null;
			//使用如下while循环找到“插入位置”(parent节点即为待插入节点的父节点)
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
	 * @description:删除二叉树的某个节点
	 * @param key:String 待删除节点的关键字的值
	 * 编程思路：
	 * step1,当前二叉树为空时直接退出deleteNode()函数，二叉树不为空时先在当前二叉搜索树中查找对应的节点
	 * step2,根据查找结果作进一步处理，若是在非空二叉树中没有查找到对应节点，则直接退出deleteNode()函数
	 * 		若是查找到相应的节点，则进一步分成三种情况分别处理
	 * 			情况一，待删除节点是叶子节点时，只需将父节点的相应属性置为null即可
	 * 					父节点是根节点时
	 * 					待删除节点是父节点的左子节点时
	 * 					待删除节点是父节点的右子节点时
	 * 			情况二，待删除节点仅有左子树或者仅有右子树时
	 * 					待删除节点是根节点时
	 * 					待删除节点是其父节点的左子节点时
	 * 					待删除节点是其父节点的右子节点时
	 * 			情况三，待删除节点既有左子树又有右子树时
	 * 				step3.1 查找待删除节点的“后继节点”(也即二叉搜索树所有节点中关键值比待删除节点关键值大，又比其他所有节点的关键值都小)
	 * 									  (后继节点是待删除节点的“右子树的最小节点”
	 * 									  (后继节点一定是待删除节点的右子节点        或者右子节点的左子孙节点
	 * 									  (后继节点一定没有左子节点
	 * 				step3.2 根据后继节点的具体情况进行下一步动作
	 * 						（情况一）3.2.1若后继节点是待删除节点的右子节点
	 * 									step1：首先将待删除节点替换成后继节点（也就是说让待删除节点的父节点指向后继节点，原本是指向待删除节点现在指向待删除节点的后继节点）
	 * 										当待删除节点是根节点时
	 * 										当待删除节点不是根节点时
	 * 											当待删除节点是其父节点的左子节点时，让其父节点的左子节点链接到待删除节点的后继节点
	 * 											当待删除节点是其父节点的右子节点时，让其父节点的右子节点链接到后继节点
	 * 									step2：其次，将待删除节点的左子树移到后继节点的左子节点处（也就是使待删除节点的左子树变成其后继节点的左子树）
	 * 						（情况二）3.2.2后继节点是待删除节点的右子节点的左子孙节点时
	 * 									step1：将后继父节点的leftChild字段指向后继节点successor的右子节点（也即将后继节点的右子树转移到它该待的位置）
	 * 									step2：将后继节点successor：Node的rightChild字段指向要删除节点的右子节点（也即将待删除节点的右子树转移到正确的位置）
	 * 									step3：将待删除节点current：Node从它的父节点的rightChild字段（或者leftChild字段）移除，并且把这个字段设置为后继节点successor
	 * 									step4：把current的左子节点从current移除，移至后继节点successor的leftChild字段
	 * */
	public void deleteNode(String key){
		if(this.isEmpty()){
			System.out.println("当前二叉搜索树为空的，无法进行节点删除操作");
			return;
		}else{
			//当前二叉树不为空时，先查找到key对应的节点
			Node current=root;//待删除节点
			Node parent=null;//待删除节点的父节点
			boolean isLeftChild=true;//待删除节点是其父节点的左子节点时该值为true
			while(!key.equals(current.getKey())){
				parent=current;
				if(key.compareTo(current.getKey())<0){
					current=current.getLeftChild();
				}else{
					current=current.getRightChild();
					isLeftChild=false;
				}
				if(current==null){
					System.out.println("当前二叉树中没有查找到key="+key+"的节点,无法进行删除操作");
					return;
				}
			}
			//从非空二叉树中查找到相应的节点后，要分成如下三种情况分别处理，最终完成节点删除工作
			/**情况一：待删除节点是叶子节点的情况
			 * 		易错点一，直接将待删除叶子节点置为null是无法达到删除效果的，这与JVM的内存管理机制有关
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
			}else if(current.getLeftChild()!=null&&current.getRightChild()==null){//情况二：待删除节点只拥有左子树时
				if(current==root){//待删除节点是根节点时
					root=current.getLeftChild();
				}else if(isLeftChild){//待删除节点是其父节点的左子节点时
					parent.setLeftChild(current.getLeftChild());
				}else{//待删除节点是其父节点的右子节点时
					parent.setRightChild(current.getLeftChild());
				}
			}else if(current.getLeftChild()==null&&current.getRightChild()!=null){//情况二：待删除节点只拥有右子树时
				if(current==root){
					root=current.getRightChild();
				}else if(isLeftChild){
					parent.setLeftChild(current.getRightChild());
				}else{
					parent.setRightChild(current.getRightChild());
				}
			}else{//情况三：待删除节点既拥有左子树又拥有右子树时
				Node successor=current.getRightChild();//successor:Node 为待删除节点的后继节点
				Node successorParent=current;//successorParent:Node 是后继节点的父节点
				//step3.1查找待删除节点的后继节点
				while(successor.getLeftChild()!=null){
					successorParent=successor;
					successor=successor.getLeftChild();
				}
				//step3.2根据查找到的后继节点的状况进行分情况讨论，不同情况下要做不同的后续处理
					/*
					 *step3.2 根据后继节点的具体情况进行下一步动作
					 * 						（情况一）3.2.1若后继节点是待删除节点的右子节点
					 * 									step1：首先将待删除节点替换成后继节点（也就是说让待删除节点的父节点指向后继节点，原本是指向待删除节点现在指向待删除节点的后继节点）
					 * 										当待删除节点是根节点时，让根节点链接到后继节点
					 * 										当待删除节点不是根节点时
					 * 											当待删除节点是其父节点的左子节点时，让其父节点的左子节点链接到待删除节点的后继节点
					 * 											当待删除节点是其父节点的右子节点时，让其父节点的右子节点链接到后继节点
					 * 									step2：其次，将待删除节点的左子树移到后继节点的左子节点处（也就是使待删除节点的左子树变成其后继节点的左子树）
					 * 						（情况二）3.2.2后继节点是待删除节点的右子节点的左子孙节点时
					 * 									step1：将后继父节点的leftChild字段指向后继节点successor的右子节点（也即将后继节点的右子树转移到它该待的位置）
					 * 									step2：将后继节点successor：Node的rightChild字段指向要删除节点的右子节点（也即将待删除节点的右子树移作后继节点的右子树）
					 * 									step3：将待删除节点current：Node从它的父节点的rightChild字段（或者leftChild字段）移除，并且把这个字段设置为后继节点successor
					 * 									step4：把current的左子节点从current移除，移至后继节点successor的leftChild字段 (也即将待删除节点的左子树移作后继节点的左子树)
								 */
				if(successor==current.getRightChild()){//3.2.1后继节点是待删除节点的右子节点时
					//step1:首先将待删除节点替换成后继节点
					if(current==root){
						root=successor;
					}else if(isLeftChild){
						parent.setLeftChild(successor);
					}else{
						parent.setRightChild(successor);
					}
					//step2：其次将待删除节点的左子树转移至后继节点的leftChild字段，使其成为后继节点的左子树
					successor.setLeftChild(current.getLeftChild());
				}else{//3.2.2后继节点是待删除节点的右子节点的左子孙节点时
					successorParent.setLeftChild(successor.getRightChild());//step1：将后继节点的右子树移作后继父节点的左子树
					successor.setRightChild(current.getRightChild());//step2：将待删除节点的右子树移作后继节点的右子树
					if(current==root){//step3：将待删除节点的父节点的链接由待删除节点转向后继节点
						root=successor;
					}else if(isLeftChild){
						parent.setLeftChild(successor);
					}else{
						parent.setRightChild(successor);
					}
					successor.setLeftChild(current.getLeftChild());//step4:将待删除节点的左子树移作后继节点的左子树
				}
				
			}
		}
	}
	/**
	 * @description：这个函数用来查找二叉树中一个"既拥有左子节点又拥有右子节点的节点"的“后继节点”（后继节点就是该节点的右子树中的最小节点）
	 * @param current:Node 就是查找这个节点的后继节点(current节点必须既拥有左子节点，又拥有右子节点)
	 * @return successor:Node 后继节点，参数节点current：Node的后继节点*/
	public Node findSuccessor(Node current){
		//检查参数是否符合条件，避免findSuccessor(Node current)被错误调用
		if(current.getLeftChild()==null||current.getRightChild()==null){
			System.out.println("参数不对，本函数的参数必须是一个既拥有左子节点又拥有右子节点的二叉搜索树节点");
			return null;
		}
		Node successor=current.getRightChild();
		while(successor.getLeftChild()!=null){
			successor=successor.getLeftChild();
		}
		return successor;
	}
	
	/**
	 * @description:根据关键字的值在二叉树中查找对应节点，并获取节点中数据
	 * @param key:String 关键字，该成员函数就是根据节点的key属性的值查找对应的节点的
	 * @return :Node 查找结果，即根据关键字查找到的节点
	 * 编程思路：
	 * 		step1:先判断搜索二叉树是否为空，若为空则返回值为null,不为空时进入step2
	 * 		step2：二叉树不为空时从根节点开始查找，并将当前查询节点标记为current：Node
	 * 			  若当前查询节点的关键字的值恰好等于参数key,则当前查询节点就是要查找的节点
	 * 			  若参数key的值小于当前节点关键字的值，则在当前查找节点的左子树中查找相应的节点
	 * 			  若参数key的值小于当前节点关键字的值，则在当前查找节点的左子树中查找相应的节点，如此循环
	 * 			   具体程序  见函数中while循环体*/
	public Node find(String key){
		if(this.isEmpty()){
			System.out.println("二叉搜索树为空，没有查找到对应节点");
			return null;
		}else{
			Node current=root;//二叉搜索树不为空时，从根节点开始查找
			while(current!=null){
				if(current.getKey().equals(key)){
					break;//一旦查找到关键值对应的节点，就立即跳出while循环
				}else if(key.compareTo(current.getKey())<0){
					current=current.getLeftChild();
				}else{
					current=current.getRightChild();
				}
			}
			if(current==null){
				System.out.println("搜索二叉树不为空，但是也没有找到关键值key="+key+"的节点");
			}else{
				System.out.println("搜索二叉树不为空，并且查找到关键字key="+key+"对应的节点了");
			}
			return current;
		}
	}
	/**
	 * @description:查找二叉搜索树中关键字值最小的节点
	 * @return  :Node 查找到的节点
	 * 编程思路：从根节点开始，一直查找当前节点的左子节点，直到到达一个没有左子节点的节点，该节点就是该搜索二叉树中关键值最小的节点*/
	public Node nodeWithMinKey(){
		if(this.isEmpty()){
			System.out.println("当前二叉搜索树为空，没有最小节点");
			return null;
		}else{
			Node current=root;
			Node parent=null;
			while(current!=null){
				parent=current;
				current=current.getLeftChild();
			}
			System.out.println("当前二叉搜索树的关键字最小的节点：key="+parent.getKey());
			return parent;
		}
	}
	/**
	 * @author lxrm
	 * @description 查找二叉搜索树关键值最大的节点
	 * 编程思路：从根节点开始，一直查找当前节点的右子节点，直到某个节点的右子节点为空，那么该节点就是当前二叉搜索树中关键值最大的节点*/
	public Node nodeWithMaxKey(){
		if(this.isEmpty()){
			System.out.println("当前搜索二叉树为空的，不存在最大节点");
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
	 * @description:遍历二叉树（中序遍历inOrder）
	 * 				中序遍历二叉树会使二叉树中所有节点按照关键字值升序被访问到
	 * 				包含两个函数，一个是public void inOrder(Node current){}
	 * 						 另外一个是public void displayAll(){}
	 * @param  current:Node 遍历以参数节点为父节点的子树；需要遍历整个二叉树时将参数设为root根节点即可
	 * 编程思路：使用递归函数实现
	 * 		     终止条件为节点为空（也即上一个节点为叶子节点）
	 * 		     递归调用（以当前节点的左子节点为参数）
	 * 		     当前节点对应的操作，如本程序中输出节点的key和data属性的值到屏幕（实际工程中这一部分可以为其他操作，如修改节点数据、输出节点数据到文件等等）
	 * 		     递归调用（以当前节点的右子节点为参数）*/
	public void inOrder(Node current){
		if(current!=null){
			inOrder(current.getLeftChild());
			System.out.println("节点key="+current.getKey()+"   节点数据data:double="+current.getData());
			inOrder(current.getRightChild());
		}
	}
	public void displayAll(){
		this.inOrder(root);//初始参数为root，调用inOrder()函数，也就是遍历二叉搜索树
	}
	
	/**
	 * description:判断树是否为空
	 * @return ：boolean  true表示此二叉搜索树为空的
	 * */
	public boolean isEmpty(){
		if(root==null){
			System.out.println("此二叉搜索树是空的");
			return true;
		}else{
			return false;
		}
	}
}
