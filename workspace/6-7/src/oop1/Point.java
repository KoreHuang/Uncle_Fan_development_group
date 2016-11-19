package oop1;

public class Point {
	int x,y;
	public Point(){
		x=0;y=0;
	}
	public Point(int xa,int ya){
		x=xa;
		y=ya;
	}
	public int  getP(int x,int y) {
		return (this.x-x)*(this.x-x)+(this.y-y)*(this.y-y);
	}
	public static void main(String[] args) {
		Point p1=new Point();
		System.out.println(p1.getP(20, 30));
	}
}
