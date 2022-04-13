import java.io.*;
import java.net.*;
public class Test02 {
//Receiver - 받는 곳의 포트번호가 열려있어야 하므로 먼저 실행해야함
	
	public static void main(String[] args) throws Exception {
		
		byte[] by = new byte[65508];
		DatagramPacket dp = new DatagramPacket(by,by.length);//receiver는 받는 곳의 주소를 몰라도됨
		DatagramSocket ds = new DatagramSocket(12345);
		ds.receive(dp);
		ds.close();
		InetAddress ia = dp.getAddress();//sender Address 반환
		byte[] by2 = dp.getData();
		String msg = new String(by2).trim();//sender가 보낸 데이터는 바이트형태이므로 String형태로 바꿔준다.
		System.out.println("sender Address : "+ia.getHostAddress());
		System.out.println("data : "+msg);
		
	}

}
