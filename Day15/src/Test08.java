import java.awt.*;
import java.util.*;


class MyFrame08 extends Frame{
	private MenuBar mb=new MenuBar();
	private Menu file=new Menu("����");
	private Menu edit=new Menu("����");
	private MenuItem f_new=new MenuItem("������");
	private MenuItem f_open=new MenuItem("���Ͽ���");
	private MenuItem f_save=new MenuItem("��������");
	private MenuItem f_exit=new MenuItem("����");
	private Menu e_color=new Menu("������");
	private Menu e_size=new Menu("ũ�⼱��");
	private CheckboxMenuItem e_red=new CheckboxMenuItem("������");
	private CheckboxMenuItem e_green=new CheckboxMenuItem("���");
	private CheckboxMenuItem e_blue=new CheckboxMenuItem("�Ķ���");
	public void init() {
		this.setMenuBar(mb);
		mb.add(file);
		file.add(f_new);
		file.add(f_open);
		file.add(f_save);
		file.addSeparator();
		file.add(f_exit);
		mb.add(edit);
		edit.add(e_color);
		edit.add(e_size);
		e_color.add(e_red);
		e_color.add(e_green);
		e_color.add(e_blue);
		
	}
	
	public MyFrame08(String title) {
		super(title);
		init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}
public class Test08 {

	public static void main(String[] args) {
		MyFrame08 mf = new MyFrame08("frame����");
	}

}
