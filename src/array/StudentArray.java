package array;

import POJO.Student;

public class StudentArray {
	private Student[] stu_arr;
	private int num;//��¼��������Ԫ�ظ���
	/*-------���캯��------
	 * 		��ָ�������СʱĬ������һ����СΪ10������*/
	public StudentArray(){
		stu_arr=new Student[10];
		num=0;
		System.out.println("������StudentArray�Ĺ��캯������ʼԪ�ظ���num��"+num+"");
	}
	public StudentArray(int size){
		stu_arr=new Student[size];
		num=0;
		System.out.println("������StudentArray�Ĺ��캯������ʼԪ�ظ���num��"+num+"");
	}
	/*function�������������Ԫ��
	 * @param stu:����ӵ�Ԫ��
	 * @return num��������Ԫ�غ�������Ԫ�ظ���*/
	public int addStudent(Student stu){
		stu_arr[num]=stu;
		//stu_arr[this.num].setId(stu.getId());
		//stu_arr[this.num].setName(stu.getName());
		num++;
		return num;
	}
	/*function:�������в���ָ��Ԫ��(�ҳ���һ��)��Ԫ��
	 * @param stu:�����ҵ�Ԫ��
	 * @return flag������鵽�˸�����¼��flag=true
	 * */
	public boolean findStudent(Student stu){
		boolean flag=false;
		int i;
		for(i=0;i<this.num;i++){
			if(stu_arr[i].equals(stu)){
				break;
			}
		}
		if(i==num){
			System.out.println("û���ҵ�������Ϣ:stuId--"+stu.getId()+"   stuName:--"+stu.getName());
			return flag;
		}else{
			flag=true;
			System.out.println("found:stuId--"+stu.getId()+"   stuName:--"+stu.getName());
			System.out.println("�������еĵ�"+i+"��Ԫ��");
			return flag;
		}
	}
	/*function:ɾ�������е�һ����Ԫ��
	 * */
	public void delete(Student stu){
		int i;
		//���������в��Ҹ�Ԫ��
		for(i=0;i<num;i++){
			if(stu_arr[i].equals(stu)){
				break;
			}
		}
		//���ݲ��ҽ���ֱ���в�ͬ�ĺ�������
		if(i==num){//û���ҵ���Ԫ�ص����
			System.out.println("û���ҵ���Ԫ��");
		}else if(i==num-1){//��Ԫ��ǡ��������ĩβԪ�ص����
			stu_arr[i].setId(null);
			stu_arr[i].setId(null);
			num--;
		}else{
			for(int j=i;j<num-1;j++){
				stu_arr[j].setId(stu_arr[j+1].getId());
				stu_arr[j].setName(stu_arr[j+1].getName());
			}
			num--;
		}	
	}
	/*function����stu_arr�����е�student���͵�Ԫ�ؽ�������(ʹ�õ������㷨��ð�������㷨)
	 * 			����Ĺؼ�����student��name���Ե�ֵ
	 * 			�����ִ�Сд
	 * 			����a��b,c.....��˳������*/
	public Student[] bubbleSortByStudentName(){
		int i,out;
		for(out=num;out>1;out--){
			for(i=0;i<out-1;i++){
				if(stu_arr[i].getName().compareToIgnoreCase(stu_arr[i+1].getName())>0){
					swap(i,i+1);
				}
			}
		}
		return this.stu_arr;
	}
	/*function:ʹ��ѡ�������㷨
	 * 		��stu_arr�е�student���͵�Ԫ��
	 * 		����studentId���Ե�ֵ��С��������*/
	public Student[] selectSortByStudentId(){
		int in,out,key;
		for(out=0;out<num-1;out++){
			key=out;
			for(in=key+1;in<num;in++){
				if(stu_arr[key].getId().compareTo(stu_arr[in].getId())>0){
					key=in;
				}
			}
			if(key!=out){
				swap(key,out);
			}
		}
		return stu_arr;
	}
	public Student[] insertionSortByStuentId(){
		int out,in;
		Student tmp;
		for(out=1;out<num;out++){
			tmp=stu_arr[out];
			in=out;
			while(((--in)>=0)&&(tmp.getId().compareTo(stu_arr[in].getId())<0)){
				stu_arr[in+1]=stu_arr[in];
			}
			stu_arr[in+1]=tmp;
		}
		return stu_arr;
	}
	/*function:��������λ��λ��i��j����Ԫ�ؽ���*/
	public void swap(int i,int j){
		Student tmp=stu_arr[i];
		stu_arr[i]=stu_arr[j];
		stu_arr[j]=tmp;
	}
	/*function:�������������Ԫ��*/
	public void list(){
		System.out.println("---��������Ԫ�ظ�����"+num);
		for(int i=0;i<num;i++){
			System.out.println("stuId--->"+stu_arr[i].getId()+"   stuName--->"+stu_arr[i].getName());
		}
	}
	public Student[] getStu_arr(){
		return this.stu_arr;
	}
}
