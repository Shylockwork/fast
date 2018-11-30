package shylock.service;

import shylock.dao.InjectionDAO;

public class InjectionService {

    public InjectionDAO getInjectionDAO() {
        return injectionDAO;
    }

    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    private InjectionDAO injectionDAO = null;

    public void show(){
        if(injectionDAO == null){
            System.out.println("没有进行注入");
        }else{
            System.out.println("spring 已经对该属性进行注入");
        }
    }


}
