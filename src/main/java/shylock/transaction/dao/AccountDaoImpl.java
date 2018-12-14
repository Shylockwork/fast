package shylock.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import javax.annotation.Resource;
import java.util.Map;

@Repository
public class AccountDaoImpl implements AccountDao {




    @Resource
    private JdbcTemplate template;

    @Override
    public Map selectAccountById(int id) {
        String sql = "select * from account where aid=?";

        Map map = template.queryForMap(sql,id);

        return  map;
    }

    @Override
    public void oddMoney(int id, double money) {
        String sql = "update account set amoney=amoney-? where aid=?";

        template.update(sql,money,id);


    }

    @Override
    public void addMoney(int id, double money) {
        String sql = "update account set amoney=amoney+? where aid=?";
        template.update(sql,money,id);
    }
}
