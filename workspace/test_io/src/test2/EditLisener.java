package test2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class EditLisener implements ActionListener{
	
	
	private JTextArea jta;
	
	public EditLisener(JTextArea jta) {
		this.jta=jta;
 	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		jta.setEnabled(true);
	}
	
}
