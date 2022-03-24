//String Class
public class Test01 {
	public static void main(String args[]) {
		String a=new String("aaa");
		String b=new String("aaa");
		String c="aaa";
		String d="aaa";
		
		System.out.println(a==b);//false : a와 b가 가리키는 데이터가 힙에 저장되는 위치가 다르다.
		System.out.println(a==c);//false 
		System.out.println(a==d);//false
		System.out.println(c==d);//true : 데이터 aaa를 c와 d가 같이 가리킨다
		//String class 비교함수
		System.out.println(a.equals(b));//a가 가리키는 데이터와 b가 가리키는 데이터 같은지를 확인하는 함수 .equals
	
		//String class String->int double float byte
		String money =new String("1000000");
		int aa=Integer.parseInt(money);
		String money2 = new String("1.234");
		double bb=Double.parseDouble(money2);
		//Byte.parseByte Float.parseByte
		
		System.out.println(money+money2);//       10000001.234
		System.out.println(aa+bb);//1000000+1.234=1000001.234
		
		//문자열에서 한 글자씩 가져오기
		String str="hello, Java!!";
		for(int i=0;i<str.length();i++) {//문자열의 길이를 구할때는 length() <=메소드이다
			System.out.println(str.charAt(i));//문자열에서 해당하는 위치의 글자를 Char형으로 가져온다.
		}
	}
}

/*
 * |aaa| ~/aaa/ ~ ~/~/aaa/|a|b|
 */
