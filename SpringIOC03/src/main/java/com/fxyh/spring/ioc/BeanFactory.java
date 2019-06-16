package com.fxyh.spring.ioc;

/**
 * @ClassName: BeanFactory
 * @description: 创建bean，提供给客户端使用的bean
 * @author: fengzhaoquan
 * @create: 2019-06-16 16:39
 * @Version 1.0
 **/
public interface BeanFactory {

    /**
     * @Author fengzhaoquan
     * @Description 实现了该接口类型的对象
     * @Param clazz 接口类型的对象
     **/
    Object getBean(Class clazz);

    /**
     * @Author fengzhaoquan
     * @Description 获取className的对象（id）
     **/
    Object getBean(String className);
}
