package com.fxyh.spring.dao.impl;

import com.fxyh.spring.dao.UserDao;
import com.fxyh.spring.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO t_user(user_name, password, salary, birthday)\n" +
                "VALUES (?, ?, ?, ?)";
        Object[] params = new Object[]{
                user.getName(),
                user.getPassword(),
                user.getSalary(),
                user.getBirthday()
        };
        this.jdbcTemplate.update(sql, params);
    }

    @Override
    public void delete(User user) {
        String sql = "DELETE\n" +
                "FROM t_user\n" +
                "WHERE user_id = ?";
        Object[] params = new Object[]{
          user.getId()
        };
        this.jdbcTemplate.update(sql, params);
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE t_user\n" +
                "SET user_name = ?,\n" +
                "    password=?,\n" +
                "    salary=?,\n" +
                "    birthday=?\n" +
                "WHERE user_id = ?";
        Object[] params = new Object[]{
                user.getName(),
                user.getPassword(),
                user.getSalary(),
                user.getBirthday(),
                user.getId()
        };
        this.jdbcTemplate.update(sql, params);
    }

    @Override
    public User findById(Integer id) {
        String sql = "SELECT user_id,\n" +
                "       user_name,\n" +
                "       password,\n" +
                "       salary,\n" +
                "       birthday\n" +
                "FROM t_user\n" +
                "WHERE user_id = ?";
        Object[] params = new Object[]{id};
        return jdbcTemplate.queryForObject(sql, params, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return userRowMap(resultSet);
            }
        });
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT user_id,\n" +
                "       user_name,\n" +
                "       password,\n" +
                "       salary,\n" +
                "       birthday\n" +
                "FROM t_user";
        return jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return userRowMap(resultSet);
            }
        });
    }

    @Override
    public List<User> find(String sql, Object... params) {
        return this.jdbcTemplate.query(sql, params, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return userRowMap(resultSet);
            }
        });
    }

    private User userRowMap(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt(1));
        user.setName(resultSet.getString(2));
        user.setPassword(resultSet.getString(3));
        user.setSalary(resultSet.getFloat(4));
        user.setBirthday(resultSet.getDate(5));
        return user;
    }
}
