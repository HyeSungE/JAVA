import java.awt.*;
import java.awt.event.*;
class C01 extends MouseAdapter{
	@Override
	public void mouseClicked(MouseEvent e) {
		System.exit(0);
	}	
}
/*
class B01 implements MouseListener{
	@Override
	public void mouseClicked(MouseEvent e) {//���콺�� Ŭ�������� �߻�!!
		System.exit(0);
	}
	@Override
	public void mousePressed(MouseEvent e) {//���콺�� �������� �߻�!!
	}
	@Override
	public void mouseReleased(MouseEvent e) {//���콺�� �������� �߻�!!
	}
	@Override
	public void mouseEntered(MouseEvent e) {//���콺 �����Ͱ� �ش� ������Ʈ ���� ������!!
	}
	@Override
	public void mouseExited(MouseEvent e) {//���콺 �����Ͱ� �ش� ������Ʈ �ۿ� ������!!
	}
}
/*
class A01 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
*/
class MyFrame02 extends Frame implements MouseListener{//implements ActionListener{
	private Button bt = new Button("����");
	private Dialog dlg = new Dialog(this, "�����!!", true);
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		//A01 ap = new A01();
		//bt.addActionListener(ap);//�ش� ������Ʈ�� �׼��� ����������
		//B01 ap = new B01();
		//bt.addMouseListener(ap);
		//C01 ap = new C01();
		//bt.addMouseListener(ap);
		//bt.addActionListener(this);
		//bt.addMouseListener(this);
		/*WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};*/
		MouseAdapter ma = new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				bt.setLabel("��ư���� ���콺 �����Ͱ� �־��");
			}
		};
		bt.addMouseListener(ma);

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
	public void mouseClicked(MouseEvent e) {//���콺�� Ŭ�������� �߻�!!
		System.exit(0);
	}
	@Override
	public void mousePressed(MouseEvent e) {//���콺�� �������� �߻�!!
	}
	@Override
	public void mouseReleased(MouseEvent e) {//���콺�� �������� �߻�!!
	}
	@Override
	public void mouseEntered(MouseEvent e) {//���콺 �����Ͱ� �ش� ������Ʈ ���� ������!!
		//bt.setLabel("��ư���� ���콺 �����Ͱ� �־��");
	}
	@Override
	public void mouseExited(MouseEvent e) {//���콺 �����Ͱ� �ش� ������Ʈ �ۿ� ������!!
		bt.setLabel("����");
	}
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
	*/
}


public class Test02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("frame����");
	}
}
