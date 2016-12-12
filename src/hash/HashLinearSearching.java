/**
 * @author lxrm
 * @date 20161027
 * @description 使用哈希表实现dictionary(英文词典)，假定词典中单词以及词组中仅包含小写字母以及空格
 * 				使用线性搜索法获得空白位置，解决可能出现的“冲突”问题
 * @编程思路 
 * 		Step1：假设该词典只有小写字母，给a,b,c.......z 以及空格各分配一个数字来表示
　　　				a b c d e ... z 空格
　　				       　1 2 3 4 5 ...26 27
		Step2: 假定这个词典一共要存储50000个单词，那么数组大小就该定为2*50000（字典大小的二倍）
　　					　arraySize=2*50000=100000
		Step3: 给定一个单词，计算这个单词对应的数字
		　　　	例，给定单词add
		　　　	Add所对应的数字hugeNumber=1*27*27+4*27+4
		Step4:使用哈希函数由hugeNumber获得数组下标（使用哈希函数将step3中对应的数字变换成一个较小的数字作为该单词add对应的数组下标
		　　　	arrayIndex=hugeNumber % arraySize
		Step5：向数组中存入该单词
		　　　	Dictionary[arrayIndex]=”add”;
		　　　	注意，这一步中可能出现“冲突”，也就是说该位置有可能之前已经存储了其他单词
				解决冲突有多种方法，本程序使用开放地址法，且使用线性搜索法获得空白位置。
		Step6:数组就是哈希表（因为该数组使用了哈希函数来存储数组元素）
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
