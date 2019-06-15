package com.fxyh;

import com.fxyh.spring.model.User;
import org.junit.Test;

/**
 * @ClassName: UserTest
 * @author: fengzhaoquan
 * @create: 2019-06-15 15:50
 * @Version 1.0
 **/
public class UserTest {

    @Test
    public void test(){
        User user = new User();
        user.setName("张三");
        user.setPassword("123456");
        System.out.println(user);
    }

}
