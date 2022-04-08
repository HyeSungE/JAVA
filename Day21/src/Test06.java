import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.*;
public class Test06 {

	public static void main(String[] args) throws IOException {
	//FileNotFoundException은 IOException을 상속받았기 때문에 IOException을 사용
	
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21");
		File file = new File(dir,"bbb.txt"); 
		
		FileInputStream fis = new FileInputStream(file);

		BufferedInputStream bis = new BufferedInputStream(fis);
		
		DataInputStream dis = new DataInputStream(bis);
	
		int a = dis.readInt();
		double b = dis.readDouble();
		String msg = dis.readUTF();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("msg = "+msg);
		
		
		
		
	
	}	
}
