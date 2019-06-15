package com.fxyh.my.service.impl;

import com.fxyh.my.model.User;
import com.fxyh.my.service.UserService;
import org.junit.Before;
import org.junit.Test;

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