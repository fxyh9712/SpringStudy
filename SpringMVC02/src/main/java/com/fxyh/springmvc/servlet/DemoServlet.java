package com.fxyh.springmvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class DemoServlet extends HttpServlet {
    private static final long serialVersionUID = 2206792018849975111L;

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("进来了");
    }
}
