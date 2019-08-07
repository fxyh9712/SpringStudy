package com.fxyh.springmvc.service;

import com.fxyh.springmvc.domain.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> findAllUserList();

    void deleteUser(Integer id);

    User findUserById(Integer id);

    void updateUser(User user);
}
