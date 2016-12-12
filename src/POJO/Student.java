package POJO;

public class Student {
	private String id;
	private String name;
	/*----------¹¹Ôìº¯Êý------*/
	public Student(){}
	public Student(String id,String name){
		this.id=id;
		this.name=name;
	}
	/*----------setter¡¢getter------*/
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
}
