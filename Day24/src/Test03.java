import java.net.*;
import java.io.*;

public class Test03 {
	public static void main(String[] args) throws Exception {
		InetAddress ia = InetAddress.getByName("localhost");
		String msg = "안녕하세요 자바 네트워크 프로그램 입니다.";
		byte[] by = msg.getBytes();
		DatagramPacket dp = new DatagramPacket(by, by.length, ia, 12345);
		DatagramSocket ds = new DatagramSocket(12346);
		DatagramPacket dp2 = new DatagramPacket(new byte[65508], 65508);
		ds.send(dp);
		ds.receive(dp2);
		ds.close();
		System.out.println("보낸이 : " + ia.getHostAddress());
		System.out.println("내용물 : " + msg);
		System.out.println("전송끝......");
	}
}
