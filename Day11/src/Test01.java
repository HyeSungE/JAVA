//String Class
public class Test01 {
	public static void main(String args[]) {
		String a=new String("aaa");
		String b=new String("aaa");
		String c="aaa";
		String d="aaa";
		
		System.out.println(a==b);//false : a�� b�� ����Ű�� �����Ͱ� ���� ����Ǵ� ��ġ�� �ٸ���.
		System.out.println(a==c);//false 
		System.out.println(a==d);//false
		System.out.println(c==d);//true : ������ aaa�� c�� d�� ���� ����Ų��
		//String class ���Լ�
		System.out.println(a.equals(b));//a�� ����Ű�� �����Ϳ� b�� ����Ű�� ������ �������� Ȯ���ϴ� �Լ� .equals
	
		//String class String->int double float byte
		String money =new String("1000000");
		int aa=Integer.parseInt(money);
		String money2 = new String("1.234");
		double bb=Double.parseDouble(money2);
		//Byte.parseByte Float.parseByte
		
		System.out.println(money+money2);//       10000001.234
		System.out.println(aa+bb);//1000000+1.234=1000001.234
		
		//���ڿ����� �� ���ھ� ��������
		String str="hello, Java!!";
		for(int i=0;i<str.length();i++) {//���ڿ��� ���̸� ���Ҷ��� length() <=�޼ҵ��̴�
			System.out.println(str.charAt(i));//���ڿ����� �ش��ϴ� ��ġ�� ���ڸ� Char������ �����´�.
		}
	}
}

/*
 * |aaa| ~/aaa/ ~ ~/~/aaa/|a|b|
 */
