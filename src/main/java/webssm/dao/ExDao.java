package webssm.dao;

import org.springframework.stereotype.Repository;
import webssm.myexception.MyException;


@Repository
public class ExDao {

    public void throwMyExDao() throws Exception {
        throw new Exception("dao");
    }
}
