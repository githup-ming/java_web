package com.xiaoming.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaoming.dong
 * @create 2021-01-20 14:46
 */
public class Formc extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("经过ForWardc");
        req.getRequestDispatcher("/a/b/c.html").forward(req,resp);
    }
}
