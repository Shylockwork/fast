package shylock.aop.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MoocBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("MoocBeforeAdvice : methodName: " + method.getName() + " targetName: " + target.getClass().getName());
    }
}
