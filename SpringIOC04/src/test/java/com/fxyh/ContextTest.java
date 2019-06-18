package com.fxyh;


import com.fxyh.ioc.Department;
import com.fxyh.ioc.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.xml.bind.annotation.XmlAccessOrder;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

/**
 * @ClassName: ContextTest
 * @description: 容器测试
 * @author: fengzhaoquan
 * @create: 2019-06-16 18:06
 * @Version 1.0
 **/
public class ContextTest {

    private ApplicationContext context;

    private BeanFactory factory;

    private User user;

    private Department department;

    @Before
    public void setUp() throws Exception {
//        this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        this.context = new ClassPathXmlApplicationContext("classpath:applicationContext-user.xml", "classpath:applicationContext-department.xml");
//        this.context = new ClassPathXmlApplicationContext("classpath*:applicationContext-*.xml");
//        this.context = new ClassPathXmlApplicationContext("classpath:applicationContextImport.xml");
        URL url = ContextTest.class.getClassLoader().getResource("applicationContextImport.xml");
        String path = url.getPath();
        path = URLDecoder.decode(path, "UTF-8");
        this.context = new FileSystemXmlApplicationContext(path);
        this.user = this.context.getBean(User.class);
        this.department = (Department) this.context.getBean("department");
    }

//    @Before
    public void setUpOld(){
        this.factory = new XmlBeanFactory(new ClassPathResource("applicationContextImport.xml"));
        this.user = this.factory.getBean(User.class);
        this.department = (Department) this.factory.getBean("department");
    }

    @Test
    public void test(){
        System.out.println(user);
        System.out.println(department);
    }

}
