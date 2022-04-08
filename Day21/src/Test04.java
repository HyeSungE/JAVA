import java.io.*;
public class Test04 {

	public static void main(String[] args) throws IOException {
	//FileNotFoundException은 IOException을 상속받았기 때문에 IOException을 사용
	
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21");
		File file = new File(dir,"aaa.txt"); 
		
		FileInputStream fis = new FileInputStream(file);
		
		while(true) {
			int ch = fis.read();//read()로 한 글자를 읽어온다.
			if(ch==-1) break; // 파일의 끝은 EOF(End of File)이고 EOF는 -1의 값을 가진다. 아스키코드는 0부터 시작하는 값이기 떄문이다.
			System.out.print((char)ch); // 아스키코드는 int이므로 char형으로 형 변환
		}
	
		//char형이 아닌 int(4byte)는 어떻게 처리해야 하는지 -> Test05
	
	
	
	
	}	
}
