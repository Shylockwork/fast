package shylock.beanannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InjectionService {
    @Autowired
    private InjectionDAO injectionDAO = null;
//    public InjectionDAO getInjectionDAO() {
//        return injectionDAO;
//    }
//
//    @Autowired
//    public void setInjectionDAO(InjectionDAO injectionDAO) {
//        this.injectionDAO = injectionDAO;
//    }


//    @Autowired
//    public InjectionService(InjectionDAO injectionDAO){
//        this.injectionDAO = injectionDAO;
//    }

    public void show(){
        if(injectionDAO == null){
            System.out.println("没有进行注入");
        }else{
            System.out.println("spring 已经对该属性进行注入");
            injectionDAO.say();

        }
    }


}
