/* function:有序数组（元素按照从小到大的顺序存放）
 * features:(有序数组的特点)
 * 		插入，数据插入的时候，使用线性查找的办法找到要插入的位置,后面的元素依次后移（这样一来元素插入速度就会变得比无序数组中元素的插入慢得多）
 * 		查找特定元素：使用二分法查找
 * 		删除特定元素：二分法查找---->后面的元素前移*/
package array;

public class OrderedIntArray {
	private int[] ordered_arr;//有序数组
	private int num;//数组中现有元素个数
	/*==========构造函数=========*/
	public OrderedIntArray(){
		ordered_arr=new int[10];
		num=0;
	}
	public OrderedIntArray(int size){
		ordered_arr=new int[size];
		num=0;
	}
	/*function:向有序数组中插入一个元素
	 * 实现思路：使用线性查找的方法找到元素插入的位置，然后后面的元素依次后移
	 * @param  data：待插入的元素
	 * @return num：插入该元素之后数组中元素个数*/
	public int insert(int data){
		int j;
		for(j=0;j<num;j++){
			if(ordered_arr[j]>data){
				break;
			}
		}
		for(int k=num;k>j;k--){
			ordered_arr[k]=ordered_arr[k-1];
		}
		ordered_arr[j]=data;
		num++;
		return num;
	}
	/*function:数组中查找特定元素
	 * @param data:待查找元素
	 * @return：数组中没有 查找到该元素时，返回值为-1；找到该元素时，返回该元素在数组中的下标*/
	public int find(int data){
		int startIndex=0;
		int endIndex=num-1;
		int key=0;
		while(startIndex<=endIndex){
			key=startIndex+endIndex/2;
			if(ordered_arr[key]==data){
				return key;
			}else if(ordered_arr[key]>data){
				endIndex=key-1;
			}else{
				startIndex=key+1;
			}
		}
		return -1;//while的循环体中一直没有找到data元素，
		//进行了若干次循环之后startIndex>endIndex了，跳出while循环体，返回-1，向调用该函数的地方说明“数组中没有找到该元素”
	}
	/*function:从数组中删除特定元素
	 * 实现思路：使用二分法查找该元素，然后后面的元素左移
	 * @param data:待删除元素
	 * @return：数组中没有该元素时，返回值为-1；查找到该元素并将其成功删除时返回值为删除该元素后数组中元素个数*/
	public int delete(int data){
		if(this.find(data)==-1){
			System.out.println("数组中没有这样的元素");
			return -1;
		}else{
			int key=this.find(data);
			for(int j=key;j<num-1;j++){
				ordered_arr[j]=ordered_arr[j+1];
			}
			num--;
			return num;
		}
	}
	/*function:将数组中所有元素展示出来*/
	public void display(){
		System.out.println("数组中所有元素：");
		for(int i=0;i<num;i++){
			System.out.println("orderedArray["+i+"]:"+ordered_arr[i]);
		}
	}
}
