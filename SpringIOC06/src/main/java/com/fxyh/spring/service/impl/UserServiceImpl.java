package com.fxyh.spring.service.impl;

import com.fxyh.spring.dao.UserDao;
import com.fxyh.spring.di.User;
import com.fxyh.spring.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        if (user == null){
            throw new IllegalArgumentException("user不能为空！");
        }
        this.userDao.save(user);
    }
}
