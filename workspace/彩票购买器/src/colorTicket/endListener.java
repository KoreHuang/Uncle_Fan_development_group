package colorTicket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class endListener extends Thread implements ActionListener  {
	startListener startListener1; 
	endListener  endListener1;
	JPanel jp;
	JButton start;
	public endListener(JPanel jPanel,startListener startListener1,JButton start) {
		// TODO Auto-generated constructor stub
		jp=jPanel;
		this.startListener1=startListener1;
		this.start=start;
		
	}
	public void setEnd(endListener  endListener1) {
		this.endListener1=endListener1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jButton=(JButton)e.getSource();
		jButton.setEnabled(false);
		start.setEnabled(true);;
		endListener1.start();
		
	}
	@Override 
	public void run() {
		closeJbutton();
		rouseButton();
		startListener1.interrupt();
	};
	public void  closeJbutton() {
		for (int i = 0; i < jp.getComponentCount(); i++) {
			((JButton)jp.getComponent(i)).setEnabled(false);
		}
	}
	public void rouseButton(){
		int count=0;
		Random random=new Random();
		JButton jb[]=new JButton[jp.getComponentCount()];
		for (int i = 0; i < jp.getComponentCount(); i++) {
			jb[i]=(JButton)jp.getComponent(i);
		}
		while(count<6){
			int i=random.nextInt(33);
			if(!jb[i].isEnabled()){
				jb[i].setEnabled(true);
				count++;
			}
		}
	}

}
