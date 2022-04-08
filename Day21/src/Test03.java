import java.io.*;
public class Test03 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21");
		File file = new File(dir,"aaa.txt"); 
		
		//rewrite방식이 default이다.
		//FileOutputStream fos = new FileOutputStream(file);//파일이 존재하지 않으면 만들어서 쓴다.
		//append방식으로 바꾸기위해서는 true
		FileOutputStream fos = new FileOutputStream(file,true);
		
		//fos.write(65); // byte단위로 값을 적어준다.
		//65=A 97=a
		//fos.write('b');
		
		String msg="Hello World"; // 문자열을
		byte[] by = msg.getBytes();//바이트배열에 저장하여 바이트로 저장
		//fos.write(by);
		fos.write(by,7,4); // 시작지점(7) 부터 가져올 글자 수 (4)
		
		
	}

}
