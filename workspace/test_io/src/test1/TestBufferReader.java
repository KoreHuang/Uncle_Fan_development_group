package test1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TestBufferReader {
	
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("D:/a.txt");
			InputStreamReader isr = new InputStreamReader(fis,"GBK");
			BufferedReader br = new BufferedReader(isr);
			String s = null;
			while((s = br.readLine())!= null){
				System.out.println(s);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
}
