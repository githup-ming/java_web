package com.xiaoming.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiaoming.dong
 * @create 2021-01-20 16:58
 */
public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("到达Response1，你要跳转到response2");
        System.out.println("到达Response1，你要跳转到response2");
        req.setAttribute("key1","value1");
        //发送响应状态
//        resp.setStatus(302);
//        //告诉浏览器地址已更新
////        resp.setHeader("location","http://localhost:8080/servlet/response2");
////        resp.setHeader("location","http://localhost:8080/servlet/WEB-INF/form.html");
//        resp.setHeader("location","http://www.baidu.com");
////        req.getRequestDispatcher("http://localhost:8080/servlet/WEB-INF/form.html").forward(req,resp);

            resp.sendRedirect("http://www.baidu.com");
    }
}
