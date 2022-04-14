import java.net.*;
import java.io.*;
public class Test04  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DatagramPacket dp = new DatagramPacket(new byte[65508],65508);
		DatagramSocket ds = new DatagramSocket(12345);
		ds.receive(dp);
		ds.close();
		String s = new String(dp.getData()).trim();
		System.out.println("s = "+s);
	}

}
