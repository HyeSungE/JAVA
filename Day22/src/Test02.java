import java.io.*;

public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22");
		File file = new File(dir,"aaa.txt"); 
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		//������ String������ ����Ǳ� ������ ���ٸ� �������� ����ȯ �۾��� �ʿ�ġ ����
		
		while(true) {
			String str = br.readLine();
			if(str==null) break; //text�Է¿����� ���� null�̴�.
			System.out.println(str);
			
			
		}
	}

}
