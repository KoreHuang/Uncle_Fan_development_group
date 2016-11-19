package mon7day9;

import javax.xml.soap.Text;

public class TextClassDefaultValue {
	int i=9;
	String s="hello";
	double d=3.14;
//	public TextClassDefaultValue() {
//		// TODO Auto-generated constructor stub
//		
//	}
	public TextClassDefaultValue(){
		i=3;
		s="NIKE";
		d=1.3;
	}
	@Override
	public String toString() {
		return "["+i+"-"+s+"-"+d+"]";
	};
	public static void main(String[] args) {
		System.out.println(new TextClassDefaultValue());
	}
}
