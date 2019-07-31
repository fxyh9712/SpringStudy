package com.fxyh.spring.service;

import com.fxyh.spring.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceTest {

    private ApplicationContext context;

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        this.userService = (UserService) this.context.getBean("proxyFactoryBean");
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setId(1);
        user.setUsername("zhangsan");
        user.setAge(18);
        userService.saveUser(user);
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void findUserById() {
    }
}