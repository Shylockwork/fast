package shylock.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class MyResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
      //  Resource resource = applicationContext.getResource("file:D:\\IntellIj\\IntelliJWork\\Shylock\\src\\main\\resources\\config.txt");
       // Resource resource = applicationContext.getResource("classpath:config.txt");
        Resource resource = applicationContext.getResource("url:http://www.chinanews.com/sh/2018/07-03/8555545.shtml");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
