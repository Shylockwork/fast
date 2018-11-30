package mybatis.mapper;

import mybatis.po.User;
import mybatis.po.UserCustom;
import mybatis.po.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception{
        // 创建sqlSessionFactory
        // mybatis配置文件
        String resource = "config/mybatis/SqlMapConfig.xml";
        // 得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        System.out.println("配置文件加载完毕");
    }

    //用户信息综合查询
    @Test
    public void testFindUserList()throws Exception{
        //System.out.println(sqlSessionFactory);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper对象,mybatis自动生成mapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();

        //UserCustom:用户的拓展类
        userCustom.setUsername("小明");
        userQueryVo.setUserCustom(userCustom);

        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(10);
        ids.add(16);
        ids.add(22);
        userQueryVo.setIds(ids);



        List<UserCustom> list = userMapper.findUserList(userQueryVo);


        System.out.println(list);

    }

}