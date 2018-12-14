package proxy.cglibproxy;



import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*
* 新的代理类 cglib代理的实现
* 此代理方式与jdk代理凡是相似
* 现有第一层代理类
* */
public class PersonCGLIB implements MethodInterceptor {
    private Object targetObj;


//    public Object getTargetObj() {
////        return targetObj;
////    }

    public void setTargetObj(Object targetObj) {
        this.targetObj = targetObj;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //输出
        System.out.println("代理对象类:"+proxy.getClass());
        System.out.println("代理对象的功能方法名:"+method.getName());
        System.out.println("目标对象的功能方法实参:"+objects);

        //实现业务功能
        Object o = method.invoke(targetObj,objects);

        return o;
    }
    //提供创建第二个代理的方法----由这个代理对象完成代理功能
    public Object createProxy(){
        //创建代理对象的对象,加工工厂
        Enhancer enhancer = new Enhancer();
        //en设置参数
        enhancer.setClassLoader(targetObj.getClass().getClassLoader());
        enhancer.setSuperclass(targetObj.getClass());
        enhancer.setCallback(this);

        Object obj = enhancer.create();
        return obj;
    }


}
