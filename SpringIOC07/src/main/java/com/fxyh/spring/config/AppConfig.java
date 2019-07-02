package com.fxyh.spring.config;

import com.fxyh.spring.dao.UserDao;
import com.fxyh.spring.dao.impl.UserDaoImpl;
import com.fxyh.spring.ioc.User;
import com.fxyh.spring.processor.UserPostProcessor;
import com.fxyh.spring.service.UserService;
import com.fxyh.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.fxyh.spring")
@Import(value = {com.fxyh.spring.ioc.Department.class})
//@PropertySource(value = "classpath*:config.properties")
public class AppConfig {

//    @Value("${username}")
    private String username;

    @Bean()
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public User user(){
        User user = new User();
//        System.out.println(username);
        user.setUsername("zhangsan");
        user.setPassword("123456");
        user.setAge(22);
        return user;
    }

    @Bean
    public UserService userService(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }

    @Bean
    public UserDao userDao(){
        UserDaoImpl userDao = new UserDaoImpl();
        return userDao;
    }

}
