class Bank{
	String name;
	double money;
	//�Ϲ����� ����ʵ峪 ����޼ҵ�� ��ü�� ������ �� �޸𸮿� �ö󰣴�.
	static float iyul; //������ ��
	//static����� Ŭ�����̸�.����̸����� �޴´�.
	//static����� ���α׷� ���۽� �޸𸮿� �ö󰣴�.
	static {
		iyul=0.05f;
		//static����ʵ��� �ʱ�ȭ
		//�Ϲݸ���ʵ�� �޸𸮿� �ö��� �ʾ����Ƿ� ���⼭ �ʱ�ȭ ��ų �� ����.
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
		System.out.println(name+"���� ���� �۾���  "+money+"���̰�, ���� ����Ǵ� ������ : "+iyul*100+"%�Դϴ�.");
	}
}
public class TestObject03 {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub	
		
		System.out.println("���� ����Ǵ� ������ : "+Bank.iyul*100+"%�Դϴ�.");
		
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
