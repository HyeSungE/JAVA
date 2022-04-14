import java.net.*;
import java.io.*;
public class Test02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramPacket dp = new DatagramPacket(new byte[65508],65508);
		
		MulticastSocket ms = new MulticastSocket(12345);
		
		InetAddress ia = InetAddress.getByName("224.26.20.40");
		ms.joinGroup(ia);
		ms.receive(dp);
		ms.leaveGroup(ia);
		ms.close();
		
		System.out.println("sender : "+dp.getAddress().getHostAddress());
		System.out.println("content : "+new String(dp.getData()).trim());
		
	}

}
