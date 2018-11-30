package shylock.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class BaseTest {

    private String springXmlPath;
    private ClassPathXmlApplicationContext context;



    public BaseTest(){}
    public BaseTest(String springXmlPath){
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before(){
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }
        String[] re = springXmlPath.split("[,\\s]+");
        context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
        context.start();
        //System.out.println(springXmlPath);
        for (String s : re){
            System.out.println(s);

        }

    }


    @After
    public void after(){
        context.destroy();
    }

    protected <T extends Object>T  getBean(String beanId){

        return (T) context.getBean(beanId);
    }


}
