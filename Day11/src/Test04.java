
public class Test04 {
	public static void main(String args[]) {
		//���ڿ� ���۰� �� �˻�
		String email="aaa@it.ac";
		if(email.endsWith(".ac")) //������ ���ڿ��˻�
			System.out.println(email);
		if(email.startsWith("aaa")) //�����ϴ� ���ڿ� �˻�
			System.out.println(email);
		
		//���ڿ� < = > ����Ʈ�迭
		String str="Hello, Java !!";
		byte[] by = str.getBytes(); //���ڿ��� ����Ʈ�迭�� �ٲٱ�
		for(int i=0;i<by.length;i++) {
			System.out.print(by[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<by.length;i++) {
			System.out.print((char)by[i]+" ");
		}
		System.out.println();
		
		String str2=new String(by); // ����Ʈ �迭 ���� ���ڿ��� �ٲٱ�
			System.out.println(str2);
		
		
		//���ڿ� �߰� ���� substring
		System.out.println(str.substring(7));
		System.out.println(str.substring(7,11));
		
		//���ڿ��� �빮�ڷ�, �ҹ��ڷ�
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//�� �� ���� ���� trim()
		String address ="              ����� ���ϱ�";
		if(address.trim().equals("����� ���ϱ�"));//equals() ���ڿ���
			System.out.println(address);
		
		//���ڿ��� ��ȯ
		int a=10;
		String str_1=String.valueOf(a);
		String str_2=a+"";
		
		//buffer�� builder�� �̿��Ͽ� ���ڿ� ����, ����
		//��Ƽ�������϶� StrungBuilder�� �������� �ʴ´�.
		String str4="Hello, avak!!";
		StringBuffer buffer=new StringBuffer(str4);
		buffer.insert(7,"J");//n��° �ε����� ���ڻ���
		buffer.delete(11,12);//11���� 12���� �ε��� �����
		str4=new String(buffer);
		System.out.println("str4 = "+str4);
		
		//���Ͻ������϶� ó���ӵ��� �� ������(StringBuffer�� ���ؼ�)
		str4="Hello, avak!!";
		StringBuilder builder=new StringBuilder(str4);
		builder.insert(7,"J");//n��° �ε����� ���ڻ���
		builder.delete(11,12);//11���� 12���� �ε��� �����
		str4=new String(builder);
		System.out.println("str4 = "+str4);
	}	
}
