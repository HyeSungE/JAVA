import java.net.*;
import java.io.*;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket ss = null;//��Ʈ��ȣ�� ����
		Socket soc = null; //TCP - unicast
		BufferedReader br = null;
		PrintWriter pw = null;
		String msg=null;
		try {
			ss = new ServerSocket(12346);
			System.out.println("���� ��� �� ..");
			soc = ss.accept();//������������ ���� ���� ����������� �����¿� �ӹ�������
			System.out.println("���� ������ : "+soc.toString());
			
			do {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			 msg=br.readLine();
			System.out.println("���� ������ : "+msg);
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
