package com.fxyh.spring.service.impl;

import com.fxyh.spring.domain.User;
import com.fxyh.spring.exception.CustomException;
import com.fxyh.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save:" + user);
//        throw new CustomException("你出错了");
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update:" + user);
    }

    @Override
    public void findUserById(Integer id) {
        System.out.println("findUserById:" + id);
    }
}
