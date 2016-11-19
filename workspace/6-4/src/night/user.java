package night;

public class user {
	public String name;
	static int count;
	public static void m1(){
		System.out.println("I'm M1...");
		m2();
	}
	public static void m2(){
		System.out.println("I'm M2...");
		System.out.println("Current number is:"+count);
	}
	user(String name){
		this.name=name;
		count++;
	}
	public void showInfo(){
		System.out.println("My name is:"+name);
	}
	public static void main(String[] args) {
		user.count=0;
		user u1=new user("xiao wang");
		u1.showInfo();;
		user.m1();
		user u2=new user("wang hua");
		u2.showInfo();
		user.m1();
	}
}
