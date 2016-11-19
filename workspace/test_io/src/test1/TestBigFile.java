package test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBigFile {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis2 = new FileInputStream("D:/·ÖÏí.pptx");
			FileOutputStream fos = new FileOutputStream("D:/a.pptx");
			long begin = System.currentTimeMillis();
			int t = 0;
			while((t = fis2.read())!=-1){
				fos.write(t);
			}
			System.out.println(System.currentTimeMillis() - begin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
