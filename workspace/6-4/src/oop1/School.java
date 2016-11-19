package oop1;
public class School {
	public void m1(Teacher t){
		t=new Teacher("老王");
	}
	public void m2(int t){
		t=10;
	}
	public static void main(String[] args) {
		Teacher t1=new Teacher("小王");
		System.out.println(t1);
		School school=new School();
		school.m1(t1);
		System.out.println(t1);
		System.out.println(t1.name);
		int t=15;
		school.m2(t);
		System.out.println(t);
	}
}
