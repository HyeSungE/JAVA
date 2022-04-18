package sungjuk;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClientFrame extends JFrame implements ActionListener {

	private JPanel jp = new JPanel();
	private JButton input_bt = new JButton("입력");
	private JButton edit_bt = new JButton("수정");
	private JButton delete_bt = new JButton("삭제");
	void init() {
		Container con = this.getContentPane();
		con.add("North",jp);
		jp.setLayout(new FlowLayout());
		jp.add(input_bt);jp.add(edit_bt);jp.add(delete_bt);
		input_bt.addActionListener(this);edit_bt.addActionListener(this);delete_bt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public ClientFrame(String title) {
		super(title);
		init();
		super.setSize(300,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(x, y);
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==input_bt) {
			dig input_dig = new dig(this,"입력",true);
		}else if(e.getSource()==edit_bt) {
			dig edit_dig = new dig(this,"수정",true);
		}else if(e.getSource()==delete_bt) {
			dig delete_dig = new dig(this,"삭제",true);
		}
		
	}
	public static void main(String[] args){
		ClientFrame cf = new ClientFrame("Client");

	}

}

