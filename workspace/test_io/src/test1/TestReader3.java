package test1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class TestReader3 {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("/Users/mac/Desktop/demo/x.txt");
			InputStreamReader isr = new InputStreamReader(fis,"gbk");
			int t = 0;
			while((t = isr.read())!= -1){
				System.out.println((char)t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
