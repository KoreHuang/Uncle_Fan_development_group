package com.xupt.testSocket;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ClientGet extends Thread{
	Socket socket;
	public ClientGet(Socket s){
		this.socket=s;
	}
	public void out(String outMsg){
		try {
			
			
			socket.getOutputStream().write(outMsg.getBytes("UTF-8"));
		
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		};
	}
	@Override
	public void run() {
		try {
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			String msg="loop:";
			int count=0;
			while (true) {
				pw.println(msg+count+"\t");
				Thread.sleep(500);
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
