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
			//�ڱ� �ڽſ��� ����ϱ� : localhost 127.0.0.1
			soc = new Socket(ia,12346);
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
			
			do{
				System.out.print("�޽����Է� : ");
				msg=in.next();
				pw.println(msg);
				pw.flush();
				br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
				msg = br.readLine();
				System.out.println("�������� ���۵� ������ : "+msg);
			}	while(!msg.equals("end")) ;
		
			//pw.close(); �� �ϰԵǸ� ������ ���� ��� �Ұ� - > flush()���
		
			soc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ŭ���̾�Ʈ ��");
	}

}
