import java.awt.*;
public class Test07 {
	public static void main(String[] args) {
		/*Frame f1=new Frame();
		f1.setVisible(true);
		f1.setSize(400,300);*/
		
		Frame f2=new Frame("title");
		f2.setVisible(true);
		f2.setSize(400,300);
		f2.setLocation(500,500);
		//->
		//���߾�
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("���α��� : "+screen.getWidth());
		System.out.println("���α��� : "+screen.getHeight());
		
		int xpos=(int)(screen.getWidth()/2)-f2.getWidth()/2;
		int ypos=(int)(screen.getHeight()/2)-f2.getHeight()/2;
		f2.setLocation(xpos,ypos);
		
		//������ ���� ����
		f2.setResizable(false);

	}

}
