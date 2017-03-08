/**
 * @author:lxrm
 * @date:20170205
 * @description:����ི��JavaAPI��������ѧ�������Math
 * java.lang.Math
 * 		1)������Math������к�������������ѧ����ĺ����������Ǻ�����ָ��������ȡ����ֵ�����ֵ����Сֵ��
 * 			 ƽ��ֵ��
 * 			�ǶȺͻ����໥ת���ĺ���
 * 			Math���л���һЩ��̬��Ա�����ɹ����ã���Բ���ʡ�E...
 * 		2)Math���еľ�̬��Ա����������ʹ��Math.������ֱ�ӵ��ã�
 * 			E
 * 			PI
 * 		3)Math��Ĺ��캯��
 * 			���캯����private�ģ����Բ�Ҫʹ��Math�Ĺ��캯������Math�����
 * 		4)Math���еĳ�Ա����������static�ģ�������ֱ��ʹ��Math.methodName()����
 * 			4.1�����Ǻ���
 * 				���Ǻ����Ĳ������Ի���Ϊ��λ��
 * 			4.2�����ȺͶ����໥ת��
 * 			4.3��ָ�����������
 * 			4.4��ȡ����С�ڸ�ֵ��������������ڸ�ֵ����С��������ӽ�������...��
 * 			4.5��ȡ����ֵ
 * 			4.6�����ֵ����Сֵ
 * 
 * 			
 * 			
 */
package operator_and_math;

public class JavaAPI_Math {
	public static void main(String[] args){
		System.out.println("Math���еľ�̬��Ա������");
		System.out.println("Math.PI="+Math.PI);
		System.out.println("Math.E="+Math.E);
		
		System.out.println("\nMath���еĳ�Ա������");
		System.out.println("1��Math���е����Ǻ���");
		System.out.println("sin(30)="+Math.sin(30));//�����-0.9880316240928618
		System.out.println("sin(30)="+Math.sin(Math.PI/6));//�����0.49999999999999994
		System.out.println("2��Math���ж����ͻ����໥ת���ĺ���");
		System.out.println("30��="+Math.toRadians(30)+"rad");//�����0.5235987755982988rad
		System.out.println("pi/2rad="+Math.toDegrees(Math.PI/2)+"��");//�����90.0��
	}
}
