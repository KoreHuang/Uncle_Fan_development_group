package test_derive_extends_base;

public class base {
	private int x = 10;
	public int y = 10;
	public base() {}
	public base(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void commenFunc(){
		System.out.println("I'm base commen function...");
	}
	public void show() {
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println("I'm base show function...");
	}
	
}
