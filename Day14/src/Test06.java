class A05{
	public void disp() throws Exception{
	}//부모한테 예외전가 ( throws Exception )이 존재하여도 자식은 예외전가가 없어도 된다.
	 
	/*public void disp() {
		
	}*/
}

class A06 extends A05 {
	//부모한테 예외전가 ( throws Exception )이 존재하지않지만,자식에서 부모의 메소드를 오버라이드할 때 예외전가하면 안된다.
	//굳이 해야겠다면 try-catch사용
	public void disp() {

		}
}


public class Test06  {
	public static void main(String args[])throws Exception {
		A05 a05=new A05();
		a05.disp();//호출한 클래스에 예외전가 존재시 그 클래스를 호출한 곳에서 throws를 해주면 된다.
		
	}
	
	
}
