import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class Clinet {
	public static void main(String[] args) {
		try {
			String string="hello......it's me..... I'm Client";
			Socket socket=new Socket("127.0.0.1", 8989);
			OutputStream oStream=socket.getOutputStream();
			InputStream iStream=socket.getInputStream();
			byte msg[]=new byte[100];
			oStream.write(string.getBytes());
			iStream.read(msg);
			
			System.out.println("Client port:"+msg.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
