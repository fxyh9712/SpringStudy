package com.fxyh.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.Serializable;

/**
 * @ClassName: InitDemo1
 * @description: bean初始化流程
 * @author: fengzhaoquan
 * @create: 2019-06-20 14:59
 * @Version 1.0
 **/

public class InitDemo1 implements Serializable, BeanNameAware, ApplicationContextAware, BeanFactoryAware, BeanPostProcessor, InitializingBean, DisposableBean {
    private static final long serialVersionUID = -2167328278489217537L;

    public InitDemo1() {
        System.out.println("InitDemo1构造方法调用！");
    }

    public void myInit() {
        System.out.println("自定义init方法调用！");
    }

    public void myDestroy() {
        System.out.println("自定义destroy方法调用！");
    }

    public void service() {
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

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext:" + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet调用");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destory方法调用！");
    }
}
