package Grade;
import java.sql.*;
import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;
public class ScoreManageImpl  implements ScoreManage   {
	
	private String name;
	private int kor,eng;
	private Scanner in;
	private Connection con=null;
	private PreparedStatement ps =null;
	private ResultSet rs = null;
	private String check = "select name from score where name=?";
	ArrayList<Student> al = new ArrayList<>();
	
	public ScoreManageImpl() throws Exception{
		con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","bigdata01","bigdata01");
		in=new Scanner(System.in);
	}
	
	public boolean nameCheck(String name){
		int res=0;
		try {
			ps=con.prepareStatement(check);
			ps.setString(1, name);
			rs = ps.executeQuery();
			return rs.next();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public ArrayList<Student> List(){
		al.clear();
		String sql = "select * from score";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				Student std = new Student(name,kor,eng);
				al.add(std);
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return al;
	}
	public void rank() {
		for(Student std : al) {
			for(Student std2 : al) {
				if(std.getSum()<std2.getSum()) {
					std.addRank();
				}
			}
		}
	}
	@Override
	public void input() {
		System.out.print("이름을 입력하시오 : ");
		name = in.next();
		System.out.print("국어 점수를 입력하시오 : ");
		kor = in.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		eng=in.nextInt();
		Student std = new Student(name,kor,eng);
		try {
			String sql="insert into score values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1,std.getName());
			ps.setInt(2, std.getKor());
			ps.setInt(3, std.getEng());
			ps.executeUpdate();
			System.out.println(name+"님의 성적이 추가되었습니다.");
			List();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		System.out.print("이름을 입력하시오 : ");
		name = in.next();
		try {
			if(nameCheck(name)) {	
				String sql = "delete from score where name=?";
				ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.executeUpdate();
				System.out.println(name+"님의 성적이 삭제되었습니다.");
				List();
			}
			else System.out.println("존재하는 이름이 없습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void edit() {
		System.out.print("이름을 입력하시오 : ");
		name = in.next();
		try {
			if(nameCheck(name)) {
				System.out.print("국어 점수를 입력하시오 : ");
				kor=in.nextInt();
				System.out.print("영어 점수를 입력하시오 : ");
				eng=in.nextInt();
				String sql = "update score set kor=?,eng=? where name=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1, kor);
				ps.setInt(2, eng);
				ps.setString(3,name);
				ps.executeUpdate();
				List();
				}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		List();
		rank();
			System.out.println("이름\t국어점수\t영어\t총점\t순위\t"
					+"\n------------------------------");
		for(Student std : al) {
			System.out.println(std.getName()+"\t"+std.getKor()+"\t"+std.getEng()
					+"\t"+std.getSum()+"\t"+std.getRank());
		}
		
	}

	@Override
	public void exit() {
		System.exit(0);
		
	}

}
