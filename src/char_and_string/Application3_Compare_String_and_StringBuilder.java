/**
 * @author chen
 * @date 20170305
 * @description 展示String和StringBuilder类的差别
 * 
 * 实例一、在需要不停地修改String对象的值的情况下，StringBuilder比String快多少*/
package char_and_string;

public class Application3_Compare_String_and_StringBuilder {
	public static void main(String[] args){
		System.out.println("实例一、在需要不停地修改String对象的值的情况下，StringBuilder比String快多少");
		String str="";
		long startTime=System.currentTimeMillis();//获取系统当前时间
		for(int i=0;i<1000;i++){
			str=str+i;
		}
		long endTime=System.currentTimeMillis();
		System.out.println("改变1000次String 对象的值总共用时："+(endTime-startTime));
		StringBuilder strBuilder=new StringBuilder();
		startTime=System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			strBuilder=strBuilder.append(i);
		}
		String strBuilder2String=strBuilder.toString();//使用StringBuilder中的toString()将StringBuilder对象转成String对象
		endTime=System.currentTimeMillis();
		System.out.println("改变1000次StringBuilder 对象的值总共用时："+(endTime-startTime));
		System.out.println("\n检查两种方法下得到的字符串是否相同：");
		System.out.println("方法一，对String对象直接修改，\n结果str="+str);
		System.out.println("方法二，先将初始字符串赋值给StringBuilder对象，然后使用StringBuilder中的方法进行修改，最后调用strBuider.toString()将其转换成String对象"+"\n结果："+strBuilder.toString());
		System.out.println("两种方法得到的字符串是否相同："+str.equals(strBuilder2String));
	}

}
