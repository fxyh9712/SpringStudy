package com.fxyh.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class LazyInitDemoTest {

    private ApplicationContext context;
    private LazyInitDemo1 lazyInitDemo1;
    private LazyInitDemo2 lazyInitDemo2;
    private LazyInitDemo3 lazyInitDemo3;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath*:applicationContext-lazy.xml");
        this.lazyInitDemo1 = this.context.getBean(LazyInitDemo1.class);
        this.lazyInitDemo2 = this.context.getBean(LazyInitDemo2.class);
        this.lazyInitDemo3 = this.context.getBean(LazyInitDemo3.class);
    }

    @Test
    public void test(){
        System.out.println(lazyInitDemo1);
        System.out.println(lazyInitDemo2);
        System.out.println(lazyInitDemo3);
    }
}