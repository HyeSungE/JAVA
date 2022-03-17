
public class TestRandom06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lotto[]=new int[6];
		int count[]=new int[45];
	
		
		for(int k=0;k<1000;k++) {
			for(int i=0;i<6;i++) {
				lotto[i]=(int)(Math.random()*45)+1;
				count[lotto[i]-1]++;
				for(int j=0;j<i;j++) {
					if(lotto[j]==lotto[i]) {
						i--;
						count[lotto[i]-1]--;
						break;
					}
				}
			}
		}
		int rank[]=new int[45];
		
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
		}
		for(int i=0;i<rank.length;i++) {
			for(int j=0;j<rank.length;j++) {
				if(count[i]<count[j]) {
					rank[i]++;
				}
			}
		}
		System.out.print("로또번호 : ");
		for(int i=0;i<rank.length;i++) {
			if(rank[i]<=6)
			System.out.print(i+1+" ");
		}
	}
}
