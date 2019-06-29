package com.fxyh.spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath*:applicationContext-di.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {

    @Autowired
    private User user;

    @Test
    public void test() {
        System.out.println(this.user);
    }
}