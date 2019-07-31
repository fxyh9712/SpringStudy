package com.fxyh.spring.handler;

public class TransactionHandlerAOP {
    public void beginTransaction(){
        System.out.println("开始事务！");
    }

    public void endTransaction(){
        System.out.println("关闭事务！");
    }
}
