package com.web.kuh.blog.common.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class RequestFilterWrap  extends HttpServletRequestWrapper {

    private Map<String, String[]> requestMap;


    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     * @throws IllegalArgumentException if the request is null
     */
    public RequestFilterWrap(HttpServletRequest request) {
        super(request);
        this.requestMap = new HashMap<>(request.getParameterMap());
    }

    @Override
    public String getParameter(String name) {
        String returnValue = null;

        String[] paramArray = getParameterValues(name);

        if (paramArray != null && paramArray.length > 0) {

            returnValue = paramArray[0];

        }

        return returnValue;
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        return Collections.unmodifiableMap(requestMap);
    }

    @Override
    public Enumeration<String> getParameterNames() {
        return Collections.enumeration(requestMap.keySet());
    }


    public void setParameter(String name, String value) {

        String[] oneParam = { (String) value};

        setParameter(name, oneParam);

    }

    public void setParameter(String name, String[] value) {
        requestMap.put(name, value);
    }


}
