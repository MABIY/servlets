package com.china.lh.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lh on 4/20/16.
 */
public class DisplaySpanish extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        //Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //set spanish language code

        response.setHeader("Content-Language","zh_CN");

        String title = "En Espa&ntilde;ol";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1>" + "l like you :" + "</h1>\n" +
                "<h1>" + "&iexcl;Hola Mundo!" + "</h1>\n" +
                "</body></html>");
    }
}
