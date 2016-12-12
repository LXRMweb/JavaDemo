package array;

import POJO.Student;

public class StudentArray {
	private Student[] stu_arr;
	private int num;//记录数组现有元素个数
	/*-------构造函数------
	 * 		不指定数组大小时默认生成一个大小为10的数组*/
	public StudentArray(){
		stu_arr=new Student[10];
		num=0;
		System.out.println("进入了StudentArray的构造函数，初始元素个数num："+num+"");
	}
	public StudentArray(int size){
		stu_arr=new Student[size];
		num=0;
		System.out.println("进入了StudentArray的构造函数，初始元素个数num："+num+"");
	}
	/*function：向数组中添加元素
	 * @param stu:待添加的元素
	 * @return num：添加完该元素后数组中元素个数*/
	public int addStudent(Student stu){
		stu_arr[num]=stu;
		//stu_arr[this.num].setId(stu.getId());
		//stu_arr[this.num].setName(stu.getName());
		num++;
		return num;
	}
	/*function:在数组中查找指定元素(找出第一个)该元素
	 * @param stu:待查找的元素
	 * @return flag：如果查到了该条记录，flag=true
	 * */
	public boolean findStudent(Student stu){
		boolean flag=false;
		int i;
		for(i=0;i<this.num;i++){
			if(stu_arr[i].equals(stu)){
				break;
			}
		}
		if(i==num){
			System.out.println("没有找到该条信息:stuId--"+stu.getId()+"   stuName:--"+stu.getName());
			return flag;
		}else{
			flag=true;
			System.out.println("found:stuId--"+stu.getId()+"   stuName:--"+stu.getName());
			System.out.println("是数组中的第"+i+"个元素");
			return flag;
		}
	}
	/*function:删除数组中第一个该元素
	 * */
	public void delete(Student stu){
		int i;
		//先在数组中查找该元素
		for(i=0;i<num;i++){
			if(stu_arr[i].equals(stu)){
				break;
			}
		}
		//根据查找结果分别进行不同的后续处理
		if(i==num){//没有找到该元素的情况
			System.out.println("没有找到该元素");
		}else if(i==num-1){//该元素恰巧是数组末尾元素的情况
			stu_arr[i].setId(null);
			stu_arr[i].setId(null);
			num--;
		}else{
			for(int j=i;j<num-1;j++){
				stu_arr[j].setId(stu_arr[j+1].getId());
				stu_arr[j].setName(stu_arr[j+1].getName());
			}
			num--;
		}	
	}
	/*function：将stu_arr数组中的student类型的元素进行排序(使用的排序算法是冒泡排序算法)
	 * 			排序的关键字是student的name属性的值
	 * 			不区分大小写
	 * 			按照a，b,c.....的顺序排序*/
	public Student[] bubbleSortByStudentName(){
		int i,out;
		for(out=num;out>1;out--){
			for(i=0;i<out-1;i++){
				if(stu_arr[i].getName().compareToIgnoreCase(stu_arr[i+1].getName())>0){
					swap(i,i+1);
				}
			}
		}
		return this.stu_arr;
	}
	/*function:使用选择排序算法
	 * 		将stu_arr中的student类型的元素
	 * 		按照studentId属性的值从小到大排列*/
	public Student[] selectSortByStudentId(){
		int in,out,key;
		for(out=0;out<num-1;out++){
			key=out;
			for(in=key+1;in<num;in++){
				if(stu_arr[key].getId().compareTo(stu_arr[in].getId())>0){
					key=in;
				}
			}
			if(key!=out){
				swap(key,out);
			}
		}
		return stu_arr;
	}
	public Student[] insertionSortByStuentId(){
		int out,in;
		Student tmp;
		for(out=1;out<num;out++){
			tmp=stu_arr[out];
			in=out;
			while(((--in)>=0)&&(tmp.getId().compareTo(stu_arr[in].getId())<0)){
				stu_arr[in+1]=stu_arr[in];
			}
			stu_arr[in+1]=tmp;
		}
		return stu_arr;
	}
	/*function:将数组中位于位置i和j处的元素交换*/
	public void swap(int i,int j){
		Student tmp=stu_arr[i];
		stu_arr[i]=stu_arr[j];
		stu_arr[j]=tmp;
	}
	/*function:输出数组中所有元素*/
	public void list(){
		System.out.println("---数组现有元素个数："+num);
		for(int i=0;i<num;i++){
			System.out.println("stuId--->"+stu_arr[i].getId()+"   stuName--->"+stu_arr[i].getName());
		}
	}
	public Student[] getStu_arr(){
		return this.stu_arr;
	}
}
