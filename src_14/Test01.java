import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		//for(int i=0; i++; i<=0) {
		//}
		
		String input = "1 fish 2 fish r ed fish blue fish";
		String[] data = input.split("fish");
		for(int i=0; i<data.length; ++i) {
			System.out.println(data[i].trim());
		}
		/*
		StringTokenizer st = new StringTokenizer(input, "fish");
		while(st.hasMoreTokens()) {
			String data = st.nextToken();
			System.out.println(data.trim());
		}
		/*
	    Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	    System.out.println(s.nextInt());
	    System.out.println(s.nextInt());
	    System.out.println(s.next());
	    System.out.println(s.next());
	    //s.close();
	    */
	}
}
