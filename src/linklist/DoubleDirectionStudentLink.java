/*auth:lxrm
 * date:20160817
 * function:双向链表中的节点类，（将data封装成节点类对象）
 * 编程思路：1)节点类属性
 * 			data属性
 * 			XxxLink next属性
 *			XxxLink previous属性
 *		2）节点类构造函数
 *			初始化，将data封装成节点类对象
 *		3）节点类成员函数
 *			只有一个displayLink()函数，用于输出节点数据值
 **/
package linklist;

import POJO.Student;

public class DoubleDirectionStudentLink {
	public Student stu;//节点中存储的数据
	public DoubleDirectionStudentLink previous;//存放上一个节点的地址
	public DoubleDirectionStudentLink next;//存放下一个节点的地址
	public DoubleDirectionStudentLink(Student stu){
		this.stu=stu;
		previous=null;
		next=null;
	}
	public void dispalyLink(){
		System.out.println("节点数据内容：stuId="+stu.getId()+"    stuName="+stu.getName());
	}
}
