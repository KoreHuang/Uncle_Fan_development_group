package oop1;

public class Cylinder extends Circle{
	double h;
	public Cylinder(double h,double r){
		super(r);
		this.h=h;
		System.out.println("圆柱体>底面圆半径是"+r+" 高是"+h);
	}
	@Override
	public double area(){
		return super.area()*h;
	}
	public static void main(String[] args) {
		Cylinder c1=new Cylinder(5,20);
		System.out.println(c1.area());
	}
}
