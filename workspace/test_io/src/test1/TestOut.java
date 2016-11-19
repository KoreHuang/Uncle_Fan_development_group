package test1;

import java.io.FileOutputStream;

public class TestOut {
	
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:/b.txt");
			for(int i=0;i<26;i++){
				fos.write(97+i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
