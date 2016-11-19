package homework;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class TextOutFile {
	public static void main(String[] args)  {
		try {
			File file=new File("/Users/mac/Desktop/demo/dst.txt");
			File fp=new File("/Users/mac/Desktop/demo/src.txt");
			FileOutputStream fos=new FileOutputStream(file);
			FileInputStream  fis=new FileInputStream(fp);
			long bg=System.currentTimeMillis();
			
			byte buf[]=new byte[1024];
			int t=0;
			while((t=fis.read(buf))!=-1){
				fos.write(buf,0,t);
			}
			System.out.println((System.currentTimeMillis()-bg));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
