import java.util.*;

public class Calendar01 {

	public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.print("�� : ");
	int year=in.nextInt();
	System.out.print("�� : ");
	int mon=in.nextInt();
	
	Calendar cal=Calendar.getInstance();
	
	/*cal.set(Calendar.YEAR,year);
	cal.set(Calendar.MONTH,mon-1);
	*/
	cal.set(year,mon-1,1);
	
	int arr[][]=new int[5][7];
	
	int week=cal.get(Calendar.DAY_OF_WEEK);//�ش� ���� ù°���� ���� (1=�Ͽ���)
	System.out.println(week);
	int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);//�� �޿� ���� ū ��¥�� ��ȯ
	System.out.println("��\t��\tȭ\t��\t��\t��\t��");
	
	for(int i=1;i<week;i++) {
		System.out.print("\t");
	}
	for(int i=1;i<=lastDay;i++) {
		System.out.print(i+"\t");
		week++;
		if(week==8) {
			System.out.println();
			week=1;
		}
	}
	
	}
}
