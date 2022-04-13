import java.net.*;

public class Test04 {
	public static void main(String[] args) throws Exception {
		byte[] by = new byte[65508];
		DatagramPacket dp = new DatagramPacket(by, by.length);
		DatagramSocket ds = new DatagramSocket(12345);
		ds.receive(dp);
		InetAddress ia = dp.getAddress();
		byte[] by2 = dp.getData();
		String msg = new String(by2).trim(); 
		DatagramPacket dp2 = new DatagramPacket(msg.getBytes(), 
				msg.getBytes().length, ia, 12346);
		ds.send(dp2);
		ds.close();

		
		System.out.println("보낸이 : " + ia.getHostAddress());
		System.out.println("내용물 : " + msg);
		
	}
}
