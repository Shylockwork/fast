package webservice.ws.impl;


import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.junit.Test;

public class WSServer {

    public static void main(String[] args) {
        //发布服务工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        //设置服务地址
        factory.setAddress("http://localhost:8000/ws/hello");
        //设置服务类
        factory.setServiceBean(new HelloServiceImpl());
        //添加日志输入和输出拦截器,观察soap请求,soqp相应内容
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        //发布服务
        factory.create();
        System.out.println("发布服务成功:http://localhost:8000/ws/hello");
    }
    @Test
    public void publish(){
    }


}