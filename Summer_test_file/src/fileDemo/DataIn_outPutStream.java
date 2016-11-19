package fileDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIn_outPutStream {
	public static void dataWrite(String fileName)throws IOException{
		File file=new File(fileName);
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(1024l);
		dos.writeDouble(3.14);
		dos.writeUTF("你好世界");
		dos.writeChars("你好世界");
		dos.close();
	}
	public static void dataRead(String fileName)throws IOException{
		File file=new File(fileName);
		DataInputStream dataInputStream=new DataInputStream(new FileInputStream(file));
		int i=dataInputStream.readInt();
		System.out.println(i);
		i=dataInputStream.readInt();
		System.out.println(i);
		long tmp=dataInputStream.readLong();
		System.out.println(tmp);
		double tt=dataInputStream.readDouble();
		System.out.println(tt);
		String substr=dataInputStream.readUTF();
		System.out.println(substr);
		dataInputStream.close();
	}
	public static void main(String[] args) throws IOException {
		String fileName="/Users/mac/Desktop/data.dat";
		DataIn_outPutStream.dataWrite(fileName);
		FlieinputStream.ReadByteByBytes(fileName);
		System.out.println();
		DataIn_outPutStream.dataRead(fileName);
	}
}
