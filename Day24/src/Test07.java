import java.io.*;
import java.net.*;
import java.util.*;
public class Test07 {
	private DatagramPacket sendP,recvP;
	private DatagramSocket ds;
	private InetAddress ia;
	private Scanner in;
	
	
	public Test07(){
		try {
			ia = InetAddress.getByName("localhost");
			in = new Scanner(System.in);
			ds = new DatagramSocket(12345);
		}catch(Exception e) {}
		while(true) {
			System.out.print("1.시간 2.날짜 3.시간과날짜 4.종료\n");
			System.out.print("메뉴를 입력하시오 : ");
			String sel = in.next();
			try {
				if(sel.equals("4")) {
					sendP=new DatagramPacket(sel.getBytes(),sel.getBytes().length,ia,12346);
					ds.send(sendP);
					ds.close();
					System.out.println("종료");	
					break;
				}	
				else {
					sendP=new DatagramPacket(sel.getBytes(),sel.getBytes().length,ia,12346);
					ds.send(sendP);
				}
			}catch(Exception e) {}
			try {
				recvP = new DatagramPacket(new byte[65508],65508);
				ds.receive(recvP);
				String msg = new String(recvP.getData()).trim();
				System.out.println(msg);
			}catch(Exception e) {}	
		}
	}

	public static void main(String args[]) {
		new Test07();
	}
	
}
