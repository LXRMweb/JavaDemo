/* function:�������飨Ԫ�ذ��մ�С�����˳���ţ�
 * features:(����������ص�)
 * 		���룬���ݲ����ʱ��ʹ�����Բ��ҵİ취�ҵ�Ҫ�����λ��,�����Ԫ�����κ��ƣ�����һ��Ԫ�ز����ٶȾͻ��ñ�����������Ԫ�صĲ������öࣩ
 * 		�����ض�Ԫ�أ�ʹ�ö��ַ�����
 * 		ɾ���ض�Ԫ�أ����ַ�����---->�����Ԫ��ǰ��*/
package array;

public class OrderedIntArray {
	private int[] ordered_arr;//��������
	private int num;//����������Ԫ�ظ���
	/*==========���캯��=========*/
	public OrderedIntArray(){
		ordered_arr=new int[10];
		num=0;
	}
	public OrderedIntArray(int size){
		ordered_arr=new int[size];
		num=0;
	}
	/*function:�����������в���һ��Ԫ��
	 * ʵ��˼·��ʹ�����Բ��ҵķ����ҵ�Ԫ�ز����λ�ã�Ȼ������Ԫ�����κ���
	 * @param  data���������Ԫ��
	 * @return num�������Ԫ��֮��������Ԫ�ظ���*/
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
	/*function:�����в����ض�Ԫ��
	 * @param data:������Ԫ��
	 * @return��������û�� ���ҵ���Ԫ��ʱ������ֵΪ-1���ҵ���Ԫ��ʱ�����ظ�Ԫ���������е��±�*/
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
		return -1;//while��ѭ������һֱû���ҵ�dataԪ�أ�
		//���������ɴ�ѭ��֮��startIndex>endIndex�ˣ�����whileѭ���壬����-1������øú����ĵط�˵����������û���ҵ���Ԫ�ء�
	}
	/*function:��������ɾ���ض�Ԫ��
	 * ʵ��˼·��ʹ�ö��ַ����Ҹ�Ԫ�أ�Ȼ������Ԫ������
	 * @param data:��ɾ��Ԫ��
	 * @return��������û�и�Ԫ��ʱ������ֵΪ-1�����ҵ���Ԫ�ز�����ɹ�ɾ��ʱ����ֵΪɾ����Ԫ�غ�������Ԫ�ظ���*/
	public int delete(int data){
		if(this.find(data)==-1){
			System.out.println("������û��������Ԫ��");
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
	/*function:������������Ԫ��չʾ����*/
	public void display(){
		System.out.println("����������Ԫ�أ�");
		for(int i=0;i<num;i++){
			System.out.println("orderedArray["+i+"]:"+ordered_arr[i]);
		}
	}
}
