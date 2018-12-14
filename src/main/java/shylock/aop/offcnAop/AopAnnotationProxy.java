package shylock.aop.offcnAop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopAnnotationProxy {

    //所有的方法都有环绕通知
    //环绕通知
    @Around("execution(* shylock.aop.offcnAop.UserInterfaceImpl.*(..))")
    public void round(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("round....");
        pjp.proceed();
        System.out.println("round....");
    }
}
