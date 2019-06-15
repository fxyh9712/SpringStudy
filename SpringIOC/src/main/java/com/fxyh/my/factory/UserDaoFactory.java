package com.fxyh.my.factory;

import com.fxyh.my.dao.UserDao;
import org.apache.commons.lang3.StringUtils;

import java.util.Properties;

/**
 * @ClassName: UserDaoFactory
 * @description: TODO
 * @author: fengzhaoquan
 * @create: 2019-06-15 16:52
 * @Version 1.0
 **/
public class UserDaoFactory {
    public static UserDao createUserDao() {
        UserDao userDao = null;
        try {
            Properties properties = new Properties();
            properties.load(UserDaoFactory.class.getClassLoader().getResourceAsStream("daoConfig.properties"));
            String userDaoClassName = properties.getProperty("UserDao");
            if (StringUtils.isNotBlank(userDaoClassName)){
                userDao = (UserDao) Class.forName(userDaoClassName).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userDao;
    }
}
