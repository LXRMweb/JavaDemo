package stack.array_to_stack;

public class CharStack {
	private char[] charArray;//数组，用于存放栈中元素
	private int top;//栈顶元素下标
	private int maxIndex;//栈中元素可能取到的最大下标
	/*==========构造函数===========*/
	public CharStack(int size){
		charArray=new char[size];
		top=-1;//栈初始状态为空栈
		maxIndex=size-1;
	}
	/*function:向栈中压入元素
	 * @return int top:返回栈顶元素下标*/
	public int push(char element){
		if(this.isFull()){
			System.out.println("栈已满，元素添加失败");
			return top;
		}else{
			charArray[++top]=element;
			return top;
		}
	}
	/*function:获取栈顶元素，并将栈顶元素删除
	 * @return char:栈为空时返回值为字符‘f’，代表元素pop失败
	 * 				栈不为空时，返回值是栈顶元素的值*/
	public char pop(){
		if(this.isEmpty()){
			System.out.println("栈为空，元素弹出失败");
			return 'f';//返回字符‘f’,代表元素弹出失败
		}else{
			return charArray[top--];
		}
	}
	/*function:查看栈顶元素的值，但是不将栈顶元素从栈中删除
	 * @return char:栈为空时返回值为字符‘f’,代表元素读取失败
	 * 				栈不为空时，返回值是栈顶元素的值*/
	public char peek(){
		if(this.isEmpty()){
			System.out.println("栈为空");
			return 'f';//返回字符‘f’,代表元素弹出失败
		}else{
			return charArray[top];
		}
	}
	/*判断栈是否为空
	 * @return boolean true：栈为空
	 * 					false:栈不为空*/
	public boolean isEmpty(){
		return top==-1?true:false;
	}
	/*判断栈是否已满
	 * @return boolean true：栈已满
	 * 					false:栈未满*/
	public boolean isFull(){
		return top==maxIndex?true:false;
	}
	/*获取栈中现有元素个数*/
	public int length(){
		return top+1;
	}
}
