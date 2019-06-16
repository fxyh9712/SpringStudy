package com.fxyh.spring.service.impl;

import com.fxyh.spring.model.User;
import com.fxyh.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    private ApplicationContext context;
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        this.userService = (UserService) this.context.getBean("userService");
        this.userService = this.context.getBean(UserService.class);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("123456");
        userService.addUser(user);
    }
}