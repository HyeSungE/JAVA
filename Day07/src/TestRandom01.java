import java.io.*;

public class TestRandom01 {

	public static void main(String[] args) throws IOException {
		char COM[]=new char[3];
		char select[]=new char[3];
		int co=0;
		//(int)로 형변환하는 이유는 난수로 생성된 수에서 소수점을 버리기 위함인데 char형으로 형변환하면 아스키코드 값인 정수만을 취하기 때문에 소수점이 버려진다
		//따라서 전체범위를 char형으로 형변화해주면 된다.
		
		for(int i=0;i<3;i++) {
			COM[i]=(char)((Math.random()*9)+49);//49 50 51 = 1 2 3의 아스키코드 값
			for(int j=0;j<i;j++) {
				if(COM[i]==COM[j]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			System.out.print("숫자 3개를 입력하시오 : ");
			int s=0,b=0;
			for(int i=0;i<3;i++) {
				select[i]=(char)System.in.read();//-48을 하지 않아도된다. 
				//read()하게 되면 표준입력스트림에서 남아있는 글자 중 한개를 가져온다. 
				//System.in.skip(10) -> 스트림에 남아있는 10바이트를 지우라는 명령문이다. 
				//System.in.skip(5) -> Enter키를 스킵하게 해준다. 
				//Enter에는 두 글자 \r, \n이 들어가고 이 두 글자를 지우기위해서 확실하게 5를 인수로 줌으로써 지운다.				
			}
			System.in.skip(10);//123을 치고 엔터키를 누를 떄 엔터키를 스킵해줌
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
		System.out.println(co+"번 만에 맞추셨습니다.");
	}

}
