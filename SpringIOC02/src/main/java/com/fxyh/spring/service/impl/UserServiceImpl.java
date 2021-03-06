package com.fxyh.spring.service.impl;

import com.fxyh.spring.dao.UserDao;
import com.fxyh.spring.model.User;
import com.fxyh.spring.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @description: UserService服务
 * @author: fengzhaoquan
 * @create: 2019-06-15 16:19
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
