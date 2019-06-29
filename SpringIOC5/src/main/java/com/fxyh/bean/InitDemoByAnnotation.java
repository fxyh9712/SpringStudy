package com.fxyh.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

@Component
public class InitDemoByAnnotation implements Serializable {
    private static final long serialVersionUID = -6995664151240989094L;

    public InitDemoByAnnotation() {
        System.out.println("InitDemoByAnnotation构造方法！");
    }

    @PostConstruct
    public void myInit(){
        System.out.println("自定义init方法！");
    }

    @PostConstruct
    public void myInit2(){
        System.out.println("自定义init2方法！");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("自定义destroy方法！");
    }

    @PreDestroy
    public void myDestroy2(){
        System.out.println("自定义destroy2方法！");
    }

}
