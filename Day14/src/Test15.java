import java.awt.*;
class MyFrame15 extends Frame{
	
	private Label lb=new Label("��ȭ�⿹��",Label.CENTER);
	private Button bt[]=new Button[12];
	private String str[]=new String[] {"*","0","#"};
	private BorderLayout bl=new BorderLayout();
	private Panel pl=new Panel();
	private GridLayout pl_gl=new GridLayout(4,3);//1�޸�2
	
	private Font font=new Font("",Font.BOLD,30);
	//Font.BOLD ITALIC PLAIN(�⺻)
	
	private Color color=new Color(15,48,165);//RGB��
	
	private Cursor cursor=new Cursor(Cursor.WAIT_CURSOR);
	
	public void init() {
		this.setLayout(bl);
		
		this.setBackground(color);
		this.setForeground(new Color(255,0,0));
		//=this.setForeground(Color.RED);
		
		this.setCursor(cursor);
		
		lb.setFont(font);	
		this.add("North",lb);
		
		this.add("Center",pl);
		pl.setLayout(pl_gl);

		for(int i=0;i<bt.length;i++) {
			if(i>=9) {
				bt[i]=new Button(str[i-9]);
			}else {
			bt[i]=new Button(String.valueOf(i+1));//String.valueOf() <�ش��ϴ� ���� ��Ʈ������ ����ȯ
			}
			bt[i].setFont(new Font("",Font.ITALIC,15));
			pl.add(bt[i]);
		}
	}
	
	public MyFrame15(String title) {
		
		super(title);
		this.setSize(400,300);
		
		init();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;
		int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
public class Test15 {
	public static void main(String[] args) {
		MyFrame15 mf=new MyFrame15("frmae����");

	}

}
