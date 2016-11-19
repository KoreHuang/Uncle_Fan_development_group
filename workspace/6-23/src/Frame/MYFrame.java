package Frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MYFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str[]={"7","8","9","+","4","5","6","-","1","2","3","*","c","0","=","/"};

	public MYFrame(){
		GridLayout gridLayout=new GridLayout(4, 4);
		gridLayout.setHgap(10);
		gridLayout.setVgap(10);
		JPanel jPanel=new JPanel();
		jPanel.setLayout(gridLayout);
		JTextField jTextField=new JTextField(20);
		
		for(int i=0;i<str.length;i++){
			JButton j1=new JButton(str[i]);
			j1.addActionListener(new ButtonListener(jTextField));
			jPanel.add(j1);
		}
		this.add(jTextField,BorderLayout.NORTH);
		this.add(jPanel);
		this.setTitle("Caculator");
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MYFrame();
	}
}
