package com.web.kuh.blog.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service("commonService")
public class CommonService {

    @Autowired
    private HttpServletRequest request;

    public String getClientIP(){
        String ip = request.getRemoteAddr();
        return ip;
    }
}
