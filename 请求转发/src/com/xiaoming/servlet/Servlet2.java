package com.xiaoming.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaoming.dong
 * @create 2021-01-19 21:23
 */
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        System.out.println("在Servlet2查看材料：" + username);
        Object key = req.getAttribute("key");
        System.out.println("在servlet2查看柜台1有章：" + key);

        System.out.println("servlet2处理业务");

    }
}
