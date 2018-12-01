package mybatis.mapper;
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
}
