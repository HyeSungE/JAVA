import java.io.*;
public class Test03 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21");
		File file = new File(dir,"aaa.txt"); 
		
		//rewrite����� default�̴�.
		//FileOutputStream fos = new FileOutputStream(file);//������ �������� ������ ���� ����.
		//append������� �ٲٱ����ؼ��� true
		FileOutputStream fos = new FileOutputStream(file,true);
		
		//fos.write(65); // byte������ ���� �����ش�.
		//65=A 97=a
		//fos.write('b');
		
		String msg="Hello World"; // ���ڿ���
		byte[] by = msg.getBytes();//����Ʈ�迭�� �����Ͽ� ����Ʈ�� ����
		//fos.write(by);
		fos.write(by,7,4); // ��������(7) ���� ������ ���� �� (4)
		
		
	}

}
