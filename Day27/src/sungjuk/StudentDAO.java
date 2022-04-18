package sungjuk;
//DB관리하는 부분들을 따로 클래스로 정의  --> DAO
import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private String url, user, pass;
	
	public StudentDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		user = "bigdata01";
		pass = "bigdata01";
	}
	
	public int insertStudent(String name, int kor, int eng) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "insert into sungjuk values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, kor);
			ps.setInt(3, eng);
			int res = ps.executeUpdate();
			return res;
		}catch(SQLException e) {
			System.err.println("insert 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally {
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return 0;
	}
	
	public Student inName(String name) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * from sungjuk where name = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			ArrayList<Student> list = makeArrayList(rs);
			if (list.size() == 1) {
				return list.get(0);
			}else {
				return null;
			}
		}catch(SQLException e) {
			System.err.println("inName 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return null;
	}
	
	public ArrayList<Student> makeArrayList(ResultSet rs) throws SQLException {
		ArrayList<Student> list = new ArrayList<>();
		while(rs.next()) {
			String name = rs.getString("name");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			Student st = new Student(name, kor, eng);
			list.add(st);
		}
		return list;
	}
	
	public ArrayList<Student> listStudent(){
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "select * from sungjuk";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ArrayList<Student> list = makeArrayList(rs);
			return list;
		}catch(SQLException e) {
			System.err.println("listStudent 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return null;
	}
	
	public int updateStudent(String name, int kor, int eng) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "update sungjuk set kor=?, eng=? where name=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, kor);
			ps.setInt(2, eng);
			ps.setString(3, name);
			int res = ps.executeUpdate();
			return res;
		}catch(SQLException e) {
			System.err.println("updateStudent 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally {
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return 0;
	}
	
	public int deleteStudent(String name) {
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "delete from sungjuk where name=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			int res = ps.executeUpdate();
			return res;
		}catch(SQLException e) {
			System.err.println("deleteStudent 실행 중 오류 발생!!");
			e.printStackTrace();
		}finally {
			try {
				if (ps != null) ps.close();
				if (con != null) con.close();
			}catch(SQLException e) {}
		}
		return 0;
	}
}






