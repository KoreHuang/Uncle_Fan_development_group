package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObj {
	
	public static void main(String[] args) {
		try {
			/*FileOutputStream fos = new FileOutputStream("D:/obj.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			User u = new User(1001, "ะกร๗");
			oos.writeObject(u);*/
			FileInputStream fis = new FileInputStream("D:/obj.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			System.out.println(o);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
