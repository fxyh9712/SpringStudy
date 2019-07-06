package com.fxyh.spring.service.impl;

import com.fxyh.spring.entity.User;
import com.fxyh.spring.handler.TransactionHandler;
import com.fxyh.spring.service.UserService;

public class UserServiceImplHandler extends TransactionHandler implements UserService {
    @Override
    public void addUser(User user) {
        this.beginTransaction();
        System.out.println(user);
        this.endTransaction();
    }

    @Override
    public void updateUser(User user) {
        this.beginTransaction();
        System.out.println(user);
        this.endTransaction();
    }
}
