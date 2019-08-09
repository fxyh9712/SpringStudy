package com.fxyh.springmvc.web.controller;

import com.fxyh.springmvc.vo.CollectionVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/collection")
public class CollectionController {

    @GetMapping("/test")
    public String test(){
        return "collection/test";
    }

   /* @PostMapping("/test")
    public String test(List<String> collection, Model model){
        model.addAttribute("collection", collection);
        return "collection/test_return";
    } */
    @PostMapping("/test")
    public String test(CollectionVO collectionVO, Model model){
        model.addAttribute("collectionVO", collectionVO);
        return "collection/test_return";
    }
}
