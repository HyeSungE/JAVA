import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
class Food {
	private String name;
	private int price;
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
}
class MyFrame06 extends Frame implements ActionListener{
	private Button bt[] = new Button[9];
	private TextArea ta = new TextArea();
	private String menu[] = new String[] {"Â¥Àå¸é", "Â«»Í", "¿ìµ¿", "±è¹ä", "ÅÁ¼öÀ°", "ººÀ½¹ä", "³Ã¸é", "¼ø´ë±¹", "µ·°¡½º"};
	private int price[] = new int[] {5000, 7000, 6000, 3000, 10000, 6000, 6000, 8000, 8000};
	private Panel cen_p = new Panel();
	private Panel east_p = new Panel(); 
	private Food[] food = new Food[9];
	private ArrayList<Food> list = new ArrayList<>();
	
	public void init() {
		this.setLayout(new BorderLayout());
		
		this.add("Center", cen_p);
		cen_p.setLayout(new GridLayout(3, 3));
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new Button(menu[i]);
			food[i] = new Food(menu[i], price[i]);
			bt[i].addActionListener(this);
			cen_p.add(bt[i]);
		}
		
		east_p.setPreferredSize(new Dimension(120,300));
		this.add("East", east_p);
		east_p.setLayout(new BorderLayout());
		east_p.add(ta);
		ta.setText("ÁÖ¹®³»¿ª¼­\n");
		ta.append("----------\n");

		
	}
	public MyFrame06(String title) {
		super(title);
		this.init();
		this.setSize(450,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<bt.length; ++i) {
			if (e.getSource()==bt[i]) {
				Food food = new Food(menu[i], price[i]);
				list.add(food);
				disp();
			}
		}
	}
	
	public void disp() {
		ta.setText("ÁÖ¹®³»¿ª¼­\n");
		ta.append("----------\n");
		int totalPrice = 0;
		for(Food food : list) {
			ta.append(food.getName()+"\t"+food.getPrice()+"\n");
			totalPrice += food.getPrice();
		}
		ta.append("----------\n");
		ta.append("ÇÕ°è :\t" + totalPrice+"¿ø");
	}
}

public class Test07Xxxx {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("frame¿¹Á¦");
	}
}
