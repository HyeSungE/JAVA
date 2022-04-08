import java.io.*;
public class Test01 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21\\aaa.txt");
		//파일의 경로와 파일명을 String값으로 지정하여 객체를 생성
		File file2 = new File("C:\\\\Users\\\\i7C-43\\\\eclipse-workspace\\Day21","aaa.txt");
		//파일 경로, 파일명으로 생성
		File dir = new File("C:\\\\Users\\\\i7C-43\\\\eclipse-workspace\\Day21");
		//파일에 경로명을 지정하여 경로 저장가능
		File file3 = new File(dir,"aaa.txt");
		  
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
		System.out.println("File.separator = " + File.separator);
		System.out.println("File.separatorChar = " + File.separatorChar);
		
		// 리눅스 폴더구별자 -> / 윈도우 폴더구별자 -> \
		
		File file4 = new File("f : "+File.separator + "bigdata" + File.separator + "study"
				+ File.separator + "day21" + File.separator + "aaa.txt");
		//파일 구별자를 사용해서 파일 객체를 생성
		
		
		
	}
}
