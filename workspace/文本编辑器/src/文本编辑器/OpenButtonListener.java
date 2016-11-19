package 文本编辑器;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OpenButtonListener implements ActionListener{
	private   JTextField jTextField;
	private 	  JTextArea jTextArea;

 	public OpenButtonListener(JTextField jTextField,JTextArea jTextArea) {
		// TODO Auto-generated constructor stub
		this.jTextField=jTextField;
		this.jTextArea=jTextArea;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		BufferedReader bReader;
		String currentPath=jTextField.getText();
		try {
			FileReader fs=new FileReader(currentPath);
			bReader = new BufferedReader(fs);
			String str="";
			String mString="";
			while ((str=bReader.readLine())!=null) {
				mString+=str+"\r\n";
			}
			jTextArea.setText(mString);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
