package mon7day9;
//使用牛顿迭代法实现求一个数的的开根函数
public class m_sqrt {
	private double x;
	public m_sqrt(double x){
		this.x=x;
	}
	//开三次根
	public double three_qrt(){
		double inf=1e-15;
		double tmp=x;
		while(Math.abs(tmp-x/(tmp*tmp))>tmp*tmp*inf){
			tmp=(2*tmp+x/Math.pow(tmp,2))/3;
		}
		return tmp;
	}
	public void modify(double new_x){
		x=new_x;
	}
	//开平方根
	public static double msqrt(double num){
		if(num<0) return Double.NaN;
		double inf=1e-15;
		double tmp=num;
		while (Math.abs(tmp-num/tmp)>tmp*inf) {
			tmp=(tmp+num/tmp)/2.0;
		}
		return tmp;
	}
	public static void main(String[] args) {
		System.out.println(msqrt(4));
		m_sqrt x=new m_sqrt(27);
		System.out.println(x.three_qrt());
	}
}
