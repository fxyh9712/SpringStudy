package com.fxyh.spring.service.impl;

import com.fxyh.spring.dao.UserDao;
import com.fxyh.spring.domain.User;
import com.fxyh.spring.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("");
        }
        userDao.save(user);
    }

    @Override
    public void deleteUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("");
        }
        userDao.delete(user);
    }

    @Override
    public void modifyUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("");
        }
        userDao.update(user);
    }

    @Override
    public User findUserById(Integer id) {
        if (id == null || id < 1) {
            throw new IllegalArgumentException("");
        }
        return userDao.findById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }

    @Override
    public List<User> findUser(String whereSql, Object... params) {
        StringBuilder sql = new StringBuilder("SELECT user_id,\n" +
                "       user_name,\n" +
                "       password,\n" +
                "       salary,\n" +
                "       birthday\n" +
                "FROM t_user\n" +
                "WHERE 1 = 1");
        if (StringUtils.isBlank(whereSql)) {
            return this.userDao.findAll();
        }
        sql.append(" AND ").append(whereSql);

        return userDao.find(sql.toString(), params);
    }
}
