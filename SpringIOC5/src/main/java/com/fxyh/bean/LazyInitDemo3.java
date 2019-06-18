package com.fxyh.bean;

/**
 * @ClassName: LazyInitDemo3
 * @description: 懒加载3
 * @author: fengzhaoquan
 * @create: 2019-06-18 22:05
 * @Version 1.0
 **/
public class LazyInitDemo3 {
    public LazyInitDemo3() {
        System.out.println("LazyInitDemo3()构造方法");
    }

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LazyInitDemo3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
