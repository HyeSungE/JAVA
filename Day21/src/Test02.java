import java.io.*;
public class Test02 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21");//�߻��� ���� �ּ��̹Ƿ� ���� ������ ��� �ȴ�.
		File file = new File(dir,"aaa.txt");
		//�ͼ��� ���� -> ȣ���� Ŭ�������� ����ó�� �������
		
		File temp=File.createTempFile("temp",".dat",dir);//�ӽ����� ���� ->�������־����
		//temp�� ���� .dat�� ������ ������ dir��ü�� �ִ� ���� �ȿ� ����� �ش�
		temp.deleteOnExit();//���α׷� ����� �ش� ������ ����
		file.delete();
		//������ �������� ������ false �����ϸ� �����ϰ� true�� ��ȯ
		
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("���α׷��� �����մϴ�.");
		}
		/*
		boolean isNewFile = File.createNewFile();
		//������ ������ ������ �����ϰ� true�� ��ȯ, ������ �̹� �����ϸ� false�� ��ȯ
		if(isNewFile) {
			System.out.println(file.getName()+" ������ ��������ϴ�.");
		}else {
			System.out.println(file.getName()+" ������ �̹� �����մϴ�.");
		}
		
		*/
		
	}
}
