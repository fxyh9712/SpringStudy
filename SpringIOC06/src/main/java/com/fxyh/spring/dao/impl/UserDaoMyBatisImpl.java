package com.fxyh.spring.dao.impl;

import com.fxyh.spring.dao.UserDao;
import com.fxyh.spring.di.User;

public class UserDaoMyBatisImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("myBatis add:" + user);
    }
}
