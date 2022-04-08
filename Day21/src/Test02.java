import java.io.*;
public class Test02 {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21");//추상적 파일 주소이므로 실제 파일이 없어도 된다.
		File file = new File(dir,"aaa.txt");
		//익셉션 전가 -> 호출한 클래스에서 예외처리 해줘야함
		
		File temp=File.createTempFile("temp",".dat",dir);//임시파일 생성 ->삭제해주어야함
		//temp로 시작 .dat로 끝나는 파일을 dir객체가 있는 폴더 안에 만들어 준다
		temp.deleteOnExit();//프로그램 종료시 해당 파일을 삭제
		file.delete();
		//파일이 존재하지 않으면 false 존재하면 삭제하고 true를 반환
		
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("프로그램을 종료합니다.");
		}
		/*
		boolean isNewFile = File.createNewFile();
		//파일이 없으면 파일을 생성하고 true를 반환, 파일이 이미 존재하면 false를 반환
		if(isNewFile) {
			System.out.println(file.getName()+" 파일을 만들었습니다.");
		}else {
			System.out.println(file.getName()+" 파일은 이미 존재합니다.");
		}
		
		*/
		
	}
}
