
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
		
		//실수형자료형
		//실수형자료형에서의 연산 결과는 조금 값이 틀릴수가 있다.(지수, 가수부를 이용한 저장방식이라서...)
		//float형은 반드시 f 또는 F를 써줘야 한다.
		double a1 = 10.0000000000000000001;
		double a2 = 10.0000000000000000001;
		System.out.println(a1 + a2);
		float a3 = 10.23F;
		
		/*
		//문자형자료형
		String str = "자바수업시간입니다.";
		int kor = 91;
		int eng = 90;
		float avg = (kor + eng) / (float)2;
		System.out.println(avg);
		
		System.out.println(a);
		//아스키코드값 : A - 65, a - 97, 0 - 48
		int b = a;
		System.out.println(b);
		*/
		
		byte a4 = 10;
		char b3 = (char)a;
		short c3 = (short)b;
		char d3 = (char)c;
		
	}
}
