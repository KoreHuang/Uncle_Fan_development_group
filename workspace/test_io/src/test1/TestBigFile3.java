package test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBigFile3 {
	
	
	
	public static void main(String[] args) {
		try {
			FileInputStream fis2 = new FileInputStream("D:/b.txt");
			FileOutputStream fos = new FileOutputStream("D:/c.txt");
			byte [] b = new byte[1024];
			int t = 0 ;
			while((t = fis2.read(b))!= -1){
				System.out.println(t);
				fos.write(b,0,t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
