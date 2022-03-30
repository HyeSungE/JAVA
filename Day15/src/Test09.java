import java.awt.*;
import java.util.*;


class MyFrame09 extends Frame{
	private Label lb =new Label("로 그 인",Label.CENTER);
	private BorderLayout bl= new BorderLayout();
	private Panel p1=new Panel();
	private Panel id=new Panel();
	private Panel pw=new Panel();
	private Panel p2=new Panel();
	private TextField id_tf=new TextField();
	private TextField pw_tf=new TextField();
	private Button ok_bt=new Button("확인");
	private Button cancle_bt=new Button("취소");
	public void init() {
	this.setLayout(bl);
	this.add("North",lb);
	p1.setLayout(new GridLayout(2,1));
	this.add("Center",p1);
	
	id.setLayout(new BorderLayout());
	p1.add(id);
	id.add("West",new Label("아이디    ",Label.LEFT));
	id.add(id_tf);
	
	pw.setLayout(new BorderLayout());
	p1.add(pw);
	pw.add("West",new Label("비밀번호",Label.LEFT));
	pw.add(pw_tf);
	
	p2.setLayout(new GridLayout(1,2));
	this.add("South",p2);
	p2.add("West",ok_bt);
	p2.add("Eest",cancle_bt);
	
		
	}
	
	public MyFrame09(String title) {
		super(title);
		init();
		this.setSize(400,150);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}
public class Test09 {

	public static void main(String[] args) {
		MyFrame09 mf = new MyFrame09("frame예제");
	}

}
