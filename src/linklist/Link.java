/*author:lxrm
 * date:2016/08/10
 * function:ʹ��java�������ʵ��  ����  �������ݴ洢�ṹ
 * 			��������  ������   ��    �ڵ���
 * "�ڵ���" ���˼�룺
 * 		��ĳ�Ա����,����Ȩ������
 * 		��Ĺ��캯��,������ڹ��캯���жԳ�Ա����������ʾ�ĳ�ʼ����JVM�ͻ�Ϊ�丳ֵһ��ϵͳĬ�ϵĳ�ʼֵ���罫������͵ĳ�Ա������ֵΪnull��
 * 		��ĳ�Ա����,displayLink()-->����ڵ���������*/
package linklist;

public class Link {
	public String key;//����ڵ�ؼ��֣���Ӵ��ֶ���Ϊ�˷������key����ָ���ڵ㣬ɾ��key��Ӧ�Ľڵ�ȣ� 
	public int intData;//�ڵ����ݣ���ͨ�������ͣ�
	public String string;//�ڵ����ݣ���ͨ�������ͣ�
	public Link next;//�洢��һ���ڵ�ĵ�ַ
	
	public Link(String key,int intData,String string){
		this.key=key;
		this.intData=intData;
		this.string=string;
		next=null;//��仰����ʡ�ԣ�ʡ��ʱ next �����Զ���ֵ��null
	}
	
	public void displayLink(){
		System.out.println("key-->"+key+"   intData-->"+this.intData+"   string-->"+this.string);
	}
}
