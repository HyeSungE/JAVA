import java.awt.*;
import java.awt.event.*;

class MyFrame02 extends Frame implements ItemListener{
	private Choice ch = new Choice();
	private Label lb = new Label("����� ��������?");
	private Label result = new Label("");
	
	public void init() {
		this.setLayout(new GridLayout(3,1));
		this.add(lb);
		this.add(ch);	ch.addItemListener(this);		
		ch.add("A��");
		ch.add("B��");
		ch.add("O��");
		ch.add("AB��");
		ch.add("��Ÿ");
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
			result.setText("����� �������� " + str +" �Դϴ�.");
		}
		
	}
}

public class Test02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("frame����");
	}
}
