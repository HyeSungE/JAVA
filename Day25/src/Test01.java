import java.io.*;
import java.net.*;
public class Test01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String msg= "hello java";
		InetAddress ia = InetAddress.getByName("224.50.50.50");
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length,ia,12345);
		MulticastSocket ms = new MulticastSocket();
		ms.send(dp);
		ms.close();
	}

}
