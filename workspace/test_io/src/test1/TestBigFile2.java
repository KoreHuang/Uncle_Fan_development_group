package test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBigFile2 {
	
	public static void cN(int [] t){
		for (int i = 0; i < t.length; i++) {
			t[i] = t[i]+1;
 		}
	}
	
	public static void main(String[] args) {
		try {
			FileInputStream fis2 = new 
					FileInputStream("D:/·ÖÏí.pptx");
			FileOutputStream fos = 
					new FileOutputStream("D:/a.pptx");
			byte [] b = new byte[1024];
			int t = 0 ;
			int count = 0 ;
			while((t = fis2.read(b))!= -1){
				fos.write(b);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int [] t = {11,22,33,44,55,66};
		cN(t);
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
	
	
}
