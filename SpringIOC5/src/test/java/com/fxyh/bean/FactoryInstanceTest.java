package com.fxyh.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class FactoryInstanceTest {

    private ApplicationContext context;
    private FactoryInstanceDemo factoryInstanceDemo;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath*:applicationContext-bean.xml");
        this.factoryInstanceDemo = this.context.getBean(FactoryInstanceDemo.class);
    }

    @Test
    public void test(){
        factoryInstanceDemo.service();
    }
}