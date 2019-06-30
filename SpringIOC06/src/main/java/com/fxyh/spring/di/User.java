package com.fxyh.spring.di;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 84601116866236075L;

    private String username;
    private String password;
    private Department department;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, Department department) {
        this.username = username;
        this.password = password;
        this.department = department;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", department=" + department +
                '}';
    }
}
