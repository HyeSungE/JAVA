import java.awt.*;

class MyFrame02 extends Frame{
	private Label lb = new Label("�����ϴ� ������?");
	private Checkbox cb1 = new Checkbox("���");
	private Checkbox cb2 = new Checkbox("�ٳ���");
	private Checkbox cb3 = new Checkbox("��");
	private Checkbox cb4 = new Checkbox("����");
	private Label lb2 = new Label("����� ������?");
	private CheckboxGroup cg = new CheckboxGroup();
	private Checkbox m_cb = new Checkbox("����", cg, true);
	private Checkbox w_cb = new Checkbox("����", cg, false);
	
	private Panel cb_p = new Panel();
	private Panel ra_p = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(4,1));
		this.add(lb);
		this.add(cb_p);
		this.add(lb2);
		this.add(ra_p);
		
		ra_p.setLayout(new GridLayout(1,2));
		ra_p.add(m_cb);
		ra_p.add(w_cb);
		
		cb_p.setLayout(new GridLayout(1,4));
		cb_p.add(cb1);
		cb_p.add(cb2);
		cb_p.add(cb3);
		cb_p.add(cb4);
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
}

public class Test02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("Checkbox����");
	}
}
