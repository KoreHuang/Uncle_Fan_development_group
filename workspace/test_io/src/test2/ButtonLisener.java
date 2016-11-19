package test2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonLisener implements ActionListener{
	
	private JTextField jtf ;
	private JTextArea jta;
	
	
	
	public ButtonLisener(JTextField jtf,JTextArea jta) {
		this.jtf = jtf;
		this.jta = jta;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String s = jtf.getText();
			FileReader fs = new FileReader(s);
			BufferedReader br = new BufferedReader(fs);
			String str = null;
			String msg = "";
			while((str = br.readLine())!= null){
				msg+=str+"\r\n";
			}
			jta.setText(msg);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
	}


	
	
	
}
