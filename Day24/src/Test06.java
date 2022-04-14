import java.net.*;
import java.util.*;

public class Test06 extends Thread{
	private DatagramPacket send_dp, receive_dp;
	private DatagramSocket ds;
	private InetAddress ia;
	private Scanner in;
	
	public Test06() {
		try {
			ia = InetAddress.getByName("localhost");
			in = new Scanner(System.in);
			ds = new DatagramSocket(12346);
		}catch(Exception e) {}
		this.start();
		sendMessage();
	}
	public void sendMessage() {
		while(true) {
			try{
				System.out.print("���� �޼��� : ");
				String msg = in.next();
				send_dp = new DatagramPacket(msg.getBytes(), 
					msg.getBytes().length, ia, 12345);
				ds.send(send_dp);
			}catch(Exception e) {}
		}
	}
	
	public void run() {
		while(true) {
			try {
				receive_dp = new DatagramPacket(new byte[65508], 65508);
				ds.receive(receive_dp);
				String msg = new String(receive_dp.getData()).trim();
				System.out.println("���� �޼��� : "+ msg);
			}catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new Test06();
	}
}