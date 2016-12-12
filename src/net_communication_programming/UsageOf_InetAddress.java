/**
 * @author lxrm
 * @date 20161101
 * @description �������Ҫ����˵��InetAddress�༰������Inet4Adress��Inet6Adress���÷�
 * 				��Щ����java��IP��ַ��װ�࣬������Щ�࣬������Ա���Բ����˽�IP���ݰ���ϸ��֪ʶ��
 * 				ֱ��ͨ����Щ���еĳ�Ա��������IP��ַ��صĲ���
 * 			1����ȡInetAddress����
 * 				1.1)˵��������InetAddress�Ĺ��캯����˽�еģ����Բ���ʹ���乹�캯����ȡ�ö���
 * 					����ʹ��InetAddress���е�static��������ȡInetAddress����ʵ��
 * 				1.2)InetAddress�������ڻ�ȡInetAddress�����static�����ж��
 *	 				public static InetAddress getByName(String host)//����hostΪIP��Ӧ������
					public static InetAddress getLocalHost()
 *	 				public static InetAddress[] getAllByName(String host)//һ���������ܶ�Ӧ���IP
					public static InetAddress getByAddress(byte[] addr)
					public static InetAddress getByAddress(String host,byte[] addr)
			    1.3)ʹ������static��������ȡInetAddress�����ʱ��Ҫע���п��ܻᷢ���쳣�����޷�����DNS����û�в��ҵ���Ӧ��
			    	����ʱ���ͻᴥ��UnknownHostException�쳣�����Ա���ѻ�ȡInetAddress�����������try...catch��
 * 			2��InetAddress���е�������Ա������ʵ����Ա������
 * 				2.1��������ͨ��1���з�����ȡ��InetAddress����֮�󣬾Ϳ���ʹ������õĶ�����ø����е�ʵ����Ա����
 * 				2.2��public String getHostName()//��ȡInetAddress�����Ӧ������
 * 					public String getHostAddress()//��ȡInetAddress�����Ӧ��IP
 * 					public byte[] getAddress()//��ȡInetAddress�����Ӧ��IP����byte[]��ʽչʾ
 * 					...//������ʵ����Ա������
 * 				*/
package net_communication_programming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class UsageOf_InetAddress {
	public static void main(String[] args){
		InetAddress address = null;
		//1)��ȡInetAddress����
		try{
			System.out.println("1)ͨ������InetAddress���е�static�������InetAddress����\n");
			address=InetAddress.getLocalHost();
			System.out.println("   InetAddress.getLocalHost()���\n   "+address+"\n");//�����chen-PC/10.203.23.66
			address=InetAddress.getByName("localhost");
			System.out.println("   InetAddress.getByName(\"localhost\")���\n   "+address+"\n");//�����localhost/127.0.0.1
			address=InetAddress.getByName("www.baidu.com");
			System.out.println("   InetAddress.getByName(\"www.baidu.com\")���\n   "+address+"\n");//�����www.baidu.com/61.135.169.125
			InetAddress[] addrs=InetAddress.getAllByName("www.baidu.com");
			System.out.println("   InetAddress.getAllByName(\"www.baidu.com\")���   ");
			for(InetAddress addr:addrs){
				System.out.println("   "+addr);
			}//�����www.baidu.com/61.135.169.121
				// www.baidu.com/61.135.169.125
		}catch(UnknownHostException e){
			System.out.println(e);
		}
		//2)ͨ��1)�л�ȡ��InetAddress�������InetAddress���еġ�ʵ����Ա������
		System.out.println("2)ͨ��1)������õ�InetAddress�������InetAddress���е�ʵ������");
		System.out.println("   "+address.getHostName());//�����www.baidu.com
		System.out.println("   "+address.getHostAddress());//�����  61.135.169.121
		System.out.println("   "+address.getAddress().toString());//�����[B@1afae45
	}//end of main
}//end of class
