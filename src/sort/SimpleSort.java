/*本程序是一个简单排序算法的实现，对一个long型的数组进行排序（将数组中的元素从小到大排序，数组尾部为最大元素）
 * Simple sort:简单排序算法
 * 			bubble sort：冒泡排序
 * 			Select sort:选择排序
 * */
package sort;

public class SimpleSort {
	private long[] array;//接收待排序的数组的地址值，并未分配新的内存空间
	private int length;//存放待排序数组的长度
	public SimpleSort(long[] arr){
		//array=new long[arr.length];
		array=arr;//并未分配新的内存空间，只是让this.array指向参数arr所在的内存空间
		this.length=array.length;
	}
	/*function:冒泡排序算法,将最小的数据项放在数组的最左边
	 * @return：排序后的数组*/
	public long[] bubbleSort(){
		for(int i=length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(array[j]>array[j+1]){
					this.swap(j,j+1);
				}
			}
		}
		return array;
	}
	/*fuction:选择排序算法，将数组中的数按照从小到大排序
	 * @return：排好序后的数组*/
	public long[] selectSort(){
		int key=0;//记录下每轮循环中最小元素的下标
		int i=0;
		int j=0;
		for(j=0;j<length;j++){
			key=j;//先认定新一轮循环中     该轮循环最左侧的元素     为  该轮循环所有剩余元素中的最小值
			for(i=j+1;i<length;i++){
				if(array[key]>array[i]){
					key=i;
				}
			}
			this.swap(key,j);
		}
		return array;
	}
	/*fuction:插入排序，将数组中的数按照从小到大排序
	 * 插入排序思想：原来的无序数组存放着所有无序的数，另外开辟一个内存空间long tmp=array[待插入]本轮待插入的数组元素的值
	 * 			tmp依次和左侧已经有序的序列进行比较，直到找到比tmp小的元素，记下该元素的下标key，
	 * 			元素array[key+1]直到array[待插入元素下标-1]之间的元素依次后移
	 * 			array[key+1]=tmp
	 * 			进行下一轮插入
	 *  @return：排好序后的数组*/
	public long[] insertSort(){
		for(int i=1;i<length;i++){//每次插入一个元素进行一轮循环
			long tmp=array[i];//将待插入的元素放在tmp中
			int j;
			for(j=0;j<i;j++){//找到待插入元素左侧比待插入元素小的元素的下标j
				if(array[j]>tmp){
					break;
				}
			}
			for(int k=i;k>j;k--){//元素array[key+1]直到array[待插入元素下标-1]之间的元素依次后移
				array[k]=array[k-1];
			}
			array[j]=tmp;//array[key+1]=tmp
		}
		return array;
	}
	/*function：将下标为i和j的两个元素进行交换*/
	public void swap(int i,int j){
		long tmp=array[i];
		array[i]=array[j];
		array[j]=tmp;
	}
}
