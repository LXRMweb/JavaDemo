/**
 * @author lxrm
 * @date 20161027
 * @description: �����������ʵ�ֶ��߳�֮���ͨ��
 * 		�����ܣ����������̣߳���һ�����ͳ�Ա�������б仯��һ��ʹ�����ӣ���һ���߳�ʹ���С�������߳�֮���ͨ�ţ�ʵ�ָ����ͱ���0101�����Ľ�����
 * 			��Ҳ����˵����һ������󣬸����������һ�����ͱ�����ʹ�ø�������������̣߳��߳�һʹ�ö����ڲ������ͱ�����һ��Ȼ��wait()�ͷŶ�����
 * 			   ��ʱ�̶߳���ö���������������̬�������Լ���run()ʹ�øö�������γ�Ա������һ��Ȼ�����߳�һ��
 * 		NumberHolder��class ������
 * 		IncreaseThread:class �߳��ࣨ���ö������е�synchronized increase()ʵ����������ö�������ִ����Ӧ�������ͷŶ�������
 *      DecreaseTnread:class �߳��ࣨ���ö����е�synchronized decrease()ʵ��������ִ����Ӧ�������ͷŶ�������
 *      Test.java �����࣬ʹ��һ�������������̣߳�ʹ���������̹߳���һ�����󣬲��ֱ�ִ�ж��������ͱ��������ͼ�����*/
package thread.communication;

public class IncreaseThread extends Thread{
	private NumberHolder numberHolder;
	public IncreaseThread(NumberHolder numberHolder){
		this.numberHolder=numberHolder;
	}
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			numberHolder.increase();
		}
		
	}
}