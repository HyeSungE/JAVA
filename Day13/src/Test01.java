import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		
		/*
		String a="홍길동";
		String b="유재석";
		
		 * String 비교 X
		if(a>b) {
			System.out.println("유재석");
		}
		else {
			System.out.println("홍길동");
		}
		*/
		
		//ArrayList list=new ArrayList(); 
		ArrayList<String> list=new ArrayList<String>();
		//generic 사용 : generic은 set,map,list 다 적용
		
		list.add("홍길동");
		list.add("유재석");
		
		Collections.sort(list);//자바에서 리스트타입을 정렬할 떄 사용
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//확장for문은 list타입에서만 사용가능
		//for(Object obj : list) : list의 0번째 위치값을 obj에 넣고 실행한 다음 1번째 위치값을 obj에 넣고 실행
		for(String name : list){
			//generic사용했으므호 데이터형을 컴퓨터가 알고있다 따라서 String사용 가능
			System.out.println("name = "+name);
		}
		
		
		
		
	}

}
