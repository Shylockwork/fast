package webssm.service;

import org.springframework.stereotype.Service;
import webssm.dao.ExDao;
import webssm.myexception.MyException;


@Service
public class ExSer {
    public void throwMyExSer() throws Exception {
        new ExDao().throwMyExDao();
    }
}
