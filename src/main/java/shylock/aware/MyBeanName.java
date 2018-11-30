package shylock.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBeanName implements BeanNameAware ,ApplicationContextAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("hello my name is:"+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("im MyBeanName my hashcode is:"+applicationContext.getBean("beanName").hashCode());
    }
}
