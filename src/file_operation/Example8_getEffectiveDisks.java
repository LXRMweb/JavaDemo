/**
 * @author lxrm
 * @date 20161115
 * @description ��ͬ�������ϵͳ�̷��ǲ���ͬ�ģ��еļ�����С�C:�� "D:" "E:" "F:"
 * 				������Щ�����ֻ��C�̺�D�̣�����Linuxϵͳ��ϵͳ�̷���/home��
 * 				���������˵����λ�ȡ���ؼ�����е���Ч�̷�
 * */
package file_operation;

import java.io.File;
import java.io.IOException;

public class Example8_getEffectiveDisks {
	public static void main(String[] args){
/*һ����ȡ������Ч�̷���C�� D�� E�� ...
 *   ���ǻ�ȡ���Կ���·���ķ���(������)��һ��ʹ�á��������������Ļ�ȡ���·���ķ����������Ҫ��ŵ����ݡ��ļ�..
 */
		File[] roots=File.listRoots();
		System.out.println("���ؼ��������Ч�̷��У�");
		for(int i=0;i<roots.length;i++){
			System.out.println(roots[i].getAbsolutePath());
		}
		
		String rootPath=roots[1].getAbsolutePath();//ѡ�������б������һ��������Ϊ������Ҫʹ�õĸ�Ŀ¼
		String path=rootPath+"/LeapMotionData/FrameData";//Frame�������ݵĴ��Ŀ¼
		System.out.println("LeapMotion�����������ݽ��ᱻ����������Ŀ¼�У�\n"+path);
		File dir=new File(path);
		if(!dir.exists()){
			dir.mkdirs();
		}
		System.out.println(dir.getAbsolutePath()+"�Ƿ���ڣ�"+dir.exists());
/*������ȡ��ǰ�ļ���
*   ���ǻ�ȡ���·���ķ��������ã������ڳ����ڲ�ͬ�ļ����OS��Ǩ��
*   ��õ�ǰ���������ļ��У��籾������D:\workspaceOfJavaEclipse\javaTest
*/
		File root2=new File(".");//��õ�ǰ�ļ��У�������Ŀ¼�������D:\workspaceOfJavaEclipse\javaTest
		//File root2=new File("..");//��õ�ǰ�ļ��еĸ��ļ��У����D:\workspaceOfJavaEclipse
		try {
			String rootDir2=root2.getCanonicalPath();
			System.out.println("��ǰ���������ļ��У�"+rootDir2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end main

}
