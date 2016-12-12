/**
 * @author lxrm
 * @date 20161024
 * @description
 * �ѣ���������Ӧ�ã�����һ������Ķ�����
 * 		������ȫ������
 * 		����������ʵ�ֵĶ�����
 * 		��������������������Ķ�������������һ�������������и��ڵ�Ĺؼ�ֵ����������ӽڵ�Ĺؼ�ֵ*/
package tree;

import POJO.Student;

public class Heap {
	private HeapNode heapArray[];//�����飬���ڴ洢���и����ڵ�
	private int maxSize;//���пɴ洢�����Ԫ�ظ���
	private int currentSize;//��������Ԫ�ظ���
	/**
	 *@param size:int �������С�����ڶ����ֶ����������нڵ���ʹ���������洢�ģ�����Ҫ�ڿ�ʼ�ͳ�ʼ����Ӧ�����飬�ò����������С��Ҳ�Ƕ���Ԫ�������� 
	 **/
	public Heap(int size){
		heapArray=new HeapNode[size];
		maxSize=size;
		currentSize=0;
	}
	/**
	 * @description:����в�������
	 * ���˼·��step1�������������ݷ�װ��Node���󣨽ڵ����
	 * 		  step2����������ڵ����ŵ�����ײ���ĩβλ�ã������в����µĽڵ㣬�������ڻ�������ѵ�������
	 * 					���жϵ�ǰ�������Ƿ����������������ܲ����µĽڵ�
	 * 					����δ�����򽫴�����ڵ�����ڶ�����ĩβλ��(ĩβ��һ����λ��)
	 * 		  step3��ʹ�²���Ľڵ�����·��������ֱ������ѵ�����(��ʹ�ø��ڵ�ؼ�ֵ�����ӽڵ�ؼ�ֵ)*/
	public void insert(String key,double data,Student stu){
		HeapNode newNode=new HeapNode(key,data,stu);//step1
		if(currentSize==maxSize){//step2
			System.out.println("���������޷������µĽڵ�");
			return;
		}
		heapArray[currentSize++]=newNode;
		this.tricleUpNode(currentSize-1);//step3,������ڵ�heapArray[currentSize]��·���������õ���ȷ��λ�ã�ʹ����������������������
	}
	/**
	 * @description:ɾ���������ȼ���ߵ�Ԫ�أ�������Ԫ����Ϊ����ֵ����*/
	public HeapNode deleteRoot(){
		HeapNode root=heapArray[0];//��Ԫ�أ�����ĳ���Ὣ���ڵ�ɾ��������������滹��ʹ�øýڵ��е����ݣ���Ҫ�Ƚ��ýڵ㱣������
		heapArray[0]=heapArray[currentSize-1];//step1:�����ڵ�ɾ���������������һ���ڵ�ŵ����ڵ��λ�ã�����ʹ��ɾ�����ڵ��Ķѻ�����ȫ��������
		currentSize--;//step2��ɾ����һ���ڵ㣬���Զ�����ĵ�ǰ��СҪ��һ
		this.tricleDownNode(0);//step3:�˲��轫ǰ������������ȫ�������������������
		return root;
	}
	/**
	 * @description:����������ڸ���ĳ���ڵ�Ĺؼ�ֵ��С�����ڸ��ĺ��Զ�����������ʹ��������������������ڵ�ؼ�ֵ�������ӽڵ�Ĺؼ�ֵ����
	 * @param index��int ���Ķ��ڵ������ֵ�����ýڵ��ڶ������е��±�ֵ��
	 * @param targetKey:String Ŀ�Ĺؼ���ֵ
	 * */
	public void changeKey(int index,String targetKey){
		if(index<0||index>=currentSize){
			System.out.println("������index������Χ��indexӦ����[0,"+currentSize+")��ȡֵ");
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
	 * @description:�����������ʹ�����ڵ�����"��·��"������ֱ���������������"������"(�����������ڵ�ؼ���ֵ���������ӽڵ�Ĺؼ��ֵ�ֵ)
	 * @param node:HeapNode ����ڵ㣬����������ʹ�������ڵ����ձ���������ȷ��λ�ã��Ӷ�ʹ�á�������ȫ����������̷��϶������Ķ�
	 * @param index:int ����ڵ��������е�λ�ã�Ҳ������ڵ��ڶ������е��±�
	 * ���˼·��������ڵ㿪ʼ��������·����������������ڵ�Ӧ�ñ����õ���ȷλ��
	 * 		     ��·���������ģ�����ڵ�-->����ڵ�ĸ��ڵ�-->����ڵ�ĸ��ڵ�ĸ��ڵ㣨������ʵ�ֵĶ���parentIndex=(childIndex-1)/2��
	 * 		     ��ֹ���������ڵ��±�<0,����;��ĳ�����ڵ�Ĺؼ�ֵ��������ڵ�Ĺؼ�ֵ
	 * */
	private void tricleUpNode(int index){
		HeapNode tmp=heapArray[index];//��ʱ�洢����ڵ�ĵ�ֵַ
		int currentIndex=index;//�ӵ�ǰ�ڵ㿪ʼ���š���·������������������ڵ�Ӧ�ñ����õ���ȷλ��
		int parentIndex=(currentIndex-1)/2;//���ڵ������±�
		
		//������ڵ�Ĺؼ�ֵ������ڵ�Ĺؼ�ֵС���򸸽ڵ�����
		while((parentIndex>=0)&&(heapArray[parentIndex].getKey().compareTo(heapArray[currentIndex].getKey())<0)){
			heapArray[currentIndex]=heapArray[parentIndex];
			currentIndex=parentIndex;
			parentIndex=(parentIndex-1)/2;
		}
		heapArray[currentIndex]=tmp;
	}
	/**
	 * @description:������ڵ㿪ʼ��������·�������²��ҡ������ڵ�Ӧ�ñ����õ�λ�ã����ҽ������ڵ���õ���ȷ��λ�ã�ʹ���������ȫ�������������������
	 * @param index:int ����ڵ��������е�λ�ã������±�
	 * ���˼·���Ӳ����ڵ�(����ڵ�)��ʼ��������·�����²��ң�ֱ���ҵ�����ڵ�Ӧ�ñ����õ���ȷλ��
	 * 		  �ӵ�ǰ�㵽��һ��������·����Ӧ��ѡ������·���أ���Ӧ��ѡ��ؼ�ֵ�ϴ���ӽڵ㹹��ʵ�����ߵ�·����
	 * 		��ֹ��������ǰ��ڵ���Ϊ���ڵ㣬�����ӽڵ�����ӽڵ�ؼ�ֵ������ǰ��ڵ�λ�þ�������ڵ�Ӧ�ñ����õ���ȷλ��
	 * 		��ֹ���������ҵ��˶�ĩβλ��*/
	private void tricleDownNode(int index){
		HeapNode tmp=heapArray[index];//step1����ʱ�洢����ڵ����
		int currentIndex=index;
		int leftChildIndex=2*currentIndex+1;
		int rightChildIndex=leftChildIndex+1;//����д���Աȳ˷���Щ����������ʡ����ʱ��
		while(leftChildIndex<currentSize){//������һ���ӽڵ�ʱ(Ҳ������ӵ�����ӽڵ�)
			boolean flagLeftChild=tmp.getKey().compareTo(heapArray[leftChildIndex].getKey())>0;//��ǰ�ڵ�ؼ�ֵ�������ӽڵ�Ĺؼ�ֵ�󣬸�ֵΪtrue
			
			if(rightChildIndex<currentSize){//ӵ�������ӽڵ�ʱ
				boolean flagRightChild=tmp.getKey().compareTo(heapArray[rightChildIndex].getKey())>0;//��ǰ�ڵ�Ĺؼ�ֵ�������ӽڵ�Ĺؼ�ֵ�󣬸�ֵΪtrue
				if(flagLeftChild&&flagRightChild){//������ڵ�ؼ�ֵ��heapArray[currentIndex]���ӽڵ�����ӽڵ㶼��ʱ��currentIndex��������ڵ�Ӧ�ñ����õ�λ��
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
			}else{//��ӵ��һ���ӽڵ�ʱ����ֻӵ�����ӽڵ�ʱ��
				if(flagLeftChild){//�����ǰ�ڵ�ؼ�ֵ�����ӽڵ�ؼ�ֵ�󣬾�����whileѭ����currentIndex��������ڵ�Ӧ�ò����λ��
					break;
				}else{
					heapArray[currentIndex]=heapArray[leftChildIndex];
					currentIndex=leftChildIndex;
					break;//�����Ѿ��Ƕ�ĩβ�����Կ�������whileѭ��
				}
			}	
		}//end while
		heapArray[currentIndex]=tmp;
	}//end tricleDownNode()
	//���Ƿ�Ϊ��
	public boolean isEmpty(){
		return currentSize==0;
	}
	//���Ƿ�����
	public boolean isFull(){
		return currentSize==maxSize;
	}
	//����չʾ����Ļ��
	public void displayHeap(){
		int layerNum=1;//ÿ��ڵ���Ŀ
		int index=0;//����Ԫ��������Ҳ���������±꣩
		//չʾ������
		System.out.println("heapArray:");
		for(;index<currentSize;index++){
			System.out.print(heapArray[index].getKey()+"  ");
		}
		/*
		//��������ʽչʾ�ѣ��д��Ľ���
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
