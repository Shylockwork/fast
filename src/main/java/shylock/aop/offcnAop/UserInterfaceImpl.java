package shylock.aop.offcnAop;

import org.springframework.stereotype.Service;

@Service
public class UserInterfaceImpl implements UserInterface {

	@Override
	public void doSave() {
		int i = 10 / 0;
		System.out.println("do....save....");
	}

	@Override
	public void doUpdate() {
		System.out.println("do....update...");
	}

	@Override
	public void findUserById(int uid) {
		System.out.println("find....user...id" + uid);
	}

	@Override
	public void findUserByName(String name) {
		System.out.println("find...user....name" + name);
	}

}
