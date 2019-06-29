package com.fxyh.bean;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class InitDemoByAnnotationTest {

    private AbstractApplicationContext context;

    private InitDemoByAnnotation initDemoByAnnotation;

    @Before
    public void setUp() throws Exception {
//        this.context = new ClassPathXmlApplicationContext("classpath*:applicationContext-annotation.xml");
        this.context = new AnnotationConfigApplicationContext("com.fxyh.bean");
        this.initDemoByAnnotation = this.context.getBean(InitDemoByAnnotation.class);
    }

    @Test
    public void test(){
        System.out.println(initDemoByAnnotation);
    }

    @After
    public void after(){
        this.context.close();
    }

}