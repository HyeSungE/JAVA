import java.awt.*;
import java.awt.event.*;

class MyFrame01 extends Frame implements ActionListener{
	private Button bt = new Button("Ȯ��");
	//int co = 0;
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		bt.addActionListener(this);
	}
	
	public void paint(Graphics g) {
		//co++;
		//System.out.println("co = " + co);
		g.drawLine(50, 50, 100, 100);
		//1,2��° �ʱ� ��ġ, 3,4��° ������ ��ġ, �� ��ġ�� �������� �̾��ش�
		g.drawRect(50, 50, 100, 100);
		//1,2��° �ʱ� ��ġ, 3��°�� ���η� �̵�, 4��°�� ���η� �̵��Ͽ� ���簢���� �׷��ش�
		g.setColor(Color.RED);
		g.fillRect(200, 50, 100, 100);
		g.setColor(Color.blue);
		g.fillOval(200, 50, 100, 100);
		int x[] = new int[] {100, 200, 160, 40, 200};
		int y[] = new int[] {60, 60, 200, 120, 60};
		g.drawPolygon(x, y, 4);
		g.setColor(Color.DARK_GRAY);
		g.setFont(new Font("", Font.BOLD, 30));
		g.drawString("�����4��Ÿ�ڴ�", 50, 200);
		Image img = Toolkit.getDefaultToolkit().getImage("K-050.jpg");
		g.drawImage(img, 50, 50, 150, 200, this);
	}
	
	public MyFrame01(String title) {
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
}

public class Test01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("frame����");
	}
}
