package com.fxyh.spring.dao;

import com.fxyh.spring.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public interface UserDao {
    void save(User user);

    void delete(User user);

    void update(User user);

    User findById(Integer id);

    List<User> findAll();

    List<User> find(String sql, Object... params);

}
