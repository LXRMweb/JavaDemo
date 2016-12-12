/**
 * @author lxrm
 * @date 20161027
 * @description: �����������ʵ�ֶ��߳�֮���ͨ��
 * 		���ӣ����������̣߳���һ�����ͳ�Ա�������б仯��һ��ʹ�����ӣ���һ���߳�ʹ���С�������߳�֮���ͨ�ţ�ʵ�ָ����ͱ���0101�����Ľ�����
 * 			��Ҳ����˵����һ������󣬸����������һ�����ͱ�����ʹ�ø�������������̣߳��߳�һʹ�ö����ڲ������ͱ�����һ��Ȼ��wait()�ͷŶ�����
 * 			   ��ʱ�̶߳���ö���������������̬�������Լ���run()ʹ�øö�������γ�Ա������һ��Ȼ�����߳�һ��
 * 		NumberHolder��class ������
 * 		IncreaseThread:class �߳��ࣨ���ö������е�synchronized increase()ʵ����������ö�������ִ����Ӧ�������ͷŶ�������
 *      DecreaseTnread:class �߳��ࣨ���ö����е�synchronized decrease()ʵ��������ִ����Ӧ�������ͷŶ�������
 *      Test.java �����࣬ʹ��һ�������������̣߳�ʹ���������̹߳���һ�����󣬲��ֱ�ִ�ж��������ͱ��������ͼ�����*/
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
