package com.fxyh.spring.ioc;

import java.io.Serializable;

public class Department implements Serializable {
    private static final long serialVersionUID = 9185871408520952851L;
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
