import java.io.*;
import java.net.*;
public class Test03 {
//broadcast
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String msg = "hi java";
		InetAddress ia = InetAddress.getByName("192.168.0.255");
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length,ia,12345);
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();
		
	}

}
