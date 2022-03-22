package inner;

class Outer02{
	private int a;
	private static int b;
	
	static {
		b = 20;
	}
	public Outer02() {
		a = 10;
	}
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	static class Inner02{//static멤버필드만 사용가능
		private int c;
		public Inner02() {
			c = 30;
		}
		public void disp_in() {
			//System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
		}
	}
}
public class TestInner02 {
	Outer02 ot=new Outer02();
	Outer02.Inner02 oi=new Outer02.Inner02();
	}
