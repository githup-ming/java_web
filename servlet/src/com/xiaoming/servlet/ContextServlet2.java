package com.xiaoming.servlet; /**
 * @author xiaoming.dong
 * @create 2021-01-19 2:19
 */

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


public class ContextServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext c = getServletContext();
        System.out.println(c);
        System.out.println(c.getAttribute("key1"));
        System.out.println(c.getAttribute("key2"));
        c.setAttribute("key1","abc1234");
        c.setAttribute("key2","abc12346");
        System.out.println(c.getAttribute("key1"));
        System.out.println(c.getAttribute("key2"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
