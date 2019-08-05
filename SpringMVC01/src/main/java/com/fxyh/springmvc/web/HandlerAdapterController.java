package com.fxyh.springmvc.web;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HandlerAdapterController implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("info", "http request handler");
        request.getRequestDispatcher("/WEB-INF/pages/adapter/success.jsp").forward(request, response);
    }
}
