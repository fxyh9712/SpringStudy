package com.fxyh.spring.service.impl;

import com.fxyh.spring.model.User;
import com.fxyh.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    private UserService userService;

    @Before
    public void init(){
        userService = new UserServiceImpl();
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("123456");
        userService.addUser(user);
    }
}