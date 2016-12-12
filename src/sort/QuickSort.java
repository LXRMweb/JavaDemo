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
	    if(left>=right){//��ֹ����������������Ԫ�ظ���С�ڵ���1ʱ���˳�����
	    	return;
	    }else{
	    	int index=this.partition(left, right, array[right]);//��ÿ�������������������Ҳ�Ԫ����Ϊ����Ŧ�����С����֡���ʹ���������Ԫ��ȫС�ڡ���Ŧֵ�����Ҳ�Ԫ��ȫ���ڻ������Ŧֵ
			swap(index,right);//ÿ�Ρ����֡�֮�󣬽���Ŧ������ȷ��λ�ã���ŦԪ�ؾ����ź�����
			this.quickSort(left, index-1);//�ݹ���ÿ���������������ŦԪ����������飨����������ŦԪ�ء������п�������
			this.quickSort(index+1, right);//�ݹ���ÿ���������������ŦԪ���Ҳ������飨����������ŦԪ�ء������п�������
	    }
		
	}
	/*function:��������л��֣�С�ڹؼ�ֵ��Ԫ�ر�������ߣ����ڹؼ�ֵ��Ԫ�ر������ұߣ�
	 * 			
	 * ���˼·��1)��ʼ״̬��left��right�ֱ�ָ��arr[0]��arr[num-1]
	 * 		  2��left++,ֱ���ҵ�>�ؼ�ֵ��Ԫ��
	 * 		  3��right--��ֱ���ҵ�<�ؼ�ֵ��Ԫ��
	 * 		  4)arr[left]��arr[right]����
	 * 		  5����ֹ����Ϊleft++��right--���
	 
	 * @param pivot:long ��Ŧ�����黮�ֵĹؼ�ֵ/����ֵ��
	 * @param left:int �������֡����������Ԫ���±꣨�� 0��
	 * @param right:int �������֡��������Ҳ�Ԫ���±꣨�� num-1��
	 * @return index:int  ��ŦӦ���������е�λ��
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
