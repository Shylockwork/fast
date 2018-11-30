package shylock.beanannotation.javabased;

import org.junit.Test;
import shylock.base.BaseTest;

import java.util.Base64;


public class StoreConfigTest extends BaseTest {
public StoreConfigTest(){
    super("/MATE-INF/spring-beanannotation.xml");
}


    @Test
    public void myDriverManager() {
        MyDriverManager manager = super.getBean("myDriverManager");
        System.out.println(manager.getClass().getName());
    }


    @Test
    public void testG(){

    StringStore store = super.getBean("stringStoreTest");

    }
}