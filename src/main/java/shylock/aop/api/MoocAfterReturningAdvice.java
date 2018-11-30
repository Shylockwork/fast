package shylock.aop.api;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MoocAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("MoocAfterReturningAdvice: methodName: "+method.getName()+" targetName"+target.getClass().getName()+" 返回值: "+returnValue);
    }

}
