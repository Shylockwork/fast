package shylock.beanannotation;

import org.junit.Test;
import shylock.base.BaseTest;

import shylock.beanannotation.beanqualifier.TestQualifer;

import shylock.beanannotation.multibean.BeanInvoker;

import static org.junit.Assert.*;

public class BeanAnnotationTest extends BaseTest {

    public BeanAnnotationTest(){

        super("/MATE-INF/spring-beanannotation.xml");
    }
    @Test
    public void say() {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.say("hello world");
    }

    @Test
    public void testMultiBeanWired(){
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }

    @Test
    public void testQualifter(){

        TestQualifer testQualifer = super.getBean("testQualifer");
        testQualifer.testQualifer();

    }


}