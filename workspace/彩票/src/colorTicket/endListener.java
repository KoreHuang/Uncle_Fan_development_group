package colorTicket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class endListener implements ActionListener {
	private JButton start;
	private JPanel jp;
	private JButton jButton[];
	private JTextArea jta;
	private  startThread startThread1;
	public endListener(JButton start,JPanel jp,JButton jButton[],JTextArea jta) {
		// TODO Auto-generated constructor stub
		this.jButton=jButton;
		this.jp=jp;
		this.start=start;
		this.jta=jta;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jba=(JButton)e.getSource();
		jba.setEnabled(false);
		start.setEnabled(true);
		startThread1.interrupt();
		(new endThread(jButton,jta,jp)).start();
	}
	
	public void setStartThread(startThread startThread1){
		this.startThread1 = startThread1;
	}
	public void  setStertThread(startThread thread) {
		startThread1=thread;
	}
	
	
}
