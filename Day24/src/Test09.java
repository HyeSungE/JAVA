import java.io.*;
import java.net.*;
import javax.swing.*;

public class Test09 {
	public static void main(String[] args) throws Exception {
		JFileChooser jfc = new JFileChooser(".");
		int res = jfc.showOpenDialog(null);
		if (res != 0) {
			JOptionPane.showMessageDialog(null, "���ϼ����� ���ؼ� �����մϴ�.", 
								"�˸�", JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
		File file = jfc.getSelectedFile();
		System.out.println("���۽�ų ���ϸ� : " + file.getName());
		DataInputStream dis = new DataInputStream
				(new BufferedInputStream(new FileInputStream(file)));
		DatagramSocket ds = new DatagramSocket();
		InetAddress ia = InetAddress.getByName("localhost");
		byte[] by = new byte[65508];
		while(true) {
			int x = dis.read(by, 0, by.length);
			if (x == -1) break;
			DatagramPacket dp = new DatagramPacket(by, x, ia, 12345);
			ds.send(dp);
		}
		String str = "end";
		DatagramPacket dp = new DatagramPacket
				(str.getBytes(), str.getBytes().length, ia, 12345);
		ds.send(dp);
		ds.close();
	}
}










	