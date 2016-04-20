package com.china.lh.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by lh on 4/20/16.
 */
public class DateLocale extends HttpServlet{

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        //set response content type
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        //Get the client's Locale
        Locale locale = request.getLocale();
        String date = DateFormat.getDateTimeInstance(DateFormat.FULL,
                DateFormat.SHORT,locale).format(new Date());

        String title = "Locale Specific Dates";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + date + "</h1>\n" +
                "</body></html>");


    }
}
