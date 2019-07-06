package com.fxyh.spring.service.impl;

import com.fxyh.spring.entity.User;
import com.fxyh.spring.service.UserService;

public class UserServiceImplHandlerWithJDKDynamicProxy implements UserService {
    @Override
    public void addUser(User user) {
        System.out.println(user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println(user);
    }
}
