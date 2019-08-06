package com.fxyh.springmvc.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends MultiActionController {

    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("add");
        return null;
    }

    public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("delete");
        return null;
    }

    public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("update");
        return null;
    }

    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("list");
        return null;
    }
}
