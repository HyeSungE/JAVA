import java.io.*;

class A03 implements Serializable{ // ����ȭ
	private int a;
	private int b;
	private transient int c; // IO�� network���� ��ü�� ������ �� ����ʵ尪 �� �������� �ʰڴٶ�� �ǹ�
	//private int c;
	public A03() {
		a=10;
		b=20;
		c=30;
	}
	public void disp() {
		System.out.println("a = "+a);
		System.out.println("a = "+b);
		System.out.println("a = "+c);
	}
}
public class Test03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22");
		File file = new File(dir,"bbb.txt"); 
	
		
		//��ü ����µ� 1byte����¿��� �����Ѵ�.
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		A03 ap= new A03();
		
		oos.writeObject(ap);
		oos.close();
		//�޸𸮿��ִµ����� �ܺη� ���������Բ� ���ִ� �� - ����ȭ
		//���Ͽ� �ִ� ���� �޸𸮿� �ö󰡰ڹ� ���ִ� �� - ������ȭ
	
	
	
	
	}

}
