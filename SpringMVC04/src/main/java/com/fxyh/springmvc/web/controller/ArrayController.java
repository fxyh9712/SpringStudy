package com.fxyh.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/array")
public class ArrayController {

    @GetMapping(value = "/test")
    public String test(){
        return "array/test";
    }

    @PostMapping("/test")
    public String test(String[] arr, Model model){
        model.addAttribute("arr", arr);
        return "array/test_return";
    }

}
