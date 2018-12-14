package shylock.transaction.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shylock.transaction.dao.AccountDao;
import shylock.transaction.dao.AccountDaoImpl;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDaoImpl accountDao;


    @Override
    public void account() {
        String name1 = "小花";
        int id1 = 1;
        String name2 = "小草";
        int id2 = 2;
        //
        double money = 2000.0;

        Map map = accountDao.selectAccountById(id1);
        Set set = map.keySet();
        Iterator it = set.iterator();
        System.out.println("====小花的余额====");
        while(it.hasNext()){
            String key = (String) it.next();
            Object value = map.get(key);
            System.out.println(key+"--"+value);
        }

        System.out.println("===============================");

        //小花转出钱
        accountDao.oddMoney(id1,money);
        //小草转入钱
        accountDao.addMoney(id2,money);

        int i = 10/0;
        //小草查余额
        System.out.println("======小草的余额=======");
        Map map2 = accountDao.selectAccountById(id2);
        Set set2 = map2.keySet();
        Iterator it2 = set2.iterator();
        while(it2.hasNext()){
            String key = (String) it2.next();
            Object value = map2.get(key);
            System.out.println(key + "--" + value);
        }
        System.out.println("====================");

    }
}
