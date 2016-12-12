/**author:lxrm
 * date:2016.07.25
 * function:ʹ��stackArray�������ݽṹʵ��ջ
 * */
package array;

public class ArrayToStack{
	private long[] stackArray;//ʹ������ʵ��ջ���������ڴ��ջԪ��
	int maxIndex;//ջ��Ԫ�ص�����±�
	int top;//ջ��Ԫ���±�
	public ArrayToStack(int size){
		stackArray=new long[size];
		maxIndex=size-1;
		top=-1;//��ʼջΪ��
	}
	/*function:��ջ�����Ԫ�أ���ջδ�������Ԫ�ص�ջ���ҷ���true;����ջ�������򷵻�false��ʾջ���������ʧ��
	 * @return��false��ʾջ���������ʧ��*/
	public boolean push(long element){
		if(++top<=maxIndex){
			stackArray[top]=element;
			return true;
		}else{
			System.out.println("ջ����������û�гɹ���ӽ�ȥ");
			return false;
		}		
	}
	/*function:��ջ��ȡ��Ԫ�أ�����ջΪ�գ��򷵻�-1
	 * @return:ջ��Ϊ��ʱ����ֵΪջ��Ԫ�أ�ջΪ��ʱ����ֵΪ-1*/
	public long pop(){
		if(top>=0){
			return stackArray[top--];
		}else{
			System.out.println("ջΪ��");
			return -1;
		}	
	}
	/*fuction:�鿴ջ��Ԫ�ص�ֵ��ֻ�ܲ鿴ջ��Ԫ�ص�ֵ�����ܲ鿴����Ԫ�ص�ֵ
	 * 			��pop()��Ψһ�������ڣ�peek()����ջ��Ԫ���±�top--,Ҳ����˵���Ƴ�ջ��Ԫ��
	 * @return��ջ��Ϊ��ʱ����ֵΪջ��Ԫ�أ�ջΪ��ʱ����ֵΪ-1*/
	public long peek(){
		if(top>=0){
			return stackArray[top];
		}else{
			System.out.println("ջΪ��");
			return -1;
		}
	}
}
