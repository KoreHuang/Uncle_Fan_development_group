package fileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InoutStreamReaderWriter {
	public static String readByIsr(String fileName)throws IOException{
		File srcFile=new File(fileName);
		FileInputStream in=new FileInputStream(srcFile);
		InputStreamReader isr=new InputStreamReader(in,"gb2312");
		char []tmpChar=new char[1024];
		int subLength=0;
		String string="";
		while((subLength=isr.read(tmpChar))!=-1){
			String str=new String(tmpChar, 0, subLength);
			System.out.println(str);
			string+=str;
		}
		isr.close();
		return string;
	}
	public static void writeByOsw(String fileName)throws IOException{
		FileOutputStream fos=new FileOutputStream(fileName);
		OutputStreamWriter osw=new OutputStreamWriter(fos, "utf-8");
		osw.write(readByIsr("/Users/mac/Desktop/数据库笔记.txt"));
		osw.flush();
		osw.close();
	}
	public static void main(String[] args) throws IOException {
		String fileName="/Users/mac/Desktop/数据库笔记.txt";
		readByIsr(fileName);
		writeByOsw("/Users/mac/Desktop/笔记2.txt");
	}
}