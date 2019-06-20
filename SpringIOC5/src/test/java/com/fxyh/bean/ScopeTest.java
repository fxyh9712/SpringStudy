package com.fxyh.bean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ScopeTest {

    private ApplicationContext context;

    private ScopeSingleton scopeSingleton1;

    private ScopeSingleton scopeSingleton2;

    private ScopePrototype scopePrototype1;

    private ScopePrototype scopePrototype2;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath*:applicationContext-scope.xml");
        this.scopeSingleton1 = this.context.getBean(ScopeSingleton.class);
        this.scopeSingleton2 = this.context.getBean(ScopeSingleton.class);
        this.scopePrototype1 = this.context.getBean(ScopePrototype.class);
        this.scopePrototype2 = this.context.getBean(ScopePrototype.class);
    }

    @Test
    public void test(){
        System.out.println(scopeSingleton1 == scopeSingleton2);//true
        System.out.println(scopePrototype1 == scopePrototype2);//false
    }
}