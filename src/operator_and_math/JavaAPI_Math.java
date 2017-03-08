/**
 * @author:lxrm
 * @date:20170205
 * @description:这个类讲述JavaAPI中用于数学运算的类Math
 * java.lang.Math
 * 		1)概述：Math这个类中含有若干用于数学计算的函数，如三角函数、指数函数、取绝对值、最大值、最小值、
 * 			 平均值、
 * 			角度和弧度相互转换的函数
 * 			Math类中还有一些静态成员常量可供调用，如圆周率、E...
 * 		2)Math类中的静态成员常量（可以使用Math.常量名直接调用）
 * 			E
 * 			PI
 * 		3)Math类的构造函数
 * 			构造函数是private的，所以不要使用Math的构造函数声明Math类对象
 * 		4)Math类中的成员函数（都是static的），可以直接使用Math.methodName()调用
 * 			4.1）三角函数
 * 				三角函数的参数是以弧度为单位的
 * 			4.2）弧度和度数相互转化
 * 			4.3）指数与对数函数
 * 			4.4）取整（小于该值的最大整数、大于该值的最小整数、最接近的整数...）
 * 			4.5）取绝对值
 * 			4.6）最大值、最小值
 * 
 * 			
 * 			
 */
package operator_and_math;

public class JavaAPI_Math {
	public static void main(String[] args){
		System.out.println("Math类中的静态成员常量：");
		System.out.println("Math.PI="+Math.PI);
		System.out.println("Math.E="+Math.E);
		
		System.out.println("\nMath类中的成员函数：");
		System.out.println("1）Math类中的三角函数");
		System.out.println("sin(30)="+Math.sin(30));//结果：-0.9880316240928618
		System.out.println("sin(30)="+Math.sin(Math.PI/6));//结果：0.49999999999999994
		System.out.println("2）Math类中度数和弧度相互转化的函数");
		System.out.println("30度="+Math.toRadians(30)+"rad");//结果：0.5235987755982988rad
		System.out.println("pi/2rad="+Math.toDegrees(Math.PI/2)+"度");//结果：90.0度
	}
}
