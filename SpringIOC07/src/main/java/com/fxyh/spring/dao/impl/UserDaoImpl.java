package com.fxyh.spring.dao.impl;

import com.fxyh.spring.dao.UserDao;
import com.fxyh.spring.ioc.User;
import com.fxyh.spring.service.UserService;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("save :" + user);
    }
}
