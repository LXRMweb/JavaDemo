/**
 * @author chen
 * @date 20170305
 * @description չʾString��StringBuilder��Ĳ��
 * 
 * ʵ��һ������Ҫ��ͣ���޸�String�����ֵ������£�StringBuilder��String�����*/
package char_and_string;

public class Application3_Compare_String_and_StringBuilder {
	public static void main(String[] args){
		System.out.println("ʵ��һ������Ҫ��ͣ���޸�String�����ֵ������£�StringBuilder��String�����");
		String str="";
		long startTime=System.currentTimeMillis();//��ȡϵͳ��ǰʱ��
		for(int i=0;i<1000;i++){
			str=str+i;
		}
		long endTime=System.currentTimeMillis();
		System.out.println("�ı�1000��String �����ֵ�ܹ���ʱ��"+(endTime-startTime));
		StringBuilder strBuilder=new StringBuilder();
		startTime=System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			strBuilder=strBuilder.append(i);
		}
		String strBuilder2String=strBuilder.toString();//ʹ��StringBuilder�е�toString()��StringBuilder����ת��String����
		endTime=System.currentTimeMillis();
		System.out.println("�ı�1000��StringBuilder �����ֵ�ܹ���ʱ��"+(endTime-startTime));
		System.out.println("\n������ַ����µõ����ַ����Ƿ���ͬ��");
		System.out.println("����һ����String����ֱ���޸ģ�\n���str="+str);
		System.out.println("���������Ƚ���ʼ�ַ�����ֵ��StringBuilder����Ȼ��ʹ��StringBuilder�еķ��������޸ģ�������strBuider.toString()����ת����String����"+"\n�����"+strBuilder.toString());
		System.out.println("���ַ����õ����ַ����Ƿ���ͬ��"+str.equals(strBuilder2String));
	}

}
