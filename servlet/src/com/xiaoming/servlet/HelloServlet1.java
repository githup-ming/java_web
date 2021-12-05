package com.xiaoming.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaoming.dong
 * @create 2021-01-19 0:05
 */
public class HelloServlet1 extends HttpServlet {
    public HelloServlet1() {
        System.out.println("构造器");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getServerName());
        System.out.println("doget");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        System.out.println(req.getServerName());
    }
}
