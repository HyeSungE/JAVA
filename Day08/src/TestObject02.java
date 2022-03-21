
public class TestObject02 {

	public static void main(String[] args) {
		//메소드의 사용목적:
		/*
		 * 같은 작업을 반복적으로 실행시키고자 할 때, 그 반복적인 기능을 메소드로 구현하고, 그 메소를 호출하여 쓰면 표현이 더 간단해 진다.
		 * 복잡한 코드를 숨기거나 기능으로 구현해서 표현하면 프로그램의 이해도가 더 높아진다.
		 */
		System.out.println("aaa");
		disp();
		System.out.println("bbb");
		disp(10);
		System.out.println("ccc");
		disp();
	}
	/*
	 * 메소드의 이름을 같지만 매개변수가 다른 집합 : 메소드 오버로딩
	 * 매개변수가 다르다함은 매개변수의 개수나 자료형이나 자료형의 배열이 다른 경우이다.
	 */
	public static void disp() {
		System.out.println("*****");
	}
	public static void disp(int a) {
		for(int i=1;i<=a;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void disp(int a,double b){
		System.out.println("*****");
	}
	public static void disp(double a,int b){
		System.out.println("*****");
	}
}



