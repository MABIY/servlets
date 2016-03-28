package com.china.lh.servlets;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * Created by lh on 16-3-27.
 */
public class AuthenFilter implements Filter{
    public void init(FilterConfig config) throws ServletException {
        String testParam = config.getInitParameter("test-param");
        System.out.println("Test Param AuthenFilter" + testParam);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String ipAddress = request.getRemoteAddr();
        System.out.println("AuthenFilter IP" + ipAddress+ ", Time" +new Date());
        chain.doFilter(request,response);
    }

    public void destroy() {
        /* Called beefore the Filter instance is removed from service by the
        web container
                */
    }
}
