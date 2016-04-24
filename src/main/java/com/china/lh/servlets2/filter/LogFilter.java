package com.china.lh.servlets2.filter;
// Import required java libraries

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * Created by lh on 16-4-23.
 */
// Implements Filter class
public class LogFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {
        //Get init parameter
        String testParam = filterConfig.getInitParameter("test-param");

        //Print the init parameter
        System.out.println("Test Parm:" + testParam);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Get the IP address of client machine
        String ipAddress =  request.getRemoteAddr();

        //Log the Ip address and current timeStamp
        System.out.println("IP" + ipAddress +",Time" + new Date());

        //Pass request back down the filter chain
        chain.doFilter(request,response);
    }

    public void destroy() {
            /* Called before the filter instance is removed from service by the
            web container
             */
        System.out.println("Filter destroy()");
    }
}
