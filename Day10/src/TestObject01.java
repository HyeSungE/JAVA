class A01{
	public String toString() {
		return "A01Ŭ����";
	}
}
//�����ڰ������� JVM�� �˾Ƽ� �������
public class TestObject01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A01 ap=new A01();
		System.out.println(ap.getClass());
		System.out.println(ap.toString());
		System.out.println(ap);
	}

}
