import java.util.*;
public class TestArray03 {

	public static void main(String[] args) {
		String Name[]=new String[5];
		String Phone[]=new String[5];
		
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<Name.length;i++) {
			System.out.print(i+1+"��° " + "�̸��Է� : "  );
			Name[i]=in.next();
			System.out.print(i+1+"��° " + "��ȭ��ȣ�Է� : "  );
			Phone[i]=in.next();
		}
		
		for(int i=0;i<Name.length;i++) {
			System.out.println(i+1+"��° " + "�̸� : "+Name[i]);
			System.out.println(i+1+"��° " + "��ȭ : " +Phone[i]);
		}
	}	

}