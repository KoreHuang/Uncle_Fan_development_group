package test1;

import java.io.FileInputStream;
import java.io.FileReader;

public class TestReader2 {
	
	public static void main(String[] args) {
		try {
			FileReader  fr = new FileReader("/Users/mac/Desktop/demo/x.txt");
			int t = 0;
			while((t = fr.read())!= -1){
				System.out.println((char)t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
