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

public class Test {
	public static void main(String[] args){
		NumberHolder numberHolder=new NumberHolder();//���һ�������
		//��ͬһ��������������̣߳������������߳̾ͻṲ���"�����"
		IncreaseThread increaseThread=new IncreaseThread(numberHolder);
		DecreaseThread decreaseThread=new DecreaseThread(numberHolder);
		increaseThread.start();
		decreaseThread.start();
	}
}
