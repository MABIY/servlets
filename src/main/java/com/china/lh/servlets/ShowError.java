package com.china.lh.servlets;
//import required java libraries

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lh on 16-3-27.
 */
//show http state return code  Extend HttpServlet class
public class ShowError extends HttpServlet {
    //method to handle GET method request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendError(407,"need authentication");
    }
    //method to handle POST method request
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
}
