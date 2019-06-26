package com.fxyh.bean;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class InitDemo1Test {

    private AbstractApplicationContext context;

    private InitDemo1 initDemo1;
    private InitDemo2 initDemo2;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath*:applicationContext-init.xml");
        this.initDemo1 = this.context.getBean(InitDemo1.class);
        this.initDemo2 = this.context.getBean(InitDemo2.class);
    }

    @Test
    public void test(){
        this.initDemo1.service();
        this.initDemo2.service();
    }

    @After
    public void after(){
        this.context.close();
    }

}