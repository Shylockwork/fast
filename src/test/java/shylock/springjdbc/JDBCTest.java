package shylock.springjdbc;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import shylock.base.BaseTest;


import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCTest extends BaseTest {
    DriverManagerDataSource dataSource = null;
    JdbcTemplate jdbcTemplate  = null;
    public JDBCTest(){
        super("/MATE-INF/spring-jdbc.xml");

    }
    @Before
    public void setUp(){
        dataSource = super.getBean("dataSource");
        jdbcTemplate = new JdbcTemplate(dataSource);







    }


    @Test
    public void test8(){
        //查询1号员工的所有信息
        String sql = "select * from user where id = ?";

        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql,1);
        while(rs.next()){
            System.out.println(rs.getString("username"));
        }
    }

    @Test
    public void testUpdate(){
        //TODO
        String sql = "";
        int i = jdbcTemplate.update(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setInt(0,100);
                //...
            }
        });
    }


    @Test
    public void testTmp(){
        //创建模板类对象---模板类对象实现crud操作是建立在

        //String sql = "INSERT INTO USER(id,username,birthday,sex,address) VALUES(?,?,?,?,?)";
       // int i = jdbcTemplate.update(sql,99,"lucy",null,1,"beijing");
       // System.out.println(i);

        String sqlq = "select count(*) from user";
        //1:sql语句   2:返回的结果    3:参数
        int c  = jdbcTemplate.queryForObject(sqlq,Integer.class);
        System.out.println("总行数:"+c);
    }

    @Test
    public void testGetFromXml(){
        System.out.println(dataSource);
    }
    @Test
    public void test1() throws Exception {
//        Properties pro = new Properties();
//        FileInputStream in = new FileInputStream("/config/mybatis/db.properties");
//        pro.load(in);
        //spring 的jdbc与mysql数据库连接的实现
        //普通连接--每次需要连接就创建,不使用了之后销毁
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //设置连接参数

        //设置驱动
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        //设置数据库链接
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/shylock?characterEncoding=UTF-8");
        //设置数据库用户名
        dataSource.setUsername("root");
        //设置数据库密码
        dataSource.setPassword("loveyou1314");

        System.out.println(dataSource);
    }


}
