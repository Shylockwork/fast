package shylock.beanannotation.beanqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestQualifer {

    @Autowired
    @Qualifier("Action")
    private QualiferXmlTest qualiferXmlTest;
    public void testQualifer(){
        qualiferXmlTest.say();
    }


}
