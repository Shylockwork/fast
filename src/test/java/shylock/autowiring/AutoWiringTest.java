package shylock.autowiring;

import org.junit.Test;
import shylock.base.BaseTest;

import static org.junit.Assert.*;

public class AutoWiringTest extends BaseTest {

public AutoWiringTest(){
    super("MATE-INF/spring-autowiring.xml");
}



    @Test
    public void testSay() {
    AutoWiringService autoWiringService = super.getBean("autoWiringService");
    autoWiringService.say("hello im autoWiringService");
    }
}