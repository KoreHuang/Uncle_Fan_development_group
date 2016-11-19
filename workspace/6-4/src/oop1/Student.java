package oop1;

public class Student {
	public int sno;
	public String name;
	public String sex;
	public int age;
	public Student(String name,String sex){
		this.name=name;
		this.sex=sex;
	}
	public Student(int sno,String name,String sex){
		this.sno=sno;
		this.name=name;
		this.sex=sex;
	}
	public Student(int sno){
		this(sno,"unknown","unknown");
	}
	public void sayName(){
		System.out.println("My name is:"+this.name);
	}
	public static void main(String[] args) {
		Student s1=new Student("Xiao xiang", "male");
		Student s2=new Student("da xiang", "male2");
		System.out.println(s2.name);
		System.out.println(s1.sex);
	}
}
