/*auth:lxrm
 * date:20160817
 * function:˫�������еĽڵ��࣬����data��װ�ɽڵ������
 * ���˼·��1)�ڵ�������
 * 			data����
 * 			XxxLink next����
 *			XxxLink previous����
 *		2���ڵ��๹�캯��
 *			��ʼ������data��װ�ɽڵ������
 *		3���ڵ����Ա����
 *			ֻ��һ��displayLink()��������������ڵ�����ֵ
 **/
package linklist;

import POJO.Student;

public class DoubleDirectionStudentLink {
	public Student stu;//�ڵ��д洢������
	public DoubleDirectionStudentLink previous;//�����һ���ڵ�ĵ�ַ
	public DoubleDirectionStudentLink next;//�����һ���ڵ�ĵ�ַ
	public DoubleDirectionStudentLink(Student stu){
		this.stu=stu;
		previous=null;
		next=null;
	}
	public void dispalyLink(){
		System.out.println("�ڵ��������ݣ�stuId="+stu.getId()+"    stuName="+stu.getName());
	}
}
