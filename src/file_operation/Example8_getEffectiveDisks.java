/**
 * @author lxrm
 * @date 20161115
 * @description 不同计算机的系统盘符是不相同的，有的计算机有“C:” "D:" "E:" "F:"
 * 				但是有些计算机只有C盘和D盘，还有Linux系统中系统盘符是/home等
 * 				本程序举例说明如何获取本地计算机中的有效盘符
 * */
package file_operation;

import java.io.File;
import java.io.IOException;

public class Example8_getEffectiveDisks {
	public static void main(String[] args){
/*一、获取本机有效盘符，C： D： E： ...
 *   这是获取绝对可用路径的方法(不常用)，一般使用“二”中所描述的获取相对路径的方法来存放想要存放的数据、文件..
 */
		File[] roots=File.listRoots();
		System.out.println("本地计算机的有效盘符有：");
		for(int i=0;i<roots.length;i++){
			System.out.println(roots[i].getAbsolutePath());
		}
		
		String rootPath=roots[1].getAbsolutePath();//选定上述列表中最后一个磁盘作为下面所要使用的根目录
		String path=rootPath+"/LeapMotionData/FrameData";//Frame对象数据的存放目录
		System.out.println("LeapMotion采样所得数据将会被放置在以下目录中：\n"+path);
		File dir=new File(path);
		if(!dir.exists()){
			dir.mkdirs();
		}
		System.out.println(dir.getAbsolutePath()+"是否存在："+dir.exists());
/*二、获取当前文件夹
*   这是获取相对路径的方法（常用），便于程序在不同的计算机OS中迁移
*   获得当前工程所在文件夹，如本例中是D:\workspaceOfJavaEclipse\javaTest
*/
		File root2=new File(".");//获得当前文件夹（即工程目录），结果D:\workspaceOfJavaEclipse\javaTest
		//File root2=new File("..");//获得当前文件夹的父文件夹，结果D:\workspaceOfJavaEclipse
		try {
			String rootDir2=root2.getCanonicalPath();
			System.out.println("当前工程所在文件夹："+rootDir2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end main

}
