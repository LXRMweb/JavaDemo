/*��������һ���������㷨��ʵ�֣���һ��long�͵�����������򣨽������е�Ԫ�ش�С������������β��Ϊ���Ԫ�أ�
 * Simple sort:�������㷨
 * 			bubble sort��ð������
 * 			Select sort:ѡ������
 * */
package sort;

public class SimpleSort {
	private long[] array;//���մ����������ĵ�ֵַ����δ�����µ��ڴ�ռ�
	private int length;//��Ŵ���������ĳ���
	public SimpleSort(long[] arr){
		//array=new long[arr.length];
		array=arr;//��δ�����µ��ڴ�ռ䣬ֻ����this.arrayָ�����arr���ڵ��ڴ�ռ�
		this.length=array.length;
	}
	/*function:ð�������㷨,����С���������������������
	 * @return������������*/
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
	/*fuction:ѡ�������㷨���������е������մ�С��������
	 * @return���ź���������*/
	public long[] selectSort(){
		int key=0;//��¼��ÿ��ѭ������СԪ�ص��±�
		int i=0;
		int j=0;
		for(j=0;j<length;j++){
			key=j;//���϶���һ��ѭ����     ����ѭ��������Ԫ��     Ϊ  ����ѭ������ʣ��Ԫ���е���Сֵ
			for(i=j+1;i<length;i++){
				if(array[key]>array[i]){
					key=i;
				}
			}
			this.swap(key,j);
		}
		return array;
	}
	/*fuction:�������򣬽������е������մ�С��������
	 * ��������˼�룺ԭ��������������������������������⿪��һ���ڴ�ռ�long tmp=array[������]���ִ����������Ԫ�ص�ֵ
	 * 			tmp���κ�����Ѿ���������н��бȽϣ�ֱ���ҵ���tmpС��Ԫ�أ����¸�Ԫ�ص��±�key��
	 * 			Ԫ��array[key+1]ֱ��array[������Ԫ���±�-1]֮���Ԫ�����κ���
	 * 			array[key+1]=tmp
	 * 			������һ�ֲ���
	 *  @return���ź���������*/
	public long[] insertSort(){
		for(int i=1;i<length;i++){//ÿ�β���һ��Ԫ�ؽ���һ��ѭ��
			long tmp=array[i];//���������Ԫ�ط���tmp��
			int j;
			for(j=0;j<i;j++){//�ҵ�������Ԫ�����ȴ�����Ԫ��С��Ԫ�ص��±�j
				if(array[j]>tmp){
					break;
				}
			}
			for(int k=i;k>j;k--){//Ԫ��array[key+1]ֱ��array[������Ԫ���±�-1]֮���Ԫ�����κ���
				array[k]=array[k-1];
			}
			array[j]=tmp;//array[key+1]=tmp
		}
		return array;
	}
	/*function�����±�Ϊi��j������Ԫ�ؽ��н���*/
	public void swap(int i,int j){
		long tmp=array[i];
		array[i]=array[j];
		array[j]=tmp;
	}
}
