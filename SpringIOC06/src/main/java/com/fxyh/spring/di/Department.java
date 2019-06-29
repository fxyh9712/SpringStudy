package com.fxyh.spring.di;

import java.io.Serializable;
import java.util.Date;

public class Department implements Serializable {
    private static final long serialVersionUID = -7390074405145933835L;

    private Integer id;

    private String departmentName;

    private Date createDate;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
