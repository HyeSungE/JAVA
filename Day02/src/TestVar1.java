
public class TestVar1 {
	public static void main(String[] args) {
		/*
		boolean a;
		a = true;	
		boolean b = false;
		boolean c;
		*/
		byte a = 10;
		++a;
		//a = (byte)(a + 1);
		System.out.println(a);
		byte b = 20;
		int c = (byte)(a + b);
		long d = 10L;//101;
		long e = 10;
		
		//�Ǽ����ڷ���
		//�Ǽ����ڷ��������� ���� ����� ���� ���� Ʋ������ �ִ�.(����, �����θ� �̿��� �������̶�...)
		//float���� �ݵ�� f �Ǵ� F�� ����� �Ѵ�.
		double a1 = 10.0000000000000000001;
		double a2 = 10.0000000000000000001;
		System.out.println(a1 + a2);
		float a3 = 10.23F;
		
		/*
		//�������ڷ���
		String str = "�ڹټ����ð��Դϴ�.";
		int kor = 91;
		int eng = 90;
		float avg = (kor + eng) / (float)2;
		System.out.println(avg);
		
		System.out.println(a);
		//�ƽ�Ű�ڵ尪 : A - 65, a - 97, 0 - 48
		int b = a;
		System.out.println(b);
		*/
		
		byte a4 = 10;
		char b3 = (char)a;
		short c3 = (short)b;
		char d3 = (char)c;
		
	}
}
