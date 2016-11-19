package text_collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.util.Scanner;

import org.omg.CORBA.OBJECT_NOT_EXIST;

public class Text_scanner {
	
	public static void main(String[] args) {
		//System.out.println("Input your data:");
		Scanner scanner=new Scanner(System.in);
		int id;
		String name;
		String sex;
		Stu s=null;
		FileOutputStream foss;
		ObjectOutputStream oss;
		FileInputStream fiss;
		ObjectInputStream ois;
		try {
			System.out.println("Input Path:");
			//scanner.next();/Users/mac/Desktop/demo/src.txt
			String path=scanner.next();
			System.out.println(path);
			foss=new FileOutputStream(path,true);
			oss=new ObjectOutputStream(foss);
			fiss=new FileInputStream(path);
			ois=new ObjectInputStream(fiss);
			System.out.println("Input data:");
				id=scanner.nextInt();
				name=scanner.next();
				sex=scanner.next();
				s=new Stu(id, name, sex);
				oss.writeObject(s);
				oss.close();
				//s.showInfo();
				s=(Stu)ois.readObject();
				s.showInfo();
				//s=(Stu)ois.readObject();
				//s.showInfo();
				//s=(Stu)ois.readObject();
				//s.showInfo();
				//System.out.println(id+"-"+name+"-"+sex);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
