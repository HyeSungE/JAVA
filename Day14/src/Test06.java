class A05{
	public void disp() throws Exception{
	}//�θ����� �������� ( throws Exception )�� �����Ͽ��� �ڽ��� ���������� ��� �ȴ�.
	 
	/*public void disp() {
		
	}*/
}

class A06 extends A05 {
	//�θ����� �������� ( throws Exception )�� ��������������,�ڽĿ��� �θ��� �޼ҵ带 �������̵��� �� ���������ϸ� �ȵȴ�.
	//���� �ؾ߰ڴٸ� try-catch���
	public void disp() {

		}
}


public class Test06  {
	public static void main(String args[])throws Exception {
		A05 a05=new A05();
		a05.disp();//ȣ���� Ŭ������ �������� ����� �� Ŭ������ ȣ���� ������ throws�� ���ָ� �ȴ�.
		
	}
	
	
}
