package shylock.transaction.dao;

import java.util.Map;

public interface AccountDao {
    public Map selectAccountById(int id1);

    public void oddMoney(int id1, double money);

    public void addMoney(int id2, double money);
}
