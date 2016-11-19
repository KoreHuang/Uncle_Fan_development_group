package colorTicket;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class endThread extends Thread {
	private JButton jb[];

	private JTextArea jta;
	private JPanel jPanel;
	public endThread(JButton jb[],JTextArea jta,JPanel jp) {
		// TODO Auto-generated constructor stub
		this.jb=jb;
		this.jta=jta;
		this.jPanel=jp;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
			try {
				rouseButton();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				this.interrupt();
			}
	
	}
	public synchronized void rouseButton() throws InterruptedException {
		closeAll();
		jPanel.repaint();
		Random random=new Random();
		int i=random.nextInt(33);
		int count=0;
		jta.setText("");
		while(count<6){
			//System.out.println(Thread.currentThread().getName());
			
			if(!jb[i].isEnabled()){
				jb[i].setEnabled(true);
				count++;
				jta.append((i+1)+" ");
				Thread.sleep(1000);
			}
			i=random.nextInt(33);
		}
	}
	public synchronized void closeAll() {
		for (int i = 0; i < jb.length; i++) {
			jb[i].setEnabled(false);
		}
	}
}
