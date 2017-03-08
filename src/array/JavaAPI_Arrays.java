/**
 * @author chen
 * @date 20170305
 * @description 本程序讲述用于数组操作的javaAPI
 * java.util.Arrays
 * 		1）概述：
 * 			1.1）Arrays类中有若干可用于数组操作的成员函数，如：
 * 				        排序(sort)：将数组中的全部或者部分元素按照升序排序，
 * 						可以对byte/char/short/int/long/float/double这7种基本数据类型的数组进行升序排序
 * 						可以对Object[]类型的数组进行升序排序
 * 						可以对模板类型的数组进行升序排序，并且可以通过参数指定比较器类型（即指定Comparator）
 * 				         二分查找(binarySearch):使用二分法在数组中查找指定元素
 * 						在调用查找函数之前一定要先调用相应的sort()函数对数组进行排序，否则调用查找函数得到的结果就有可能是错误的
 * 						可以在byte/char/short/int/long/float/double这7种基本数据类型的数组中查找指定元素
 * 						可以在Object[]类型的数组查找指定元素
 * 						可以在模板类型的数组中查找指定元素，并且可以通过参数指定比较器类型（即指定Comparator）
 * 					比较(equal)：比较两个数组中元素是否完全一致（相同下标处的元素的数值要一致）
 * 						可以比较8种基本数据类型数组
 * 						可以比较Object类型数组
 * 					填充(fill):往数组中填写元素，使得数组中全部或者部分元素都是fill()函数参数值
 * 						可以操作8种基本数据类型数组
 * 						可以操作Object类型数组
 * 					克隆(copy):从数组中copy出一部分元素，变成一个新的数组并作为返回值被返回
 * 						复制一部分或者全部元素组成新的数组
 * 						可以操作8种基本数据类型的数组
 * 						也可以操作模板数组
 * 						还可以在复制的同时，将数组元素由原来的数据类型变成新的数据类型
 * 					转变成List<>集合
 * 						可以将数组元素变成集合元素，整个数组变成一个List集合
 * 					计算数组对应的hashCode码：
 * 						可以将整个数组看作一个整体，计算出这个数组所对应的一个hashCode码
 * 						如果两个数组内容依照顺序完全相同，那么两个数组对应的hashCode码一定相同
 * 						如果数组和一个List集合的元素依照次序完全相同，那么Arrays.hashCode(数组名)==集合名称List#hashCode()
 * 					将数组转变成String对象
 * 						将数组中所有元素组合在一起，成为一个String对象
 * 			1.2）This class also contains a static factory that allows arrays to be viewed as lists.
 * 
 * 		2）Arrays类中的构造函数
 * 			只有一个无参构造函数
 * 			且唯一的构造函数还是private的，所以不能在外部调用
 * 			private Arrays(){}//注意：private
 * 		3）Arrays类中的成员函数
 * 			3.1）static成员函数
 * 					排序：【1】public static void sort(int[] a)
 * 								功能:   将a:int[]按照升序排列
 * 								所用算法： Dual-Pivot Quicksort双支点快速排序
 * 								时间复杂度：O(N*logN)
 * 						【2】public static void sort(int[] a, int fromIndex, int toIndex)
 * 								功能：         将参数数组a:int[]中的a[fromIndex]~a[toIndex-1]这些个元素按照升序排列
 * 									    If {@code fromIndex == toIndex},the range to be sorted is empty.
 * 								所用算法： Dual-Pivot Quicksort双支点快速排序
 * 								时间复杂度：O(N*logN)
 * 						 【3】下面的函数和上面的函数除了参数数组的数据类型不同之外，其他地方都相同，都是将数组的部分或者全部成员按照升序排序
 * 							public static void sort(long[] a)
 * 							public static void sort(long[] a, int fromIndex, int toIndex)
 * 							public static void sort(short[] a)
 * 							public static void sort(short[] a, int fromIndex, int toIndex)
 * 							public static void sort(char[] a)
 * 							public static void sort(char[] a, int fromIndex, int toIndex)
 * 							public static void sort(byte[] a)
 * 							public static void sort(byte[] a, int fromIndex, int toIndex)
 * 							public static void sort(float[] a)
 * 							public static void sort(float[] a, int fromIndex, int toIndex)
 * 								注意：对于float型数值，认为{@code -0.0f}小于 {@code 0.0f}
 * 											    and {@code Float.NaN}比其他任何float型数值都大（也即认为Float.NaN是最大的float型数值）
 * 												and 所有{@code Float.NaN} values are considered equal. 							
 * 							public static void sort(double[] a)
 * 							public static void sort(double[] a, int fromIndex, int toIndex)
 * 								注意：对于double型数值，认为 {@code -0.0d}小于{@code 0.0d}
 * 												  and {@code Double.NaN} is considered greater than any other value 
 * 												  and all {@code Double.NaN} values are considered equal.
 * 						【4】	public static void sort(Object[] a)
 * 							public static void sort(Object[] a, int fromIndex, int toIndex)
 * 								注意：这个函数可以将参数a:Object[]数组按照升序排序，但是，这个函数对于a:Object[]有一些特殊要求
 * 									首先，a:Object[] 数组中的每一个元素都应该实现 the {@link Comparable} interface. 
 * 									其次， all elements in the array must be <i>mutually comparable</i> 
 * 										(that is, {@code e1.compareTo(e2)} must not throw a 
 * 										{@code ClassCastException} for any elements {@code e1} and {@code e2}
 * 										in the array).
 * 										譬如，将String类型数据和Integer型数值进行比较，就会抛出ClassCastException
 * 								本函数中使用的排序算法：归并排序
 * 								时间复杂度：当初始数组中元素是完全随机排列的时候，该函数时间复杂度为O(N*logN)
 * 										当初始数组中元素   部分有序  的时候，该函数的时间复杂度远远小于O(N*logN)
 * 								本函数的适用场景：特别适用于合并两个已经有序的数组，并对合并后的数组重新排序，这种场景下该函数将会有较好的性能
 * 						【5】	public static <T> void sort(T[] a, Comparator<? super T> c)
 * 							public static <T> void sort(T[] a, int fromIndex, int toIndex,Comparator<? super T> c)
 * 								备注：该函数可以指定比较器，使用参数中所指定的比较器来比较数组中的任意两个元素，并且根据比较结果对数组元素进行排序
 * 									要想使用该函数，必须保证all elements in the array must be <i>mutually comparable</i> 
 * 										(that is, {@code e1.compareTo(e2)} must not throw a 
 * 										{@code ClassCastException} for any elements {@code e1} and {@code e2}
 * 										in the array).
 * 										譬如，将String类型数据和Integer型数值进行比较，就会抛出ClassCastException
 * 								本函数中使用的排序算法：归并排序
 * 								时间复杂度：当初始数组中元素是完全随机排列的时候，该函数时间复杂度为O(N*logN)
 * 										当初始数组中元素   部分有序  的时候，该函数的时间复杂度远远小于O(N*logN)
 * 								本函数的适用场景：特别适用于合并两个已经有序的数组，并对合并后的数组重新排序，这种场景下该函数将会有较好的性能
 *					查找：【1】public static int binarySearch(long[] a, long key) 
 *								功能：对有序数组a:long[]进行二分查找，查找指定元素ley:long,并返回指定元素在数组中的下标
 *									在调用查找函数之前一定要先调用相应的sort()函数对数组进行排序，保证作为search()函数的数组是一个有序数组
 *									（也即一定要保证a:long[]是有序数组，否则它不能作为binarySearch()函数的参数）
 *									如果a:long[]不是有序的，那么调用查找函数binarySearch()得到的结果就有可能是错误的
 *									If the array contains multiple elements with the specified value, there is
 *									no guarantee which one will be found.
 *								返回值：参见java.util.Ararays程序注解
 *						【2】public static int binarySearch(long[] a, int fromIndex, int toIndex,long key) 
 *								功能：这个函数和上面的函数功能类似，只不过这个函数只是在a[fromIndex]~a[toIndex-1]之间查找
 *									一定要保证参数a：long[]是一个有序数组
 *						【3】下面的函数和上述两个函数功能一致，只不过参数数组的数据类型不一样而已
 *							public static int binarySearch(int[] a, int key) 
 *							public static int binarySearch(int[] a, int fromIndex, int toIndex,int key)
 *							public static int binarySearch(short[] a, short key)
 *							public static int binarySearch(short[] a, int fromIndex, int toIndex,short key)
 *							public static int binarySearch(char[] a, char key)
 *							public static int binarySearch(char[] a, int fromIndex, int toIndex,char key)
 *							public static int binarySearch(byte[] a, byte key) 
 *							public static int binarySearch(byte[] a, int fromIndex, int toIndex,byte key)
 *							public static int binarySearch(double[] a, double key)
 *								备注：This method considers all NaN values to be equivalent and equal.
 *							public static int binarySearch(double[] a, int fromIndex, int toIndex,double key)
 *								备注：This method considers all NaN values to be equivalent and equal.
 *							public static int binarySearch(float[] a, float key)
 *								备注：This method considers all NaN values to be equivalent and equal.
 *							public static int binarySearch(float[] a, int fromIndex, int toIndex,float key)
 *								备注：This method considers all NaN values to be equivalent and equal.
 *						【4】	public static int binarySearch(Object[] a, Object key)
 *							public static int binarySearch(Object[] a, int fromIndex, int toIndex,Object key)
 *						【5】public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c)
 *							public static <T> int binarySearch(T[] a, int fromIndex, int toIndex,
 *                                      T key, Comparator<? super T> c)
 *                比较(equals):【1】 public static boolean equals(long[] a, long[] a2)
 *                					功能：如果 two arrays contain the same elements in the same order.则返回值为true
 *                			     【2】 public static boolean equals(int[] a, int[] a2)
 *                				  public static boolean equals(short[] a, short a2[])
 *                				  public static boolean equals(char[] a, char[] a2)  
 *                				  public static boolean equals(byte[] a, byte[] a2)
 *                				  public static boolean equals(boolean[] a, boolean[] a2)                                
 *                				  public static boolean equals(double[] a, double[] a2)
 *                					  备注：this method considers<tt>NaN</tt> equals to itself, 
 *                											and 0.0d unequal to -0.0d.
 *                				  public static boolean equals(float[] a, float[] a2) 
 *                					  备注：this method considers<tt>NaN</tt> equals to itself, 
 *                											and 0.0f unequal to -0.0f.
 *                			    【3】 public static boolean equals(Object[] a, Object[] a2)
 *                					  备注：   Two objects <tt>e1</tt> and <tt>e2</tt> are considered <i>equal</i>
 *                						  if <tt>(e1==null ? e2==null : e1.equals(e2))</tt>. 
 *                			    【4】public static boolean deepEquals(Object[] a1, Object[] a2)
 *                					 备注：这个函数专门用于嵌套型数组的比较
 *                填充(fill):【1】public static void fill(long[] a, long val)
 *                					功能：往a:long[]中填充元素，使得数组a中的数值全都为val:long
 *                			【2】public static void fill(long[] a, int fromIndex, int toIndex, long val)
 *                					和上述函数功能类似，只不过这个函数只是使a[fromIndex]~a[toIndex-1]变成val:long
 *                			【3】public static void fill(int[] a, int val)
 *                				public static void fill(int[] a, int fromIndex, int toIndex, int val)
 *                				public static void fill(short[] a, short val)
 *                				public static void fill(short[] a, int fromIndex, int toIndex, short val)
 *                				public static void fill(char[] a, char val)
 *                				public static void fill(char[] a, int fromIndex, int toIndex, char val)
 *                				public static void fill(byte[] a, byte val)
 *                				public static void fill(byte[] a, int fromIndex, int toIndex, byte val)
 *                				public static void fill(boolean[] a, boolean val)
 *                				public static void fill(boolean[] a, int fromIndex, int toIndex,boolean val)
 *                				public static void fill(double[] a, double val) 
 *                				public static void fill(double[] a, int fromIndex, int toIndex,double val)
 *                				public static void fill(float[] a, float val) 
 *                				public static void fill(float[] a, int fromIndex, int toIndex, float val) 
 *                			【4】public static void fill(Object[] a, Object val)
 *                				public static void fill(Object[] a, int fromIndex, int toIndex, Object val)
 *                clone(复制)：【1】public static <T> T[] copyOf(T[] original, int newLength)
 *                					功能：从original：T[]中复制newLength个元素，变成一个新的数组被作为函数返回值返回
 *                						当newLength>original.length时，在新的数组后面补充null
 *                						当newLength>original.length时，只截取original数组的一部分作为新的数组被返回
 *                			    【2】public static <T,U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType)
 *                					备注：和上面的函数功能类似，只是这个函数还可以指定新数组的类型
 *                						也就是说这个函数不只复制了original：U[]数组，还将数组元素由U型转变成了newType类型
 *                			    【3】public static byte[] copyOf(byte[] original, int newLength)
 *                					功能：从original：byte[]中复制newLength：int个元素组成新的数组并作为返回值返回
 *                						当newLength>original.length时，在新的数组后面补充0
 *                						当newLength>original.length时，只截取original数组的一部分作为新的数组被返回
 *                			    【4】public static short[] copyOf(short[] original, int newLength)
 *                					备注：补0（if necessary）
 *                				 public static int[] copyOf(int[] original, int newLength)
 *                					备注：补0（if necessary）
 *                				 public static long[] copyOf(long[] original, int newLength)
 *                					备注：补0L（if necessary）
 *                				 public static char[] copyOf(char[] original, int newLength)
 *                					备注：补'\\u000'（if necessary）
 *                				 public static float[] copyOf(float[] original, int newLength)
 *                					备注：补0f（if necessary）
 *                				 public static double[] copyOf(double[] original, int newLength)
 *                                  备注：补0f（if necessary）
 *                               public static boolean[] copyOf(boolean[] original, int newLength)
 *                                  备注：补false（if necessary）   
 *                            【5】public static <T> T[] copyOfRange(T[] original, int from, int to)
 *                            		功能：copy源数组的一部分到新的数组中
 *                            			将original[from]~original[to-1]依次放入新数组中(当to>original.length时，使用null代替)
 *                            			新数组的长度=to-from
 *                            		@param from:int    0<=from<=original.length 
 *                            		@param to:int      from<=to   并且   to可以大于original.length
 *                            【6】public static <T,U> T[] copyOfRange(U[] original, int from, int to, Class<? extends T[]> newType)
 *                            		备注：这个函数和【5】中的函数功能类似，只不过这个函数还会对数组元素进行类型转换，会由原来的类型转变成newType类型
 *                            【7】public static byte[] copyOfRange(byte[] original, int from, int to)
 *                            	  public static short[] copyOfRange(short[] original, int from, int to)
 *                            	  public static int[] copyOfRange(int[] original, int from, int to)
 *                            		public static long[] copyOfRange(long[] original, int from, int to)
 *                            		public static char[] copyOfRange(char[] original, int from, int to)
 *                            		public static float[] copyOfRange(float[] original, int from, int to)
 *                            		public static double[] copyOfRange(double[] original, int from, int to) 
 *                            		public static boolean[] copyOfRange(boolean[] original, int from, int to)
 *               转变成List集合：【1】public static <T> List<T> asList(T... a)
 *               hashCode:   【1】public static int hashCode(long a[])
 *               					功能：Returns a hash code based on the contents of the specified array.
 *               					1)如果两个long型数组long a[],long b[]完全相同（即相同下标处值相同），也即Arrays.equals(a,b)
 *               					      那么Arrays.hashCode(a)==Arrays.hashCode(b)
 *               					2)如果一个List集合中拥有的集合元素和long[] a数组中的元素相同，并且有相同的顺序
 *               					     那么Arrays.hashCode(a)==List#hashCode()函数所得的值
 *               			  【2】public static int hashCode(int a[])
 *               				public static int hashCode(short a[])
 *               				public static int hashCode(char a[])
 *               				public static int hashCode(byte a[]) 
 *               				public static int hashCode(boolean a[])
 *               				public static int hashCode(float a[])
 *               				public static int hashCode(double a[])
 *               			【3】public static int hashCode(Object a[])
 *               			【4】public static int deepHashCode(Object a[])
 *               转变成String对象：【1】public static String toString(long[] a)
 *               				   public static String toString(int[] a)
 *               				   public static String toString(short[] a)
 *               				   public static String toString(char[] a)
 *               				   public static String toString(byte[] a)                              
 *               				   public static String toString(float[] a)
 *               				   public static String toString(double[] a) 
 *               				【2】public static String toString(Object[] a)
 *               				【3】public static String deepToString(Object[] a)                           
 *                                                  
 * 			3.2）实例成员函数
 * */
package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaAPI_Arrays {
	public static void main(String[] args){
		
	}

}
