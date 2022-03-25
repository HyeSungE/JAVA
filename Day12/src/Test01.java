import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();//java.util
		
		/*
		 * key-value형태로 데이터를 저장한다. key는 중복되지 않는 고유값이어야 하고, key가 중복되면 수정이 된다. 
		*/
		ht.put("김종국", "가수");
		ht.put("유재석", "개그맨");
		ht.put("송지효","배우");
		ht.put("전소민","배우");
		ht.put("지석진","배우");
		ht.put("하하","가수");
		ht.put("양세찬","개그맨");
		
		System.out.println("맵 : "+ht);//집합형태로 출력
		System.out.println("맵의 크기 : "+ht.size());
		System.out.println("--------------------");
		System.out.println("김종국의 직업 : "+ht.get("김종국"));
		System.out.println("--------------------");
		
		/*Key값을 비교할 떄는 containsKey()
		 *key값을 이용하여 value값을 찾는 것이 Map의 중요한 목적이기 떄문에 
		 *value값을 찾는 contains()나 containsValue()는 잘 사용하지 않는다.
		 */
		if(ht.containsKey("유재석")) {
			System.out.println("유재석은 멤버에 있습니다.");
		}else {
			System.out.println("유재석은 멤버에 없습니다.");
		}
		System.out.println("--------------------");
		
		/*value값을 모두 꺼내 반복자 Eumeration에 넣어준다.
		 *Eumeration enu = ht.elements();
		 */
		
		//key값을 모두 꺼내 반복자 Enumeration에 넣어준다.
		Enumeration enu = ht.keys();
		while(enu.hasMoreElements()) {
			Object obj=enu.nextElement();
			String Key=(String)obj;
			String value=(String)ht.get(Key);
			System.out.println(Key+"님의 직업은 "+value);
		}
		System.out.println("--------------------");
		
		//set을 사용하는 방법
		Set set=ht.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			String key=(String)obj;
			String value=(String)ht.get(key);
			System.out.println(key+"님의 직업은 "+value);
		}
		System.out.println("--------------------");
		
		
		
		
	    //map비우기
		ht.clear();
		System.out.println("ht.clear()후 맵 : "+ht);
		System.out.println("맵의 크기 : "+ht.size());
		//객체명을 출력할때는 뒤에 .toString이 생략
		//객체명.toString()=객체명
		//객체명의 toString()값이 출력이 되는 것이다.
		System.out.println("--------------------");
		
		
		
 	}

}
