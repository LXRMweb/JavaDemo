/**
 * @author lxrm
 * @date 20161107
 * @description 这个文件举例说明java.io.OutputStream类成员方法的使用方法
 * 			write(int b)将一个整数（即参数b:int）输出到流中（只输出低八位，其余24位忽略）
 * 			write(byte[] b)将参数（b:byte[]）中的数据输出到输出流中
 * 			write(byte[] b,int off,int len)将数组b中从off指定的位置开始，长度为len的数据输出到输出流中
 * 			flush()只有BufferedOutputStream子类中实现了该函数，该函数功能是：刷新缓冲区，使得缓冲区的数据被强制送出到输出流中
 * 			close()关闭流并释放相应的系统资源，如输出目标是一个文件时，调用close()会使得流对象释放相应的文件句柄，这是仅让输出流对象为null做不到的
 * */
package java_io_examples;

import java.io.OutputStream;

public class Use_OutputStream {
	
}
