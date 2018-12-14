package proxy.cglibproxy;

import org.springframework.stereotype.Component;

//Ŀ�������������
@Component
public class UserInterfaceImpl implements UserInterface{

	@Override
	public void save() {
		System.out.println("user...interface...impl...save");
	}

}
