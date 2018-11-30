package shylock.service;

import org.junit.Test;
import shylock.base.BaseTest;

public class InjectionServiceTest extends BaseTest {


    public InjectionServiceTest(){
        super("/MATE-INF/spring-beanscope.xml");
    }
    @Test
    public void show() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.show();
    }
}