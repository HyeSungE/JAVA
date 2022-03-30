import java.util.*;
import java.awt.*;
public class Test01_fail {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("년 : ");
		int year=in.nextInt();
		System.out.print("월 : ");
		int mon=in.nextInt();
		
		CalendarFrame_fail mf=new CalendarFrame_fail("frmae예제");
		mf.setYear(year);
		mf.setMonth(mon);
		
		
		
	}

}
