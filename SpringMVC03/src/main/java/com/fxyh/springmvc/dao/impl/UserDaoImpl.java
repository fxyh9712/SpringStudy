package com.fxyh.springmvc.dao.impl;

import com.fxyh.springmvc.dao.UserDao;
import com.fxyh.springmvc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void save(User user) {
        String sql = "INSERT INTO t_user(user_name, password, salary, birthday)\n" +
                "VALUES (?, ?, ?, ?)";
        Object[] params = new Object[]{
                user.getUsername(),
                user.getPassword(),
                user.getSalary(),
                user.getBirthday()
        };
        this.jdbcTemplate.update(sql, params);
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT user_id, user_name, password, salary, birthday\n" +
                "FROM t_user";
        return this.jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return userRowMap(resultSet);
            }

        });
    }

    @Override
    public void deleteUser(Integer id) {
        String sql = "DELETE\n" +
                "FROM t_user\n" +
                "WHERE user_id = ?";
        Object[] params = new Object[]{id};
        jdbcTemplate.update(sql, params);
    }

    @Override
    public User findUserById(Integer id) {
        String sql = "SELECT user_id, user_name, password, salary, birthday\n" +
                "FROM t_user\n" +
                "WHERE user_id = ?";
        return jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                return userRowMap(rs);
            }
        }, id);
    }

    @Override
    public void updateUser(User user) {
        String sql = "UPDATE t_user\n" +
                "SET user_name = ?,\n" +
                "    password  = ?,\n" +
                "    salary=?,\n" +
                "    birthday=?\n" +
                "WHERE user_id = ?";
        Object[] params = new Object[]{
                user.getUsername(),
                user.getPassword(),
                user.getSalary(),
                user.getBirthday(),
                user.getId()
        };
        jdbcTemplate.update(sql, params);
    }

    private User userRowMap(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt(1));
        user.setUsername(resultSet.getString(2));
        user.setPassword(resultSet.getString(3));
        user.setSalary(resultSet.getFloat(4));
        user.setBirthday(resultSet.getDate(5));
        return user;
    }
}
