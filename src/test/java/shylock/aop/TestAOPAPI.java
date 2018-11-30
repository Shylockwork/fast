package shylock.aop;

import org.junit.Test;
import shylock.aop.api.BizLogic;
import shylock.base.BaseTest;

public class TestAOPAPI extends BaseTest {
    public TestAOPAPI(){
        super("/MATE-INF/spring-aop-api.xml");
    }

    @Test
    public void testSave(){
        BizLogic logic = super.getBean("bizLogicImpl");
        logic.save();
    }

}
