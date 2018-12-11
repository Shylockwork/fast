package mybatis.mapper;

import mybatis.po.User;
import mybatis.po.UserCustom;
import mybatis.po.UserQueryVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.List;

public class UserMapperTest {
    private ApplicationContext applicationContext;
    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");
    }
    //用户信息综合查询
    @Test
    public void testFindUserList()throws Exception{
        //System.out.println(sqlSessionFactory);
        /**************** 原始mybatis的mapper开发方式:********************/
       // SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象,mybatis自动生成mapper代理对象
       // UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        /********************************分界线********************************/
        //整合ssm后的获取Mapper方式:
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");

        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
        //UserCustom:用户的拓展类
        userCustom.setUsername("小明");
        userQueryVo.setUserCustom(userCustom);
        //创建集合
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(10);
        ids.add(16);
        ids.add(22);
        userQueryVo.setIds(ids);
        //查询
        List<UserCustom> list = userMapper.findUserList(userQueryVo);
        System.out.println(list);
    }





    @Test
    public void testQueryUserByPage() throws Exception {
//        OrdersMapper ordersMapper = (OrdersMapper)applicationContext.getBean("ordersMapper");
//        List<OrdersCustom> list = ordersMapper.findOrdersUser();
//        System.out.println(list);
    }


    @Test
    public void testFindUserListBug() throws Exception {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        List<UserCustom> list = userMapper.findUserList2();
        System.out.println(list);
    }

    @Test
    public void testCache() throws Exception {
        // 创建代理对象
        UserMapper userMapper1 = applicationContext.getBean(UserMapper.class);
        // 第一次发起请求，查询id为1的用户
        User user1 = userMapper1.findUserById(1);
        System.out.println(user1);

        //这里执行关闭操作，将sqlsession中的数据写到二级缓存区域
       // sqlSession1.close();


		//使用sqlSession3执行commit()操作
//		UserMapper userMapper3 = applicationContext.getBean(UserMapper.class);
//		User user  = userMapper3.findUserById(1);
//		user.setUsername("张明明");
//		userMapper3.insertUser(user);
		//执行提交，清空UserMapper下边的二级缓存


        UserMapper userMapper2 = applicationContext.getBean(UserMapper.class);
        // 第二次发起请求，查询id为1的用户
        User user2 = userMapper2.findUserById(1);
        System.out.println(user2);
    }
}
