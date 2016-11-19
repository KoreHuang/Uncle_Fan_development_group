package homework;

import java.io.FileInputStream;


import java.io.InputStreamReader;

public class TextReader {
	public static void main(String[] args) {
		try{
			FileInputStream fileInputStream=new FileInputStream("/Users/mac/Desktop/demo/src.txt");
			InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"gbk");
			int t=0;
			while ((t=inputStreamReader.read())!=-1){
				System.out.println((char)t);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
