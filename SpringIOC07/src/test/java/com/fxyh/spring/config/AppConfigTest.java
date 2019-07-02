package com.fxyh.spring.config;

import com.fxyh.spring.ioc.Department;
import com.fxyh.spring.ioc.User;
import com.fxyh.spring.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfigTest {
    private AbstractApplicationContext context;
    private User user;
    private User user2;
    private Department department;
    private UserService userService;

    @Before
    public void setUp() {
        this.context = new AnnotationConfigApplicationContext(AppConfig.class);
//        this.context = new AnnotationConfigApplicationContext("com.fxyh.spring.config");
//        this.context = new ClassPathXmlApplicationContext("classpath*:applicationContext-bean.xml");
        this.user = this.context.getBean(User.class);
        this.user2 = this.context.getBean(User.class);
        this.department = this.context.getBean(Department.class);
        this.userService = (UserService) this.context.getBean("userService");
    }

    @Test
    public void test() {
        System.out.println(department);
        String[] beanDefinitionNames = this.context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanName:" + beanDefinitionName);
        }
        System.out.println(this.user);
        System.out.println(user == user2);
        this.userService.addUser(this.user);
    }

    @After
    public void after(){
        this.context.close();
    }
}