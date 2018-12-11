package mybatis.mapper;

import mybatis.po.Orders;
import mybatis.po.OrdersCustom;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;



public class OrdersMapperTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");
    }


    @Test
    public void testFindOrdersUser() throws Exception {

        OrdersMapper ordersMapper = (OrdersMapper) applicationContext.getBean("ordersMapper");


        //resultType:
       // List<OrdersCustom> list = ordersMapper.findOrdersUser();

        //resultMap:
       // List<Orders> list = ordersMapper.findOrdersUserResultMap();

        //一对多:
        //List<Orders> list = ordersMapper.findOrdersAndOrderDetailResultMap();

        //延迟加载:
        List<Orders> list = ordersMapper.findOrdersUserLazyLoading();

        for(Orders orders:list)
            System.out.println(orders.getUser());

        System.out.println(list);
    }
}