import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame06 extends Frame implements ActionListener{
	private TextField tf = new TextField();
	private Button bt[] = new Button[16];
	private String[] str = new String[] {
			"7","8","9","+","4","5","6","-","1","2","3","*","0","=","%","/"};
	private BorderLayout bl = new BorderLayout();
	private Panel p = new Panel();
	private GridLayout p_gl = new GridLayout(4,4, 3, 3);
	
	private char op = 0;
	private boolean isOp = false;
	private int firstSu = 0, resultSu = 0;
	
	public void init() {
		this.setLayout(bl);
		tf.setEditable(false);
		tf.setFont(new Font("", Font.PLAIN, 30));
		this.add("North", tf);
		this.add("Center", p);
		
		p.setLayout(p_gl);
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("", Font.BOLD, 20));
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
	}
	
	public MyFrame06(String title) {
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
	
	public void result() {
		switch(op) {
		case '+' : resultSu = firstSu + Integer.parseInt(tf.getText().trim()); break;
		case '-' : resultSu = firstSu - Integer.parseInt(tf.getText().trim()); break;
		case '*' : resultSu = firstSu * Integer.parseInt(tf.getText().trim()); break;
		case '/' : resultSu = firstSu / Integer.parseInt(tf.getText().trim()); break;
		case '%' : resultSu = firstSu % Integer.parseInt(tf.getText().trim()); 
		}
		tf.setText(String.valueOf(resultSu));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		String a = e.getActionCommand();
		try {
			int b = Integer.parseInt(a);
			tf.setText(tf.getText() + a);
		}catch(InputMismatchException ee) {
			op = a.charAt(0);
			if (op == '=') {
				result();
			}
		}
		*/
		for(int i=0; i<bt.length; ++i) {
			if (e.getSource() == bt[i]) {
				if (i==3 || i==7 || i==11 || i==14 || i==15) {
					if (op != 0) {
						result();
					}
					op = bt[i].getLabel().charAt(0);
					isOp = true;
				}else if (i==13) {
					result();
					op = 0;
					isOp = true;
				}else {
					if (isOp) {
						if (op != 0) {
							firstSu = Integer.parseInt(tf.getText().trim());
						}
						tf.setText(bt[i].getLabel());
						isOp = false;	
					}else {
						tf.setText(tf.getText() + bt[i].getLabel());
					}
				}
			}
			
		}
		
	}
}

public class Test06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("계산기예제");
	}	
}
