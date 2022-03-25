import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();//java.util
		
		/*
		 * key-value���·� �����͸� �����Ѵ�. key�� �ߺ����� �ʴ� �������̾�� �ϰ�, key�� �ߺ��Ǹ� ������ �ȴ�. 
		*/
		ht.put("������", "����");
		ht.put("���缮", "���׸�");
		ht.put("����ȿ","���");
		ht.put("���ҹ�","���");
		ht.put("������","���");
		ht.put("����","����");
		ht.put("�缼��","���׸�");
		
		System.out.println("�� : "+ht);//�������·� ���
		System.out.println("���� ũ�� : "+ht.size());
		System.out.println("--------------------");
		System.out.println("�������� ���� : "+ht.get("������"));
		System.out.println("--------------------");
		
		/*Key���� ���� ���� containsKey()
		 *key���� �̿��Ͽ� value���� ã�� ���� Map�� �߿��� �����̱� ������ 
		 *value���� ã�� contains()�� containsValue()�� �� ������� �ʴ´�.
		 */
		if(ht.containsKey("���缮")) {
			System.out.println("���缮�� ����� �ֽ��ϴ�.");
		}else {
			System.out.println("���缮�� ����� �����ϴ�.");
		}
		System.out.println("--------------------");
		
		/*value���� ��� ���� �ݺ��� Eumeration�� �־��ش�.
		 *Eumeration enu = ht.elements();
		 */
		
		//key���� ��� ���� �ݺ��� Enumeration�� �־��ش�.
		Enumeration enu = ht.keys();
		while(enu.hasMoreElements()) {
			Object obj=enu.nextElement();
			String Key=(String)obj;
			String value=(String)ht.get(Key);
			System.out.println(Key+"���� ������ "+value);
		}
		System.out.println("--------------------");
		
		//set�� ����ϴ� ���
		Set set=ht.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			String key=(String)obj;
			String value=(String)ht.get(key);
			System.out.println(key+"���� ������ "+value);
		}
		System.out.println("--------------------");
		
		
		
		
	    //map����
		ht.clear();
		System.out.println("ht.clear()�� �� : "+ht);
		System.out.println("���� ũ�� : "+ht.size());
		//��ü���� ����Ҷ��� �ڿ� .toString�� ����
		//��ü��.toString()=��ü��
		//��ü���� toString()���� ����� �Ǵ� ���̴�.
		System.out.println("--------------------");
		
		
		
 	}

}
