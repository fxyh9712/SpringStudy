package com.fxyh.springmvc.dao;

import com.fxyh.springmvc.domain.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    List<User> findAll();

    void deleteUser(Integer id);

    User findUserById(Integer id);

    void updateUser(User user);
}
