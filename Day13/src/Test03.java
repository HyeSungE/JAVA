import java.text.*;
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("date = "+date);
			
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("date = "+sdf.format(date));
		System.out.println("------------------");

		//date�ڷ����ۿ� ���� ���Ѵ�
		//y=�⵵ M=�� d=��  H=0~23 m=�� s=�� S=�и�������
		
		//Calendar cal = new Calendar();// �߸��� ������ ��
		Calendar cal=Calendar.getInstance();
		
		System.out.println("cal = " + cal);
		System.out.println("year = " + cal.get(Calendar.YEAR));
		System.out.println("month = "+ (cal.get(Calendar.MONTH)+1));
		System.out.println("day-of-month = "+(cal.get(Calendar.DAY_OF_MONTH)));//���� ��
		System.out.println("hour = "+(cal.get(Calendar.HOUR_OF_DAY)));//���� �ð�
		System.out.println("minute = "+(cal.get(Calendar.MINUTE)));
		System.out.println("second = "+(cal.get(Calendar.SECOND)));
		System.out.print("day-of-week = ");
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: System.out.print("�Ͽ���"); break;
		case 2: System.out.print("������"); break;
		case 3: System.out.print("ȭ����"); break;
		case 4: System.out.print("������"); break;
		case 5: System.out.print("�����"); break;
		case 6: System.out.print("�ݿ���"); break;
		case 7: System.out.print("�����"); break;
		}
		cal.set(Calendar.YEAR,2000);
		cal.set(Calendar.MONTH,3-1);//1�� ����� �� ���� �ùٸ��� ����.
		
	}
	
		
	

}
