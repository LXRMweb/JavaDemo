package array;

public class IntArray {
	private int[] intArray;
	private int num;//数组中现有元素个数
	
	/*============构造函数=========*/
	public IntArray(){
		intArray=new int[10];
		num=0;
	}
	public IntArray(int size){
		intArray=new int[size];
		num=0;
	}
	
	/*===========成员函数==========*/
	/*function:向数组中添加一个元素
	 * @return：num 添加了该元素后数组中元素个数
	 * */
	public int insert(int data){
		intArray[num]=data;
		num++;
		return num;
	}
	/*function:在数组中查找该元素，若查找到该元素则返回该元素的元素下标i，
	 * 			若没有查找到该元素则返回值为-1
	 * @return:若查找到该元素则返回值为该元素的元素下标i，若没有查找到该元素则返回值为-1*/
	public int find(int data){
		int i;
		for(i=0;i<num;i++){
			if(intArray[i]==data){
				break;
			}
		}
		if(i==num){
			System.out.println("data:"+data+"not found!");
			return -1;
		}else{
			System.out.println("data:"+data+"found.");
			return i;
		}
	}
	/*function:在数组中查找到第一个该元素并将其从数组中删除
	 * @param data:待删除的对象
	 * @return num:删除该元素后数组中元素的个数*/
	public int delete(int data){
		int i;
		if(this.find(data)==-1){//没有找到该元素的情况下
			//System.out.println("data:"+data+"not found!");
			return this.num;
		}else{//找到了该元素的情况下
			i=this.find(data);
			for(int j=i;j<num-1;j++){
				intArray[j]=intArray[j+1];
			}
			num--;
			return num;
		}
	}
	/*function:找到数组中最大的数，数组为空时返回值为-1,
	 * @return：数组为空时返回值为-1；数组不为空时返回值为该数组中最大的元素的位置（即元素下标）*/
	public int findMax(){
		if(num==0){
			return -1;
		}else{
			int tmp=intArray[0];
			int key=0;
			for(int j=0;j<num;j++){
				if(tmp<intArray[j]){
					tmp=intArray[j];
					key=j;
				}
			}
			System.out.println("数组中最大的元素为："+tmp);
			return key;
		}
	}
	/*function:删除数组中最大的元素，数组为空时不进行删除操作直接返回false
	 * @return:数组为空时，返回值为false；数组不为空且成功找到并删除了最大元素时返回值为true*/
	public boolean removeMax(){
		if(num==0){
			System.out.println("数组为空，该操作无意义");
			return false;
		}else{
			int key=this.findMax();
			for(int j=key;j<num-1;j++){
				intArray[j]=intArray[j+1];
			}
			num--;
			return true;
		}
	}
	/*function:将数组中所有元素进行输出*/
	public void display(){
		System.out.println("数组中现有元素个数为："+num);
		System.out.println("元素列表如下：");
		for(int i=0;i<num;i++){
			System.out.println("int_arr["+i+"]:"+intArray[i]);
		}
	}
}
