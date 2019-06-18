package com.fxyh.ioc;

import java.io.Serializable;

/**
 * @ClassName: Department
 * @description: TODO
 * @author: fengzhaoquan
 * @create: 2019-06-16 18:10
 * @Version 1.0
 **/
public class Department implements Serializable {

    private static final long serialVersionUID = -3949007953156763909L;

    private Long id;
    private String name;
    private String location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
