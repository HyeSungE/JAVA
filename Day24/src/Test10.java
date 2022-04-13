import java.net.*;
import java.io.*;

public class Test10 {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(12345);
		File file = new File("imsi.txt");
		DataOutputStream dos = new DataOutputStream
				(new BufferedOutputStream(new FileOutputStream(file)));
		while(true) {
			DatagramPacket dp = new DatagramPacket(new byte[65508], 65508);
			ds.receive(dp);
			
			String str = new String(dp.getData()).trim();
			if (str.equals("end")) break;
			dos.write(str.getBytes(), 0, str.getBytes().length);
			//dos.flush();
		}
		dos.close();
	}
}
