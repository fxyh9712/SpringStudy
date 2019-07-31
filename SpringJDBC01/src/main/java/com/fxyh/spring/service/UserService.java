package com.fxyh.spring.service;

import com.fxyh.spring.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(User user);

    void modifyUser(User user);

    User findUserById(Integer id);

    List<User> findAllUser();

    List<User> findUser(String whereSql, Object... params);
}
