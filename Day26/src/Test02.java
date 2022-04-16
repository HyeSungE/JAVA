import java.sql.*;
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�˻� ����");
		}
		catch(ClassNotFoundException e) {
			System.err.println("�˻� ����");
		}
		
		Connection con = null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bigdata01","bigdata01");
			System.out.println("����Ŭ ���� ����");
		}catch(SQLException e) {
			System.err.println("����Ŭ ���� ����");
		}
		
		PreparedStatement ps = null;
		ResultSet rs =null;//select�� ����� ���� Ŭ����
		try {
			String sql = "select * from testMember";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(); // select�� �����ϰ� executeQuery�޼ҵ� ����
			
			while(rs.next()) {
				String id = rs.getString("id"); //column�̸��̳� ��ȣ�� ȣ�� �����ϴ�.
				//String id = rs.getString("1");
				String name = rs.getString("name");
				//String name = rs.getString("2");
				String tel = rs.getNString("tel");
				//String tel = rs.getString("3");
				System.out.println(id+"\t"+name+"\t"+tel+"\t");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
