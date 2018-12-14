package shylock.transaction;

import com.mysql.jdbc.Driver;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import shylock.transaction.service.AccountService;

import java.sql.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JDBCTransactionTest {


    PreparedStatement pstat = null;
    ResultSet rs =null;
    Connection conn = null;
    ApplicationContext context = null;
    JdbcTemplate template = null;
    @Before
    public void setUp(){
        context = new ClassPathXmlApplicationContext("/MATE-INF/spring-transaction.xml");
        template = (JdbcTemplate) context.getBean("template");
    }


    @Test
    public void test1() {

        try {
            DriverManager.registerDriver(new Driver());
            conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shylock?characterEncoding=UTF-8"
                    ,"root","loveyou1314");

            //设置手动提交
            conn.setAutoCommit(false);

            String sqlQ = "select * from account where aid=?";
            pstat = conn.prepareStatement(sqlQ);
            pstat.setInt(1,1);
            rs = pstat.executeQuery();
            if(rs.next()){
                System.out.println("name"+rs.getString("aname")+" id:"+rs.getInt("aid")+" money:"+rs.getDouble("amoney"));
            }
            //开始转账
            String sqlZK = "update account set amoney=amoney-? where aid=?";
            pstat=conn.prepareStatement(sqlZK);
            pstat.setInt(1,2000);
            pstat.setInt(2,1);
            pstat.executeUpdate();


            int i = 10/0;
            //收钱
            String sqlSQ = "update account set amoney=amoney+? where aid=?";
            pstat=conn.prepareStatement(sqlSQ);
            pstat.setInt(1,2000);
            pstat.setInt(2,2);
            pstat.executeUpdate();

            conn.commit();

            //查询

        } catch (Exception e) {
            System.out.println("出现异常");
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                pstat.close();
                rs.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


    @Test
    public void test2(){
        //spring的事务管理
        //这个类是spring中管理事务的
//        String sql = "select * from employee where empnum = ?";
//        Map map = template.queryForMap(sql, 1);
//        Set set = map.keySet();
//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            String key = (String) it.next();
//            Object value = map.get(key);
//            System.out.println(key + "--" + value);
//        }

        AccountService as = (AccountService) context.getBean("accountServiceImpl");
        as.account();
    }
    @Test
    public void test3(){
        //注解测试
        AccountService as = (AccountService) context.getBean("accountServiceImpl");
        as.account();
    }


}
