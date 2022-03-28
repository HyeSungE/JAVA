import java.util.*;

public class Calendar01 {

	public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.print("년 : ");
	int year=in.nextInt();
	System.out.print("월 : ");
	int mon=in.nextInt();
	
	Calendar cal=Calendar.getInstance();
	
	/*cal.set(Calendar.YEAR,year);
	cal.set(Calendar.MONTH,mon-1);
	*/
	cal.set(year,mon-1,1);
	
	int arr[][]=new int[5][7];
	
	int week=cal.get(Calendar.DAY_OF_WEEK);//해당 월의 첫째날의 요일 (1=일요일)
	System.out.println(week);
	int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);//이 달에 제일 큰 날짜를 반환
	System.out.println("일\t월\t화\t수\t목\t금\t토");
	
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
