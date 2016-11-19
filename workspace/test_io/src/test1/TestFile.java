package test1;

import java.io.FileInputStream;

public class TestFile {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:/a.txt");
			/*System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println(fis.read());*/
			
			int t = -1;
			while((t = fis.read())!=-1){
				System.out.println((char)t);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
