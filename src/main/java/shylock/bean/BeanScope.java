package shylock.bean;

public class BeanScope {


    public void say(){

        System.out.println("shylock.bean.BeanScope say:"+this.hashCode());
    }

    public void init(){
        System.out.println("im beanScope i have bean initializing");
    }

    public void destroy(){
        System.out.println("im beanScope i have bean destroy");
    }

}
