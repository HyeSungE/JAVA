package Student;

import java.util.List;

public interface StudentPro {
	public void getList(List<Student> list);
	public void input(String name, int kor, int eng);
	//�̸�, ����, ���������� �Է¹޾� �����ϱ� ���� �޼ҵ�
	public List<Student> output(String name);
	//����� �ڷḦ ��ȯ�� �ִ� �޼ҵ�
	public Student getStudent(String name);
	//�̸��� �Է¹޾� �ش��ϴ� Student��ü�� ��ȯ���ִ� �޼ҵ�(�Է½�, ������, ������ �̿�)
	public void edit(Student edit);
	//����, ���������� �ٽ� �Է¹޾Ƽ� ������ ���ִ� �޼ҵ�
	public void delete(Student delete);
	//getStudent�� ���� ���� ��ü�� �Ѱ��༭ �������ִ� �޼ҵ�
	public void exit();
	//���α׷��� �����Ű�� �޼ҵ�
}
