package com.fxyh.spring.service.impl;

import com.fxyh.spring.domain.User;
import com.fxyh.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration("classpath*:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void addUser() {
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("123456");
        user.setSalary(99.9F);
        user.setBirthday(new Date());
        userService.addUser(user);
    }

    @Test
    public void deleteUser() {
        User user = new User();
        user.setId(2);
        userService.deleteUser(user);
    }

    @Test
    public void modifyUser() {
        User user = new User();
        user.setId(1);
        user.setName("lisi");
        user.setPassword("123456");
        user.setSalary(99.9F);
        user.setBirthday(new Date());
        userService.modifyUser(user);
    }

    @Test
    public void findUserById() {
        System.out.println(userService.findUserById(1));
    }

    @Test
    public void findAllUser() {
        userService.findAllUser().stream().forEach(System.out::println);
    }

    @Test
    public void findUser() {
        String whereSql = "user_name LIKE ? AND password LIKE ?";
        Object[] params = new Object[]{
                "%l%",
                "%12%"
        };
        userService.findUser(whereSql, params).stream().forEach(System.out::println);
    }
}