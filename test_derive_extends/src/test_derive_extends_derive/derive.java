package test_derive_extends_derive;

import test_derive_extends_base.base;

public class derive extends base{
	private int x = 20;
	public int y = 20;
	public void commenFunc(){
		System.out.println("I'm derive commen function...");
	}
	public void show() {		
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println("I'm derive show function...");
	}
	public void show(int z) {
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(z);
	}
	public static void main(String[] args) {
		base base1=new derive();
		System.out.println("...base->derive...");
		base1.commenFunc();
		base1.show();
		System.out.println("...derive...");
		derive d1=(derive)base1;
		d1.commenFunc();
		d1.show();
		
		
	}
}
