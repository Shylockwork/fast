package shylock.bean;

import org.junit.Test;
import shylock.base.BaseTest;

public class BeanScopeTest extends BaseTest {
    public BeanScopeTest(){
        super("/MATE-INF/spring-beanscope.xml");
    }

    @Test
    public void say() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }
    @Test
    public void say2() {
        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }
}