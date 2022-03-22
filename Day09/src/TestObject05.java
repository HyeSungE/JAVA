class A05{
	//int a;
	//static int b;
	final int a=10;//final은 한 번 값을 초기에주고 바꾸지 못한다.선언시 초기화하거나
	static int b;//A05.b로 접근
	static {
		System.out.println("static구문이 실행되었습니다.");
	}
	{
		System.out.println("일반구문{}이 실행되었습니다.");
		//일반구문에서 초기화해야한다
	}
	public A05(){
		//fianl멤버필드는 생성자 전에 초기화해야한다.
		System.out.println("생성자 A05()가 실행되었습니다.");
	}
	public A05(int a,int b){
		System.out.println("생성자 A05(int a,int b)가 실행되었습니다.");
	}
}
public class TestObject05 {

	public static void main(String[] args) {
		A05 ap=new A05();
		A05 bp=new A05(10,20);
		System.out.println(ap.a);
		System.out.println(A05.b);
	}

}
