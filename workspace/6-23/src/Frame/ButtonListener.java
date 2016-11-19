package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener{
	private JTextField jtf;
	static int L_Num;
	static int R_Num;
	static String SF;
	static int tmp;
	public ButtonListener(JTextField jtf) {
		// TODO Auto-generated constructor stub
		this.jtf=jtf;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton j1=(JButton) e.getSource();
		String msg = "";
		String string;
		string=j1.getText();
		switch (string) {
		case "c":
			jtf.setText("");
			L_Num=0;
			R_Num=0;
			SF=null;
			tmp=0;
			break;
		case "=":
			switch (SF) {
			case "+":
				addOperation();
				break;
				case "-":
					subOperation();
					break;
					case "*":
						mulOperation();
						break;
						case "/":
							divOperation();
							break;
			}
			dispReault();
			R_Num=0;
			break;
		case "+":
		case "-":
		case "*":
		case "/":
			SF=string;
			msg=jtf.getText()+SF;
			jtf.setText(msg);
			break;
		default:
			msg=jtf.getText()+string;
			jtf.setText(msg);
			tmp=Integer.parseInt(string);
			if(SF==null){
				setLNum();
				//System.out.println(L_Num);
			}else {
				setRNum();
				//System.out.println(R_Num);
			}
			break;
		}
		
	}
	private  void setLNum() {
		L_Num=L_Num*10+tmp;
	}
	private void setRNum() {
		R_Num=R_Num*10+tmp;
	}
	private void addOperation() {
		L_Num+=R_Num;
	}
	private void subOperation() {
		L_Num-=R_Num;
	}
	private void mulOperation() {
		L_Num*=R_Num;
	}
	private void divOperation() {
		if(R_Num==0){
			System.out.println("Can not divid Zero!");
			return;
		}
		L_Num/=R_Num;
	}
	private void dispReault() {
		jtf.setText(L_Num+"");
	}
}
