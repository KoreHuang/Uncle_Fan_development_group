package IOPractice;
import java.io.*;
/*
 * �ַ���
 * ֻ�ܲ��ݴ��ı�
 */
public class ReaderTest01 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:/oo.txt");
			FileWriter fw = new FileWriter("E:/oo01.txt");
			fw.write("haha");
			int t = 0;
			String msg = null;
			while((t = fr.read())!=-1){
				msg +=(char)t; 
			}
			fw.write(msg);
			System.out.println(msg);
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
