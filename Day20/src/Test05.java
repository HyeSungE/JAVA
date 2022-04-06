import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame05 extends JFrame implements ActionListener{
	
	private JButton jbt = new JButton("입력");
	private JFileChooser jfc = new JFileChooser(".");
	
	public void init() {
		Container con = this.getContentPane();
		//Color color = JColorChooser.showDialog(this, "색상선택해봐", Color.red);
		//con.setBackground(color);
		con.setLayout(new BorderLayout());
		con.add("South", jbt);
		jbt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JFrame의 x 버튼을 눌렀을때 프로그램을 종료하라는 이벤트
	}
	
	public MyFrame05(String title) {
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
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jbt) {
			//int res = jfc.showOpenDialog(this);
			//System.out.println("res = " + res);
			/*if (res==0) {
				System.out.println("선택하신 파일 : " + jfc.getSelectedFile().getName());
			}*/
			
			String name = JOptionPane.showInputDialog(this, "이름을 입력하세요", "입력", 
					JOptionPane.QUESTION_MESSAGE);
			JOptionPane.showMessageDialog(this, "입력하신 이름은 " + name +" 입니다.", 
					"알림", JOptionPane.WARNING_MESSAGE);
			
			int res = JOptionPane.showConfirmDialog(this, "정말로 종료하시겠습니까?", 
					"종료", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (res==0) {
				System.exit(0);
			}
			/*JOptionPane.showMessageDialog(this, 
					"확인버튼을 누르셨습니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
			*/
		}
		
	}
}

public class Test05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("swing예제");
	}
}
