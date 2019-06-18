package com.fxyh.bean;

/**
 * @ClassName: StaticFactoryBeanDemo
 * @description: 静态工厂方式
 * @author: fengzhaoquan
 * @create: 2019-06-18 20:20
 * @Version 1.0
 **/
public class StaticFactoryBeanDemo {

    public static StaticFactoryBeanDemo createInstance(){
        System.out.println("createInstance()方法调用！");
        return new StaticFactoryBeanDemo();
    }

    public void service(){
        System.out.println("Service方法调用！");
    }

}
