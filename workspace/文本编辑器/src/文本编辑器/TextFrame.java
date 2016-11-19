package 文本编辑器;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TextFrame extends JFrame{
	public TextFrame() {
		JTextField jTextField=new JTextField(40);
		JPanel jPanel=new JPanel();     //容器一，内载路径文本jTextFiled,打开按钮jButton
		JButton jButton=new JButton("Open"); //打开按钮
		JTextArea jtArea=new JTextArea();	//文本文件输出板
		JPanel jPanel2=new JPanel();			//容器二，内载编辑，保存按钮
		
		jPanel.add(jTextField);				//将路径文本加容器1
		jPanel.add(jButton);					//将打开按钮加入容器1
		
		jButton.addActionListener(new OpenButtonListener(jTextField, jtArea));
		//添加open点击事件
		
		JButton editor=new JButton("Edit");	//编辑按钮	
		editor.addActionListener(new EditButtonListener(jtArea));//添加editor点击事件
		JButton save=new JButton("Save");	//保存按钮
		save.addActionListener(new SaveButtonLisener(jTextField, jtArea));
		//添加save点击事件
		jPanel2.add(editor);					//将编辑和保存两个按钮加入容器二
		jPanel2.add(save);
		jtArea.setEnabled(false);
		this.add(jPanel,BorderLayout.NORTH);
		this.add(jtArea);
		this.add(jPanel2,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 1000);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		TextFrame myTextFrame=new TextFrame();
	}
}
