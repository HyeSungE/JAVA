import java.io.*;

public class TestRandom01 {

	public static void main(String[] args) throws IOException {
		char COM[]=new char[3];
		char select[]=new char[3];
		int co=0;
		//(int)�� ����ȯ�ϴ� ������ ������ ������ ������ �Ҽ����� ������ �����ε� char������ ����ȯ�ϸ� �ƽ�Ű�ڵ� ���� �������� ���ϱ� ������ �Ҽ����� ��������
		//���� ��ü������ char������ ����ȭ���ָ� �ȴ�.
		
		for(int i=0;i<3;i++) {
			COM[i]=(char)((Math.random()*9)+49);//49 50 51 = 1 2 3�� �ƽ�Ű�ڵ� ��
			for(int j=0;j<i;j++) {
				if(COM[i]==COM[j]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			System.out.print("���� 3���� �Է��Ͻÿ� : ");
			int s=0,b=0;
			for(int i=0;i<3;i++) {
				select[i]=(char)System.in.read();//-48�� ���� �ʾƵ��ȴ�. 
				//read()�ϰ� �Ǹ� ǥ���Է½�Ʈ������ �����ִ� ���� �� �Ѱ��� �����´�. 
				//System.in.skip(10) -> ��Ʈ���� �����ִ� 10����Ʈ�� ������ ��ɹ��̴�. 
				//System.in.skip(5) -> EnterŰ�� ��ŵ�ϰ� ���ش�. 
				//Enter���� �� ���� \r, \n�� ���� �� �� ���ڸ� ��������ؼ� Ȯ���ϰ� 5�� �μ��� �����ν� �����.				
			}
			System.in.skip(10);//123�� ġ�� ����Ű�� ���� �� ����Ű�� ��ŵ����
			co++;
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(COM[i]==select[j]) {
						if(i==j) 
							s++;
						else 
							b++;
					}
				}
			}
			if(s==3) 
				break;
			else if(s==0&&b==0) 
				System.out.println("out");
			else  
				System.out.printf("%d S %d B\n",s,b);
		}
		System.out.println(co+"�� ���� ���߼̽��ϴ�.");
	}

}
