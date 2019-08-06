package com.fxyh.springmvc.service.impl;

import com.fxyh.springmvc.dao.UserDao;
import com.fxyh.springmvc.domain.User;
import com.fxyh.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("");
        }
        userDao.save(user);
    }

    @Override
    public List<User> findAllUserList() {
       return userDao.findAll();
    }
}
