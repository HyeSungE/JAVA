import java.util.*;
import java.awt.*;
public class Test01_fail {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("�� : ");
		int year=in.nextInt();
		System.out.print("�� : ");
		int mon=in.nextInt();
		
		CalendarFrame_fail mf=new CalendarFrame_fail("frmae����");
		mf.setYear(year);
		mf.setMonth(mon);
		
		
		
	}

}
