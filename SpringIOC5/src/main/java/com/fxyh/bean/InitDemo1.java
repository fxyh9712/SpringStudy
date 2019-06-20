package com.fxyh.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

import java.io.Serializable;

/**
 * @ClassName: InitDemo1
 * @description: TODO
 * @author: fengzhaoquan
 * @create: 2019-06-20 14:59
 * @Version 1.0
 **/
public class InitDemo1 implements Serializable, BeanNameAware, BeanFactoryAware {
    private static final long serialVersionUID = -2167328278489217537L;

    public InitDemo1() {
        System.out.println("InitDemo1构造方法调用！");
    }

    public void init(){
        System.out.println("自定义init方法调用！");
    }

    public void destroy(){
        System.out.println("自定义destroy方法调用！");
    }

    public void service(){
        System.out.println("service方法调用！");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName:" + name + "调用！");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory:" + beanFactory + "调用！");
    }
}
