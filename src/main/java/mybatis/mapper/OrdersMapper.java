package mybatis.mapper;

import mybatis.po.Orders;
import mybatis.po.OrdersCustom;

import java.util.List;

public interface OrdersMapper {

    //查询订单信息关联查询用户信息
    public List<OrdersCustom> findOrdersUser()throws Exception;

    //通过resultMap映射查询订单关联用户
    public List<Orders> findOrdersUserResultMap()throws Exception;

    //查询订单(关联用户)一对多
    public List<Orders> findOrdersAndOrderDetailResultMap()throws Exception;

    //延迟查询:
    public List<Orders> findOrdersUserLazyLoading()throws Exception;


}