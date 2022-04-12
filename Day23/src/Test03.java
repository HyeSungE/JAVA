import java.net.*;
import java.io.*;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket ss = null;//포트번호만 관리
		Socket soc = null; //TCP - unicast
		BufferedReader br = null;
		PrintWriter pw = null;
		String msg=null;
		try {
			ss = new ServerSocket(12346);
			System.out.println("서버 대기 중 ..");
			soc = ss.accept();//서버소켓으로 부터 값이 들오기전까지 대기상태에 머물러있음
			System.out.println("접속 데이터 : "+soc.toString());
			
			do {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			 msg=br.readLine();
			System.out.println("전송 데이터 : "+msg);
			pw = new PrintWriter(soc.getOutputStream(),true);
			//=pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			pw.println(msg);
			}while(!msg.equals("end"));
			
			
			pw.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
