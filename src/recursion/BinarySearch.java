/*auth:lxrm
 * date:20160819
 * function:���ڵݹ�˼��Ķ��ֲ��ҳ���
 * 			�������������ĳ���ض���Ԫ��*/
package recursion;

public class BinarySearch {
	private long[] array;//long�����飬�������飨��СԪ�ط����±��С����
	private int nElements;//����������Ԫ�ظ���
	public BinarySearch(int size){
		array=new long[size];
		nElements=0;
	}
	//��������������Ԫ�ظ���
	public int size(){
		return nElements;
	}
	/*���չؼ��ֲ�ѯ�������ض�Ԫ��
	 * @param long key:��ѯ�ؼ���
	 * @return int  :�ؼ��ֶ�Ӧ����Ԫ�ص��±�
	 * ���˼·��ʹ�õݹ�˼��ʵ������Ԫ�صĶ��ֲ���
	 * 		1��������������*/
	//����һ�����ڰ�recycleFind()��������ʼ��������
	public int find(long searchKey){
		return recycleFind(searchKey,0,nElements-1);
	}
	//���������ݹ���ú���ʵ�ֶ��ֲ���
	private int recycleFind(long searchKey,int lowerBoundary,int uperBoundary){
		int mid=(lowerBoundary+uperBoundary)/2;
		if(array[mid]==searchKey){
			return mid;
		}else if(lowerBoundary>uperBoundary){
			return -1;//����ֵΪ-1��ʾû�����������ҵ���Ӧ��Ԫ��
		}else if(array[mid]<searchKey){
			return recycleFind(searchKey,mid+1,uperBoundary);
		}else{
			return recycleFind(searchKey,lowerBoundary,mid-1);
		}
	}
	//��������뺯��������һ��˳����룬��ʹ��������Ԫ�ذ��մ�С�������У�
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
	//��̨��ӡ�������������Ԫ��
	public void display(){
		System.out.println("����������Ԫ�أ�");
		for(int j=0;j<nElements;j++){
			System.out.println("array["+j+"]="+array[j]);
		}
	}
}
