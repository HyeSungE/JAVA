import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class Test08{

	private DatagramPacket sendP,recvP;
	private DatagramSocket ds;
	private InetAddress ia;
	private Calendar cal;
	private String sel;
	private SimpleDateFormat sdf=null;
	public Test08() {
		try {
			ia = InetAddress.getByName("localhost");
			ds = new DatagramSocket(12346);
			recvP = new DatagramPacket(new byte[65508],65508);
		}catch(Exception e) {}
		while(true) {
			Date date = new Date();
			try {
				ds.receive(recvP);
				sel = new String(recvP.getData()).trim();
				switch(sel) {
					case "4" :  System.exit(0); break;
					case "1" :  sdf = new SimpleDateFormat("HH:mm:ss"); break;
					case "2" :  sdf = new SimpleDateFormat("yyyy:MM:dd"); break;
					case "3" :  sdf = new SimpleDateFormat("yyyy:MM:dd"+" "+"HH:mm:ss"); break;
				}
				String msg = sdf.format(date);
				sendP = new DatagramPacket(msg.getBytes(),msg.getBytes().length,ia,12345);
				ds.send(sendP);
			}catch(Exception e) {}	
		}
	}
	public static void main(String args[]) {
		new Test08();
	}
}
