package com.fxyh.spring.handler;

public class TransactionHandler {
    public void beginTransaction(){
        System.out.println("开启事务！");
    }

    public void endTransaction(){
        System.out.println("关闭事务！");
    }
}
