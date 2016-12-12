/**
 * @author lxrm
 * @date 20161024
 * @description
 * 堆：这是树的应用，堆是一种特殊的二叉树
 * 		堆是完全二叉树
 * 		堆是用数组实现的二叉树
 * 		（堆条件）堆这种特殊的二叉树必须满足一个条件，即树中父节点的关键值必须大于其子节点的关键值*/
package tree;

import POJO.Student;

public class Heap {
	private HeapNode heapArray[];//堆数组，用于存储堆中各个节点
	private int maxSize;//堆中可存储的最大元素个数
	private int currentSize;//堆中现有元素个数
	/**
	 *@param size:int 堆数组大小（由于堆这种二叉树的所有节点是使用数组来存储的，所以要在开始就初始化相应的数组，该参数是数组大小，也是堆中元素最大个数 
	 **/
	public Heap(int size){
		heapArray=new HeapNode[size];
		maxSize=size;
		currentSize=0;
	}
	/**
	 * @description:向堆中插入数据
	 * 编程思路：step1，将待插入数据封装成Node对象（节点对象）
	 * 		  step2，将待插入节点对象放到堆最底层最末尾位置（往堆中插入新的节点，但是现在还不满足堆的条件）
	 * 					先判断当前堆数组是否已满，若已满则不能插入新的节点
	 * 					若堆未满，则将待插入节点放置在堆数组末尾位置(末尾第一个空位置)
	 * 		  step3，使新插入的节点沿着路径上升，直到满足堆的条件(即使得父节点关键值大于子节点关键值)*/
	public void insert(String key,double data,Student stu){
		HeapNode newNode=new HeapNode(key,data,stu);//step1
		if(currentSize==maxSize){//step2
			System.out.println("堆已满，无法插入新的节点");
			return;
		}
		heapArray[currentSize++]=newNode;
		this.tricleUpNode(currentSize-1);//step3,将乱序节点heapArray[currentSize]沿路径上升放置到正确的位置，使乱序二叉树重新满足堆条件
	}
	/**
	 * @description:删除堆中优先级最高的元素，并将该元素作为返回值返回*/
	public HeapNode deleteRoot(){
		HeapNode root=heapArray[0];//根元素，下面的程序会将根节点删除，所以如果后面还想使用该节点中的数据，就要先将该节点保存下来
		heapArray[0]=heapArray[currentSize-1];//step1:将根节点删除，并将堆中最后一个节点放到根节点的位置（这样使得删除根节点后的堆还是完全二叉树）
		currentSize--;//step2：删掉了一个节点，所以堆数组的当前大小要减一
		this.tricleDownNode(0);//step3:此步骤将前面所得无序完全二叉树重新满足堆条件
		return root;
	}
	/**
	 * @description:这个函数用于更改某个节点的关键值大小，且在更改后自动重新排序，以使其重新满足堆条件（父节点关键值比两个子节点的关键值都大）
	 * @param index：int 待改动节点的索引值（即该节点在堆数组中的下标值）
	 * @param targetKey:String 目的关键字值
	 * */
	public void changeKey(int index,String targetKey){
		if(index<0||index>=currentSize){
			System.out.println("给出的index超出范围，index应该在[0,"+currentSize+")中取值");
			return; 
		}
		String initKey=heapArray[index].getKey();
		heapArray[index].setKey(targetKey);
		if(targetKey.compareTo(initKey)>0){
			this.tricleUpNode(index);
		}else{
			this.tricleDownNode(index);
		}
	}
	/**
	 * @description:这个函数用于使参数节点沿着"树路径"上升，直至这个树重新满足"堆条件"(堆条件：父节点关键字值大于他的子节点的关键字的值)
	 * @param node:HeapNode 乱序节点，本函数可以使这个乱序节点最终被放置在正确的位置，从而使得“乱序完全二叉树”编程符合堆条件的堆
	 * @param index:int 乱序节点在数组中的位置，也即乱序节点在堆数组中的下标
	 * 编程思路：从乱序节点开始，沿着树路径上升，查找乱序节点应该被放置的正确位置
	 * 		     树路径是这样的，乱序节点-->乱序节点的父节点-->乱序节点的父节点的父节点（用数组实现的堆中parentIndex=(childIndex-1)/2）
	 * 		     终止条件：父节点下标<0,或者途中某个父节点的关键值大于乱序节点的关键值
	 * */
	private void tricleUpNode(int index){
		HeapNode tmp=heapArray[index];//暂时存储乱序节点的地址值
		int currentIndex=index;//从当前节点开始沿着“树路径”上升，查找乱序节点应该被放置的正确位置
		int parentIndex=(currentIndex-1)/2;//父节点数组下标
		
		//如果父节点的关键值比乱序节点的关键值小，则父节点下移
		while((parentIndex>=0)&&(heapArray[parentIndex].getKey().compareTo(heapArray[currentIndex].getKey())<0)){
			heapArray[currentIndex]=heapArray[parentIndex];
			currentIndex=parentIndex;
			parentIndex=(parentIndex-1)/2;
		}
		heapArray[currentIndex]=tmp;
	}
	/**
	 * @description:从无序节点开始，沿着树路径“向下查找”参数节点应该被放置的位置，并且将参数节点放置到正确的位置，使得乱序的完全二叉树重新满足堆条件
	 * @param index:int 无序节点在数组中的位置，数组下标
	 * 编程思路：从参数节点(无序节点)开始，沿着树路径向下查找，直至找到无序节点应该被放置的正确位置
	 * 		  从当前层到下一层有两条路径，应该选择哪条路径呢（答：应该选择关键值较大的子节点构成实际行走的路径）
	 * 		终止条件：当前层节点作为父节点，比左子节点和右子节点关键值都大，则当前层节点位置就是乱序节点应该被放置的正确位置
	 * 		终止条件：查找到了堆末尾位置*/
	private void tricleDownNode(int index){
		HeapNode tmp=heapArray[index];//step1：暂时存储无序节点对象
		int currentIndex=index;
		int leftChildIndex=2*currentIndex+1;
		int rightChildIndex=leftChildIndex+1;//这样写可以比乘法少些运算量，节省运行时间
		while(leftChildIndex<currentSize){//至少有一个子节点时(也即至少拥有左子节点)
			boolean flagLeftChild=tmp.getKey().compareTo(heapArray[leftChildIndex].getKey())>0;//当前节点关键值比其左子节点的关键值大，该值为true
			
			if(rightChildIndex<currentSize){//拥有两个子节点时
				boolean flagRightChild=tmp.getKey().compareTo(heapArray[rightChildIndex].getKey())>0;//当前节点的关键值比其右子节点的关键值大，该值为true
				if(flagLeftChild&&flagRightChild){//当乱序节点关键值比heapArray[currentIndex]左子节点和右子节点都大时，currentIndex就是乱序节点应该被放置的位置
					break;
				}else{
					if(heapArray[leftChildIndex].getKey().compareTo(heapArray[rightChildIndex].getKey())>0){
						heapArray[currentIndex]=heapArray[leftChildIndex];
						currentIndex=leftChildIndex;
					}else{
						heapArray[currentIndex]=heapArray[rightChildIndex];
						currentIndex=rightChildIndex;
					}
					leftChildIndex=2*currentIndex+1;
					rightChildIndex=leftChildIndex+1;
				}
			}else{//仅拥有一个子节点时（即只拥有左子节点时）
				if(flagLeftChild){//如果当前节点关键值比左子节点关键值大，就跳出while循环，currentIndex就是乱序节点应该插入的位置
					break;
				}else{
					heapArray[currentIndex]=heapArray[leftChildIndex];
					currentIndex=leftChildIndex;
					break;//这里已经是堆末尾，所以可以跳出while循环
				}
			}	
		}//end while
		heapArray[currentIndex]=tmp;
	}//end tricleDownNode()
	//堆是否为空
	public boolean isEmpty(){
		return currentSize==0;
	}
	//堆是否已满
	public boolean isFull(){
		return currentSize==maxSize;
	}
	//将堆展示在屏幕上
	public void displayHeap(){
		int layerNum=1;//每层节点数目
		int index=0;//堆中元素索引（也即堆数组下标）
		//展示堆数组
		System.out.println("heapArray:");
		for(;index<currentSize;index++){
			System.out.print(heapArray[index].getKey()+"  ");
		}
		/*
		//以树的形式展示堆（有待改进）
		while(true){
			for(int i=0;i<layerNum;i++){
				if(heapArray[index].getKey()!=null){
					System.out.print(heapArray[index].getKey()+" ");
				}
				
				index++;
				if(index>=currentSize-1){
					return;
				}
			}
			System.out.println("index="+index);
			layerNum=2*layerNum;
		}//end while()
		*/
	}
	
}
