package Grade;
import java.io.*;
public class ScoreMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Function pro = new Score();
		
		while(true) {
			System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 :	pro.input(); break;
			case 2 :	pro.print(); break;
			case 3 :	pro.modifi(); break;
			case 4 :	pro.delete(); break;
			case 5 :	pro.quit(); break;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}

}
