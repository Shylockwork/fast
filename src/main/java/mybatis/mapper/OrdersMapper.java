package mybatis.mapper;

import mybatis.po.OrdersCustom;

import java.util.List;

public interface OrdersMapper {

    //查询订单信息关联查询用户信息
    public List<OrdersCustom> findOrdersUser()throws Exception;

}