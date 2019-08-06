package com.fxyh.springmvc.web.controller;

import com.fxyh.springmvc.domain.User;
import com.fxyh.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
        return "user/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user){
        userService.addUser(user);
        return "redirect:/user/findAll";
    }

    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        List<User> userList = userService.findAllUserList();
        model.addAttribute("userList", userList);
        return "user/list";
    }

}
