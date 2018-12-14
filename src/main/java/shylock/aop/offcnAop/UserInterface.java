package shylock.aop.offcnAop;

public interface UserInterface {

	public void doSave();
	public void doUpdate();
	
	public void findUserById(int uid);
	public void findUserByName(String name);
}
