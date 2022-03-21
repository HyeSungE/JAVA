import java.util.*;
class A11{
	int a; int b; int c; int d; int e; int f; int g;
	A11(){
		a=10;b=20;c=30;d=40;e=50;f=60;g=70;
	}
	A11(int a){
		this();//매개변수가 없는 생성자를 호출한다.
		//다른 생성자 호출
		//생성자 내부에서만 사용 가능
		//생성자의 첫줄에서만 사용 가능
		//내부에서 한번에 두개를 호출하지 못한다.
		this.a=a;
	}
	A11(int a,int b){
		this(a);//매개변수가 하나 있는 생성자를 호출
		this.b=b;
	}
}
public class TestObject11{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력 : ");
		String name=in.next();
		System.out.print("전화번호를 입력  : ");
		String tel=in.next();
		Member m=new Member(name,tel);
		m.disp();
	}
}
