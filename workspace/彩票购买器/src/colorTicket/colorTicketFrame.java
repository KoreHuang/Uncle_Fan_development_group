package colorTicket;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class colorTicketFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public colorTicketFrame() {
		// TODO Auto-generated constructor stub
		GridLayout grid=new GridLayout(3, 11);
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JTextArea jta1=new JTextArea(1,10);
		jta1.setEditable(false);
		JButton start=new JButton("开始");
		JButton end =new JButton("结束");
		jp1.setLayout(grid);
		jp2.add(start);
		jp2.add(end);
		startListener startListener1=new startListener(jp1,jta1,end);
		endListener ens=new endListener(jp1, startListener1,start);
		ens.setEnd(ens);
		startListener1.setThread(startListener1);
		for (int i = 0; i < 33; i++) {
			JButton tmp=new JButton(new ImageIcon("red/"+(i+1)+".png"));
			tmp.setEnabled(false);
			tmp.setVisible(true);
			jp1.add(tmp);
		}
		//		JButton [] jButton=new JButton[jp1.getComponentCount()];
//		for(int i=0;i<jButton.length;i++){
//			jButton[i]=(JButton)jp1.getComponent(i);
//		}
//		jButton[2].setEnabled(true);
//		System.out.println(jButton.length);
		
		start.addActionListener(startListener1);
		end.addActionListener(ens);
		this.add(jta1);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.setVisible(true);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("彩票售卖机");
	}
	public static void main(String[] args) {
		new colorTicketFrame();
		
	}
}
