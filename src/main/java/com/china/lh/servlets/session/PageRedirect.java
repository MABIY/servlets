package com.china.lh.servlets.session;


// import required libraries
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lh on 4/18/16.
 */
public class PageRedirect extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        String site = new String("http://www.baidu.com");

        response.setStatus(response.SC_MOVED_PERMANENTLY);
        response.setHeader("Location",site);


    }
}

