import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
public class Test01 {

	public static void main(String[] args) throws IOException {
	//FileNotFoundException은 IOException을 상속받았기 때문에 IOException을 사용
	
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22");
		File file = new File(dir,"aaa.txt"); 
		
		FileWriter fw = new FileWriter(file);

		BufferedWriter bw = new BufferedWriter(fw);
		
		PrintWriter pw = new PrintWriter(bw);
		//파일은 무조건 String형태로 저장
		int a=10;	
		pw.print("안녕");
		pw.println("자바수업시간");
		pw.close();
	
	}	
}
