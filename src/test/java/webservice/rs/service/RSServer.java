package webservice.rs.service;


import mybatis.po.User;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class RSServer {
    public static void main(String[] args) {
        //创建发布工厂
        JAXRSServerFactoryBean factory  = new JAXRSServerFactoryBean();
        //设置服务地址
        factory.setAddress("http://localhost:8001/rs/");
        //设置服务类
        factory.setServiceBean(new UserServiceImpl());
        //添加日志输入输出拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        //发布服务
        factory.create();
        System.out.println("发布服务成功:端口80001");
    }

}