/**
 * @author chen
 * @date 20170305
 * @description ���������������������javaAPI
 * java.util.Arrays
 * 		1��������
 * 			1.1��Arrays���������ɿ�������������ĳ�Ա�������磺
 * 				        ����(sort)���������е�ȫ�����߲���Ԫ�ذ�����������
 * 						���Զ�byte/char/short/int/long/float/double��7�ֻ����������͵����������������
 * 						���Զ�Object[]���͵����������������
 * 						���Զ�ģ�����͵���������������򣬲��ҿ���ͨ������ָ���Ƚ������ͣ���ָ��Comparator��
 * 				         ���ֲ���(binarySearch):ʹ�ö��ַ��������в���ָ��Ԫ��
 * 						�ڵ��ò��Һ���֮ǰһ��Ҫ�ȵ�����Ӧ��sort()����������������򣬷�����ò��Һ����õ��Ľ�����п����Ǵ����
 * 						������byte/char/short/int/long/float/double��7�ֻ����������͵������в���ָ��Ԫ��
 * 						������Object[]���͵��������ָ��Ԫ��
 * 						������ģ�����͵������в���ָ��Ԫ�أ����ҿ���ͨ������ָ���Ƚ������ͣ���ָ��Comparator��
 * 					�Ƚ�(equal)���Ƚ�����������Ԫ���Ƿ���ȫһ�£���ͬ�±괦��Ԫ�ص���ֵҪһ�£�
 * 						���ԱȽ�8�ֻ���������������
 * 						���ԱȽ�Object��������
 * 					���(fill):����������дԪ�أ�ʹ��������ȫ�����߲���Ԫ�ض���fill()��������ֵ
 * 						���Բ���8�ֻ���������������
 * 						���Բ���Object��������
 * 					��¡(copy):��������copy��һ����Ԫ�أ����һ���µ����鲢��Ϊ����ֵ������
 * 						����һ���ֻ���ȫ��Ԫ������µ�����
 * 						���Բ���8�ֻ����������͵�����
 * 						Ҳ���Բ���ģ������
 * 						�������ڸ��Ƶ�ͬʱ��������Ԫ����ԭ�����������ͱ���µ���������
 * 					ת���List<>����
 * 						���Խ�����Ԫ�ر�ɼ���Ԫ�أ�����������һ��List����
 * 					���������Ӧ��hashCode�룺
 * 						���Խ��������鿴��һ�����壬����������������Ӧ��һ��hashCode��
 * 						�������������������˳����ȫ��ͬ����ô���������Ӧ��hashCode��һ����ͬ
 * 						��������һ��List���ϵ�Ԫ�����մ�����ȫ��ͬ����ôArrays.hashCode(������)==��������List#hashCode()
 * 					������ת���String����
 * 						������������Ԫ�������һ�𣬳�Ϊһ��String����
 * 			1.2��This class also contains a static factory that allows arrays to be viewed as lists.
 * 
 * 		2��Arrays���еĹ��캯��
 * 			ֻ��һ���޲ι��캯��
 * 			��Ψһ�Ĺ��캯������private�ģ����Բ������ⲿ����
 * 			private Arrays(){}//ע�⣺private
 * 		3��Arrays���еĳ�Ա����
 * 			3.1��static��Ա����
 * 					���򣺡�1��public static void sort(int[] a)
 * 								����:   ��a:int[]������������
 * 								�����㷨�� Dual-Pivot Quicksort˫֧���������
 * 								ʱ�临�Ӷȣ�O(N*logN)
 * 						��2��public static void sort(int[] a, int fromIndex, int toIndex)
 * 								���ܣ�         ����������a:int[]�е�a[fromIndex]~a[toIndex-1]��Щ��Ԫ�ذ�����������
 * 									    If {@code fromIndex == toIndex},the range to be sorted is empty.
 * 								�����㷨�� Dual-Pivot Quicksort˫֧���������
 * 								ʱ�临�Ӷȣ�O(N*logN)
 * 						 ��3������ĺ���������ĺ������˲���������������Ͳ�֮ͬ�⣬�����ط�����ͬ�����ǽ�����Ĳ��ֻ���ȫ����Ա������������
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
 * 								ע�⣺����float����ֵ����Ϊ{@code -0.0f}С�� {@code 0.0f}
 * 											    and {@code Float.NaN}�������κ�float����ֵ����Ҳ����ΪFloat.NaN������float����ֵ��
 * 												and ����{@code Float.NaN} values are considered equal. 							
 * 							public static void sort(double[] a)
 * 							public static void sort(double[] a, int fromIndex, int toIndex)
 * 								ע�⣺����double����ֵ����Ϊ {@code -0.0d}С��{@code 0.0d}
 * 												  and {@code Double.NaN} is considered greater than any other value 
 * 												  and all {@code Double.NaN} values are considered equal.
 * 						��4��	public static void sort(Object[] a)
 * 							public static void sort(Object[] a, int fromIndex, int toIndex)
 * 								ע�⣺����������Խ�����a:Object[]���鰴���������򣬵��ǣ������������a:Object[]��һЩ����Ҫ��
 * 									���ȣ�a:Object[] �����е�ÿһ��Ԫ�ض�Ӧ��ʵ�� the {@link Comparable} interface. 
 * 									��Σ� all elements in the array must be <i>mutually comparable</i> 
 * 										(that is, {@code e1.compareTo(e2)} must not throw a 
 * 										{@code ClassCastException} for any elements {@code e1} and {@code e2}
 * 										in the array).
 * 										Ʃ�磬��String�������ݺ�Integer����ֵ���бȽϣ��ͻ��׳�ClassCastException
 * 								��������ʹ�õ������㷨���鲢����
 * 								ʱ�临�Ӷȣ�����ʼ������Ԫ������ȫ������е�ʱ�򣬸ú���ʱ�临�Ӷ�ΪO(N*logN)
 * 										����ʼ������Ԫ��   ��������  ��ʱ�򣬸ú�����ʱ�临�Ӷ�ԶԶС��O(N*logN)
 * 								�����������ó������ر������ںϲ������Ѿ���������飬���Ժϲ�������������������ֳ����¸ú��������нϺõ�����
 * 						��5��	public static <T> void sort(T[] a, Comparator<? super T> c)
 * 							public static <T> void sort(T[] a, int fromIndex, int toIndex,Comparator<? super T> c)
 * 								��ע���ú�������ָ���Ƚ�����ʹ�ò�������ָ���ıȽ������Ƚ������е���������Ԫ�أ����Ҹ��ݱȽϽ��������Ԫ�ؽ�������
 * 									Ҫ��ʹ�øú��������뱣֤all elements in the array must be <i>mutually comparable</i> 
 * 										(that is, {@code e1.compareTo(e2)} must not throw a 
 * 										{@code ClassCastException} for any elements {@code e1} and {@code e2}
 * 										in the array).
 * 										Ʃ�磬��String�������ݺ�Integer����ֵ���бȽϣ��ͻ��׳�ClassCastException
 * 								��������ʹ�õ������㷨���鲢����
 * 								ʱ�临�Ӷȣ�����ʼ������Ԫ������ȫ������е�ʱ�򣬸ú���ʱ�临�Ӷ�ΪO(N*logN)
 * 										����ʼ������Ԫ��   ��������  ��ʱ�򣬸ú�����ʱ�临�Ӷ�ԶԶС��O(N*logN)
 * 								�����������ó������ر������ںϲ������Ѿ���������飬���Ժϲ�������������������ֳ����¸ú��������нϺõ�����
 *					���ң���1��public static int binarySearch(long[] a, long key) 
 *								���ܣ�����������a:long[]���ж��ֲ��ң�����ָ��Ԫ��ley:long,������ָ��Ԫ���������е��±�
 *									�ڵ��ò��Һ���֮ǰһ��Ҫ�ȵ�����Ӧ��sort()����������������򣬱�֤��Ϊsearch()������������һ����������
 *									��Ҳ��һ��Ҫ��֤a:long[]���������飬������������ΪbinarySearch()�����Ĳ�����
 *									���a:long[]��������ģ���ô���ò��Һ���binarySearch()�õ��Ľ�����п����Ǵ����
 *									If the array contains multiple elements with the specified value, there is
 *									no guarantee which one will be found.
 *								����ֵ���μ�java.util.Ararays����ע��
 *						��2��public static int binarySearch(long[] a, int fromIndex, int toIndex,long key) 
 *								���ܣ��������������ĺ����������ƣ�ֻ�����������ֻ����a[fromIndex]~a[toIndex-1]֮�����
 *									һ��Ҫ��֤����a��long[]��һ����������
 *						��3������ĺ���������������������һ�£�ֻ��������������������Ͳ�һ������
 *							public static int binarySearch(int[] a, int key) 
 *							public static int binarySearch(int[] a, int fromIndex, int toIndex,int key)
 *							public static int binarySearch(short[] a, short key)
 *							public static int binarySearch(short[] a, int fromIndex, int toIndex,short key)
 *							public static int binarySearch(char[] a, char key)
 *							public static int binarySearch(char[] a, int fromIndex, int toIndex,char key)
 *							public static int binarySearch(byte[] a, byte key) 
 *							public static int binarySearch(byte[] a, int fromIndex, int toIndex,byte key)
 *							public static int binarySearch(double[] a, double key)
 *								��ע��This method considers all NaN values to be equivalent and equal.
 *							public static int binarySearch(double[] a, int fromIndex, int toIndex,double key)
 *								��ע��This method considers all NaN values to be equivalent and equal.
 *							public static int binarySearch(float[] a, float key)
 *								��ע��This method considers all NaN values to be equivalent and equal.
 *							public static int binarySearch(float[] a, int fromIndex, int toIndex,float key)
 *								��ע��This method considers all NaN values to be equivalent and equal.
 *						��4��	public static int binarySearch(Object[] a, Object key)
 *							public static int binarySearch(Object[] a, int fromIndex, int toIndex,Object key)
 *						��5��public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c)
 *							public static <T> int binarySearch(T[] a, int fromIndex, int toIndex,
 *                                      T key, Comparator<? super T> c)
 *                �Ƚ�(equals):��1�� public static boolean equals(long[] a, long[] a2)
 *                					���ܣ���� two arrays contain the same elements in the same order.�򷵻�ֵΪtrue
 *                			     ��2�� public static boolean equals(int[] a, int[] a2)
 *                				  public static boolean equals(short[] a, short a2[])
 *                				  public static boolean equals(char[] a, char[] a2)  
 *                				  public static boolean equals(byte[] a, byte[] a2)
 *                				  public static boolean equals(boolean[] a, boolean[] a2)                                
 *                				  public static boolean equals(double[] a, double[] a2)
 *                					  ��ע��this method considers<tt>NaN</tt> equals to itself, 
 *                											and 0.0d unequal to -0.0d.
 *                				  public static boolean equals(float[] a, float[] a2) 
 *                					  ��ע��this method considers<tt>NaN</tt> equals to itself, 
 *                											and 0.0f unequal to -0.0f.
 *                			    ��3�� public static boolean equals(Object[] a, Object[] a2)
 *                					  ��ע��   Two objects <tt>e1</tt> and <tt>e2</tt> are considered <i>equal</i>
 *                						  if <tt>(e1==null ? e2==null : e1.equals(e2))</tt>. 
 *                			    ��4��public static boolean deepEquals(Object[] a1, Object[] a2)
 *                					 ��ע���������ר������Ƕ��������ıȽ�
 *                ���(fill):��1��public static void fill(long[] a, long val)
 *                					���ܣ���a:long[]�����Ԫ�أ�ʹ������a�е���ֵȫ��Ϊval:long
 *                			��2��public static void fill(long[] a, int fromIndex, int toIndex, long val)
 *                					�����������������ƣ�ֻ�����������ֻ��ʹa[fromIndex]~a[toIndex-1]���val:long
 *                			��3��public static void fill(int[] a, int val)
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
 *                			��4��public static void fill(Object[] a, Object val)
 *                				public static void fill(Object[] a, int fromIndex, int toIndex, Object val)
 *                clone(����)����1��public static <T> T[] copyOf(T[] original, int newLength)
 *                					���ܣ���original��T[]�и���newLength��Ԫ�أ����һ���µ����鱻��Ϊ��������ֵ����
 *                						��newLength>original.lengthʱ�����µ�������油��null
 *                						��newLength>original.lengthʱ��ֻ��ȡoriginal�����һ������Ϊ�µ����鱻����
 *                			    ��2��public static <T,U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType)
 *                					��ע��������ĺ����������ƣ�ֻ���������������ָ�������������
 *                						Ҳ����˵���������ֻ������original��U[]���飬��������Ԫ����U��ת�����newType����
 *                			    ��3��public static byte[] copyOf(byte[] original, int newLength)
 *                					���ܣ���original��byte[]�и���newLength��int��Ԫ������µ����鲢��Ϊ����ֵ����
 *                						��newLength>original.lengthʱ�����µ�������油��0
 *                						��newLength>original.lengthʱ��ֻ��ȡoriginal�����һ������Ϊ�µ����鱻����
 *                			    ��4��public static short[] copyOf(short[] original, int newLength)
 *                					��ע����0��if necessary��
 *                				 public static int[] copyOf(int[] original, int newLength)
 *                					��ע����0��if necessary��
 *                				 public static long[] copyOf(long[] original, int newLength)
 *                					��ע����0L��if necessary��
 *                				 public static char[] copyOf(char[] original, int newLength)
 *                					��ע����'\\u000'��if necessary��
 *                				 public static float[] copyOf(float[] original, int newLength)
 *                					��ע����0f��if necessary��
 *                				 public static double[] copyOf(double[] original, int newLength)
 *                                  ��ע����0f��if necessary��
 *                               public static boolean[] copyOf(boolean[] original, int newLength)
 *                                  ��ע����false��if necessary��   
 *                            ��5��public static <T> T[] copyOfRange(T[] original, int from, int to)
 *                            		���ܣ�copyԴ�����һ���ֵ��µ�������
 *                            			��original[from]~original[to-1]���η�����������(��to>original.lengthʱ��ʹ��null����)
 *                            			������ĳ���=to-from
 *                            		@param from:int    0<=from<=original.length 
 *                            		@param to:int      from<=to   ����   to���Դ���original.length
 *                            ��6��public static <T,U> T[] copyOfRange(U[] original, int from, int to, Class<? extends T[]> newType)
 *                            		��ע����������͡�5���еĺ����������ƣ�ֻ��������������������Ԫ�ؽ�������ת��������ԭ��������ת���newType����
 *                            ��7��public static byte[] copyOfRange(byte[] original, int from, int to)
 *                            	  public static short[] copyOfRange(short[] original, int from, int to)
 *                            	  public static int[] copyOfRange(int[] original, int from, int to)
 *                            		public static long[] copyOfRange(long[] original, int from, int to)
 *                            		public static char[] copyOfRange(char[] original, int from, int to)
 *                            		public static float[] copyOfRange(float[] original, int from, int to)
 *                            		public static double[] copyOfRange(double[] original, int from, int to) 
 *                            		public static boolean[] copyOfRange(boolean[] original, int from, int to)
 *               ת���List���ϣ���1��public static <T> List<T> asList(T... a)
 *               hashCode:   ��1��public static int hashCode(long a[])
 *               					���ܣ�Returns a hash code based on the contents of the specified array.
 *               					1)�������long������long a[],long b[]��ȫ��ͬ������ͬ�±괦ֵ��ͬ����Ҳ��Arrays.equals(a,b)
 *               					      ��ôArrays.hashCode(a)==Arrays.hashCode(b)
 *               					2)���һ��List������ӵ�еļ���Ԫ�غ�long[] a�����е�Ԫ����ͬ����������ͬ��˳��
 *               					     ��ôArrays.hashCode(a)==List#hashCode()�������õ�ֵ
 *               			  ��2��public static int hashCode(int a[])
 *               				public static int hashCode(short a[])
 *               				public static int hashCode(char a[])
 *               				public static int hashCode(byte a[]) 
 *               				public static int hashCode(boolean a[])
 *               				public static int hashCode(float a[])
 *               				public static int hashCode(double a[])
 *               			��3��public static int hashCode(Object a[])
 *               			��4��public static int deepHashCode(Object a[])
 *               ת���String���󣺡�1��public static String toString(long[] a)
 *               				   public static String toString(int[] a)
 *               				   public static String toString(short[] a)
 *               				   public static String toString(char[] a)
 *               				   public static String toString(byte[] a)                              
 *               				   public static String toString(float[] a)
 *               				   public static String toString(double[] a) 
 *               				��2��public static String toString(Object[] a)
 *               				��3��public static String deepToString(Object[] a)                           
 *                                                  
 * 			3.2��ʵ����Ա����
 * */
package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaAPI_Arrays {
	public static void main(String[] args){
		
	}

}
