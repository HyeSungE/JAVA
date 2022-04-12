import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ia = null;
		Socket soc = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		Scanner in = new Scanner(System.in);
		String msg=null;
		try {
			ia = InetAddress.getByName("192.168.0.213");
			//자기 자신에게 통신하기 : localhost 127.0.0.1
			soc = new Socket(ia,12346);
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			
			do{
				System.out.print("메시지입력 : ");
				msg=in.next();
				pw.println(msg);
				pw.flush();
				br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
				msg = br.readLine();
				System.out.println("서버에서 전송된 데이터 : "+msg);
			}	while(!msg.equals("end")) ;
		
			//pw.close(); 을 하게되면 소켓이 닫혀 통신 불가 - > flush()사용
		
			soc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("클라이언트 끝");
	}

}
