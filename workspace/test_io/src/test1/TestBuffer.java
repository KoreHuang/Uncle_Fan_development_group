package test1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBuffer {
	
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("D:/t.pptx");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			int  t= 0;
			while((t = bis.read())!= -1){
				bos.write(t);
			}
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
}
