package shylock.aop.offcnAop;

import org.junit.Test;

import shylock.base.BaseTest;



public class PersonInterfaceImplTest extends BaseTest {

public PersonInterfaceImplTest(){
    super("/MATE-INF/spring-aop-offcn-annotation.xml");
}
    @Test
    public void save() {
        //
        UserInterface uii =   super.getBean("userInterfaceImpl");
        uii.doUpdate();
    }
}