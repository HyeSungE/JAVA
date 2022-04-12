import java.io.*;
import java.net.*;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InetAddresss IP주소를 관리하는 클래스
		
		InetAddress ia[] = null;
		
		//여러개의 주소
		try {
			ia = InetAddress.getAllByName("www.daum.net");
			for(int i=0;i<ia.length;i++) {
				System.out.println("ip address : " + ia[i].getHostAddress());
			}
		}catch(UnknownHostException e) {
			System.out.println("없는 호스투 주소입니다");
		}
		
		
		//하나의 주소
		/*try {
			ia = InetAddress.getByName("ezenan.co.kr");
			System.out.println("IP주소 : "+ia.getHostAddress());
			System.out.println("호스트 이름  : "+ia.getHostName());
		}catch(UnknownHostException e) {
			System.out.println("없는 호스트 주소 입니다");
		}*/
	}

}
