package shylock.aop.schema.biz;

public class AspectBiz {

    public void biz(){
        System.out.println("AspectBiz biz");
       // throw new RuntimeException("强制抛出异常测试:");
    }

    public void init(String name , int age){
        System.out.println("AspectBize:name:"+name+" age:"+age);
    }

}
