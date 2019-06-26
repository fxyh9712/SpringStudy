package com.fxyh.bean;

import org.springframework.beans.BeansException;

import java.io.Serializable;

/**
 * @ClassName: InitDemo1
 * @description: bean初始化流程
 * @author: fengzhaoquan
 * @create: 2019-06-20 14:59
 * @Version 1.0
 **/

public class InitDemo3 implements Serializable{
    private static final long serialVersionUID = -2167328278489217537L;

    public InitDemo3() {
        System.out.println("InitDemo3构造方法调用！");
    }

    public void service() {
        System.out.println("InitDemo2service方法调用！");
    }

}
