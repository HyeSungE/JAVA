class Bank{
	String name;
	double money;
	//일반적인 멤버필드나 멤버메소드는 객체가 생성할 때 메모리에 올라간다.
	static float iyul; //공동의 값
	//static멤버는 클래스이름.멤버이름으로 받는다.
	//static멤버는 프로그램 시작시 메모리에 올라간다.
	static {
		iyul=0.05f;
		//static멤버필드의 초기화
		//일반멤버필드는 메모리에 올라가지 않았으므로 여기서 초기화 시킬 수 없다.
	}
	Bank(String name,double money,float iyul){
		this.name=name;
		this.money=money;
		//this.iyul=iyul;
		Bank.iyul=iyul;
	}
	public void setIyul(float iyul) {
		this.iyul=iyul;
	}
	
	void disp() {
		System.out.println(name+"님의 현재 작액은  "+money+"원이고, 현재 적용되는 이율은 : "+iyul*100+"%입니다.");
	}
}
public class TestObject03 {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub	
		
		System.out.println("현재 적용되는 이율은 : "+Bank.iyul*100+"%입니다.");
		
		Bank aaa=new Bank("aaa",1000.0,0.03f);
		aaa.disp();
		System.out.println("---------------------------------------------------");
		
		
		Bank bbb=new Bank("bbb",1000.0,0.03f);
		aaa.setIyul(0.025f);
		aaa.disp();
		bbb.disp();
		System.out.println("---------------------------------------------------");
		aaa.setIyul(0.02f);
		
		Bank ccc=new Bank("ccc",1000.0,0.03f);
		aaa.setIyul(0.05f);
		aaa.disp();
		bbb.disp();
		ccc.disp();
		System.out.println("---------------------------------------------------");
	}

}
