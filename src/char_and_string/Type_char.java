/**
 * function:Java��8�ֻ�����������֮-----char
 * ������char��java��8�ֻ�����������֮�е�һ�֣����ڴ洢�����ַ���һ��char�ͱ���ռ�������ֽڴ洢�ռ䡣
 * 		         ÿһ���ַ�����Ӧ��һ��int����ֵ�������Ӧ��ϵ��רҵ�����������ǡ��ַ��ı��뷽ʽ�������ڴ��ڶ��ֱ��뷽ʽ��
 * 		��ASCII��ISO-8859-1��Unicode��utf-8��gbk�ȵȡ���Щ���뷽ʽ�������������ַ����ܲ�ͬ���ַ���Ӧ�ı�����
 * 		��ռ�õĿռ��С���ܲ�ͬ�����뷽ʽ���ܲ�ͬ��
 * 			java��char�ͱ����洢���ַ���Unicode���뷽ʽ�µ��ַ���char�ͱ������Ա���ֵΪUnicode���еĵ����ַ���
 * 		���ߵ����ַ���Ӧ��Unicode����е�λ�ã�����ת���ַ���
 * */
package char_and_string;

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
