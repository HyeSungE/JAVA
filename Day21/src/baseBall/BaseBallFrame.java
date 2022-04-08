package baseBall;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


class BBFrame extends JFrame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton jbt[] = new JButton[5];
	
	String[] TeamList = new String[] {"삼성", "KT", "LG", "한화", "기아", 
			"롯데", "NC", "두산", "넥센", "SSG"};
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel jp[] = new JPanel[TeamList.length];
	private JTextArea jta[] = new JTextArea[TeamList.length];
	
	private String str[] = new String[] {"등록","트레이드","은퇴","수정","종료"}; 
	private TextArea ta = new TextArea();
	private Player pl;
	private InputDialog md[]=new InputDialog[4] ;
	BaseBallPro pro = new BaseBallProImpl();
	private String club=null;
	
	private Hashtable ht=pro.getHt();
	
	private String title_str = new String("-------------------------------------------------------------------------\n"
			   +" 이름\t\t연봉\n"
			   +"-------------------------------------------------------------------------\n");

	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North",jtb);
		for(int i=0;i<5;i++) {
			jbt[i]=new JButton();
			jbt[i].setText(str[i]);
			jbt[i].addActionListener(this);
			jtb.add(jbt[i]);
			if(i<4) {
				md[i]=new InputDialog(this,"",true,i);
				md[i].cen_bt.addActionListener(this);
				md[i].ok_bt.addActionListener(this);
			}
		}
		con.add("Center", jtp);
		
		for(int i=0;i<jp.length;i++) {
			jp[i]=new JPanel();
			jp[i].setLayout(new BorderLayout());
			jta[i]=new JTextArea("");
			jp[i].add("Center",jta[i]);
			jtp.add(TeamList[i],jp[i]);
		}

		
		
		
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public BBFrame(String title) {
		super(title);
		init();
		this.setSize(500,450);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
	
	public void output() {
		Hashtable ht2 = (Hashtable)ht.get(club);
		int n = 0;
		for(int i=0;i<TeamList.length;i++) {
			if(club.equals(TeamList[i])) {
				jta[i].setText("\n\t\t" + club + "선수명단\n"+title_str);
				if (ht2.size()==0) {
					jta[i].append("등록된 선수가 없습니다.");
				}
			n=i;
			break;
			}
		}
		Enumeration enu = ht2.keys();
		while(enu.hasMoreElements()) {
			String name = (String)enu.nextElement();
			Player output = (Player)ht2.get(name);
			jta[n].append(output.getName() + "\t\t" + output.getSalary());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbt[4]) {
			System.exit(0);
		}else {
			for(int i=0;i<=3;i++) {
				if(e.getSource()==jbt[i]) {
					md[i].setVisible(true);
				}
				if(e.getSource()==md[i].ok_bt) {
					if(i==0) {
						String teamName=md[i].getTeam();
						String errTName=null,errPName=null;
						String name=md[i].getName();
						int salary=md[i].getSalary();
						if(pro.isClub(teamName)) {
							Player pl = new Player(name,teamName,salary);
							md[i].clearData();
							md[i].setVisible(false);
							JOptionPane.showMessageDialog(this, "입력하신 선수" + name + "이/가 등록되었습니다.\n", 
									"팀 등록 성공", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							errTName=teamName;
							teamName=null;
							md[i].clearData();
							JOptionPane.showMessageDialog(this, "입력하신 팀 이름은 " + errTName +"은/는 존재 하지 않습니다.\n"
								+ "다시 입력해주세요", 
								"팀 이름 오류", JOptionPane.WARNING_MESSAGE);
						}
					}else if(i==1) {
						
					}else if(i==2) {
						
					}else if(i==3) {}
				}
				if(e.getSource()==md[i].cen_bt) {
					md[i].clearData();
					md[i].setVisible(false);
				}
			}
		}
		
	}
}

public class BaseBallFrame{

	public static void main(String[] args) {
		BBFrame mf = new BBFrame("frame예제");
	}

}
