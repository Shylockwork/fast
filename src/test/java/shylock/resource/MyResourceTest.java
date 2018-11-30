package shylock.resource;

import org.junit.Test;
import shylock.base.BaseTest;

import java.io.IOException;

import static org.junit.Assert.*;

public class MyResourceTest extends BaseTest {

    public MyResourceTest(){
        super("/MATE-INF/spring-resource.xml");
    }

    @Test
    public void testResource() throws IOException {
            MyResource myResource = super.getBean("myResource");
            myResource.resource();
    }
}