import java.awt.*;
import java.util.*;
import javax.swing.*;


class MyFrame01 extends Frame{

	private Button bt=new Button("Ȯ��");
	public void init() {
	this.setLayout(new BorderLayout());
	this.add("South",bt);

	}
	
	public void paint(Graphics g) {
		g.drawLine(50, 50, 100, 100);
		//1,2�� �ʱ���ġ 3,4�� ������ 1,2�� ��ġ�̴�.
		g.drawRect(50,50,100,100);
		//1,2�� �ʱ���ġ  3��ŭ �����̵� 4��ŭ �����̵�
		g.setColor(Color.PINK);//���� ����
		g.fillRect(200, 50, 100, 100);
		//���� ä�� �簢�� fill->�ȿ� ���� ä��ڴ�.
		g.setColor(Color.blue);
		g.fillOval(200, 50, 100, 100);
		//���� ä�� ��-> drawRect�� �� ä��� ���� ����� ������ �Ű������� drawRect�� ����.
		/*int x[]=new int[] {100,160,40};
		int y[]=new int[] {60,200,120};
		g.drawPolygon(x,y,3);
		//���������� �մ´�. -> ������ �׸� �� �ִ�.
		g.drawPolyline(x,y,3);
		//���������� ���� �ʴ´� -> Ư���� ������ �հ��� �� ��
		*/
		int x[]=new int[] {100,200,160,40,200};
		int y[]=new int[] {60,60,200,120,60};
		g.drawPolygon(x,y,4);//�־��� �迭���� ���Ը� �Է����� ������ �ȴ�.
		//�־��� �迭���� ���� �Է°���
		g.setFont(new Font("",Font.BOLD,30));
		g.drawString("�����4��Ÿ�ڴ�.", 50, 200);
	
		//�̹��� �θ���
		Image img=Toolkit.getDefaultToolkit().getImage("K-050.jpg");
		g.drawImage(img, 50, 50, 100, 100, this);
		
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
		MyFrame01 mf = new MyFrame01("frame����");
	}

}
