package com.xiaoming.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaoming.dong
 * @create 2021-01-19 18:32
 */
public class RequstAPIServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getRequestURI());
        System.out.println(req.getRemoteUser());
        System.out.println(req.getRequestURL());
        System.out.println(req.getRemoteHost());
        System.out.println(req.getRemoteAddr());
        System.out.println(req.getRemotePort());
        System.out.println(req.getHeader("User-agent"));
        System.out.println("requstapiServlet");
    }
}
