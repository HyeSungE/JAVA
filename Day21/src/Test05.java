import java.io.*;
public class Test05 {

	public static void main(String[] args) throws IOException {
	//FileNotFoundException�� IOException�� ��ӹ޾ұ� ������ IOException�� ���
	
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21");
		File file = new File(dir,"bbb.txt"); 
		
		FileOutputStream fos = new FileOutputStream(file);

		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		DataOutputStream dos = new DataOutputStream(bos);
		
		//���۸޸𸮿� ������ ���۸޸𸮰� �� ���� ������ ������ �ʴ´�.
		int a=10;
		double b=1.23;
		String str = "�ȳ�";
		
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(str);
		dos.flush();//���۸޸𸮿� ���� file�� �ű��. - > ���۸޸𸮿� ���� ��� �������ִ� ����
		
		dos.close(); // ���� ���۸޸𸮿� ���� ���Ϸ� �ű�� dos�� �ݴ´�.
		
		
	
		
		
		
		
	
	}	
}
