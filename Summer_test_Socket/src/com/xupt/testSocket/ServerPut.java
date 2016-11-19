package com.xupt.testSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerPut extends Thread {
	@Override
	public void run() {
		ServerSocket serverSocket;
		try {

			serverSocket = new ServerSocket(9999);
			while (true) {
				Socket socket = serverSocket.accept();
				JOptionPane.showMessageDialog(null, "有客户端链接到服务器，启动正常服务...");
				new ClientGet(socket).start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
