/*author:lxrm
 * date:2016/08/10
 * function:使用java编程语言实现  链表  这种数据存储结构
 * 			本程序是  简单链表   的    节点类
 * "节点类" 编程思想：
 * 		类的成员变量,访问权限问题
 * 		类的构造函数,如果不在构造函数中对成员变量进行显示的初始化，JVM就会为其赋值一个系统默认的初始值（如将类对象型的成员变量赋值为null）
 * 		类的成员方法,displayLink()-->输出节点数据内容*/
package linklist;

public class Link {
	public String key;//链表节点关键字（添加此字段是为了方便根据key查找指定节点，删除key对应的节点等） 
	public int intData;//节点数据（普通数据类型）
	public String string;//节点数据（普通数据类型）
	public Link next;//存储下一个节点的地址
	
	public Link(String key,int intData,String string){
		this.key=key;
		this.intData=intData;
		this.string=string;
		next=null;//这句话可以省略，省略时 next 对象自动赋值成null
	}
	
	public void displayLink(){
		System.out.println("key-->"+key+"   intData-->"+this.intData+"   string-->"+this.string);
	}
}
