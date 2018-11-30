package shylock.aop.schema.biz;

import org.junit.Test;
import shylock.aop.schema.advisors.service.InvokeService;
import shylock.base.BaseTest;

public class AdvisorsTest extends BaseTest {
    public AdvisorsTest(){
        super("/MATE-INF/spring-aop-schema-advisors.xml");
    }
    @Test
    public void testSave(){
        InvokeService service = super.getBean("invokeService");
        service.invoke();
        System.out.println("-----------------------------");
        service.invokeException();
    }



}
