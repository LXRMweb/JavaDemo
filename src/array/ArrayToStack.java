/**author:lxrm
 * date:2016.07.25
 * function:使用stackArray这种数据结构实现栈
 * */
package array;

public class ArrayToStack{
	private long[] stackArray;//使用数组实现栈，数组用于存放栈元素
	int maxIndex;//栈中元素的最大下标
	int top;//栈顶元素下标
	public ArrayToStack(int size){
		stackArray=new long[size];
		maxIndex=size-1;
		top=-1;//初始栈为空
	}
	/*function:往栈中添加元素，若栈未满则添加元素到栈中且返回true;若是栈已满，则返回false表示栈已满，添加失败
	 * @return：false表示栈已满，添加失败*/
	public boolean push(long element){
		if(++top<=maxIndex){
			stackArray[top]=element;
			return true;
		}else{
			System.out.println("栈已满，数据没有成功添加进去");
			return false;
		}		
	}
	/*function:从栈中取出元素，若是栈为空，则返回-1
	 * @return:栈不为空时返回值为栈顶元素，栈为空时返回值为-1*/
	public long pop(){
		if(top>=0){
			return stackArray[top--];
		}else{
			System.out.println("栈为空");
			return -1;
		}	
	}
	/*fuction:查看栈顶元素的值，只能查看栈顶元素的值，不能查看其他元素的值
	 * 			和pop()的唯一区别在于，peek()不将栈顶元素下标top--,也就是说不移除栈顶元素
	 * @return：栈不为空时返回值为栈顶元素，栈为空时返回值为-1*/
	public long peek(){
		if(top>=0){
			return stackArray[top];
		}else{
			System.out.println("栈为空");
			return -1;
		}
	}
}
