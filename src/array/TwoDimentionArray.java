/**
 * @author chen
 * @date 20170305
 * @description 本程序讲述java语言中二维数组相关的语法知识
 *1） 二维数组的声明
 *2） 为二维数组分配内存空间
 *3） 二维数组的初始化
 *4） 访问二维数组中的元素
 *5)遍历二维数组
 *		方法一，使用双层for循环来遍历一个二维数组
 *		方法二，使用for each来遍历一个二维数组
 * */
package array;

public class TwoDimentionArray {
	public static void main(String[] args){
		/**1)二维数组的声明
		 * 
		 */
		int array1[][];
		int[][] array2;
		
		/**2)为二维数组分配内存空间(共有两种方法)
		 * 		方法一，直接为每一维都分配相同长度的内存空间
		 * 		方法二，分别为每一维分配内存空间（各维长度可以不同）
		 */
		//方法一，直接为每一维都分配相同长度的内存空间
		array1=new int[2][2];
		//方法二，分别为每一维分配内存空间（各维长度可以不同）
		array2=new int[2][];
		array2[0]=new int[3];
		array2[1]=new int[6];
		
		/**
		 * 可以在数组的声明过程中直接为数组分配内存空间*/
		int[][] array3=new int[2][3];
		
		/**3)二维数组的初始化(共有三种方法)
		 * 		方法一，
		 * 		方法三，使用for循环分别为数组的每个元素赋值
		 * */
		//方法一，
		int array5[][]={{1,2,2},{3,1,2}};
		/*方法三，使用for循环分别为数组的每个元素赋值
		 * 		*可以为二维数组的各行分配不同列数
		 * 		*二维数组的行数=arrayName.length
		 * 		*二维数组第i行的列数=arrayName[i].length,其中i=0,1...
		 */
		int arrayName[][]=new int[3][];//并不指定列数，为的是下面可以分别为每一行分配列长度
		for(int i=0;i<arrayName.length;i++){//arrayName.length返回值是二维数组的行数
			arrayName[i]=new int[i+1];//为二维数组的第i行分配长度为i+1的内存空间
			for(int j=0;j<arrayName[i].length;j++){//arrayName[i].length返回值是该二维数组的第i行的长度
				arrayName[i][j]=(i+1)*(j+1);
				System.out.print(arrayName[i][j]+" ");
			}
			System.out.println("");
		}//end for
		
		/**5)遍历二维数组
		 *		方法一，使用双层for循环来遍历一个二维数组
		 *		方法二，使用for each来遍历一个二维数组
		 * */
		System.out.println("\n二维数组的遍历");
		//方法一，使用双层for循环来遍历一个二维数组
		System.out.println("方法一，使用双层for循环来遍历一个二维数组");
		int arrayName2[][]={{1,2,3},{1,1,0,6},{1,1}};//现在只是指定了行数并不指定列数，为的是下面可以分别为每一行分配列长度
		for(int i=0;i<arrayName2.length;i++){//arrayName.length返回值是二维数组的行数
			for(int j=0;j<arrayName2[i].length;j++){//arrayName[i].length返回值是该二维数组的第i行的长度
				System.out.print(arrayName2[i][j]+" ");
			}
			System.out.println("");
		}//end for
		//方法二，使用for each来遍历一个二维数组
		System.out.println("方法二，使用for each来遍历一个二维数组");
		int arrayName3[][]={{1,2,3},{1,1,0,6},{1,1}};
		for(int tmp[]:arrayName3){//使用tmp:int[]存储二维数组中的一行
			for(int element:tmp){//使用element:int存储tmp:int[]中的一个元素
				if(element==tmp.length){//判断元素是不是该行的最后一个元素
					System.out.print(element);
				}else{
					System.out.print(element+"、");
				}
			}
			System.out.println("");//换行
		}
	}//end main

}//end class
