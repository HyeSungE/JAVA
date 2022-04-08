package Calendar;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class MyFrame03 extends Frame implements ActionListener{
	private Calendar cal = Calendar.getInstance();
	private Label lb = new Label("", Label.CENTER);
	private Button left_bt = new Button(" ◀ ");
	private Button right_bt = new Button(" ▶ ");
	private Label[] week_lb = new Label[7];
	private String[] str = new String[] {"일","월","화","수","목","금","토"};
	private Button[] day_bt = new Button[42];
		
	private BorderLayout bl = new BorderLayout();
	private Panel nor_p = new Panel();
	private Panel p = new Panel();
	private GridLayout p_gl = new GridLayout(7, 7);
	
	private int year, month;
	private DayDialog dd = new DayDialog(this, "", true);
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
			p.add(day_bt[i]);
			day_bt[i].addActionListener(this);
			
		}
		buttonSetting();
		
		dd.save_bt.addActionListener(this);
		dd.can_bt.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==left_bt) {
			month--;
			if (month<1) {
				month = 12;
				year--;
			}
		}else if (e.getSource()==right_bt) {
			month++;
			if (month>12) {
				month = 1;
				year++;
			}
		}
		lb.setText(year+"년 " + month + "월");
		cal.set(year, month-1, 1);
		buttonSetting();
		for(int i=0;i<day_bt.length;i++) {
			if(e.getSource()==day_bt[i]) {
				dd.set_titleL(lb.getText()+" "+day_bt[i].getLabel()+"일");
				File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22\\src\\Calendar");
				File file = new File(dir,dd.get_ti()+".txt");
				
				try {
					FileInputStream fis = new FileInputStream(file); 
					BufferedInputStream bis =new BufferedInputStream(fis);
					ObjectInputStream ois =new ObjectInputStream(bis);
					
					Object obj =ois.readObject(); 
					DayDialog idd =(DayDialog)obj;
					dd.set_ta(idd.get_ta());
					dd.setVisible(true);
				}catch (IOException err) {
					dd.setVisible(true);
				}catch (ClassNotFoundException err) {
					
				}catch (NullPointerException err) {
					dd.setVisible(true);
				}
				
			}	
		}
		
		if(e.getSource()==dd.save_bt) {
			String str = dd.get_ta();
			File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22\\src\\Calendar");
			File file = new File(dir,dd.get_ti()+".txt");
			try {
				FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				DayDialog odd = dd;
				oos.writeObject(odd);
				oos.close();
			}catch (IOException err) {
				
			}
			dd.setVisible(false);
		}else if(e.getSource()==dd.can_bt) {
			dd.set_ta("");
			dd.setVisible(false);
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

public class MyCalendar {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("달력예제");
	}
}