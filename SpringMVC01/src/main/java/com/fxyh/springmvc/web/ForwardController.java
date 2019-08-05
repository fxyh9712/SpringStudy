package com.fxyh.springmvc.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("info", "forward");
        // 第一种：转发
//        modelAndView.setViewName("forward/success");
        // 第二种：
//        modelAndView.setViewName("forward:/WEB-INF/pages/forward/success.jsp");
        // 第三种： 只适合在后端控制器实现了HttpRequestHandler接口的时候
//        request.getRequestDispatcher("/WEB-INF/pages/forward/success.jsp").forward(request,response);
        //第四种
        View view = new JstlView("/WEB-INF/pages/forward/success.jsp");
        modelAndView.setView(view);
        return modelAndView;
    }
}
