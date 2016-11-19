package text_string;

public class TestS1 {
	public static void main(String[] args) {
		String str = "abc";
		String str3 = "abc";
		String str2 = new String("abc");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str == str2);
		System.out.println(str == str3);
		
		String str4 = "asfdASfadsf";
		//获取字符串长度
		System.out.println(str4.length());
		//获取指定位置的字符
		System.out.println(str4.charAt(4));
		//获取指定字符串第一次出现的位置
		System.out.println(str4.indexOf("5"));
		//获取指定字符串最后一次出现的位置
		System.out.println(str4.lastIndexOf("f"));
		//将字符串转换为大写
		System.out.println(str4.toUpperCase());
		//将字符串转换为小写
		System.out.println(str4.toLowerCase());
		//从指定位置截取字符串
		System.out.println(str4.substring(2));
		//从指定区间截取字符串
		System.out.println(str4.substring(5,7));
		String str5="我恨你，恨你不恨你的恨";
		System.out.println(str5.replaceAll("恨", "*"));
		byte [] b = str5.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		boolean b1 = str4.contains("AS");
		System.out.println(b1);
		String s5 = "a,b,c,d";
		String [] s = s5.split(",");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}
	
	
}
