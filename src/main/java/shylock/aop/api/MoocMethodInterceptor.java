package shylock.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MoocMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("MoocMethodInterceptor 1: methodName:"+invocation.getMethod().getName()+"    "+invocation.getStaticPart().getClass().getName());
        Object obj = invocation.proceed();
        System.out.println("MoocMethodIntercepter 2: 返回值: " + obj);
        return obj;
    }
}
