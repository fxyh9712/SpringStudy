package com.fxyh.spring.model;

import java.io.Serializable;

/**
 * @ClassName: User
 * @description: user实体
 * @author: fengzhaoquan
 * @create: 2019-06-15 15:47
 * @Version 1.0
 **/
public class User implements Serializable {

    private static final long serialVersionUID = -5333671573596770181L;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
