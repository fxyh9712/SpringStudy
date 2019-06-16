package com.fxyh.spring.service.impl;

import com.fxyh.spring.ioc.BeanFactory;
import com.fxyh.spring.ioc.ClassPathXmlApplicationContext;
import com.fxyh.spring.model.User;
import com.fxyh.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    private BeanFactory factory;

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        this.factory = new ClassPathXmlApplicationContext();
        this.userService = (UserService) this.factory.getBean(UserService.class);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("123456");
        userService.addUser(user);
    }
}