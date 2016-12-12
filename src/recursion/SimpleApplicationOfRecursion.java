/*auth:lxrm
 * date:20160819
 * function:recursion(递归)，使用递归算法实现某些简单功能
 * 		如使用递归算法计算第n个三角数字的值（第n个三角数字 = 第n-1个三角数字 + n）
 * 		如使用递归算法计算  n! 的值
 * 备注：recursion(递归)
 * 		triangle：三角数字
 * 		factorial:阶乘*/
package recursion;

public class SimpleApplicationOfRecursion {
	/*三角数字triangle：计算第n个三角数字的值
	 * @param n:要计算第n个三角数字
	 * @return:第n个三角数字的值*/
	public int triangle(int n){
		if(n<1){
			System.out.println("参数值只能为大于等于1的整数,您的参数值"+n+"不符合要求");
			return n;//返回错误的输入值
		}else if(n==1){
			return 1;
		}else{
			return n+triangle(n-1);
		}
	}
	/*阶乘，计算n!的值，并将计算结果作为返回值*/
	public int factorial(int n){
		if(n<0){
			System.out.println("参数值只能为大于等于0的整数,您的参数值"+n+"不符合要求");
			return n;//返回错误的输入值
		}else if(n==0){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
}
