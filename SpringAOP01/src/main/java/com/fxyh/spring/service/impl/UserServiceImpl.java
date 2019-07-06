package com.fxyh.spring.service.impl;

import com.fxyh.spring.entity.User;
import com.fxyh.spring.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void updateUser(User user) {
        beginTransaction();
        System.out.println(user);
        endTransaction();
    }

    @Override
    public void addUser(User user) {
        beginTransaction();
        System.out.println(user);
        endTransaction();
    }

    public void beginTransaction(){
        System.out.println("开启事务！");
    }

    public void endTransaction(){
        System.out.println("关闭事务！");
    }
}
