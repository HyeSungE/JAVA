import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
public class Test01 {

	public static void main(String[] args) throws IOException {
	//FileNotFoundException�� IOException�� ��ӹ޾ұ� ������ IOException�� ���
	
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22");
		File file = new File(dir,"aaa.txt"); 
		
		FileWriter fw = new FileWriter(file);

		BufferedWriter bw = new BufferedWriter(fw);
		
		PrintWriter pw = new PrintWriter(bw);
		//������ ������ String���·� ����
		int a=10;	
		pw.print("�ȳ�");
		pw.println("�ڹټ����ð�");
		pw.close();
	
	}	
}
