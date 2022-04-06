import java.awt.*;
import java.awt.event.*;

class MyFrame02 extends Frame implements ItemListener{
	private Choice ch = new Choice();
	private Label lb = new Label("당신의 혈액형은?");
	private Label result = new Label("");
	
	public void init() {
		this.setLayout(new GridLayout(3,1));
		this.add(lb);
		this.add(ch);	ch.addItemListener(this);		
		ch.add("A형");
		ch.add("B형");
		ch.add("O형");
		ch.add("AB형");
		ch.add("기타");
		this.add(result);
	}
	
	public MyFrame02(String title) {
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
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource()==ch) {
			String str = ch.getSelectedItem();
			result.setText("당신의 혈액형은 " + str +" 입니다.");
		}
		
	}
}

public class Test02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("frame예제");
	}
}
