package com.fxyh.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionHandlerWithJDKDynamicProxy implements InvocationHandler {

    private Object targetObject;

    public TransactionHandlerWithJDKDynamicProxy() {
    }

    public TransactionHandlerWithJDKDynamicProxy(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object createProxyInstance(){
        return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
                this.targetObject.getClass().getInterfaces(),
                this);
    }

    /**
     *
     * @param proxy     代理对象
     * @param method    目标对象的方法
     * @param args      方法的参数
     */
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
        System.out.println("JDK关闭事务！");
    }

    private void beginTransaction() {
        System.out.println("JDK开启事务！");
    }
}
