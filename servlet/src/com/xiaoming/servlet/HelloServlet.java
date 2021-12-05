package com.xiaoming.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaoming.dong
 * @create 2021-01-18 22:42
 */
public class HelloServlet implements Servlet{

    public HelloServlet() {
        System.out.println("构造器");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(servletConfig.getServletName());
        System.out.println(servletConfig.getInitParameter("url"));
        System.out.println(servletConfig.getInitParameter("username"));
        System.out.println(servletConfig.getServletContext());


        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("config");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest httpServlet = (HttpServletRequest) servletRequest;
        System.out.println(httpServlet.getMethod());
        System.out.println("service");
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
