import java.io.IOException;
import java.net.*; // �ڹٿ��� ��Ʈ��ũ ���α׷����� �ϱ� ����
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket ss = null;
		//server ServerScoket,Socket
		//client Socket
		
		for(int i=0;i<65536;i++) {
			try {
				ss = new ServerSocket(i);
				ss.close();
			}catch(IOException e){
				System.out.println(i+1+"��� ��");
			}
		}
		
	}

}
