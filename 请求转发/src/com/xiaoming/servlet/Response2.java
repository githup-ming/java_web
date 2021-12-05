package com.xiaoming.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaoming.dong
 * @create 2021-01-20 17:01
 */
public class Response2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("key1" + req.getAttribute("key1"));
        resp.setContentType("text/html;charset=utf-8");
        System.out.println("到达Response2");
        resp.getWriter().write("到达Response2");
    }
}
