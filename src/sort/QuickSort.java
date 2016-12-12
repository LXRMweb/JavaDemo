/*lxrm
 * 20160926
 * 
 */

package sort;

public class QuickSort {
	private long[] array;
	private int num;
	public QuickSort(long[] array){
		this.array=array;
		this.num=array.length;
	}
	public void quickSort(int left,int right){
	    if(left>=right){//终止条件，当子数组中元素个数小于等于1时，退出排序
	    	return;
	    }else{
	    	int index=this.partition(left, right, array[right]);//以每个待排序的子数组的最右侧元素作为“枢纽”进行“划分”，使得左侧数组元素全小于“枢纽值”，右侧元素全大于或等于枢纽值
			swap(index,right);//每次“划分”之后，将枢纽放在正确的位置，枢纽元素就算排好序了
			this.quickSort(left, index-1);//递归调用快速排序函数，对枢纽元素左侧子数组（不包括“枢纽元素”）进行快速排序
			this.quickSort(index+1, right);//递归调用快速排序函数，对枢纽元素右侧子数组（不包括“枢纽元素”）进行快速排序
	    }
		
	}
	/*function:将数组进行划分（小于关键值的元素被放在左边，大于关键值的元素被放在右边）
	 * 			
	 * 编程思路：1)初始状态下left、right分别指向arr[0]和arr[num-1]
	 * 		  2）left++,直到找到>关键值的元素
	 * 		  3）right--，直到找到<关键值的元素
	 * 		  4)arr[left]和arr[right]交换
	 * 		  5）终止条件为left++和right--相等
	 
	 * @param pivot:long 枢纽（数组划分的关键值/界线值）
	 * @param left:int 待“划分”数组最左侧元素下标（如 0）
	 * @param right:int 待“划分”数组最右侧元素下标（如 num-1）
	 * @return index:int  枢纽应该在数组中的位置
	 */
	public int partition(int left,int right,long pivot){
		while(true){
			while(array[left++]<pivot);
			while(array[right--]>=pivot);
			if(--left<++right){
				swap(left,right);
				left++;
				right--;
				continue;
			}else{
				break;
			}
		}
		int index=right+1;
		return index;
	}
	public void displayArray(){
		for(int i=0;i<num;i++){
			System.out.println("array["+i+"]="+array[i]);
		}
	}
	private void swap(int i,int j){
		long tmp=0;
		tmp=array[i];
		array[i]=array[j];
		array[j]=tmp;
	}
}
