/**
 * @author lxrm
 * @date 20161027
 * @description ʹ�ù�ϣ��ʵ��dictionary(Ӣ�Ĵʵ�)���ٶ��ʵ��е����Լ������н�����Сд��ĸ�Լ��ո�
 * 				ʹ��������������ÿհ�λ�ã�������ܳ��ֵġ���ͻ������
 * @���˼· 
 * 		Step1������ôʵ�ֻ��Сд��ĸ����a,b,c.......z �Լ��ո������һ����������ʾ
������				a b c d e ... z �ո�
����				       ��1 2 3 4 5 ...26 27
		Step2: �ٶ�����ʵ�һ��Ҫ�洢50000�����ʣ���ô�����С�͸ö�Ϊ2*50000���ֵ��С�Ķ�����
����					��arraySize=2*50000=100000
		Step3: ����һ�����ʣ�����������ʶ�Ӧ������
		������	������������add
		������	Add����Ӧ������hugeNumber=1*27*27+4*27+4
		Step4:ʹ�ù�ϣ������hugeNumber��������±꣨ʹ�ù�ϣ������step3�ж�Ӧ�����ֱ任��һ����С��������Ϊ�õ���add��Ӧ�������±�
		������	arrayIndex=hugeNumber % arraySize
		Step5���������д���õ���
		������	Dictionary[arrayIndex]=��add��;
		������	ע�⣬��һ���п��ܳ��֡���ͻ����Ҳ����˵��λ���п���֮ǰ�Ѿ��洢����������
				�����ͻ�ж��ַ�����������ʹ�ÿ��ŵ�ַ������ʹ��������������ÿհ�λ�á�
		Step6:������ǹ�ϣ����Ϊ������ʹ���˹�ϣ�������洢����Ԫ�أ�
*/
package hash;

public class HashLinearSearching {
	private String[] hashArray;
	public HashLinearSearching(int size){
		hashArray=new String[2*size];
	}
	private int toIndex(String word){
		return 0;
	}
}
