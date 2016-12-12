/*auth:lxrm
 * date:20160819
 * function:recursion(�ݹ�)��ʹ�õݹ��㷨ʵ��ĳЩ�򵥹���
 * 		��ʹ�õݹ��㷨�����n���������ֵ�ֵ����n���������� = ��n-1���������� + n��
 * 		��ʹ�õݹ��㷨����  n! ��ֵ
 * ��ע��recursion(�ݹ�)
 * 		triangle����������
 * 		factorial:�׳�*/
package recursion;

public class SimpleApplicationOfRecursion {
	/*��������triangle�������n���������ֵ�ֵ
	 * @param n:Ҫ�����n����������
	 * @return:��n���������ֵ�ֵ*/
	public int triangle(int n){
		if(n<1){
			System.out.println("����ֵֻ��Ϊ���ڵ���1������,���Ĳ���ֵ"+n+"������Ҫ��");
			return n;//���ش��������ֵ
		}else if(n==1){
			return 1;
		}else{
			return n+triangle(n-1);
		}
	}
	/*�׳ˣ�����n!��ֵ��������������Ϊ����ֵ*/
	public int factorial(int n){
		if(n<0){
			System.out.println("����ֵֻ��Ϊ���ڵ���0������,���Ĳ���ֵ"+n+"������Ҫ��");
			return n;//���ش��������ֵ
		}else if(n==0){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
}
