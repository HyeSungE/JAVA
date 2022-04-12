import java.net.*;
import java.io.*;
import java.util.*;

public class Test07 extends Thread{
	private ServerSocket ss;
	private Socket soc;
	private Scanner in;
	private PrintWriter pw;
	private BufferedReader br;
	
	public Test07() {
		try {
			in = new Scanner(System.in);
			ss = new ServerSocket(12345);
			System.out.println("���� ����� .......");
			soc = ss.accept();
			this.start();
			try {
				pw = new PrintWriter(soc.getOutputStream(), true);
				while(true) {
					System.out.print("Ŭ�� ���� �޼��� : ");
					String msg = in.next();
					pw.println(msg);
					pw.flush();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				String msg = br.readLine();
				System.out.println("Ŭ���� �� �޼��� : " + msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test07();
	}
}








