import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.net.*;
import java.io.*;
import javax.swing.*;

enum Food{
	짜장(4000), 짬뽕(6000), 피자(12000), 족발(20000), 보쌈(24000),
	치킨(17000), 닭발(18000), 순대(3000), 곱창(15000);
	int price;
	Food(int price) {
		this.price=price;
	}
	int getPrice() {
		return this.price;
	}
}
class BuyList{
	private String name;
	private int price;
	public BuyList(String name, int price) {
		
		this.name=name;
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	
}


class MyFrame06 extends JFrame implements ActionListener,Runnable{
	static int tableSIZE = 6;
	
	private JButton[] bt= new JButton[9];
	private JButton send_bt = new JButton("전 송");
	private JPanel Center_jp = new JPanel();
	private JPanel East_jp = new JPanel();
	private JTextArea jta = new JTextArea("주문내역서\n----------------------\n");
	private Food[] food = Food.values();
	private ArrayList<BuyList> list = new ArrayList<BuyList>();
	private Hashtable <Integer,ArrayList> ht=new Hashtable<>();
	private DatagramPacket send_dp, receive_dp;
	private DatagramSocket ds;
	private InetAddress ia;
	private int n;

	private int totalPrice=0;
	
	
	
	public void init() {
		Container con = this.getContentPane();
		
		Center_jp.setLayout(new GridLayout(3,3));
		for(int i=0;i<bt.length;i++) {
			bt[i] = new JButton();
			bt[i].addActionListener(this);
			bt[i].setText(food[i].name()+": "+food[i].getPrice());
			Center_jp.add(bt[i]);
		}
		con.add("Center",Center_jp);
		
		East_jp.setPreferredSize(new Dimension(140,300));
		send_bt.addActionListener(this);
		East_jp.add("Center",jta);East_jp.add("Soutn",send_bt);
		jta.setPreferredSize(new Dimension(140,220));
		send_bt.setPreferredSize(new Dimension(140,30));
		con.add("East",East_jp);
	}
	public MyFrame06(String title) throws Exception {
		super(title);
		this.init();
		this.setSize(480,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
		ds = new DatagramSocket(12346);
		Thread tt = new Thread(this);
		tt.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<bt.length; ++i) {
			if (e.getSource()==bt[i]) {
				list.add(new BuyList(food[i].name(),food[i].getPrice()));
				disp();
			}
		}
		if(e.getSource()==send_bt) {
			try {
				InetAddress ia = InetAddress.getByName("localhost");
				/*byte[] by = jta.getText().getBytes();*/
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(ht.get(n));
				
				byte[] by = baos.toByteArray();
				send_dp = new DatagramPacket(by,by.length,ia,12345);
				ds.send(send_dp);
				jta.setText("");
				totalPrice = 0;
				list.clear();
				ht.get(n).clear();
			}catch(Exception ee) {}
		}
		
	}
	public void disp() {
		jta.setText("주문내역서\n----------------------\n");
		totalPrice = 0;
		
		for(BuyList food : list) {
			jta.append(food.getName()+"\t"+food.getPrice()+"\n");
			ht.put(n,list);
			totalPrice += food.getPrice();
		}
			jta.append("----------------------\n");
			jta.append("합계 :\t" + totalPrice+"원");
	}
	@Override
	public void run() {
		while(true) {
			try {
				byte by[] = new byte[65508];
				InetAddress ia = InetAddress.getByName("localhost");
				receive_dp = new DatagramPacket(by,by.length);
				ds.receive(receive_dp);
				n = Integer.parseInt(new String(receive_dp.getData()).trim());
				System.out.println(n);
			}catch(Exception e) {}
		}
		
	}		
}

public class Test07 {
	public static void main(String[] args) throws Exception {
		MyFrame06 mf = new MyFrame06("주 문");
	}
}
