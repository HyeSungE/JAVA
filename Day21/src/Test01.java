import java.io.*;
public class Test01 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21\\aaa.txt");
		//������ ��ο� ���ϸ��� String������ �����Ͽ� ��ü�� ����
		File file2 = new File("C:\\\\Users\\\\i7C-43\\\\eclipse-workspace\\Day21","aaa.txt");
		//���� ���, ���ϸ����� ����
		File dir = new File("C:\\\\Users\\\\i7C-43\\\\eclipse-workspace\\Day21");
		//���Ͽ� ��θ��� �����Ͽ� ��� ���尡��
		File file3 = new File(dir,"aaa.txt");
		  
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
		System.out.println("File.separator = " + File.separator);
		System.out.println("File.separatorChar = " + File.separatorChar);
		
		// ������ ���������� -> / ������ ���������� -> \
		
		File file4 = new File("f : "+File.separator + "bigdata" + File.separator + "study"
				+ File.separator + "day21" + File.separator + "aaa.txt");
		//���� �����ڸ� ����ؼ� ���� ��ü�� ����
		
		
		
	}
}
