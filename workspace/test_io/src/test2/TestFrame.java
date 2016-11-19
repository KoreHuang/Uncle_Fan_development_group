package test2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestFrame extends JFrame{

	public TestFrame(){

		JPanel jp = new JPanel();
		JButton j1 = new JButton("文档路径");
		JTextField jtf = new JTextField(30);
		
		JTextArea jta = new JTextArea();
		jta.setEnabled(false);
		
		
		j1.addActionListener(new ButtonLisener(jtf,jta));
		
		jp.add(jtf);
		jp.add(j1);
		
		
		JPanel jp2 = new JPanel();
		JButton edit = new JButton("编辑");
		
		edit.addActionListener(new EditLisener(jta));
		
		
		JButton save = new JButton("保存");
		jp2.add(edit);
		jp2.add(save);
		
		
		
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jta);
		this.add(jp,BorderLayout.NORTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame();
	}
	
	
	
	
}
