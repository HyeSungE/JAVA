import java.io.*;

class A03 implements Serializable{ // 직렬화
	private int a;
	private int b;
	private transient int c; // IO나 network에서 객체를 전송할 때 멤버필드값 중 전송하지 않겠다라는 의미
	//private int c;
	public A03() {
		a=10;
		b=20;
		c=30;
	}
	public void disp() {
		System.out.println("a = "+a);
		System.out.println("a = "+b);
		System.out.println("a = "+c);
	}
}
public class Test03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22");
		File file = new File(dir,"bbb.txt"); 
	
		
		//객체 입출력도 1byte입출력에서 시작한다.
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		A03 ap= new A03();
		
		oos.writeObject(ap);
		oos.close();
		//메모리에있는데이터 외부로 빠져나가게끔 해주는 것 - 직렬화
		//파일에 있는 것이 메모리에 올라가겠므 해주는 것 - 역직렬화
	
	
	
	
	}

}
