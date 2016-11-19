package 静态数据成员的初始化;

public class tmpClass {
	origenClass1 class1=new origenClass1(1);
	public tmpClass() {
		// TODO Auto-generated constructor stub
		System.out.println("I'm default tmpClass....");
		class1=new origenClass1(11);
		
		class2.fun(2);
	}
	public tmpClass(int i){
		System.out.println("I'm user tmpClass....");
		class1=new origenClass1(12);
		
		class2.fun(2);
	}
	public void  fun() {
		System.out.println("i'm tmpClass's fun....");
	}
	public static void main(String[] args) {
		//class2.fun(2);
		new tmpClass();//java在对对象数据成员进行初始化时，始终先对静态数据成员进行初始化，静态数据成员初始化按照声明顺序且只初始化一次，
						//之后在对其它非静态数据成员进行初始化，最后调用默认构造函数对对数据成成员进行初始化
		new tmpClass(2);				
	}
	static origenClass1 class2=new origenClass1(2);
	static origenClass1 class3=new origenClass1(3);
}
