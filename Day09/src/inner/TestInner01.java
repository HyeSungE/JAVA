package inner;

class Outer01{
	private int a;
	private static int b;
	Inner01 in = new Inner01();
	static {
		b=20;
	}
	public Outer01(){
		a=10;
	}
	public void disp() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	class Inner01{
		private int c;
		public Inner01() {
			c=30;
		}
	public void disp_in() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		}
	}
}
public class TestInner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer01 ot=new Outer01();
		Outer01.Inner01 oi=ot.new Inner01();
		ot.in.disp_in();
	}

}
