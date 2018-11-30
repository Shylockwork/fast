package shylock.aop.schema.advice;


import jdk.nashorn.internal.codegen.ObjectCreator;
import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {
	public void before(){
		System.out.println("MoocAspect: before");
	}


	public void afterReturning(){
		System.out.println("MoocAspect: afterReturning");
	}

	public void afterThrowing(){
        System.out.println("MoocAspect: afterThrowing");
    }

    public void after(){
        System.out.println("MoocAspect: after");
    }

    public Object around(ProceedingJoinPoint pjp){
        Object obj = null;
        try {
            System.out.println("MoocAspect: around 1");
            obj = pjp.proceed();
            System.out.println("MoocAspect: around 2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return  obj;

    }

    public Object aroundInit(ProceedingJoinPoint pjp,String name,int age){
        System.out.println("Aspect:"+name+"  "+age);
        Object obj = null;
        try {
            System.out.println("MoocAspect: aroundInit 1");
            obj = pjp.proceed();
            System.out.println("MoocAspect: aroundInit 2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return  obj;

    }
}
