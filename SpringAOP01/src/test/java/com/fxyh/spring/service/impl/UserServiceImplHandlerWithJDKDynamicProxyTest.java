package com.fxyh.spring.service.impl;

import com.fxyh.spring.entity.User;
import com.fxyh.spring.proxy.TransactionHandlerWithJDKDynamicProxy;
import com.fxyh.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplHandlerWithJDKDynamicProxyTest {

    private UserService userService;
    private TransactionHandlerWithJDKDynamicProxy transactionHandlerWithJDKDynamicProxy;

    @Before
    public void setUp() throws Exception {
//        this.userService = new UserServiceImplHandlerWithJDKDynamicProxy();
        this.transactionHandlerWithJDKDynamicProxy = new TransactionHandlerWithJDKDynamicProxy(new UserServiceImplHandlerWithJDKDynamicProxy());
        this.userService = (UserService) this.transactionHandlerWithJDKDynamicProxy.createProxyInstance();
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        this.userService.addUser(user);
    }

    @Test
    public void updateUser() {
    }
}