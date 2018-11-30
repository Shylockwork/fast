package shylock.beanannotation.jsr;

import org.junit.Test;
import shylock.base.BaseTest;

import static org.junit.Assert.*;

public class JsrServiceTest extends BaseTest {

    public JsrServiceTest(){
        super("/MATE-INF/spring-beanannotation.xml");
    }

    @Test
    public void save() {
        JsrService service = getBean("jsrService");
        service.save();
    }
}