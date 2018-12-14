package shylock.aop.offcnAop;

public class PersonInterfaceImpl implements PersonInterface{

	@Override
	public void save() {
		//目标对象的功能 --- 原有功能
		System.out.println("person...save");
		//新增代码段
	}

	@Override
	public void update() {
		//人造异常
		int i = 10 / 0;
		//目标对象的功能 --- 原有功能
		System.out.println("person.....update");
	}

	public void insert(){
		//人为异常--目的是演示当业务功能没有被正常执行结束
		String str = null;
		str.length();
		System.out.println("person....insert....");
	}

	//测试环绕通知
	public void delete(){
		int i = 10 / 0;
		System.out.println("person......delete.....");
	}

	//测试异常后通知
	public void select(){
		int i = 10 / 0;
		System.out.println("person....select....");
	}


	//业务功能find方法
	public void find(){
		int i = 10 / 0;
		System.out.println("person....find.....");
	}

	//所有的增删改操作以do做为前缀：doXxx()
	public void doSave(){

	}
	public void doUpdate(){

	}
	public void doDelete(){

	}

	//所有的查询操作都是以find做为前缀：findXxx()
	public void findPerson(){

	}
	public void findPersonById(){

	}
	public void findPersonByName(){

	}





}
