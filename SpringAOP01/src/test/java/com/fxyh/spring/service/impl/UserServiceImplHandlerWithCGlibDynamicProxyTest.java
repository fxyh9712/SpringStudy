package com.fxyh.spring.service.impl;

import com.fxyh.spring.entity.User;
import com.fxyh.spring.proxy.TransactionHandlerWithCGlibDynamicProxy;
import com.fxyh.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplHandlerWithCGlibDynamicProxyTest {

    private UserService userService;

    private TransactionHandlerWithCGlibDynamicProxy transactionHandlerWithCGlibDynamicProxy;

    @Before
    public void setUp() {
        this.transactionHandlerWithCGlibDynamicProxy = new TransactionHandlerWithCGlibDynamicProxy(new UserServiceImplHandlerWithCGlibDynamicProxy());
        this.userService = (UserService) this.transactionHandlerWithCGlibDynamicProxy.createProxyInstance();
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