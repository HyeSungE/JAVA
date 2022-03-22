package test01;

public class Test01 {
		private int a;
		Test01(){
			a=10;
	}
	void disp() {	//package는 default이다. 따라서 같은 패키지에있는 클래스는 사용가능하다.
		System.out.println(a);
	}

}
