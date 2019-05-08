package com.kuh.blog.main;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"","main"})
public class MainContoller {

    @RequestMapping(value = "/")
    public String main(){
        return "index";
    }
}
