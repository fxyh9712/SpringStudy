package com.fxyh.spring.handler;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class TransactionHandler implements MethodInterceptor {
    public void beginTransaction(){
        System.out.println("开始事务！");
    }

    public void endTransaction(){
        System.out.println("关闭事务！");
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        String methodName = method.getName();
        boolean isUse = methodName.startsWith("save") || methodName.startsWith("delete") || methodName.startsWith("update");
        if (isUse){
            beginTransaction();
        }
        //调用目标方法
        Object returnObj = invocation.proceed();

        if (isUse){
            endTransaction();
        }
        return returnObj;
    }
}
