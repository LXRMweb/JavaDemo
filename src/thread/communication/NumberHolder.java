/**
 * @author lxrm
 * @date 20161027
 * @description: 本组程序用来实现多线程之间的通信
 * 		例子：利用两个线程，对一个整型成员变量进行变化，一个使其增加，另一个线程使其减小，利用线程之间的通信，实现该整型变量0101这样的交替变更
 * 			（也就是说，有一个类对象，该类对象中有一个整型变量，使用该类对象开启两个线程，线程一使该对象内部的整型变量加一，然后wait()释放对象锁
 * 			   这时线程二获得对象锁，进入运行态并调用自己的run()使得该对象的整形成员变量减一，然后唤醒线程一）
 * 		NumberHolder：class 对象类
 * 		IncreaseThread:class 线程类（调用对象类中的synchronized increase()实例函数，获得对象锁，执行相应操作，释放对象锁）
 *      DecreaseTnread:class 线程类（调用对象中的synchronized decrease()实例函数，执行相应操作，释放对象锁）
 *      Test.java 测试类，使用一个对象开启两个线程，使得这两个线程共用一个对象，并分别执行对象中整型变量的增和减操作*/
package thread.communication;

public class NumberHolder {
	private int i;
	public NumberHolder(){
		i=0;
	}
	public synchronized void increase(){
		if(i!=0){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(i);
		i++;
		
		notify();
	}//end increase()
	public synchronized void decrease(){
		if(i==0){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(i);
		i--;
		
		notify();
	}//end decrease()
}//end class
