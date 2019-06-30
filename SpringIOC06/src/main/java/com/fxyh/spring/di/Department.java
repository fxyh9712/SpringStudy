package com.fxyh.spring.di;

import java.io.Serializable;
import java.util.Date;

public class Department implements Serializable {
    private static final long serialVersionUID = -7390074405145933835L;

    private Integer id;

    private String departmentName;

    private String address;

    public Department() {
    }

    public Department(Integer id, String departmentName, String address) {
        this.id = id;
        this.departmentName = departmentName;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}