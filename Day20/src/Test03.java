import java.awt.*;
import java.awt.event.*;

class MyFrame03 extends Frame implements FocusListener, KeyListener{
	private Label lb = new Label("첫번째 TextField에 위치");
	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private Label lb1 = new Label("0개");
	private Label lb2 = new Label("0개");
	
	public void init() {
		this.setLayout(new GridLayout(5,1));
		this.add(lb);
		this.add(tf1);	tf1.addKeyListener(this);
		this.add(lb1);
		this.add(tf2);	tf2.addKeyListener(this);
		this.add(lb2);
		tf1.addFocusListener(this);
		tf2.addFocusListener(this);
	}
	
	public MyFrame03(String title) {
		super(title);
		this.init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource()==tf1) {
			int len = tf1.getText().trim().length();
			lb1.setText(len+"개");
		}else if (e.getSource()==tf2) {
			int len = tf2.getText().trim().length();
			lb2.setText(len+"개");
		}
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource()==tf1) {
			lb.setText("첫번째 TextFeild에 위치");
		}else if (e.getSource()==tf2) {
			lb.setText("두번째 TextFeild에 위치");
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class Test03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("frame예제");
	}
}
