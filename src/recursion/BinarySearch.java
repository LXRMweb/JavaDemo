/*auth:lxrm
 * date:20160819
 * function:基于递归思想的二分查找程序
 * 			查找有序数组的某个特定的元素*/
package recursion;

public class BinarySearch {
	private long[] array;//long型数组，有序数组（较小元素放在下标较小处）
	private int nElements;//数组中现有元素个数
	public BinarySearch(int size){
		array=new long[size];
		nElements=0;
	}
	//返回数组中现有元素个数
	public int size(){
		return nElements;
	}
	/*按照关键字查询数组中特定元素
	 * @param long key:查询关键字
	 * @return int  :关键字对应数组元素的下标
	 * 编程思路：使用递归思想实现数组元素的二分查找
	 * 		1）包含两个函数*/
	//函数一：用于帮recycleFind()函数赋初始函数参数
	public int find(long searchKey){
		return recycleFind(searchKey,0,nElements-1);
	}
	//函数二：递归调用函数实现二分查找
	private int recycleFind(long searchKey,int lowerBoundary,int uperBoundary){
		int mid=(lowerBoundary+uperBoundary)/2;
		if(array[mid]==searchKey){
			return mid;
		}else if(lowerBoundary>uperBoundary){
			return -1;//返回值为-1表示没有在数组中找到相应的元素
		}else if(array[mid]<searchKey){
			return recycleFind(searchKey,mid+1,uperBoundary);
		}else{
			return recycleFind(searchKey,lowerBoundary,mid-1);
		}
	}
	//向数组插入函数（按照一定顺序插入，即使得数组中元素按照从小到大排列）
	public void insert(long data){
		int i,j;
		for(i=0;i<nElements;i++){
			if(array[i]>=data){
				break;
			}
		}
		for(j=nElements;j>i;j--){
			array[j]=array[j-1];
		}
		array[j]=data;
		nElements++;
	}
	//后台打印输出数组中所有元素
	public void display(){
		System.out.println("数组中所有元素：");
		for(int j=0;j<nElements;j++){
			System.out.println("array["+j+"]="+array[j]);
		}
	}
}
