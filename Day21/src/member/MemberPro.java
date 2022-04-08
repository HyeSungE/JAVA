package member;

import java.io.IOException;

public interface MemberPro {
	public void input();
	public void output();
	public void edit();
	public void delete();
	public void save() throws IOException;
	public void load() throws IOException;
	public void exit();
}
