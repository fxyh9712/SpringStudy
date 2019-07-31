package com.fxyh.spring.handler;

import com.fxyh.spring.exception.CustomException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionHandlerAutoAOP {

    /*
     * 定义一个公共的切点
     */
    @Pointcut("execution(* com.fxyh.spring.service.*.*(..))")
    public void pointcut() {}

    /**
     * 前置通知
     * @param joinPoint
     */
    @Before(value = "execution(* com.fxyh.spring.service.*.*(..))")
    public void beginTransaction(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();
        String kind = joinPoint.getKind();
        Signature signature = joinPoint.getSignature();
        System.out.println("注解方式开始事务！");
    }

    /**
     * 后置通知
     */
    @After(value = "pointcut()")
    public void endTransaction(){
        System.out.println("注解方式关闭事务！");
    }

    /**
     * 异常通知
     * @param joinpoint
     * @param exception
     */
    @AfterThrowing(value = "pointcut()", throwing = "exception")
    public void logException(JoinPoint joinpoint, Exception exception){
        System.out.println(exception.getMessage());
    }

    /**
     * 自定义异常通知
     * @param joinPoint
     * @param exception
     */
    @AfterThrowing(value = "pointcut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, CustomException exception){
        System.out.println(exception.getMessage());
    }
}
