import java.util.*;
abstract class Protoss{
	/*public void attack() {
		System.out.println("유닛이 공격을 합니다.");
	}
	public void move() {
		System.out.println("유닛이 이동을 합니다.");
	}*/
	//부모클래스에서는 별로 필요가 없다. 자식클래스가 구현을 해서 이용할 꺼야~
	//근데 attack메소드는 없어지면 안돼
	// *추상클래스* : 메소드 명만 정의하고 내용은 적지 않는 메소드 , 이 메소드는 자식클래스에서 반드시 구현을 해야하고,
	//업캐스팅된 상태에서 자식의 메소드를 실행하고자 할 때 사용
	//추상클래스는 객체를 생성하지 못한다. -> 설계도만 있는 클래스
	/*
	 * 추상클래스는 객체를 생성하지 못하므로 생성자또한 없다 따라서, 자식클래스가 상속받아서 만들거나 익명중첩클래스를 통해서만들거나 해야한다
	 */
	public abstract void attack();
	public abstract void move();
	
}
class Zealot extends Protoss{
	public void attack() {
		System.out.println("질럿이 공격을 합니다.");
	}public void move() {
		System.out.println("질럿이 이동을 합니다.");
	}
}

class Dragon extends Protoss{
	public void attack() {
		System.out.println("드라곤이 공격을 합니다.");
	}public void move() {
		System.out.println("드라곤이 이동을 합니다.");
	}
}

public class TestObject05 {

	public static void main(String[] args) {
		Protoss pro[]=new Protoss[5];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("1.질럿 2.드라곤 : ");
			int select1=in.nextInt();
			if(select1==1) {
				pro[i]= new Zealot();
			}
			else {
				pro[i]= new Dragon();
			}
		}
		System.out.print("1.공격 2.이동 : ");
		int select2=in.nextInt();
		for(int i=0;i<5;i++) {	
			if(select2==1) {
				pro[i].attack();
			}
			else {
				pro[i].move();
			}
		}
	}

}
