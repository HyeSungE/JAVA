import java.util.*;
class Member{
	String name;
	String tel;
	Member(String name,String tel){
		this.name=name;
		this.tel=tel;
	}
	void disp() {
		System.out.println(this.name + "님의 전화번호는 "+this.tel+"입니다.");
	}
}
public class TestObject10{
	public static void main(String[] args){
		Member m[]=new Member[5];
		//클래스 배열은 객체를 선언만 한 것이다. 생성은 생성자에 의해 만들어진다.
		//배열을 선언만 한것으로는 클래스 배열을 사용할 수 없고 각각 new와 생성자를 통해 만들어줘야 사용가능하다.
		Scanner in = new Scanner(System.in);
		for(int i=0;i<m.length;i++) {
			System.out.print("이름을 입력 : ");
			String name=in.next();
			System.out.print("전화번호를 입력  : ");
			String tel=in.next();
			m[i]=new Member(name,tel);
			//위와 같이 클래스 배열을 각각 생성해줘야 사용가능하다.
		}
		for(int i=0;i<m.length;i++)
			m[i].disp();
	}
}
