import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

class MyFrame03 extends Frame implements ActionListener{
	private Calendar cal = Calendar.getInstance();
	private Label lb = new Label("", Label.CENTER);
	private Button left_bt = new Button(" ◀ ");
	private Button right_bt = new Button(" ▶ ");
	private Label[] week_lb = new Label[7];
	private String[] str = new String[] {"일","월","화","수","목","금","토"};
	private Button[] day_bt = new Button[42];
		
	private MyDialog md = new MyDialog(this, "다이어리", true);
	private BorderLayout bl = new BorderLayout();
	private Panel nor_p = new Panel();
	private Panel p = new Panel();
	private GridLayout p_gl = new GridLayout(7, 7);
	
	private String filename;
	private int year, month;
	private File dir = new File("F:\\bigdata\\study\\day16");
	
	public void init() {
		this.setLayout(bl);
				
		lb.setText(year+"년 " + month + "월");
		lb.setFont(new Font("", Font.BOLD, 30));
		this.add("North", nor_p);
		nor_p.setLayout(new BorderLayout());
		nor_p.add("West", left_bt);	
		left_bt.addActionListener(this);
		nor_p.add("Center", lb);
		nor_p.add("East", right_bt);
		right_bt.addActionListener(this);
		this.add("Center", p);
		
		p.setLayout(p_gl);
		for(int i=0; i<week_lb.length; ++i) {
			week_lb[i] = new Label(str[i], Label.CENTER);
			p.add(week_lb[i]);
		}
		for(int i=0; i<day_bt.length; ++i) {
			day_bt[i] = new Button("");
			day_bt[i].addActionListener(this);
			p.add(day_bt[i]);
		}
		buttonSetting();
		md.ok_bt.addActionListener(this);
		md.cen_bt.addActionListener(this);
	}
	
	public MyFrame03(String title) {
		super(title);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		cal.set(Calendar.DAY_OF_MONTH, 1);
		this.init();
		
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
	public String setFilename(String day) {
		filename = String.valueOf(year);
		if (month<9) filename += "0" + month;
		else filename += month;
		if (day.length()==1) filename += "0" + day;
		else filename += day;
		filename += ".txt";
		String title = filename.substring(0,4) + "년";
		title += filename.substring(4,6) +"월";
		title += filename.substring(6,8) + "일";
		return title;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<day_bt.length; ++i) {
			if (e.getSource()==day_bt[i]) {
				String title = setFilename(day_bt[i].getActionCommand());
				try {
					File file = new File(dir, filename);
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					String msg, data="";
					while((msg=br.readLine()) != null) {
						data += msg;
					}
					md.setTextArea(data);
				}catch(Exception ee) {}
				md.setTitle_lb(title);
				md.setVisible(true);
				return;
			}
		}
		if (e.getSource()==left_bt) {
			month--;
			if (month<1) {
				month = 12;
				year--;
			}
			lb.setText(year+"년 " + month + "월");
			cal.set(year, month-1, 1);
			buttonSetting();
		}else if (e.getSource()==right_bt) {
			month++;
			if (month>12) {
				month = 1;
				year++;
			}
			lb.setText(year+"년 " + month + "월");
			cal.set(year, month-1, 1);
			buttonSetting();
		}else if (e.getSource()==md.ok_bt) {
			String data = md.getTextArea();
			try {
				File file = new File(dir, filename);
				FileWriter fw = new FileWriter(filename);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println(data);
				pw.close();
			}catch(Exception ee) {}
			md.setTextArea("");
			md.setVisible(false);
		}else if (e.getSource()==md.cen_bt) {
			md.setTextArea("");
			md.setVisible(false);
		}
		
	}
	public void buttonSetting() {
		for(int i=0; i<day_bt.length; ++i) {
			day_bt[i].setLabel("");
			day_bt[i].setEnabled(true);
		}
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		int co = 0;	
		for(int i=1; i<week; ++i) {
			day_bt[co].setLabel("");
			day_bt[co].setEnabled(false);
			co++;
		}
		for(int i=1; i<=lastDay; ++i) {
			day_bt[co].setLabel(String.valueOf(i));
			co++;
		}
		for ( ; co<day_bt.length; ++co) {
			day_bt[co].setLabel("");
			day_bt[co].setEnabled(false);
		}
	}
}

public class Test03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("달력예제");
	}
}

class MyDialog extends Dialog{
	private Label title_lb = new Label("", Label.CENTER);
	private TextArea ta = new TextArea("");
	Button ok_bt = new Button("저장");
	Button cen_bt = new Button("취소");
	
	private Panel p = new Panel();
	
	public void setTitle_lb(String title) {
		title_lb.setText(title);
	}
	public void setTextArea(String str) {
		ta.setText(str);
	}
	public String getTextArea() {
		return ta.getText();
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		title_lb.setFont(new Font("", Font.BOLD, 30));
		this.add("North", title_lb);
		ta.setFont(new Font("", Font.PLAIN, 20));
		this.add("Center", ta);
		this.add("South", p);
		p.setLayout(new GridLayout(1,2,10,10));
		p.add(ok_bt);
		p.add(cen_bt);
	}
	public MyDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		this.init();
		this.setSize(300,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
	}
	
	
}




