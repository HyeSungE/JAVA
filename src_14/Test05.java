import java.io.*;
class A05{
	public void disp() throws IOException{
	}
}

class B05 extends A05{
	@Override
	public void disp(){
		try {
			
		}catch(Exception e) {}
	}
}
public class Test05 {
	public static void main(String[] args) throws IOException {
		//int su = System.in.read();
		A05 ap = new A05();
		ap.disp();
	}
}












