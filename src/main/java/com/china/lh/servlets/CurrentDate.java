package com.china.lh.servlets;
//import required java libraries


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by lh on 16-4-14.
 */
//Extend HttpServlet class
public class CurrentDate extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Display Current Date & Time";

        Date date = new Date();
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align=\"center\">" + date.toString() + "</h2>\n" +
                "</body></html>");
    }

}
