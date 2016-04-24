package com.china.lh.servlets2.filter;

//import required libraries
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lh on 16-4-23.
 */
public class autoFilter  implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("autoFilter init()");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("autoFilter doFilter");
        chain.doFilter(request,response);
    }

    public void destroy() {
        System.out.println("autoFilter destroy");
    }


}
