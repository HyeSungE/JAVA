import java.io.*;
import java.net.*;

public class Test12 {
	public static void main(String[] args) throws Exception{
		byte[] by = new byte[65508];
		DatagramPacket dp = new DatagramPacket(by, by.length);
		DatagramSocket ds = new DatagramSocket(12345);
		ds.receive(dp);
		ds.close();

		ByteArrayInputStream bais = new ByteArrayInputStream(dp.getData());
		ObjectInputStream ois = new ObjectInputStream(bais);
		
		A11 ap = (A11)ois.readObject();
		ap.disp();
		

	}
}
