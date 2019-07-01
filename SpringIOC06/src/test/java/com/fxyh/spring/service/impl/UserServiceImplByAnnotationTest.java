package com.fxyh.spring.service.impl;

import com.fxyh.spring.di.User;
import com.fxyh.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath*:applicationContext-annotation.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplByAnnotationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        this.userService.addUser(user);
    }
}