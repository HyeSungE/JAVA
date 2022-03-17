
public class TestRandom01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE=10;
		for(int i=0;i<SIZE;i++)
			System.out.println(Math.random());
		/*
		 * random : 구하고자 하는 수의 범위를 곱하고 int로 형변환하여 시작 수를 더한다.
		 * 			1~10
		 			(int)(Math.random()*10)+1;
		 			0부터 시작할 떄는 구하고자는 수의 +1의 값을 곱한다.
		 			(int)(Math.random()*11=(10+1));
		 			
		 			ex)31~40 31하고 40의 차이는 10
		 			(int)(Math.random()*10)+31;
		 			
		 			
		 */
	}

}
