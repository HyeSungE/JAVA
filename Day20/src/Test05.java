import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame05 extends JFrame implements ActionListener{
	
	private JButton jbt = new JButton("�Է�");
	private JFileChooser jfc = new JFileChooser(".");
	
	public void init() {
		Container con = this.getContentPane();
		//Color color = JColorChooser.showDialog(this, "�������غ�", Color.red);
		//con.setBackground(color);
		con.setLayout(new BorderLayout());
		con.add("South", jbt);
		jbt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JFrame�� x ��ư�� �������� ���α׷��� �����϶�� �̺�Ʈ
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
				System.out.println("�����Ͻ� ���� : " + jfc.getSelectedFile().getName());
			}*/
			
			String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���", "�Է�", 
					JOptionPane.QUESTION_MESSAGE);
			JOptionPane.showMessageDialog(this, "�Է��Ͻ� �̸��� " + name +" �Դϴ�.", 
					"�˸�", JOptionPane.WARNING_MESSAGE);
			
			int res = JOptionPane.showConfirmDialog(this, "������ �����Ͻðڽ��ϱ�?", 
					"����", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (res==0) {
				System.exit(0);
			}
			/*JOptionPane.showMessageDialog(this, 
					"Ȯ�ι�ư�� �����̽��ϴ�.", "�˸�", JOptionPane.INFORMATION_MESSAGE);
			*/
		}
		
	}
}

public class Test05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("swing����");
	}
}
