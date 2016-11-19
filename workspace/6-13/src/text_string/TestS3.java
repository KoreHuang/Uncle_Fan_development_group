package text_string;

public class TestS3 {
	public static String fun(char c){
		if(c == 'z'){
			return "z";
		}
		return c+fun((char)(c+1));
	}
	public static void main(String[] args) {
		
		char first = 'x';
		System.out.println((char)(first+1));
		System.out.println(fun('w'));
		String s = "a"+"b"+"c"+"d";
		System.out.println(s);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<10;i++){
			sb.append(i);
		}
	}
}
