import java.util.*;
public class Test01 {
	static int arr[][]=new int[9][9];
	public static  void boom(int i, int j) {
		int minI=i-1; if(minI<0) minI=0;
		int maxI=i+1; if(maxI>8) minI=8;
		int minJ=j-1; if(minJ<0) minJ=0;
		int maxJ=j+1; if(minJ>8) minJ=8; 
		
		for(int a=minI; a<=maxI; a++) {
			for(int b=minJ; b<=maxJ;b++) {
				if(arr[a][b]!=10) arr[a][b]++;
			}
		}
	}
	
	public static void main(String[] args) {
		//int arr[][]=new int[9][9];
		int co=0;
		
		while(true) {
			int row=(int)(Math.random()*8);
			int col=(int)(Math.random()*8);
			
			if(arr[row][col]==10) {
				continue;
			}
			
			arr[row][col]=10;
			boom(row,col);
			co++;
			if(co==10) break;
			}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==10) {
					System.out.print("ÆøÅº\t");
				}
				else{
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println("\n");
		}
		

	
	}
	

}
