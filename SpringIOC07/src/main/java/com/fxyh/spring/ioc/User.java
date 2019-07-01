package com.fxyh.spring.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -3998954573366385030L;

    public User() {
        System.out.println("user构造方法调用");
    }

    private String username;
    private String password;
    private Integer age;

    @PostConstruct
    public void myInit(){
        System.out.println("自定义初始化方法！");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("自定义销毁方法！");
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
