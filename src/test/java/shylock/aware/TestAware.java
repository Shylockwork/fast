package shylock.aware;

import org.junit.Test;
import shylock.base.BaseTest;

public class TestAware extends BaseTest {

public TestAware(){
    super("/MATE-INF/spring-aware.xml");
}
    @Test
    public void testMyApplicationContext(){

        System.out.println("im testApplicationContext my hashcode is:"+super.getBean("applicationContext").hashCode());
    }

    @Test
    public void testMyBeanName(){
        System.out.println("im testBeanName my hashcode is:"+super.getBean("beanName").hashCode());
    }

}
