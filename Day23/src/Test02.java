import java.io.*;
import java.net.*;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InetAddresss IP�ּҸ� �����ϴ� Ŭ����
		
		InetAddress ia[] = null;
		
		//�������� �ּ�
		try {
			ia = InetAddress.getAllByName("www.daum.net");
			for(int i=0;i<ia.length;i++) {
				System.out.println("ip address : " + ia[i].getHostAddress());
			}
		}catch(UnknownHostException e) {
			System.out.println("���� ȣ���� �ּ��Դϴ�");
		}
		
		
		//�ϳ��� �ּ�
		/*try {
			ia = InetAddress.getByName("ezenan.co.kr");
			System.out.println("IP�ּ� : "+ia.getHostAddress());
			System.out.println("ȣ��Ʈ �̸�  : "+ia.getHostName());
		}catch(UnknownHostException e) {
			System.out.println("���� ȣ��Ʈ �ּ� �Դϴ�");
		}*/
	}

}
