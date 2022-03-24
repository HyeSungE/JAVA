
public class Test04 {
	public static void main(String args[]) {
		//문자열 시작과 끝 검사
		String email="aaa@it.ac";
		if(email.endsWith(".ac")) //끝나는 문자열검사
			System.out.println(email);
		if(email.startsWith("aaa")) //시작하는 문자열 검사
			System.out.println(email);
		
		//문자열 < = > 바이트배열
		String str="Hello, Java !!";
		byte[] by = str.getBytes(); //문자열을 바이트배열로 바꾸기
		for(int i=0;i<by.length;i++) {
			System.out.print(by[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<by.length;i++) {
			System.out.print((char)by[i]+" ");
		}
		System.out.println();
		
		String str2=new String(by); // 바이트 배열 값을 문자열로 바꾸기
			System.out.println(str2);
		
		
		//문자열 중간 추출 substring
		System.out.println(str.substring(7));
		System.out.println(str.substring(7,11));
		
		//문자열을 대문자로, 소문자로
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//앞 뒤 공백 제거 trim()
		String address ="              서울시 강북구";
		if(address.trim().equals("서울시 강북구"));//equals() 문자열비교
			System.out.println(address);
		
		//문자열로 변환
		int a=10;
		String str_1=String.valueOf(a);
		String str_2=a+"";
		
		//buffer와 builder를 이용하여 문자열 삽입, 삭제
		//멀티스레드일때 StrungBuilder를 지원하지 않는다.
		String str4="Hello, avak!!";
		StringBuffer buffer=new StringBuffer(str4);
		buffer.insert(7,"J");//n번째 인덱스에 문자삽입
		buffer.delete(11,12);//11에서 12까지 인덱스 지우기
		str4=new String(buffer);
		System.out.println("str4 = "+str4);
		
		//단일스레드일때 처리속도가 더 빠르다(StringBuffer에 비해서)
		str4="Hello, avak!!";
		StringBuilder builder=new StringBuilder(str4);
		builder.insert(7,"J");//n번째 인덱스에 문자삽입
		builder.delete(11,12);//11에서 12까지 인덱스 지우기
		str4=new String(builder);
		System.out.println("str4 = "+str4);
	}	
}
