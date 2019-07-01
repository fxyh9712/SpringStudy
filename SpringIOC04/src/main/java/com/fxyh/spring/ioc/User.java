package com.fxyh.spring.ioc;

import java.io.Serializable;

/**
 * @ClassName: User
 * @description: TODO
 * @author: fengzhaoquan
 * @create: 2019-06-16 18:03
 * @Version 1.0
 **/
public class User implements Serializable {

    private static final long serialVersionUID = 4512617515909664931L;

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
