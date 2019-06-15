package com.fxyh.my.dao.impl;

import com.fxyh.my.dao.UserDao;
import com.fxyh.my.model.User;

/**
 * @ClassName: UserDaoHibernateImpl
 * @description: UserDaoHibernate实现
 * @author: fengzhaoquan
 * @create: 2019-06-15 16:22
 * @Version 1.0
 **/
public class UserDaoHibernateImpl implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println("Hibernate add:" + user);
    }
}
