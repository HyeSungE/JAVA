import java.io.*;
public class Test04 {

	public static void main(String[] args) throws IOException {
	//FileNotFoundException�� IOException�� ��ӹ޾ұ� ������ IOException�� ���
	
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21");
		File file = new File(dir,"aaa.txt"); 
		
		FileInputStream fis = new FileInputStream(file);
		
		while(true) {
			int ch = fis.read();//read()�� �� ���ڸ� �о�´�.
			if(ch==-1) break; // ������ ���� EOF(End of File)�̰� EOF�� -1�� ���� ������. �ƽ�Ű�ڵ�� 0���� �����ϴ� ���̱� �����̴�.
			System.out.print((char)ch); // �ƽ�Ű�ڵ�� int�̹Ƿ� char������ �� ��ȯ
		}
	
		//char���� �ƴ� int(4byte)�� ��� ó���ؾ� �ϴ��� -> Test05
	
	
	
	
	}	
}
