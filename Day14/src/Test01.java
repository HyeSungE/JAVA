import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="1fishredfish3";
		StringTokenizer st=new StringTokenizer(input,"fish");
		while(st.hasMoreTokens()) {
			String str=st.nextToken();
			System.out.println(str);
		}
		
		String[] sdata=input.split("fish");
		for(int i=0;i<sdata.length;i++) {
			System.out.println(sdata[i].trim());
		}
	}

}
