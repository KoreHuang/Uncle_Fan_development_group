package homework;

import java.io.BufferedInputStream;
import java.io.BufferedReader;

import java.io.FileInputStream;

import java.io.InputStreamReader;

public class TextBufferReader {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream=new FileInputStream("/Users/mac/Desktop/demo/x.txt");
			InputStreamReader isReader=new InputStreamReader(fileInputStream,"GBK");
			BufferedReader bReader=new BufferedReader(isReader);
			String string=null;
			while((string=bReader.readLine())!=null){
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
