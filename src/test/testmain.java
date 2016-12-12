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
/*对于StudentArray.java的测试代码
 * 现存bug:该类的addStudent()方法未通过测试
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
		System.out.println("排序前");
		studentArray.list();
		//studentArray.findStudent(stu1);
		//studentArray.delete(stu2);
		System.out.println("按照student的id选择排序");
		studentArray.insertionSortByStuentId();
		studentArray.list();
		System.out.println("按照student的id排序后");
		studentArray.selectSortByStudentId();
		studentArray.list();
*/
		
/*IntArray.java的测试*/
/*
		IntArray int_arr=new IntArray();
		System.out.println("数组中最大的元素(数组为空时)："+int_arr.findMax());
		int_arr.insert(5);
		int_arr.insert(2);
		int_arr.insert(1);
		int_arr.insert(5);
		int_arr.insert(2);
		int_arr.display();
		System.out.println("数组中最大的元素的下标："+int_arr.findMax());
		int_arr.removeMax();
		System.out.println("删除数组中最大的元素");
		int_arr.display();
		*/
		
		
/*对于OrderedIntArray.java的测试代码
		 * 现存bug:该类的find()方法未通过测试,有时候能查到元素位置（存在的元素反回来下标，不存在的元素返回了-1），但是有时候要执行很长时间都没有动静
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
		System.out.println("删除67");
		ordered_arr.delete(3);
		System.out.println("删除67后数组中的所有元素");
		ordered_arr.display();
		System.out.println("删除101");
		ordered_arr.delete(101);
		ordered_arr.display();
		System.out.println("查找180,元素180在数组中的位置（下标）："+ordered_arr.find(180));
		System.out.println("查找67,元素67在数组中的位置（下标）："+ordered_arr.find(67));
*/
		
		
/*测试冒泡排序算法*/
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
		
/*使用数组这种数据结构实现的stack，测试ArrayToStack.java*/
		/*
		ArrayToStack stack=new ArrayToStack(10);
		stack.push(2);
		stack.push(6);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		*/
		
		/*测试CharStack.java
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
		
/*测试DelimiterMatches.java*/
		/*
		DelimiterMatches match=new DelimiterMatches();
		String s="hiuyh{}[]}h{k[()9((kkk))0)](kk)[[[";
		match.check(s);
		*/
		
//测试LongQueue.java
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
		System.out.println(queue.outQueue()+"出队");
		System.out.println(queue.outQueue()+"出队");
		System.out.println(queue.outQueue()+"出队");
		System.out.println(queue.outQueue()+"出队");
		System.out.println("新的元素13、57、1分别入队");
		
		queue.enterQueue(13);
		queue.enterQueue(57);
		queue.enterQueue(1);
		System.out.println("新的元素入队之后");
		queue.displayQueue();
		//queue.displayArray();
//测试优先级队列（元素类型为long）    LongPriorityQueue.java
		/*
		LongPriorityQueue queue=new LongPriorityQueue(10);
		
		System.out.println("初始状态下的队列，访问队首元素"+queue.peekHead());
		queue.outQueue();
		//System.out.println("初始状态下的队列，num="+queue.num());
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
		System.out.println("插入元素后队首"+queue.peekHead());
		System.out.println("从队列中取出元素");
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
//测试StudentPriorityQueue.java
		/*
		Student stu1=new Student("056","chen");
		Student stu2=new Student("002","Bu");
		Student stu3=new Student("4","lu");
		Student stu4=new Student("587","Ahen");
		Student stu5=new Student("032","bu");
		Student stu6=new Student("003","au");
	
		StudentPriorityQueue queue=new StudentPriorityQueue(10);
		System.out.println("企图从空的队列中取出队首元素时，返回值="+queue.outQueue());
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
		System.out.println("取出队首元素"+queue.outQueue().getId());
		System.out.println("取出队首元素"+queue.outQueue().getId());
		System.out.println("取出队首元素"+queue.outQueue().getId());
		*/
//测试SingleLinkList.java
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
		
		
//测试linklist_to_sortedArray.java使用链表实现有序数组的程序
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
	

//测试OrderedStudentLinkList.java实现有序链表的程序
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
		System.out.println("有序链表：");
		
		stuList.displayList();
		*/
		
/*		
//测试DoubleDirectionStudentLinkList.java实现双向链表的程序
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
		System.out.println("测试findLink(string key)函数：");
		if(list.findLink(str)==null){
			System.out.println("没有找到相应的节点stuId="+str);
		}else{
			System.out.println("找到了相应节点stuId="+str);
			list.findLink(str).dispalyLink();
		}
		
		list.insertAfter("056", stu3);
		System.out.println("在stuId=056后面插入stuId=4的data");
		list.displayForward();
		
		
		for(int i=0;i<4;i++){
			System.out.println("从wei部删除，节点"+i);
			list.deleteLast();
			list.displayForward();
			list.displayBackword();
		}
		list.insertAfter("003", stu3);
		System.out.println("在stuId=003后面插入stuId=4的data");
		list.displayForward();
*/
		
//递归思想的简单应用
/*
		SimpleApplicationOfRecursion recursion=new SimpleApplicationOfRecursion();
		for(int i=-1;i<8;i++){
			System.out.println("第"+i+"个三角数字："+recursion.triangle(i));
			System.out.println(i+"的阶乘i!="+recursion.factorial(i));
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


//测试快速排序算法，class QuickSort
/*
 
		int num=100;
		long[] array=new long[num];
		for(int i=0;i<num;i++){
			array[i]=(long)(java.lang.Math.random()*999);
			
		}
		
		QuickSort partition=new QuickSort(array);
		System.out.println("排序之前的数组：");
		partition.displayArray();
		partition.quickSort(0,99);
		System.out.println("划分之后的数组：");
		partition.displayArray();
*/	
		
		
//测试堆Heap.java
/*测试结果：发现插入就不对，插入8,8始终在root位置，位置不对*/
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