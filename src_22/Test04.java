import java.io.File;
import java.io.*;

public class Test04 {
	public static void main(String[]args) throws IOException ,ClassNotFoundException{
		File dir=new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22");
		File file=new File(dir,"bbb.txt");
		
		FileInputStream fis = new FileInputStream(file); // IOException���׿���
		BufferedInputStream bis =new BufferedInputStream(fis);
		ObjectInputStream ois =new ObjectInputStream(bis);
		
		Object obj =ois.readObject(); //ClassNotFoundException ���� ���� 
		A03 ap =(A03)obj;
		ap.disp();
}
}

