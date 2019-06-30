package com.fxyh.spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration("classpath*:applicationContext-di.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AbstractDemoTest {

    @Autowired
    private AbstractDemo1 abstractDemo1;
    @Autowired
    private AbstractDemo2 abstractDemo2;
    @Autowired
    private AbstractDemo3 abstractDemo3;

    @Test
    public void test(){
        System.out.println(abstractDemo1);
        System.out.println(abstractDemo2);
        System.out.println(abstractDemo3);
    }

}