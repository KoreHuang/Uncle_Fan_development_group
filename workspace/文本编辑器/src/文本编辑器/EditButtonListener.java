package 文本编辑器;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class EditButtonListener implements ActionListener{
	private JTextArea jTextArea;
	public EditButtonListener(JTextArea jTextArea) {
		// TODO Auto-generated constructor stub
		this.jTextArea=jTextArea;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jTextArea.setEnabled(true);;
	}
	
}
