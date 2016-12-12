/**
 * @author lxrm
 * @date 20161107
 * @description 这个文件举例说明java.io.InputStream类成员方法的使用方法
 * 			read()
 * 			int read(byte[] b)每次调用这个函数，就从流中读取多个字节到函数参数b:byte[] 中，并且返回读到的字节数目
 * 			int read(byte[] b,int off,int len)从流中读取长度为len字节的数据，写入数组b[off]，b[off+1]...,并且返回读到的字节数目
 * 			skip(long n)跳过流中若干字节数
 * 			available()返回流中不阻塞的情况下还可用的字节数
 * 			mark()在流中标记一个位置，可以调用reset()重新定向到此位置
 * 			reset()结合mark()使用
 * 			markSupported()是否支持流标记和复位工作（即是否支持mark()和reset()）
 * 			close()关闭流并释放相应的系统资源，如输入源是一个文件时，调用close()会使得流对象释放相应的文件句柄，这是仅让输入流对象为null做不到的
 * 			*/
package java_io_examples;

public class Use_InputStream {

}
