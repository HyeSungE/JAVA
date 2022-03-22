package test01;

public class Test02 {

	public static void main(String[] args) {
		Test01 a=new Test01();
		//System.out.println(a.a);
		/*
		 * Test01과 Test02는 같은 클래스가 아니기 때문에 Test01에 있는 private가 붙은 멤버필드는 사용할 수가 없다.
		 */
		a.disp();//간접접근은 가능하다.
		
	}

}
