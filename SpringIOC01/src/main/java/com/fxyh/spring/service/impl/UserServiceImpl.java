package com.fxyh.spring.service.impl;

import com.fxyh.spring.dao.UserDao;
import com.fxyh.spring.factory.UserDaoFactory;
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

    public UserServiceImpl() {
        // 代码没有扩展性。如果现在持久化策略编程mybatis实现，那么此时需要修改程序
        //this.userDao = new UserDaoHibernateImpl();
        //this.userDao = new UserDaoMybatisImpl();
        // 使用工厂来创建这个Dao,然后通过properties配置创建那个Dao实现不用该代码直接切换
        this.userDao = UserDaoFactory.createUserDao();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
