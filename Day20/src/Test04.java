import java.awt.*;
import java.awt.event.*;

class MyFrame04 extends Frame implements KeyListener{
	private int x = 175;
	private int y = 125;
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, 50, 50);
	}
	public MyFrame04(String title) {
		super(title);
		this.addKeyListener(this);
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
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 5;
			if (y > 240) {
				y = 240;
			}
		}else if (e.getKeyCode() == KeyEvent.VK_UP) {
			y -= 5;
			if (y < 60) {
				y = 60;
			}
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 5;
			if (x < 60) {
				x = 60;
			}
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 5;
			if (x > 340) {
				x = 340;
			}
		}
		repaint();
	}
}

public class Test04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("frame¿¹Á¦");
	}
}
