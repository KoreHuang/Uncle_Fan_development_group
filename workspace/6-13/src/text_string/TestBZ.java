package text_string;

public class TestBZ {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(1));
		//Integer it = 1;
		//int t = it;
		String s = "12540";
		System.out.println(Integer.parseInt(s));
		System.out.println(Double.parseDouble(s));
		System.out.println(Integer.toBinaryString(10));
	}
	
}
