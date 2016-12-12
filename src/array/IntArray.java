package array;

public class IntArray {
	private int[] intArray;
	private int num;//����������Ԫ�ظ���
	
	/*============���캯��=========*/
	public IntArray(){
		intArray=new int[10];
		num=0;
	}
	public IntArray(int size){
		intArray=new int[size];
		num=0;
	}
	
	/*===========��Ա����==========*/
	/*function:�����������һ��Ԫ��
	 * @return��num ����˸�Ԫ�غ�������Ԫ�ظ���
	 * */
	public int insert(int data){
		intArray[num]=data;
		num++;
		return num;
	}
	/*function:�������в��Ҹ�Ԫ�أ������ҵ���Ԫ���򷵻ظ�Ԫ�ص�Ԫ���±�i��
	 * 			��û�в��ҵ���Ԫ���򷵻�ֵΪ-1
	 * @return:�����ҵ���Ԫ���򷵻�ֵΪ��Ԫ�ص�Ԫ���±�i����û�в��ҵ���Ԫ���򷵻�ֵΪ-1*/
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
	/*function:�������в��ҵ���һ����Ԫ�ز������������ɾ��
	 * @param data:��ɾ���Ķ���
	 * @return num:ɾ����Ԫ�غ�������Ԫ�صĸ���*/
	public int delete(int data){
		int i;
		if(this.find(data)==-1){//û���ҵ���Ԫ�ص������
			//System.out.println("data:"+data+"not found!");
			return this.num;
		}else{//�ҵ��˸�Ԫ�ص������
			i=this.find(data);
			for(int j=i;j<num-1;j++){
				intArray[j]=intArray[j+1];
			}
			num--;
			return num;
		}
	}
	/*function:�ҵ�������������������Ϊ��ʱ����ֵΪ-1,
	 * @return������Ϊ��ʱ����ֵΪ-1�����鲻Ϊ��ʱ����ֵΪ������������Ԫ�ص�λ�ã���Ԫ���±꣩*/
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
			System.out.println("����������Ԫ��Ϊ��"+tmp);
			return key;
		}
	}
	/*function:ɾ������������Ԫ�أ�����Ϊ��ʱ������ɾ������ֱ�ӷ���false
	 * @return:����Ϊ��ʱ������ֵΪfalse�����鲻Ϊ���ҳɹ��ҵ���ɾ�������Ԫ��ʱ����ֵΪtrue*/
	public boolean removeMax(){
		if(num==0){
			System.out.println("����Ϊ�գ��ò���������");
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
	/*function:������������Ԫ�ؽ������*/
	public void display(){
		System.out.println("����������Ԫ�ظ���Ϊ��"+num);
		System.out.println("Ԫ���б����£�");
		for(int i=0;i<num;i++){
			System.out.println("int_arr["+i+"]:"+intArray[i]);
		}
	}
}
