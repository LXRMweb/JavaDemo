package stack.array_to_stack;

public class CharStack {
	private char[] charArray;//���飬���ڴ��ջ��Ԫ��
	private int top;//ջ��Ԫ���±�
	private int maxIndex;//ջ��Ԫ�ؿ���ȡ��������±�
	/*==========���캯��===========*/
	public CharStack(int size){
		charArray=new char[size];
		top=-1;//ջ��ʼ״̬Ϊ��ջ
		maxIndex=size-1;
	}
	/*function:��ջ��ѹ��Ԫ��
	 * @return int top:����ջ��Ԫ���±�*/
	public int push(char element){
		if(this.isFull()){
			System.out.println("ջ������Ԫ�����ʧ��");
			return top;
		}else{
			charArray[++top]=element;
			return top;
		}
	}
	/*function:��ȡջ��Ԫ�أ�����ջ��Ԫ��ɾ��
	 * @return char:ջΪ��ʱ����ֵΪ�ַ���f��������Ԫ��popʧ��
	 * 				ջ��Ϊ��ʱ������ֵ��ջ��Ԫ�ص�ֵ*/
	public char pop(){
		if(this.isEmpty()){
			System.out.println("ջΪ�գ�Ԫ�ص���ʧ��");
			return 'f';//�����ַ���f��,����Ԫ�ص���ʧ��
		}else{
			return charArray[top--];
		}
	}
	/*function:�鿴ջ��Ԫ�ص�ֵ�����ǲ���ջ��Ԫ�ش�ջ��ɾ��
	 * @return char:ջΪ��ʱ����ֵΪ�ַ���f��,����Ԫ�ض�ȡʧ��
	 * 				ջ��Ϊ��ʱ������ֵ��ջ��Ԫ�ص�ֵ*/
	public char peek(){
		if(this.isEmpty()){
			System.out.println("ջΪ��");
			return 'f';//�����ַ���f��,����Ԫ�ص���ʧ��
		}else{
			return charArray[top];
		}
	}
	/*�ж�ջ�Ƿ�Ϊ��
	 * @return boolean true��ջΪ��
	 * 					false:ջ��Ϊ��*/
	public boolean isEmpty(){
		return top==-1?true:false;
	}
	/*�ж�ջ�Ƿ�����
	 * @return boolean true��ջ����
	 * 					false:ջδ��*/
	public boolean isFull(){
		return top==maxIndex?true:false;
	}
	/*��ȡջ������Ԫ�ظ���*/
	public int length(){
		return top+1;
	}
}
