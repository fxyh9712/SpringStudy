package com.fxyh.my.dao.impl;

import com.fxyh.my.dao.UserDao;
import com.fxyh.my.model.User;

/**
 * @ClassName: UserDaoImpl
 * @description: UserDaoMybatis实现
 * @author: fengzhaoquan
 * @create: 2019-06-15 16:20
 * @Version 1.0
 **/
public class UserDaoMybatisImpl implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println("Mybatis add:" + user);
    }
}
