/**
 * function:Java��8�ֻ�����������֮-----char
 * */
package datatype;

public class Type_char {

	public static void main(String args[]){
		char ch='a';//����һ���������ڵĵ����ַ����ַ�����ΪUnicode��������һ���ַ���
		char ch2=97;//��������Unicode���и��ַ���Ӧ��λ���±꣬ȡֵ��ΧΪ0-65535��Ҳ��0x0000-0xffff(ʮ������)
		for(int i=0;i<=65535;i++){
			ch2=(char)i;
			System.out.print(ch2+" ");
		}
		System.out.println("ת���ַ���");
		//��������ת���ַ�
		char ch3='\\';
		char ch4='\u2605';
		System.out.println(ch3+" "+ch4);
		Integer integer1=new Integer(23);
	}

}
