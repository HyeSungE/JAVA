import java.io.*;
import java.net.*;
public class Test02 {
//Receiver - �޴� ���� ��Ʈ��ȣ�� �����־�� �ϹǷ� ���� �����ؾ���
	
	public static void main(String[] args) throws Exception {
		
		byte[] by = new byte[65508];
		DatagramPacket dp = new DatagramPacket(by,by.length);//receiver�� �޴� ���� �ּҸ� ���󵵵�
		DatagramSocket ds = new DatagramSocket(12345);
		ds.receive(dp);
		ds.close();
		InetAddress ia = dp.getAddress();//sender Address ��ȯ
		byte[] by2 = dp.getData();
		String msg = new String(by2).trim();//sender�� ���� �����ʹ� ����Ʈ�����̹Ƿ� String���·� �ٲ��ش�.
		System.out.println("sender Address : "+ia.getHostAddress());
		System.out.println("data : "+msg);
		
	}

}
