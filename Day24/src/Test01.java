import java.io.*;
import java.net.*;
public class Test01 {
//Sender
	public static void main(String[] args) throws Exception {
		InetAddress ia = InetAddress.getByName("localhost");
		String msg = "Java Network Program";
		byte[] by = msg.getBytes();
		//udp에서는 바이트로만 데이터를 전송가능
		DatagramPacket dp = new DatagramPacket(by,by.length,ia,12345); //바이트배열과 바이트배열의 크기
		DatagramSocket ds = new DatagramSocket();//receiver는 포트번호가 필요하지만 sender는 그렇지 않다
		ds.send(dp);
		ds.close();
		System.out.println("전송 끝");
		
	}

}
