package com.china.lh.servlets;
//import required java libraries
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lh on 16-3-27.
 */
public class HelloWorld extends HttpServlet{
    private String message;

    public void init() throws ServletException
    {
        // Do required initialization　　
        message = "Hello World";
        System.out.println("HelloWorld init()");
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
        System.out.println("HelloWorld doGet");
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    public void destroy()
    {
        // do nothing.
    }
}
