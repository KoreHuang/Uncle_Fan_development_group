import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame(){
		JButton east=new JButton("东");
		JButton west=new JButton("西");
		JButton north=new JButton("南");
		JButton south=new JButton("北");
		JButton center=new JButton("中");
		
		this.add(center);
		this.add(east,"East");
		this.add(west,"West");
		this.add(north,"North");
		this.add(south,"South");
		this.setSize(1400,400);
		this.setTitle("Calculator..");
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
