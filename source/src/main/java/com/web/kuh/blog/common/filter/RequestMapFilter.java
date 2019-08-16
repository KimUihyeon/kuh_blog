package com.web.kuh.blog.common.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class RequestMapFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        request.setAttribute("test",1);
        request.setAttribute("test2",1);
        RequestFilterWrap requestFilter = new RequestFilterWrap((HttpServletRequest)request );
        requestFilter.setParameter("data","1");


        chain.doFilter(requestFilter,response);
    }

    @Override
    public void destroy() {

    }
}
