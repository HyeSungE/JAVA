import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class MyFrame05 extends Frame implements ActionListener{

	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("����");
	private Menu help = new Menu("����");
	private MenuItem f_open = new MenuItem("���Ͽ���");
	private MenuItem f_save = new MenuItem("��������");
	private MenuItem f_exit = new MenuItem("����");
	private MenuItem h_version = new MenuItem("��������");
	private FileDialog fd_open;
	private FileDialog fd_save;
	private Dialog d_version = new Dialog(this, "��������", true);
	private Label version_l = new Label("���� 1.0 �Դϴ�.", Label.CENTER);
	private Button version_bt = new Button("Ȯ��");
	private Panel version_s_p = new Panel();
	
	
	public void init() {
		d_version.setLayout(new BorderLayout());
		version_l.setFont(new Font("", Font.BOLD, 30));
		d_version.add("Center", version_l);
		d_version.add("South", version_s_p);
		version_s_p.setLayout(new FlowLayout(FlowLayout.CENTER));
		version_s_p.add(version_bt);	
		version_bt.addActionListener(this);
		
		this.setMenuBar(mb);
		mb.add(file);
		mb.add(help);
		file.add(f_open);
		f_open.addActionListener(this);
		file.add(f_save);
		f_save.addActionListener(this);
		file.addSeparator();
		file.add(f_exit);
		f_exit.addActionListener(this);
		help.add(h_version);
		h_version.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==f_open) {
			fd_open=new FileDialog(this,"����",FileDialog.LOAD);
			fd_open.setVisible(true);
		}else if(e.getSource()==f_save) {
			fd_save=new FileDialog(this,"����",FileDialog.SAVE);
			fd_save.setVisible(true);
		}else if(e.getSource()==f_exit) {
			System.exit(0);
		}else if(e.getSource()==h_version) {
			d_version.setBounds(300, 300, 300, 150);
			d_version.setResizable(false);
			d_version.setVisible(true);
		}else if (e.getSource() == version_bt) {
			d_version.setVisible(false);
		}
	}
	
	public MyFrame05(String title) {
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
public class Test05{

	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("frame����");
	}

}
