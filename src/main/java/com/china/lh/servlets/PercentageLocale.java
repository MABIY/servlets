package com.china.lh.servlets;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by lh on 4/20/16.
 */
public class PercentageLocale extends HttpServlet{

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        //Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //Get the client's Locale
        Locale locale = request.getLocale();
        NumberFormat nft = NumberFormat.getPercentInstance(locale);
        String title = "Locale Specific Percentage";
        String formattedPerc = nft.format(0.51);
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + formattedPerc + "</h1>\n" +
                "</body></html>");

    }
}
