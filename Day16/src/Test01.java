import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class A01 implements ActionListener{
	//addActionListener의 매개변수는 ActionListener이다.
	//ActionListener은 인터페이스이므로 직접 객체 생성 x-> 클래스에 implements하고 메소드를 구현
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
class MyFrame01 extends Frame{
	
	private Button bt=new Button("종료");
	
	public void init() {
	this.setLayout(new BorderLayout());
	this.add("South",bt);
	A01 ap=new A01();
	bt.addActionListener(ap);//해당 컴포넌트에 액션이 가해졌을때
	}
	
	public MyFrame01(String title) {
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
public class Test01 {

	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("frame예제");
	}

}
