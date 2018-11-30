package shylock.aop.schema.biz;

import org.junit.Test;
import shylock.aop.schema.advice.Fit;
import shylock.base.BaseTest;



public class AspectBizTest extends BaseTest {


    public AspectBizTest(){
        super("/MATE-INF/spring-aop-schema-advice.xml");
    }

    @Test
    public void biz() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
    }

    @Test
    public void init() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.init("shylock",18);
    }


    @Test
    public void testFit(){
        Fit fit = (Fit)super.getBean("aspectBiz");
        fit.filter();
    }


}