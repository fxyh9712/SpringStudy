package com.fxyh.springmvc.common;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        if (ex != null) {
            if (ex instanceof CustomException) {
                CustomException customException = (CustomException) ex;
                String message = customException.getMessage();
                modelAndView.addObject("error", message);
                modelAndView.setViewName("common/error");
            }
        }
        return modelAndView;
    }

}
