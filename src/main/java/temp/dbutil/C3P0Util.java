package temp.dbutil;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Administrator
 */
public class C3P0Util {
    //定义连接池对象
    private static ComboPooledDataSource cpds;
    static{
        //连接池构建和初始化
        cpds = new ComboPooledDataSource("mysql");
    }
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = cpds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
