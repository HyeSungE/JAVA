package Student;

import java.util.List;

public interface StudentPro {
	public void getList(List<Student> list);
	public void input(String name, int kor, int eng);
	//이름, 국어, 영어점수를 입력받아 저장하기 위한 메소드
	public List<Student> output(String name);
	//저장된 자료를 반환해 주는 메소드
	public Student getStudent(String name);
	//이름을 입력받아 해당하는 Student객체를 반환해주는 메소드(입력시, 수정시, 삭제시 이용)
	public void edit(Student edit);
	//국어, 영어점수를 다시 입력받아서 수정을 해주는 메소드
	public void delete(Student delete);
	//getStudent를 통해 받은 객체를 넘겨줘서 삭제해주는 메소드
	public void exit();
	//프로그램을 종료시키는 메소드
}
