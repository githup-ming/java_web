package com.xiaoming.servlet; /**
 * @author xiaoming.dong
 * @create 2021-01-19 1:37
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();
        System.out.println(servletContext);
//        System.out.println(servletContext.getInitParameter("username"));
//        System.out.println(servletContext.getInitParameter("password"));
//        System.out.println(servletContext.getAttributeNames());
//        System.out.println(servletContext.getRealPath("/"));
//        System.out.println(servletContext.getRealPath("/css/1.css"));
        System.out.println(servletContext.getAttribute("key1"));
        System.out.println(servletContext.getAttribute("key2"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
