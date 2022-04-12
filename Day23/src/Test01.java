import java.io.IOException;
import java.net.*; // 자바에서 네트워크 프로그래밍을 하기 위함
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
				System.out.println(i+1+"사용 중");
			}
		}
		
	}

}
