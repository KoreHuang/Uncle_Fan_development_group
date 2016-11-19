package test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestData {


	public static void main(String[] args) {
		try {
			/*FileOutputStream fos = new FileOutputStream("D:/t.txt");
			DataOutputStream dos = new DataOutputStream(fos);

			dos.writeBoolean(false);
			dos.writeInt(250);
			dos.writeDouble(3.14);*/

			FileInputStream fis = new FileInputStream("D:/t.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());


		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
