import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame07 extends Frame implements ActionListener,MouseListener{

	private Panel Wp=new Panel();
	private Panel Ep=new Panel();
	private TextArea Ea=new TextArea();
	private Button food_bt[]=new Button[9];
	private String food[]=new String[] {"Â¥Àå¸é","°£Â¥Àå","Àï¹ÝÂ¥Àå","Â«»Í","ººÀ½Â«»Í","ººÀ½¹ä","ÅÁ¼öÀ°","±ñÇ³±â","µ·±î½º"};
	private int price[]=new int[] {5000,6000,7000,5000,8000,6000,10000,15000,6000};
	
	private boolean end=false;
	private int sum=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<food_bt.length;i++) {
			if(e.getSource()==food_bt[i]) {
				
				Ea.setText(Ea.getText()+"\n"+food_bt[i].getLabel()+" - " + price[i]+"¿ø");
				sum+=price[i];
				
				
			}
		}
	}
	
	
	public void init() {
	this.setLayout(new BorderLayout());
	this.add("West",Wp);
	this.add("Center",Ep);
	Wp.setLayout(new GridLayout(3,3));
	Ep.setLayout(new BorderLayout());
	Ep.add("North",new Label("ÁÖ¹®³»¿ª¼­",Label.CENTER));
	Ep.add("Center",Ea);
	
	for(int i=0;i<food_bt.length;i++) {
		food_bt[i]=new Button(food[i]);
		food_bt[i].addActionListener(this);
		Wp.add(food_bt[i]);
	}
	Ea.setFont(new Font("",Font.BOLD,15));
	Ea.addMouseListener(this);

	}
	
	public MyFrame07(String title) {
		super(title);
		init();
		this.setSize(600,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(!end) {
			end=true;
			Ea.setText(Ea.getText()+"\n-------------------");
			Ea.setText(Ea.getText()+"\n±Ý¾× - "+sum+"¿ø");
		}
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

public class test07 {

	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("frame¿¹Á¦");
	}

}
