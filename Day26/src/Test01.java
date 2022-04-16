//db를 사용하기 위해서는 드라이버를 설치해야함
//build path를 통해 ojdbc를 추가해줘야함
import java.sql.*;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 검색 성공");
		}catch(ClassNotFoundException e) {
			System.err.println("오라클 드라이버 검색 실패");
		}
		Connection con = null;//검색 후 자바와 오라클을 연결시키는 클래스
		try {
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","bigdata01","bigdata01");
			con.setAutoCommit(false);//autocommit을 하지 않게한다.
			System.out.println("오라클 연결성공");
		}catch(SQLException e){
			System.err.println("오라클 연결 실패");
		}
		//오라클 연결 후 쿼리문을 다룬다, 쿼리문을 다루는 클래스를 사용
		//Statement 	정적쿼리 	
		//-> 아이디와 패스워드
		//PreparedStatement		동적쿼리
		//->delete from testMember where id=? <데이터만 ? 가능하고 column은 ?를 쓸 수 없다.>
		//CallableStatement		구문쿼리 - 프로시저를 만들어서 호출할 수 있는 객체
		
		PreparedStatement ps = null;//autocommit이 default
		try {
			String sql = "insert into testmember values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1,"hong");//set들어가는데이터의자료형
			ps.setString(2, "홍길동");
			ps.setNString(3, "123-555");
			int res = ps.executeUpdate();
			//쿼리문장이 insert delete upadate일 경우 executeUpdate메소드를 실행시켜준다.
			//결과는 int값으로 변경이 일어나 행의 개수이다.
			//받은 결과가 0보다 크면 성공이고 작으면 실패다이다.
		
			//auto commit을 false시키면 변경이 일어날 때마다 계쏙 해줘야함
			if(res>0) {
				System.out.println("홍길동 입력 성공");
				con.commit();
			}
			else {
				System.out.println("홍길동 입력 실패");
			}
		}catch(SQLException e) {}
		
	}

}
