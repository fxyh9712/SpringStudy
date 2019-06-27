package com.fxyh.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.io.Serializable;

/**
 * @ClassName: InitDemo1
 * @description: bean初始化流程
 * @author: fengzhaoquan
 * @create: 2019-06-20 14:59
 * @Version 1.0
 **/

public class InitDemo3 implements Serializable, BeanPostProcessor {

    private static final long serialVersionUID = -3806397125776158318L;

    public InitDemo3() {
        System.out.println("InitDemo3构造方法调用！");
    }

    public void service() {
        System.out.println("InitDemo2service方法调用！");
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization: beanName=" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization: beanName=" + beanName);
        return bean;
    }
}
