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
			System.out.print("1.�ð� 2.��¥ 3.�ð�����¥ 4.����\n");
			System.out.print("�޴��� �Է��Ͻÿ� : ");
			String sel = in.next();
			try {
				if(sel.equals("4")) {
					sendP=new DatagramPacket(sel.getBytes(),sel.getBytes().length,ia,12346);
					ds.send(sendP);
					ds.close();
					System.out.println("����");	
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
