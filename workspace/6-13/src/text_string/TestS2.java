package text_string;

import java.util.Scanner;

public class TestS2 {
	public static void main(String[] args) {
		Scanner canner = new Scanner(System.in);
		while(canner.hasNext()){
			String s = canner.next();
			System.out.println(s);
			for(int i=s.length()-1;i>=0;i--){
				char c = s.charAt(i);
				System.out.print(c);
			}
			System.out.println();
			while(s.length() != 0){
				char c = s.charAt(0);
				int len = s.length();
				s = s.replaceAll(c+"", "");
				System.out.println(c+"出现的次数是"+(len - s.length()));
			}			
		}
	}
}
