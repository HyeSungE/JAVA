package inner;

class Outer03{
	private int a;
	private static int b;
	
	static {
		b = 20;
	}
	public Outer03() {
		a = 10;
	}
	public void disp() {
		class Inner03{
			private int c;
			public Inner03() {
				c=30;
			}
		
		public void disp_in() {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			}
		}
	}
}
public class TestInner03 {
	Outer02 ot=new Outer02();
	Outer02.Inner02 oi=new Outer02.Inner02();
	}
