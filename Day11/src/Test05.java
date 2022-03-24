import java.util.*;
public class Test05 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();//16개 부하값 0.75 / 초기값 설정가능/ 시작값과 부하값 설정가능
		
		//set은 중복데이터를 허용하지 않는다.
		hs.add("유재석");
		hs.add("송지효");
		hs.add("김종국");
		hs.add("하하");
		hs.add("지석진");
		hs.add("전소민");
		hs.add("양세찬");
		
		System.out.println("런닝맨 멤버의 수 : "+hs.size());//set의 크기 .size
		hs.remove("지석진");//특정한 데이터 삭제
		System.out.println("런닝맨 멤버의 수 : "+hs.size());
		
		
		if(hs.contains("유재석")){//contains()으로 set의 데이터 검색가능
			System.out.println("런닝맨 멤버가 맞다.");
		}
		else {
			System.out.println("아니다");
		}
		
		//메모리 상에 무분별하게 저장되있는 set에서 존재하는 데이터만을 모두 모아서 Iterator가 가리키게함
		Iterator it=hs.iterator();//Hashset객체에 있는 자료를 모두 Iterator에게 넘기기 
		while(it.hasNext()) {//Iterator 객체가 가르키는 곳에 데이터가 있는지?
			Object obj=it.next();//Iterator가 가르키는 곳에 다음 데이터를 가르키게 하고 값을 obj에게 넘긴다.
			//Object는 모든 자료형의 부모이기 때문에 모든 데이터를 받을 수 있다. 많이 쓰는 방법이다. 컴퓨터는 자료형을 모르니까 부모로 업캐스팅하고
			//사용자가 원하는 자료형으로 다시 다운캐스팅하여 사용한다.
			String name=(String)obj;//업캐스팅된 obj값을 다운캐스팅하여 원래 자료형으로 가게한다.
			System.out.println(name);
		}
		//set을 배열로 만들기
		String name[]=new String[hs.size()];
		hs.toArray(name);
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		hs.clear();//set의 모든 내용을 지우기
		if(hs.isEmpty()){//set의 데이터가 하나도 없는지
			System.out.println("모두 지워짐");
		}
		else {
			System.out.println("데이터가 남음");
		}
		System.out.println("런닝맨 멤버의 수 : "+hs.size()); 
		
	}

}
