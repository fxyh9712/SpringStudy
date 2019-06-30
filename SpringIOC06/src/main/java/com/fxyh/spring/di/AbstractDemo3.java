package com.fxyh.spring.di;

import java.io.Serializable;

public class AbstractDemo3 implements Serializable {
    private static final long serialVersionUID = -2566446452128162290L;

    private Integer id;
    private String username;
    private String address;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AbstractDemo3{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
