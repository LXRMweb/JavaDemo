package test;

import POJO.Student;
import array.IntArray;
import array.OrderedIntArray;
import array.StudentArray;
import linklist.DoubleDirectionStudentLinkList;
import linklist.DoubleEndStudentLinkList;
import linklist.Link;
import linklist.OrderedStudentLinkList;
import linklist.SingleEndStudentLinkList;
import linklist.SingleLinkList;
import linklist.StudentLink;
import linklist.application.linklist_to_sortedArray;
import queue.array_to_queue.LongPriorityQueue;
import queue.array_to_queue.LongQueue;
import queue.array_to_queue.StudentPriorityQueue;
import queue.linklist_to_queue.StudentQueue;
import recursion.BinarySearch;
import recursion.SimpleApplicationOfRecursion;
import stack.array_to_stack.CharStack;
import stack.linklist_to_stack.StudentStack;
import array.ArrayToStack;
import sort.QuickSort;
import sort.ShellSort;
import sort.SimpleSort;
import stack.useStack.DelimiterMatches;
import tree.Heap;

public class testmain {
	public static void main(String[] args){
/*����StudentArray.java�Ĳ��Դ���
 * �ִ�bug:�����addStudent()����δͨ������
 */
		/*
		Student stu1=new Student("056","chen");
		Student stu2=new Student("002","Bu");
		Student stu3=new Student("4","lu");
		Student stu4=new Student("587","Ahen");
		Student stu5=new Student("032","bu");
		Student stu6=new Student("003","au");
		StudentArray studentArray=new StudentArray();
		
		studentArray.addStudent(stu1);
		studentArray.addStudent(stu2);
		studentArray.addStudent(stu3);
		studentArray.addStudent(stu4);
		studentArray.addStudent(stu5);
		studentArray.addStudent(stu6);
		System.out.println("����ǰ");
		studentArray.list();
		//studentArray.findStudent(stu1);
		//studentArray.delete(stu2);
		System.out.println("����student��idѡ������");
		studentArray.insertionSortByStuentId();
		studentArray.list();
		System.out.println("����student��id�����");
		studentArray.selectSortByStudentId();
		studentArray.list();
*/
		
/*IntArray.java�Ĳ���*/
/*
		IntArray int_arr=new IntArray();
		System.out.println("����������Ԫ��(����Ϊ��ʱ)��"+int_arr.findMax());
		int_arr.insert(5);
		int_arr.insert(2);
		int_arr.insert(1);
		int_arr.insert(5);
		int_arr.insert(2);
		int_arr.display();
		System.out.println("����������Ԫ�ص��±꣺"+int_arr.findMax());
		int_arr.removeMax();
		System.out.println("ɾ������������Ԫ��");
		int_arr.display();
		*/
		
		
/*����OrderedIntArray.java�Ĳ��Դ���
		 * �ִ�bug:�����find()����δͨ������,��ʱ���ܲ鵽Ԫ��λ�ã����ڵ�Ԫ�ط������±꣬�����ڵ�Ԫ�ط�����-1����������ʱ��Ҫִ�кܳ�ʱ�䶼û�ж���
		 */		
/*
		OrderedIntArray ordered_arr=new OrderedIntArray();
		ordered_arr.insert(3);
		ordered_arr.insert(100);
		ordered_arr.insert(60);
		ordered_arr.insert(1);
		ordered_arr.insert(3);
		ordered_arr.insert(67);
		ordered_arr.display();
		System.out.println("ɾ��67");
		ordered_arr.delete(3);
		System.out.println("ɾ��67�������е�����Ԫ��");
		ordered_arr.display();
		System.out.println("ɾ��101");
		ordered_arr.delete(101);
		ordered_arr.display();
		System.out.println("����180,Ԫ��180�������е�λ�ã��±꣩��"+ordered_arr.find(180));
		System.out.println("����67,Ԫ��67�������е�λ�ã��±꣩��"+ordered_arr.find(67));
*/
		
		
/*����ð�������㷨*/
		/*
		long[] myArr={98,3,0,78,23,1,34,89,36,990};
		SimpleSort sort=new SimpleSort(myArr);
		sort.insertSort();
		
		for(int j=0;j<myArr.length;j++){
			System.out.println("myArr["+j+"]:"+myArr[j]);
		}
		
		int size=1000;
		long[] myArr2=new long[size];
		for(int i=0;i<size;i++){
			myArr2[i]=(long) java.lang.Math.random()*1000000;
			System.out.println(myArr2[i]);
		}
		SimpleSort sort2=new SimpleSort(myArr2);
		sort2.bubbleSort();
		for(int j=0;j<myArr2.length;j++){
			System.out.println("myArr2["+j+"]:"+myArr2[j]);
		}
		*/
		
/*ʹ�������������ݽṹʵ�ֵ�stack������ArrayToStack.java*/
		/*
		ArrayToStack stack=new ArrayToStack(10);
		stack.push(2);
		stack.push(6);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		*/
		
		/*����CharStack.java
		CharStack stack=new CharStack(10);
		stack.push('h');
		stack.push('e');
		stack.push('l');
		stack.push('l');
		stack.push('o');
		stack.push('m');
		System.out.println(stack.length());
		for(int j=0;j<10;j++){
			System.out.println(stack.pop());
		}
		*/
		
/*����DelimiterMatches.java*/
		/*
		DelimiterMatches match=new DelimiterMatches();
		String s="hiuyh{}[]}h{k[()9((kkk))0)](kk)[[[";
		match.check(s);
		*/
		
//����LongQueue.java
		/*
		LongQueue queue=new LongQueue(10);
		queue.enterQueue(3);
		queue.enterQueue(4);
		queue.enterQueue(6);
		queue.enterQueue(8);
		queue.enterQueue(9);
		queue.enterQueue(111);
		queue.enterQueue(13);
		queue.enterQueue(57);
		queue.enterQueue(1);
		queue.enterQueue(89);
		queue.enterQueue(1234);
		queue.enterQueue(678);
		queue.displayQueue();
		//queue.displayArray();
		System.out.println(queue.outQueue()+"����");
		System.out.println(queue.outQueue()+"����");
		System.out.println(queue.outQueue()+"����");
		System.out.println(queue.outQueue()+"����");
		System.out.println("�µ�Ԫ��13��57��1�ֱ����");
		
		queue.enterQueue(13);
		queue.enterQueue(57);
		queue.enterQueue(1);
		System.out.println("�µ�Ԫ�����֮��");
		queue.displayQueue();
		//queue.displayArray();
//�������ȼ����У�Ԫ������Ϊlong��    LongPriorityQueue.java
		/*
		LongPriorityQueue queue=new LongPriorityQueue(10);
		
		System.out.println("��ʼ״̬�µĶ��У����ʶ���Ԫ��"+queue.peekHead());
		queue.outQueue();
		//System.out.println("��ʼ״̬�µĶ��У�num="+queue.num());
		queue.enterQueue(12);
		queue.enterQueue(7);
		queue.enterQueue(4);
		queue.enterQueue(176);
		queue.enterQueue(90);
		queue.enterQueue(345);
		queue.enterQueue(12);
		queue.enterQueue(7);
		queue.enterQueue(4);
		queue.enterQueue(178);
		queue.enterQueue(90);
		queue.enterQueue(345);
		queue.dispalyArray();
		//System.out.println(queue.peekEnd());
		System.out.println("����Ԫ�غ����"+queue.peekHead());
		System.out.println("�Ӷ�����ȡ��Ԫ��");
		System.out.println(queue.outQueue());
		System.out.println(queue.outQueue());
		System.out.println(queue.outQueue());
		
		
		queue.enterQueue(81);
		queue.enterQueue(82);
		queue.enterQueue(83);
		queue.enterQueue(84);
		queue.enterQueue(85);
		queue.dispalyArray();
		//System.out.println(queue.peekEnd());
		System.out.println(queue.peekHead());
		*/
//����StudentPriorityQueue.java
		/*
		Student stu1=new Student("056","chen");
		Student stu2=new Student("002","Bu");
		Student stu3=new Student("4","lu");
		Student stu4=new Student("587","Ahen");
		Student stu5=new Student("032","bu");
		Student stu6=new Student("003","au");
	
		StudentPriorityQueue queue=new StudentPriorityQueue(10);
		System.out.println("��ͼ�ӿյĶ�����ȡ������Ԫ��ʱ������ֵ="+queue.outQueue());
		queue.enterQueue(stu1);
		queue.enterQueue(stu2);
		queue.enterQueue(stu3);
		queue.enterQueue(stu4);
		queue.enterQueue(stu5);
		queue.enterQueue(stu6);
		queue.enterQueue(stu1);
		queue.enterQueue(stu2);
		queue.enterQueue(stu3);
		queue.enterQueue(stu4);
		queue.enterQueue(stu5);
		queue.enterQueue(stu6);
		queue.dispalyQueue();
		System.out.println("ȡ������Ԫ��"+queue.outQueue().getId());
		System.out.println("ȡ������Ԫ��"+queue.outQueue().getId());
		System.out.println("ȡ������Ԫ��"+queue.outQueue().getId());
		*/
//����SingleLinkList.java
		/*
		String key="001";
		int intData=12;
		String str="lxrm";
		Link link=new Link(key,intData,str);
		link.displayLink();
		
		SingleLinkList list=new SingleLinkList();
		list.displayLinkList();
		list.insertFirst("001", 12, "lxrm1");
		list.insertFirst("002", 12, "lxrm2");
		list.insertFirst("003", 12, "lxrm3");
		list.insertFirst("004", 12, "lxrm1");
		list.insertFirst("005", 12, "lxrm4");
		list.displayLinkList();
		list.deleteLink("003");
		list.displayLinkList();
		link=list.findLink("005");
		link.displayLink();
		link=list.findLink("003");
*/
		
		
//����linklist_to_sortedArray.javaʹ������ʵ����������ĳ���
		/*
		Student stu1=new Student("056","chen");
		Student stu2=new Student("002","Bu");
		Student stu3=new Student("4","lu");
		Student stu4=new Student("587","Ahen");
		Student stu5=new Student("032","bu");
		Student stu6=new Student("003","au");
		Student[] stu=new Student[6];
		stu[0]=stu1;
		stu[1]=stu2;
		stu[2]=stu3;
		stu[3]=stu4;
		stu[4]=stu5;
		stu[5]=stu6;
		linklist_to_sortedArray toOrderedArray=new linklist_to_sortedArray();
		stu=toOrderedArray.toOrderedArray(stu);
		for(int i=0;i<stu.length;i++){
			System.out.println(stu[i].getId());
		}
	

//����OrderedStudentLinkList.javaʵ����������ĳ���
		/*Student stu1=new Student("056","chen");
		Student stu2=new Student("002","Bu");
		Student stu3=new Student("4","lu");
		Student stu4=new Student("587","Ahen");
		Student stu5=new Student("032","bu");
		Student stu6=new Student("003","au");
		
		OrderedStudentLinkList stuList=new OrderedStudentLinkList();
		stuList.insertByOrder_firstMax(stu6);
		stuList.insertByOrder_firstMax(stu3);
		stuList.insertByOrder_firstMax(stu1);
		stuList.insertByOrder_firstMax(stu2);
		stuList.insertByOrder_firstMax(stu4);
		stuList.insertByOrder_firstMax(stu5);
		stuList.insertByOrder_firstMax(stu2);
		stuList.insertByOrder_firstMax(stu4);
		stuList.insertByOrder_firstMax(stu5);
		System.out.println("��������");
		
		stuList.displayList();
		*/
		
/*		
//����DoubleDirectionStudentLinkList.javaʵ��˫������ĳ���
		Student stu1=new Student("056","chen");
		Student stu2=new Student("002","Bu");
		Student stu3=new Student("4","lu");
		Student stu4=new Student("587","Ahen");
		Student stu5=new Student("032","bu");
		Student stu6=new Student("003","au");
		DoubleDirectionStudentLinkList list=new DoubleDirectionStudentLinkList();
		list.displayForward();
		
		list.insertFirst(stu6);
		list.insertFirst(stu5);
		list.insertFirst(stu4);
		list.insertLast(stu1);
		list.insertLast(stu2);
		list.insertLast(stu1);
		list.displayForward();
		
		String str="003";
		System.out.println("����findLink(string key)������");
		if(list.findLink(str)==null){
			System.out.println("û���ҵ���Ӧ�Ľڵ�stuId="+str);
		}else{
			System.out.println("�ҵ�����Ӧ�ڵ�stuId="+str);
			list.findLink(str).dispalyLink();
		}
		
		list.insertAfter("056", stu3);
		System.out.println("��stuId=056�������stuId=4��data");
		list.displayForward();
		
		
		for(int i=0;i<4;i++){
			System.out.println("��wei��ɾ�����ڵ�"+i);
			list.deleteLast();
			list.displayForward();
			list.displayBackword();
		}
		list.insertAfter("003", stu3);
		System.out.println("��stuId=003�������stuId=4��data");
		list.displayForward();
*/
		
//�ݹ�˼��ļ�Ӧ��
/*
		SimpleApplicationOfRecursion recursion=new SimpleApplicationOfRecursion();
		for(int i=-1;i<8;i++){
			System.out.println("��"+i+"���������֣�"+recursion.triangle(i));
			System.out.println(i+"�Ľ׳�i!="+recursion.factorial(i));
		}
*/	
		
/*		BinarySearch search=new BinarySearch(10);
		search.insert(9);
		search.insert(5);
		for(int j=0;j<5;j++){
			search.insert(j);
		}
		search.insert(-1);
		search.display();
		System.out.println(search.find(9));
	}
	*/


//���Կ��������㷨��class QuickSort
/*
 
		int num=100;
		long[] array=new long[num];
		for(int i=0;i<num;i++){
			array[i]=(long)(java.lang.Math.random()*999);
			
		}
		
		QuickSort partition=new QuickSort(array);
		System.out.println("����֮ǰ�����飺");
		partition.displayArray();
		partition.quickSort(0,99);
		System.out.println("����֮������飺");
		partition.displayArray();
*/	
		
		
//���Զ�Heap.java
/*���Խ�������ֲ���Ͳ��ԣ�����8,8ʼ����rootλ�ã�λ�ò���*/
		Student stu=new Student();
		double data=10.34;
		Heap heap=new Heap(100);
		heap.insert("23",10.3,stu);
		heap.insert("67", data, stu);
		heap.displayHeap();
		heap.insert("8", data, stu);
		heap.displayHeap();
		heap.insert("3",10.3,stu);
		heap.insert("670", data, stu);
		heap.insert("35", data, stu);
		heap.displayHeap();
	}//end main()
}//end class