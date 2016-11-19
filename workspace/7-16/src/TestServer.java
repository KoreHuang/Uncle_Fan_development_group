
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	public static void main(String[] args) {
		
		try {
			String string="hello......it's me..... I'm server";
			ServerSocket serverSocket=new ServerSocket(8989);
			Socket socket=serverSocket.accept();
			OutputStream oStream=socket.getOutputStream();
			oStream.write(string.getBytes());;
			InputStream iStream=socket.getInputStream();
			byte msg[]=new byte[100];
			iStream.read(msg);
			System.out.println("Sever port:"+msg.toString());
			//System.out.println("hello......it's me.....");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
