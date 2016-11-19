package 文本编辑器;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.FlatteningPathIterator;
import java.io.DataOutputStream;

import java.io.FileOutputStream;
import java.io.FileWriter;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class SaveButtonLisener implements ActionListener{
	private JTextField jTextField;
	private JTextArea jTextArea;
	public SaveButtonLisener(JTextField jtf,JTextArea jTextArea) {
		// TODO Auto-generated constructor stub
		this.jTextField=jtf;
		this.jTextArea=jTextArea;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String currentPath=jTextField.getText();
		String mString=jTextArea.getText();
		FileWriter fWriter;
		jTextArea.setEnabled(false);;
		//FileOutputStream fileOutputStream;
		//DataOutputStream dataOutputStream;
		try {
			//fileOutputStream=new FileOutputStream(currentPath);
			fWriter=new FileWriter(currentPath);
			//dataOutputStream=new DataOutputStream(fileOutputStream);	
			//dataOutputStream.writeChars(mString);
			fWriter.write(mString);
			fWriter.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	
}
