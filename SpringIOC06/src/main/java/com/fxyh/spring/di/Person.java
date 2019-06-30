package com.fxyh.spring.di;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private static final long serialVersionUID = -7298705943304743625L;

    private Integer id;
    private String username;
    private Float salary;
    private Date createDate;

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

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", salary=" + salary +
                ", createDate=" + createDate +
                '}';
    }
}
