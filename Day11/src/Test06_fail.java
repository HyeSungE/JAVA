import java.util.*;
public class Test06_fail {

	public static void main(String[] args) {
		HashSet Name=new HashSet();
		HashSet Tel=new HashSet();
		Scanner in=new Scanner(System.in);
		int select=-1;
	
		while(select!=5) {
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.����");
			select=in.nextInt();
			
			switch(select) {
				case 1:
					String NameArr[]=new String[Name.size()];
					String TelArr[]=new String[Tel.size()];
					System.out.print("�̸��� �Է��� �ּ��� : ");
					String name=in.next();
					Name.add(name);
					Name.toArray(NameArr);
					System.out.print("��ȭ��ȣ�� �Է��� �ּ��� :");
					String num=in.next();
					Tel.add(num);
					Tel.toArray(TelArr);
					Iterator NameIt=Name.iterator();
					Iterator TelIt=Tel.iterator();
					
					break;
				case 2:
					NameIt=Name.iterator();
					TelIt=Tel.iterator();
					
						//System.out.println("�̸� : "+(String)NameObj+" ��ȭ��ȣ : "+(String)TelObj);
					
					break;
				case 3:
					NameIt=Name.iterator();
					TelIt=Tel.iterator();
					System.out.print("�̸��� �Է��� �ּ��� : ");
					name=in.next();
					String NameAr[]=new String[Name.size()];
					String TelAr[]=new String[Tel.size()];
					for(int i=0;i<NameAr.length;i++) {
						if(NameAr[i]==name) {
							System.out.print("��ȭ��ȣ�� �Է��� �ּ��� : ");
							String tel=in.next();
							TelAr[i]=tel;
						}
					}
					break;
				case 4:
					break;
				case 5:
					break;	
				default :
					System.out.println("�ٽ� �Է����ּ��� !");
					break;
			}
		}
		
		

	}

}
