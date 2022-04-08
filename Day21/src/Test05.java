import java.io.*;
public class Test05 {

	public static void main(String[] args) throws IOException {
	//FileNotFoundException은 IOException을 상속받았기 때문에 IOException을 사용
	
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21");
		File file = new File(dir,"bbb.txt"); 
		
		FileOutputStream fos = new FileOutputStream(file);

		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		DataOutputStream dos = new DataOutputStream(bos);
		
		//버퍼메모리에 들어간것은 버퍼메모리가 다 차기 전까지 나오지 않는다.
		int a=10;
		double b=1.23;
		String str = "안녕";
		
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(str);
		dos.flush();//버퍼메모리에 값을 file로 옮긴다. - > 버퍼메모리에 값은 계속 존재해있는 상태
		
		dos.close(); // 따라서 버퍼메모리에 값을 파일로 옮기고 dos를 닫는다.
		
		
	
		
		
		
		
	
	}	
}
