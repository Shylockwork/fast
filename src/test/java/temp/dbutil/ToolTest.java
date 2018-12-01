package temp.dbutil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ToolTest {

    @Test
    public void testInsertTest() throws SQLException {
        //向表中插入新的数据--名称和地址
        String name = "lihong";
        String balance = "5200";

        //需要连接对象
        Connection  conn = MyTest.getConn();
        conn.setAutoCommit(false);
        //准备sql
        String sql = "insert into account(name,balance) values(?,?)";

        //工具对象
        QueryRunner qr = new QueryRunner();

        int i = 0;
        try {
            //实现功能
             i= qr.update(conn,sql,name,balance);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(i);

        conn.commit();
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindAll() throws SQLException {

        Connection conn = MyTest.getConn();
        String sql = "select * from account";
        QueryRunner qr = new QueryRunner();

        List<Account> list= qr.query(conn,sql,new BeanListHandler<>(Account.class));

        for(Account account:list){
            System.out.println(account.getName());
        }



    }



}