package com.fxyh.spring.service.impl;

import com.fxyh.spring.dao.UserDao;
import com.fxyh.spring.ioc.User;
import com.fxyh.spring.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }
}
