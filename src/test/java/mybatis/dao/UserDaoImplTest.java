package mybatis.dao;

import mybatis.po.User;
import mybatis.po.UserPage;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class UserDaoImplTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:config/spring/applicationContext.xml");
    }
    @Test
    public void findUserById() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //调用userDao的方法
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
    @Test
    public void testFindUserByPage() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        UserPage userPage = new UserPage();
        userPage.setStartPage(2);
        userPage.setPageSize(2);

        List<User> list = userDao.queryUserByPage(userPage);
        System.out.println(list);
    }
}