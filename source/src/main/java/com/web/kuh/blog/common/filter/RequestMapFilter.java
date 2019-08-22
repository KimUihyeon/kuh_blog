package com.web.kuh.blog.common.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RequestMapFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {


        RequestFilterWrap requestFilter = new RequestFilterWrap((HttpServletRequest)request );

        requestFilter.setParameter("user_name", "dkrnl1318");
        requestFilter.setParameter("current_date",
                new SimpleDateFormat("yyyy-MM-dd hh:mm").format(System.currentTimeMillis()));


        chain.doFilter(requestFilter,response);
    }

    @Override
    public void destroy() {

    }
}
