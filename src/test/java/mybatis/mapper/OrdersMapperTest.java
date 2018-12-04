package mybatis.mapper;

import mybatis.po.OrdersCustom;
import mybatis.po.UserCustom;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrdersMapperTest {
    private ApplicationContext applicationContext;
    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");
    }

    @Test
    void findOrdersUser() throws Exception {
        OrdersMapper ordersMapper = (OrdersMapper) applicationContext.getBean("ordersMapper");

        List<OrdersCustom> list = ordersMapper.findOrdersUser();

        System.out.println(list);
    }
}