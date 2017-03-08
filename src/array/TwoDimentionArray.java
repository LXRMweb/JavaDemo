/**
 * @author chen
 * @date 20170305
 * @description ��������java�����ж�ά������ص��﷨֪ʶ
 *1�� ��ά���������
 *2�� Ϊ��ά��������ڴ�ռ�
 *3�� ��ά����ĳ�ʼ��
 *4�� ���ʶ�ά�����е�Ԫ��
 *5)������ά����
 *		����һ��ʹ��˫��forѭ��������һ����ά����
 *		��������ʹ��for each������һ����ά����
 * */
package array;

public class TwoDimentionArray {
	public static void main(String[] args){
		/**1)��ά���������
		 * 
		 */
		int array1[][];
		int[][] array2;
		
		/**2)Ϊ��ά��������ڴ�ռ�(�������ַ���)
		 * 		����һ��ֱ��Ϊÿһά��������ͬ���ȵ��ڴ�ռ�
		 * 		���������ֱ�Ϊÿһά�����ڴ�ռ䣨��ά���ȿ��Բ�ͬ��
		 */
		//����һ��ֱ��Ϊÿһά��������ͬ���ȵ��ڴ�ռ�
		array1=new int[2][2];
		//���������ֱ�Ϊÿһά�����ڴ�ռ䣨��ά���ȿ��Բ�ͬ��
		array2=new int[2][];
		array2[0]=new int[3];
		array2[1]=new int[6];
		
		/**
		 * ���������������������ֱ��Ϊ��������ڴ�ռ�*/
		int[][] array3=new int[2][3];
		
		/**3)��ά����ĳ�ʼ��(�������ַ���)
		 * 		����һ��
		 * 		��������ʹ��forѭ���ֱ�Ϊ�����ÿ��Ԫ�ظ�ֵ
		 * */
		//����һ��
		int array5[][]={{1,2,2},{3,1,2}};
		/*��������ʹ��forѭ���ֱ�Ϊ�����ÿ��Ԫ�ظ�ֵ
		 * 		*����Ϊ��ά����ĸ��з��䲻ͬ����
		 * 		*��ά���������=arrayName.length
		 * 		*��ά�����i�е�����=arrayName[i].length,����i=0,1...
		 */
		int arrayName[][]=new int[3][];//����ָ��������Ϊ����������Էֱ�Ϊÿһ�з����г���
		for(int i=0;i<arrayName.length;i++){//arrayName.length����ֵ�Ƕ�ά���������
			arrayName[i]=new int[i+1];//Ϊ��ά����ĵ�i�з��䳤��Ϊi+1���ڴ�ռ�
			for(int j=0;j<arrayName[i].length;j++){//arrayName[i].length����ֵ�Ǹö�ά����ĵ�i�еĳ���
				arrayName[i][j]=(i+1)*(j+1);
				System.out.print(arrayName[i][j]+" ");
			}
			System.out.println("");
		}//end for
		
		/**5)������ά����
		 *		����һ��ʹ��˫��forѭ��������һ����ά����
		 *		��������ʹ��for each������һ����ά����
		 * */
		System.out.println("\n��ά����ı���");
		//����һ��ʹ��˫��forѭ��������һ����ά����
		System.out.println("����һ��ʹ��˫��forѭ��������һ����ά����");
		int arrayName2[][]={{1,2,3},{1,1,0,6},{1,1}};//����ֻ��ָ������������ָ��������Ϊ����������Էֱ�Ϊÿһ�з����г���
		for(int i=0;i<arrayName2.length;i++){//arrayName.length����ֵ�Ƕ�ά���������
			for(int j=0;j<arrayName2[i].length;j++){//arrayName[i].length����ֵ�Ǹö�ά����ĵ�i�еĳ���
				System.out.print(arrayName2[i][j]+" ");
			}
			System.out.println("");
		}//end for
		//��������ʹ��for each������һ����ά����
		System.out.println("��������ʹ��for each������һ����ά����");
		int arrayName3[][]={{1,2,3},{1,1,0,6},{1,1}};
		for(int tmp[]:arrayName3){//ʹ��tmp:int[]�洢��ά�����е�һ��
			for(int element:tmp){//ʹ��element:int�洢tmp:int[]�е�һ��Ԫ��
				if(element==tmp.length){//�ж�Ԫ���ǲ��Ǹ��е����һ��Ԫ��
					System.out.print(element);
				}else{
					System.out.print(element+"��");
				}
			}
			System.out.println("");//����
		}
	}//end main

}//end class
