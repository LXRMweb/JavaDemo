/**
 * @author lxrm
 * @date 20161107
 * @description �����ר�Ų���java�б�׼����������Լ���׼���������÷�
 *������     ��Ӧ����java.lang.System��
 * 			System���г����б�׼�������������׼��������صĳ�Ա����֮�⣬���������ĳ�Ա����
 * 		��Щ�����ĳ�Ա�����������ڲ���ϵͳ���ԡ��������ա���ȫ...
 * 			System�಻�ܱ�ʵ�����������Ա��������static��
 * 			System�������������׼�������������׼������������صĳ�Ա��������Щ��Ա�������ֳ�System.in
 * 		System.out��System.err����������ÿ�����ж���ֹһ����Ա������
 * ��⣺���ļ��н�����System�������׼�������������׼�������йصĺ�������Ҫ��������������ĳ�Ա����
 * 			1��System.in���Ա��������׼��������Ĭ��Ϊ���̣�����ʹ��System.setIn(InputStream in)ָ���µ�������
 * 					ʵ��һ��public int read(byte b[]) throws IOException//�ӱ�׼�����ȡ���ݵ���������b:byte[]�У����ҷ��ض�ȡ��Ԫ�ظ���
 * 					
 * 			2��System.out���Ա��������׼�������Ĭ��Ϊ��Ļ������ʹ��System.setOut(PrintStream out)ָ���µ��������
 * 			3��System.err���Ա��������׼�����������Ĭ����������������Ϣ����Ļ������ͨ��System.setErr(PrintStream err)ָ���µĴ�����Ϣ�������
 * */
package java_io_examples;

import java.io.IOException;

public class StandardIO {
	public static void main(String[] args){
		System.out.println("���ڼ����������ַ����Իس���������");
		byte[] buffer=new byte[100];//���뻺����
		int count=0;
		try {
			//ʵ��һ
			count= System.in.read(buffer);//�Ӽ��̶�ȡ���ݵ�������buffer��,���ҽ���ȡ��byte����Ԫ�صĸ�����Ϊ����ֵ��ֵ��count��int
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���һ���ӱ�׼�����ȡ��"+count+"��byte���͵�Ԫ�أ��ֱ��ǣ�");
		for(int i=0;i<buffer.length;i++){
			System.out.println("buffer["+i+"]="+buffer[i]);
		}
		System.out.println("��byte[] buffer �е�����ת�����ַ���ʽ�����");
		for(int i=0;i<count;i++){
			System.out.print((char)buffer[i]);
		}
		try {
			System.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
