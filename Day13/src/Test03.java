import java.text.*;
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("date = "+date);
			
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("date = "+sdf.format(date));
		System.out.println("------------------");

		//date자료형밖에 들어가지 못한다
		//y=년도 M=월 d=일  H=0~23 m=분 s=초 S=밀리세컨드
		
		//Calendar cal = new Calendar();// 잘못된 선언의 예
		Calendar cal=Calendar.getInstance();
		
		System.out.println("cal = " + cal);
		System.out.println("year = " + cal.get(Calendar.YEAR));
		System.out.println("month = "+ (cal.get(Calendar.MONTH)+1));
		System.out.println("day-of-month = "+(cal.get(Calendar.DAY_OF_MONTH)));//지금 일
		System.out.println("hour = "+(cal.get(Calendar.HOUR_OF_DAY)));//지금 시간
		System.out.println("minute = "+(cal.get(Calendar.MINUTE)));
		System.out.println("second = "+(cal.get(Calendar.SECOND)));
		System.out.print("day-of-week = ");
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: System.out.print("일요일"); break;
		case 2: System.out.print("월요일"); break;
		case 3: System.out.print("화요일"); break;
		case 4: System.out.print("수요일"); break;
		case 5: System.out.print("목요일"); break;
		case 6: System.out.print("금요일"); break;
		case 7: System.out.print("토요일"); break;
		}
		cal.set(Calendar.YEAR,2000);
		cal.set(Calendar.MONTH,3-1);//1을 뺴줘야 그 값이 올바르게 들어간다.
		
	}
	
		
	

}
