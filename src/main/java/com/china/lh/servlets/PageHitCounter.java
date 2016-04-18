package com.china.lh.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lh on 4/18/16.
 */
public class PageHitCounter extends HttpServlet {

    private int hitCount;

    public void init() {
        hitCount = 0;
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        //set response content type
        response.setContentType("text/html");
        //this method executes whenever the servlet is hit
        //increment hitCount
        hitCount++;
        PrintWriter out = response.getWriter();
        String title = "Total Number of Hits";
        String docType=
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align=\"center\">" + hitCount + "</h2>\n" +
                "</body></html>");

    }

    public void destroy() {
        //this is optional step but if you like you
        // can write hitCount value in your database
    }
}
