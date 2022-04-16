//db�� ����ϱ� ���ؼ��� ����̹��� ��ġ�ؾ���
//build path�� ���� ojdbc�� �߰��������
import java.sql.*;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����Ŭ ����̹� �˻� ����");
		}catch(ClassNotFoundException e) {
			System.err.println("����Ŭ ����̹� �˻� ����");
		}
		Connection con = null;//�˻� �� �ڹٿ� ����Ŭ�� �����Ű�� Ŭ����
		try {
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","bigdata01","bigdata01");
			con.setAutoCommit(false);//autocommit�� ���� �ʰ��Ѵ�.
			System.out.println("����Ŭ ���Ἲ��");
		}catch(SQLException e){
			System.err.println("����Ŭ ���� ����");
		}
		//����Ŭ ���� �� �������� �ٷ��, �������� �ٷ�� Ŭ������ ���
		//Statement 	�������� 	
		//-> ���̵�� �н�����
		//PreparedStatement		��������
		//->delete from testMember where id=? <�����͸� ? �����ϰ� column�� ?�� �� �� ����.>
		//CallableStatement		�������� - ���ν����� ���� ȣ���� �� �ִ� ��ü
		
		PreparedStatement ps = null;//autocommit�� default
		try {
			String sql = "insert into testmember values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1,"hong");//set���µ��������ڷ���
			ps.setString(2, "ȫ�浿");
			ps.setNString(3, "123-555");
			int res = ps.executeUpdate();
			//���������� insert delete upadate�� ��� executeUpdate�޼ҵ带 ��������ش�.
			//����� int������ ������ �Ͼ ���� �����̴�.
			//���� ����� 0���� ũ�� �����̰� ������ ���д��̴�.
		
			//auto commit�� false��Ű�� ������ �Ͼ ������ ��� �������
			if(res>0) {
				System.out.println("ȫ�浿 �Է� ����");
				con.commit();
			}
			else {
				System.out.println("ȫ�浿 �Է� ����");
			}
		}catch(SQLException e) {}
		
	}

}
