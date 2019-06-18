package com.fxyh.bean;

/**
 * @ClassName: FactoryInstance
 * @description: 工厂实例方式
 * @author: fengzhaoquan
 * @create: 2019-06-18 20:29
 * @Version 1.0
 **/
public class FactoryInstance {

    public FactoryInstanceDemo createFactoryInstanceDemo(){
        System.out.println("createFactoryInstanceDemo()调用！");
        return new FactoryInstanceDemo();
    }

}
