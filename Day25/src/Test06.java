enum A06{
	�Ｚ, KT, LG, ��ȭ, ���, �Ե�, NC, �λ�, �ؼ�, SSG
}
public class Test06 {
	public static void main(String[] args) {
		A06[] ap = A06.values();
		for(int i=0; i<ap.length; ++i) {
			String team = ap[i].name();
			System.out.println(team);
		}
	}
}
