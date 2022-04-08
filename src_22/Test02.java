import java.io.*;

public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22");
		File file = new File(dir,"aaa.txt"); 
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		//무조건 String형으로 저장되기 때문에 별다른 데이터의 형변환 작업이 필요치 않음
		
		while(true) {
			String str = br.readLine();
			if(str==null) break; //text입력에서의 끝은 null이다.
			System.out.println(str);
			
			
		}
	}

}
