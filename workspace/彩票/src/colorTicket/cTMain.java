package colorTicket;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextArea;

public class cTMain extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public cTMain() {
		// TODO Auto-generated constructor stub
		GridLayout grid=new GridLayout(3, 11);
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JTextArea jTextArea=new JTextArea(1,20);
		jTextArea.setEditable(false);
		jp1.setLayout(grid);
		JButton jButton[]=new JButton [33];
		for (int i = 0; i < 33; i++) {
			jButton[i]=new JButton(new ImageIcon("red/"+(i+1)+".png"));
			jButton[i].setEnabled(false);
			jp1.add(jButton[i]);
		}
		JButton start=new JButton("开始");
		JButton end=new JButton("结束");		
		jp2.add(start);
		jp2.add(end);
		endListener eListener=new endListener(start, jp1, jButton, jTextArea);
		startListener sListener=new  startListener(jButton, jTextArea,end,jp1,eListener);
		start.addActionListener(sListener);
		end.addActionListener(eListener);
		this.add(jTextArea);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2, BorderLayout.SOUTH);
		this.setTitle("彩票售卖机");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new cTMain();
	}
}
