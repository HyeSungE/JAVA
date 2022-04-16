import java.sql.*;
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("검색 성공");
		}
		catch(ClassNotFoundException e) {
			System.err.println("검색 실패");
		}
		
		Connection con = null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bigdata01","bigdata01");
			System.out.println("오라클 연결 성공");
		}catch(SQLException e) {
			System.err.println("오라클 연결 실패");
		}
		
		PreparedStatement ps = null;
		ResultSet rs =null;//select의 결과를 받을 클래스
		try {
			String sql = "select * from testMember";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(); // select는 유일하게 executeQuery메소드 실행
			
			while(rs.next()) {
				String id = rs.getString("id"); //column이름이나 번호로 호출 가능하다.
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
