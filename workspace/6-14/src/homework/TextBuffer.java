package homework;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TextBuffer {
	public static void main(String[] args) {
		try(FileInputStream fileInputStream=new FileInputStream( "/Users/mac/Desktop/demo/src.txt");
			BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
			FileOutputStream fileOutputStream=new FileOutputStream("/Users/mac/Desktop/demo/dst.txt");
			BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream)
			){
			int t=0;
			while((t=bufferedInputStream.read())!=-1){
				bufferedOutputStream.write(t);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
