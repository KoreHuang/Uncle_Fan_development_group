package colorTicket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class startListener implements ActionListener{
	private   JButton jba[]=new JButton[33];
	private   JTextArea jta;
	private   JButton stop;
	private   JPanel jpPanel;
	private 	  endListener eListener;
	public startListener(JButton jButton[],JTextArea jta,JButton stop,JPanel jp,endListener eListener) {
		// TODO Auto-generated constructor stub
		jba=jButton;
		this.jta=jta;
		this.stop=stop;
		jpPanel=jp;
		this.eListener=eListener;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		startThread startThread1=new startThread(jba,jpPanel , jta);
		JButton jButton=(JButton)e.getSource();
		jButton.setEnabled(false);
		stop.setEnabled(true);
		eListener.setStartThread(startThread1);
		startThread1.start();
	}
}
