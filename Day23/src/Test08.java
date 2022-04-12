import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Test08 extends Thread{
	private InetAddress ia;
	private Socket soc;
	private Scanner in;
	private PrintWriter pw;
	private BufferedReader br;
	
	public Test08() {
		try {
			in = new Scanner(System.in);
			ia = InetAddress.getByName("localhost");
			System.out.println("서버 대기중 .......");
			soc = new Socket(ia, 12345);
			this.start();
			try {
				pw = new PrintWriter(soc.getOutputStream(), true);
				while(true) {
					System.out.print("서버로 보낼 메세지 : ");
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
				System.out.println("서버에서 온 메세지 : " + msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test08();
	}
}
