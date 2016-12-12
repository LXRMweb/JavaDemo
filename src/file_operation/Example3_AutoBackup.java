/**
 * @author lxrm
 * @date 20161110
 * @description 这个文件中实现的功能是：将D:/AppData目录下新增加的文件和子目录自动备份到D:/AppData/backup目录下
 *						每次运行这个程序后，程序都会对比源目录和备份目录下的文件以及子目录，如果发现源目录的某个文件的更新时间
 *						要晚于备份目录下该文件的更新时间，则将源目录下该文件复制一份到备份目录 
 *状态：这个文件是不完整的，并没有真正实现文件备份功能*/
package file_operation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3_AutoBackup {
	public static void main(String[] args){
		String sourcePath="D:/AppData";
		String backupPath="/backup";
		File source=new File(sourcePath);
		File backup=new File(source,backupPath);
		if(!source.exists()){
			source.mkdir();
		}
		if(!backup.exists()){
			backup.mkdir();
		}
		new Example3_AutoBackup().update(source,backup);
	}
	/*功能：将源目录中的文件备份到备份目录*/
	private boolean update(File source,File backup){
		String[] files=source.list();
		System.out.println("源目录："+source.getAbsolutePath()+"\n该文件夹下所有文件以及子目录：");
		for(int i=0;i<files.length;i++){
			File file=new File(files[i]);
			this.getInfo(file);
		}
		return false;
	}
	private void getInfo(File file){
		SimpleDateFormat date=new SimpleDateFormat("yyyy年MM月dd日hh时mm分");
		if(file.isDirectory()){
			System.out.println("子目录\t"+file.getPath()+"\t"+file.lastModified());
		}else{
			System.out.println("文件\t"+file.getName()+"\t"+file.length()+"\t"+date.format(new Date(file.lastModified())));
		}
		
	}
}
