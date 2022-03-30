import java.awt.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

class MyFrame10 extends Frame{

	private BorderLayout bl=new BorderLayout();
	private Label lb=new Label("성적입력",Label.CENTER);
	
	private Panel p1=new Panel();
	private Panel p0=new Panel();
	private Panel p2=new Panel();
	private Panel p2_1=new Panel();
	private Panel p2_2=new Panel();
	private Panel p3=new Panel();
	private Panel p4=new Panel();
	private Panel p5=new Panel();
	private  TextField tf=new TextField();
	private Choice ch=new Choice();
	private JRadioButton mb=new JRadioButton("남자");
	private JRadioButton gb=new JRadioButton("여자");
	public void init() {
	this.setLayout(bl);
	
	lb.setFont(new Font("",Font.BOLD,25));
	this.add("North",lb);
	
	p1.setLayout(new GridLayout(1,2));
	this.add("Center",p1);
	

	p0.setLayout(new BorderLayout());
	p0.add("Center",p2);
	
	p5.setLayout(new GridLayout(1,4,5,8));
	p5.add(new Button("저장"));
	p5.add(new Button("지우기"));
	p5.add(new Button("성적 List"));
	p5.add(new Button("종료"));
	p0.add("South",p5);
	
	p2.setLayout(new GridLayout(9,2));
	
	p1.add("West",p0);
	p2.add(new Label("학 번",Label.CENTER));
	p2.add(new TextField());
	p2.add(new Label("성 명",Label.CENTER));
	p2.add(new TextField());
	p2.add(new Label("학 과",Label.CENTER));
	p2.add(ch);
	ch.add("물리학과");
	ch.add("전자공학과");
	ch.add("소프트웨어학과");
	ch.add("체육교육학과");
	ch.add("국어국문학과");
	ch.add("자유전공학과");
	p2.add(new Label("성 별",Label.CENTER));
	p2.add(p2_1);
	p2_1.setLayout(new GridLayout());
	p2_1.add("West",mb);
	p2_1.add("East",gb);
	p2.add(new Label("국 어",Label.CENTER));
	p2.add(new TextField());
	p2.add(new Label("수 학",Label.CENTER));
	p2.add(new TextField());
	p2.add(new Label("영 어",Label.CENTER));
	p2.add(new TextField());
	p2.add(new Label("사 회",Label.CENTER));
	p2.add(new TextField());
	p2.add(new Label("과 학",Label.CENTER));
	p2.add(new TextField());
	
	p3.setLayout(new BorderLayout());
	p1.add("East",p3);
	p3.add("North",new Label("메 모"));
	p3.setFont(new Font("",Font.BOLD,15));
	p3.add(new TextArea());
	
	p4.setLayout(new BorderLayout());
	p4.add("North",new Label("성적 Lis출력"));
	p4.setFont(new Font("",Font.BOLD,15));
	p4.add("Center",new TextArea());
	this.add("South",p4);
	}
	
	public MyFrame10(String title) {
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
public class Test10 {

	public static void main(String[] args) {
		MyFrame10 mf = new MyFrame10("frame예제");
	}

}
