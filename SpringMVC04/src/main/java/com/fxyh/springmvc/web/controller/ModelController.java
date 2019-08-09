package com.fxyh.springmvc.web.controller;

import com.fxyh.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/model")
@SessionAttributes(value = "user")
public class ModelController {

    /**
     * 默认将user对象放入到Model中，key为方法名（user）
     */
    @ModelAttribute
    public User user(){
        User user = new User();
        user.setId(100);
        user.setUsername("zhangsan");
        return user;
    }

    @GetMapping("/test")
    @ResponseBody
    public User test(Model model){
        User user = (User) model.asMap().get("user");
        System.out.println(user);
        return user;
    }

    @GetMapping("/test2")
    @ResponseBody
    public User test2(Map map){
        User user = (User) map.get("user");
        System.out.println(user);
        return user;
    }

    @GetMapping("/test3")
    public String test3(@ModelAttribute User user){
        user.setUsername("李四");
        return "redirect:/model/test4";
    }

    @GetMapping("/test4")
    @ResponseBody
    public Object test4(Model model){
        User user = (User) model.asMap().get("user");
        System.out.println(user);
        return user;
    }
}
