//lxrm:使用希尔排序算法将数组进行排序（从小到大）
package sort;

public class ShellSort {
	private long[] array;
	private int num;//数组中元素个数
	public ShellSort(long[] array){
		this.array=array;
		this.num=array.length;
	}
	//使用希尔排序算法对无序数组进行排序，（从小到大）
	public void shellSort(){
	/*step1：计算出希尔排序的初始增量（Kunth序列中小于数组大小num的最大值）
	 * 		Kunth序列:(h=3*h+1),1/4/13/40/121/...\
	 * 		例子：一个拥有10个元素的数组，其初始增量就为4
	 */
		int h=this.initH(num);
				
	/*step2：以增量为步长，将原始待排序数组分成若干子数组，并将子数组进行直接插入排序（编程思想：将array[h0]到array[num-1]这些元素依次插入到 “对应的子序列”  中）
	 * step3：减小增量（步长），并将step2中排序后的数组重新分组，并将新的子数组进行直接插入排序
	 * step4：终止条件：直到增量==1并进行直接插入排序后终止
	 * 拓展：子数组内部进行直接插入排序的编程思路如下
	 * 			49   38   65   97   26   13   27   49   55   4（原始待排序数组）

				1A                  1B					1C		（第一个子序列）
				
				     2A                  2B					 2C （第二个子序列）
				
				          3A                  3B				（第三个子序列）
				
				                4A                  4B			（第四个子序列）
			子序列直接插入排序思路：将1B插入第一个子序列中，将2B插入第二个子序列中，将3B插入第三个子序列中，将4B插入第四个子序列中
							将1C插入第一个子序列中，将2C插入第二个子序列中
	 */
		while(h>=1){//外层循环，每一个”“增量”对应一轮本层循环
			for(int j=h;j<num;j++){//对于一个确定好了的增量，将分成的各个子序列分别排好序（编程思想：将array[h0]到array[num-1]这些元素依次插入到 “对应的子序列”  中）
				long tmp=array[j];//待插入数据
				while(((j-h)>=0)&&tmp<array[j-h]){//将待插入数据插入到         对应的子序列中
					array[j]=array[j-h];
					j=j-h;
				}
				array[j]=tmp;
			}
			h=(h-1)/3;//减小希尔排序增量，进行下一轮“增量排序”
		}
		
		
	}
	
	/*
	 * 用于计算希尔排序的初始增量（Kunth序列中小于数组大小num的最大值）
	 * 		Kunth序列:(h=3*h+1),1/4/13/40/121/...\
	 * 		例子：一个拥有10个元素的数组，其初始增量就为4
	 */
	public int initH(int num){
		int h=1;
		while(h<num){
			h=3*h+1;
		}
		if(h>=num){
			h=(h-1)/3;
		}
		return h;
	}
	
}
