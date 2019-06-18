package com.fxyh.bean;

/**
 * @ClassName: LazyInitDemo2
 * @description: 懒加载2
 * @author: fengzhaoquan
 * @create: 2019-06-18 22:03
 * @Version 1.0
 **/
public class LazyInitDemo2 {

    public LazyInitDemo2() {
        System.out.println("LazyInitDemo2()构造方法");
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
        return "LazyInitDemo2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
