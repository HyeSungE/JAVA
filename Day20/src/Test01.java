import java.awt.*;
import java.awt.event.*;

class MyFrame01 extends Frame implements MouseListener, MouseMotionListener{
	private Label lb = new Label("x = 000 , y = 000");
	private Button bt = new Button("확인");
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", lb);
		this.add("South", bt);
		bt.addMouseListener(this);
		this.addMouseMotionListener(this);
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
	public void mouseClicked(MouseEvent e) {
		System.exit(0);		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		bt.setLabel("클릭하시면 종료됩니다.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		bt.setLabel("확인");		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (e.getSource()==this) {
			int x = e.getX();
			int y = e.getY();
			lb.setText("x = "+ x + " , y = " + y);
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class Test01 {
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("frame예제");
	}
}
