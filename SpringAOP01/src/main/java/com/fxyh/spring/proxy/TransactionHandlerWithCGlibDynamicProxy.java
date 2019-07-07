package com.fxyh.spring.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class TransactionHandlerWithCGlibDynamicProxy implements InvocationHandler {

    private Object targetObject;

    public TransactionHandlerWithCGlibDynamicProxy() {
    }

    public TransactionHandlerWithCGlibDynamicProxy(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object createProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.targetObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnObj;
        if (proxy == null)
            throw new IllegalArgumentException("");
        if (method == null)
            throw new IllegalArgumentException("");

        String methodName = method.getName();
        boolean flag = methodName.startsWith("add") || methodName.startsWith("delete") || methodName.startsWith("update");
        if (flag){
            beginTransaction();
        }
        returnObj = method.invoke(this.targetObject,args);
        if (flag){
            endTransaction();
        }
        return returnObj;
    }

    private void endTransaction() {
        System.out.println("CGlib关闭事务！");
    }

    private void beginTransaction() {
        System.out.println("CGlib开启事务！");
    }
}
