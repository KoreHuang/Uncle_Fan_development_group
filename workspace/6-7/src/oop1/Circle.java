package oop1;

public class Circle extends Shape{
	double r;
	public Circle() {
		r=0;
		System.out.println("点>无面积");
	}
	public Circle(double R){
		r=R;
		System.out.println("圆形>半径是:"+R);
	}
	public void modify(double nr){
		r=nr;
	}
	public double area() {
		return 3.1415926*r*r;
	}
}
