package com.fxyh.springmvc.web.controller;

import com.fxyh.springmvc.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @GetMapping("/test")
    public String test(){
        return "ajax/test";
    }

    @PostMapping("/test")
    @ResponseBody
    public Object test(@RequestBody Person person){
        return person;
    }
}
