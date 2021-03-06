package com.fxyh.spring.service;

import com.fxyh.spring.AppAOPConfig;
import com.fxyh.spring.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceAutoAOPByConfigTest {

    private ApplicationContext context;

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        this.context = new AnnotationConfigApplicationContext(AppAOPConfig.class);
        this.userService = this.context.getBean(UserService.class);
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
        userService.findUserById(1);
    }
}