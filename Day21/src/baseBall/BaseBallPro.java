package baseBall;

import java.util.Hashtable;

public interface BaseBallPro {
	public void output();
	public void edit();
	public void delete();
	public void exit();
	public boolean isClub(String club);
	public boolean isName(String club,String p_name,int salary) ;
	public Hashtable getHt();
}
