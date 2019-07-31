package com.fxyh.spring.service;

import com.fxyh.spring.domain.User;

public interface UserService {

    void saveUser(User user);

    void updateUser(User user);

    void findUserById(Integer id);
}
