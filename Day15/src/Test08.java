import java.awt.*;
import java.util.*;


class MyFrame08 extends Frame{
	private MenuBar mb=new MenuBar();
	private Menu file=new Menu("파일");
	private Menu edit=new Menu("편집");
	private MenuItem f_new=new MenuItem("새파일");
	private MenuItem f_open=new MenuItem("파일열기");
	private MenuItem f_save=new MenuItem("파일저장");
	private MenuItem f_exit=new MenuItem("종료");
	private Menu e_color=new Menu("색상선택");
	private Menu e_size=new Menu("크기선택");
	private CheckboxMenuItem e_red=new CheckboxMenuItem("빨간색");
	private CheckboxMenuItem e_green=new CheckboxMenuItem("녹색");
	private CheckboxMenuItem e_blue=new CheckboxMenuItem("파란색");
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
		MyFrame08 mf = new MyFrame08("frame예제");
	}

}
