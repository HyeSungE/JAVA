import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


class MyFrame03 extends Frame implements ActionListener{
	private Button left_bt = new Button("왼쪽버튼");
	private Button right_bt = new Button("오른쪽버튼");
	private Label msg_lb = new Label("버튼을 누르세요!!", Label.CENTER);
	
	private Panel p = new Panel();
	public void init() {
		
		this.setLayout(new GridLayout(2,1));
		this.add(p);
		p.setLayout(new GridLayout(1,2));
		p.add(left_bt);	left_bt.addActionListener(this);
		p.add(right_bt);right_bt.addActionListener(this);
		msg_lb.setFont(new Font("", Font.BOLD, 30));
		this.add(msg_lb);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == left_bt) {
			msg_lb.setText("왼쪽버튼을 누르셨습니다.");
		}else if (e.getSource() == right_bt) {
			msg_lb.setText("오른쪽버튼을 누르셨습니다.");
		}
		
	}
	public MyFrame03(String title) {
		super(title);
		init();
		this.setSize(450,600);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}
public class Test03{

	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("frame예제");
	}

}
