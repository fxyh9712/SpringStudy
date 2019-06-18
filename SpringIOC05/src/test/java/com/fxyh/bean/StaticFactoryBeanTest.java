package com.fxyh.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StaticFactoryBeanTest {

    private ApplicationContext context;
    private StaticFactoryBeanDemo staticFactoryBeanDemo;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath*:applicationContext-bean.xml");
        this.staticFactoryBeanDemo = this.context.getBean(StaticFactoryBeanDemo.class);
    }

    @Test
    public void test() {
        staticFactoryBeanDemo.service();
    }
}