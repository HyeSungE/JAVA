import java.io.*;
import java.net.*;
public class Test01 {
//Sender
	public static void main(String[] args) throws Exception {
		InetAddress ia = InetAddress.getByName("localhost");
		String msg = "Java Network Program";
		byte[] by = msg.getBytes();
		//udp������ ����Ʈ�θ� �����͸� ���۰���
		DatagramPacket dp = new DatagramPacket(by,by.length,ia,12345); //����Ʈ�迭�� ����Ʈ�迭�� ũ��
		DatagramSocket ds = new DatagramSocket();//receiver�� ��Ʈ��ȣ�� �ʿ������� sender�� �׷��� �ʴ�
		ds.send(dp);
		ds.close();
		System.out.println("���� ��");
		
	}

}
