package com.xiaoming.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author xiaoming.dong
 * @create 2021-01-20 15:40
 */
public class ResponseIoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding("utf-8");

//        resp.setHeader("Content-Type","text/html;charset=utf-8");//Content-Type: text/html;charset=ISO-8859-1
        resp.setContentType("text/html;charset=utf-8");

//        req.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();

        System.out.println(resp.getCharacterEncoding());//ISO-8859-1
        writer.println("\t\n");
        writer.write("abcdefg");

        writer.write(resp.getCharacterEncoding());
        writer.write("这是服务器返回的数据");
        writer.write("这是返回给服务器的数据");

    }
}
