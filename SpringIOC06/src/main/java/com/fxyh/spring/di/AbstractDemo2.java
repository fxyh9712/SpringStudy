package com.fxyh.spring.di;

import java.io.Serializable;

public class AbstractDemo2 implements Serializable {
    private static final long serialVersionUID = -2566446452128162290L;

    private Integer id;
    private String username;
    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AbstractDemo2{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
