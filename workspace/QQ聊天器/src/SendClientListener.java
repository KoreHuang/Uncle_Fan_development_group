import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SendClientListener implements ActionListener{
	private JTextArea jta;
	private JTextField jtf;
	private OutputStream os;
	public SendClientListener(JTextArea jta,JTextField jtf,OutputStream os) {
		// TODO Auto-generated constructor stub
		this.jta=jta;
		this.jtf=jtf;
		this.os=os;
	}
	public SendClientListener() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			String sendMsg="小象:";
			sendMsg+=jtf.getText()+"\r\n";
			jta.append(sendMsg);
			PrintWriter pWriter=new PrintWriter(os,true);
			pWriter.println(jtf.getText());
			jtf.setText("");
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		
	}

}
