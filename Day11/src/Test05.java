import java.util.*;
public class Test05 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();//16�� ���ϰ� 0.75 / �ʱⰪ ��������/ ���۰��� ���ϰ� ��������
		
		//set�� �ߺ������͸� ������� �ʴ´�.
		hs.add("���缮");
		hs.add("����ȿ");
		hs.add("������");
		hs.add("����");
		hs.add("������");
		hs.add("���ҹ�");
		hs.add("�缼��");
		
		System.out.println("���׸� ����� �� : "+hs.size());//set�� ũ�� .size
		hs.remove("������");//Ư���� ������ ����
		System.out.println("���׸� ����� �� : "+hs.size());
		
		
		if(hs.contains("���缮")){//contains()���� set�� ������ �˻�����
			System.out.println("���׸� ����� �´�.");
		}
		else {
			System.out.println("�ƴϴ�");
		}
		
		//�޸� �� ���к��ϰ� ������ִ� set���� �����ϴ� �����͸��� ��� ��Ƽ� Iterator�� ����Ű����
		Iterator it=hs.iterator();//Hashset��ü�� �ִ� �ڷḦ ��� Iterator���� �ѱ�� 
		while(it.hasNext()) {//Iterator ��ü�� ����Ű�� ���� �����Ͱ� �ִ���?
			Object obj=it.next();//Iterator�� ����Ű�� ���� ���� �����͸� ����Ű�� �ϰ� ���� obj���� �ѱ��.
			//Object�� ��� �ڷ����� �θ��̱� ������ ��� �����͸� ���� �� �ִ�. ���� ���� ����̴�. ��ǻ�ʹ� �ڷ����� �𸣴ϱ� �θ�� ��ĳ�����ϰ�
			//����ڰ� ���ϴ� �ڷ������� �ٽ� �ٿ�ĳ�����Ͽ� ����Ѵ�.
			String name=(String)obj;//��ĳ���õ� obj���� �ٿ�ĳ�����Ͽ� ���� �ڷ������� �����Ѵ�.
			System.out.println(name);
		}
		//set�� �迭�� �����
		String name[]=new String[hs.size()];
		hs.toArray(name);
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		hs.clear();//set�� ��� ������ �����
		if(hs.isEmpty()){//set�� �����Ͱ� �ϳ��� ������
			System.out.println("��� ������");
		}
		else {
			System.out.println("�����Ͱ� ����");
		}
		System.out.println("���׸� ����� �� : "+hs.size()); 
		
	}

}
