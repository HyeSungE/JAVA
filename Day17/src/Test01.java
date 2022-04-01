import java.awt.*;
import java.util.*;
import javax.swing.*;


class MyFrame01 extends Frame{

	private Button bt=new Button("확인");
	public void init() {
	this.setLayout(new BorderLayout());
	this.add("South",bt);

	}
	
	public void paint(Graphics g) {
		g.drawLine(50, 50, 100, 100);
		//1,2는 초기위치 3,4는 마지막 1,2의 위치이다.
		g.drawRect(50,50,100,100);
		//1,2는 초기위치  3만큼 가로이동 4만큼 세로이동
		g.setColor(Color.PINK);//색상 설정
		g.fillRect(200, 50, 100, 100);
		//색을 채운 사각형 fill->안에 색을 채우겠다.
		g.setColor(Color.blue);
		g.fillOval(200, 50, 100, 100);
		//색을 채운 원-> drawRect를 꽉 채우는 원을 만들기 때문에 매개변수가 drawRect와 같다.
		/*int x[]=new int[] {100,160,40};
		int y[]=new int[] {60,200,120};
		g.drawPolygon(x,y,3);
		//마지막선을 잇는다. -> 도형을 그릴 수 있다.
		g.drawPolyline(x,y,3);
		//마지막선을 잇지 않는다 -> 특정한 선들을 잇고자 할 때
		*/
		int x[]=new int[] {100,200,160,40,200};
		int y[]=new int[] {60,60,200,120,60};
		g.drawPolygon(x,y,4);//주어진 배열보다 많게만 입력하지 않으면 된다.
		//주어진 배열보다 적게 입력가능
		g.setFont(new Font("",Font.BOLD,30));
		g.drawString("김민은4번타자다.", 50, 200);
	
		//이미지 부르기
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
		MyFrame01 mf = new MyFrame01("frame예제");
	}

}
