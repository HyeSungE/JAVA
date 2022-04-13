import java.io.*;
import java.net.*;

class A11 implements Serializable{
	private int a = 10;
	private int b = 20;
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
public class Test11 {
	public static void main(String[] args) throws Exception{
		A11 ap = new A11();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(ap);
		oos.close();
		byte[] by = baos.toByteArray();
		InetAddress ia = InetAddress.getByName("localhost");
		
		DatagramPacket dp = new DatagramPacket(by, by.length, ia, 12345);
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();
	}
}








